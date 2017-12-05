package top.zander.spidder.processor;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Description:
 * @vertion:1.0
 * @author:yizhendong
 * @date:2017/12/5 21:35
 */
@Slf4j
public class houseProcessor implements PageProcessor{
    public static final String URL_LIST = "https://cd\\.lianjia\\.com/ershoufang/tianfuxinqu/pg[\\d{1}|\\d{2}]";

    public static final String URL_POST = "https://cd\\.lianjia\\.com/ershoufang/[\\d{1}|\\d{2}]\\.html";

    public static final String content_prefix = "//div[@class='overview']/div[@class='content']";
    public static final String overview_prefix = "//div[@class='overview']/div[@class='content']/div[@class='aroundInfo']/div[@class='houseRecord']";
    public static final String title_prefix = "//div[@class='sellDetailHeader']/div[@class='title-wrapper']/div[@class='content']/div[@class='title']";
    public static final String fav_prefix = "//div[@class='sellDetailHeader']/div[@class='title-wrapper']/div[@class='content']/div[@class='btnContainer']";

    private Site site = Site.me().
            setRetryTimes(3).
            setTimeOut(5000).
            setDomain("cd.lianjia.com").
            setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36\n" +
            "Query String Parameters\n" +
            " (1)\n" +
            "Name\n");
    @Override
    public void process(Page page) {
        log.info("开始更新");
        //列表页
        if (page.getUrl().regex(URL_LIST).match()) {
            page.addTargetRequests(page.getHtml().xpath("//div[@class='content']/div[@class='leftContent']/ul[@class='sellListContent']")
                    .links().regex(URL_POST).all());
            page.addTargetRequests(page.getHtml().links().regex(URL_LIST).all());
            //文章页
        } else {
            String title = page.getHtml().xpath(title_prefix+"/h1/text()").get();
            page.putField("title", title);
            log.info("title值为:{}",title);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new houseProcessor())
                .addUrl("https://cd.lianjia.com/ershoufang/tianfuxinqu/pg1")
                .thread(5)
                .run();
    }
}
