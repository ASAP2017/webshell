package main.java.phishing;

public class ScoreDomain {

	static String[] whilte_list;
	
	static {
		whilte_list = new String[] {
			"email-qq.com", "58.com","jiwu.com","xiaomi.com","cnzz.com","tuicool.com","saic.gov.cn","chinanews.com","23wx.com","ifanr.com","gao7.com","quanmin.tv","vancl.com","cjn.cn","microsoftonline.com","yiqifa.com","appgame.com","mtime.com","suning.com","pinterest.com","12306.cn","cnhubei.com","worktile.com","pcbeta.com","jd.hk","quora.com","hujiang.com","21cn.com","chinaunix.net","lenovo.com.cn","dianping.com","19lou.com","house365.com","btbbt.cc","fuliba.net","onlinedown.net","caixin.com","google.com.tw","v2ex.com","10jqka.com.cn","dell.com","ynepb.gov.cn","ceconline.com","miaopai.com","18183.com","yesky.com","120ask.com","pps.tv","2345.com","xvideos.com","huaban.com","etao.com","yaolan.com","gucheng.com","nga.cn","alicdn.com","gamersky.com","2cto.com","guokr.com","taoche.com","instagram.com","liansuo.com","xjtour.com","microsoft.com","eastday.com","booking.com","sina.com","google.com.hk","github.com","hupu.com","nuomi.com","3158.cn","youth.cn","ebay.com","longzhu.com","baike.com","u17.com","yougou.com","dytt8.net","biquge.la","ecitic.com","twitter.com","ccb.com","ngacn.cc","autohome.com.cn","dy2018.com","caijing.com.cn","weibo.cn","sogou.com","zbj.com","bttiantang.com","cyol.com","eqxiu.com","alibaba-inc.com","51yes.com","yixun.com","people.com.cn","gongchang.com","mafengwo.cn","ximalaya.com","cmbc.com.cn","takungpao.com","dmzj.com","kuwo.cn","spdb.com.cn","zcool.com.cn","tudou.com","mp4ba.com","ikea.com","zhihu.com","jandan.net","jxnews.com.cn","workercn.cn","zuanke8.com","blogspot.com","aliexpress.com","csair.com","aiweibang.com","cnblogs.com","cgbchina.com.cn","xywy.com","nipic.com","ih5.cn","msn.com","google.com","126.com","51credit.com","huanqiu.com","51job.com","jrj.com.cn","tgfcer.com","chooseauto.com.cn","17track.net","weather.com.cn","doubleclick.net","doc88.com","258.com","muchong.com","huim.com","91jm.com","92lux.cn","114so.cn","pptv.com","pchome.net","chinabyte.com","g-fox.cn","chinadaily.com.cn","xiamp4.com","huawei.com","ccidnet.com","amap.com","xdf.cn","chouti.com","lofter.com","meizu.com","duomai.com","ctrip.com","mozilla.org","25pp.com","mgtv.com","95516.com","renren.com","amazon.co.jp","yahoo.co.jp","cnnic.cn","goldcarpet.cn","xiu.com","guancha.cn","17k.com","nih.gov","tumblr.com","10086.cn","winshang.com","ali213.net","loldytt.com","sobaidupan.com","huihui.cn","gusuwang.com","xiami.com","cs.com.cn","juooo.com","chinaso.com","cnr.cn","ftchinese.com","egou.com","bilibili.com","ctfile.com","dahe.cn","mama.cn","cpta.com.cn","google.com.sg","meishichina.com","kdslife.com","ci123.com","alipay.com","k618.cn","oschina.net","epwk.com","amazon.com","cnmo.com","36kr.com","lashou.com","alimama.com","cntv.cn","yinyuetai.com","gmw.cn","acfun.tv","cisco.com","github.io","cnbeta.com","3dmgame.com","122.gov.cn","kaixin001.com","xunlei.com","dragonparking.com","segmentfault.com","mydrivers.com","blizzard.cn","beva.com","17173.com","sdo.com","zol.com.cn","smzdm.com","steamcommunity.com","kugou.com","rednet.cn","scol.com.cn","taobao.com","alibaba.com","jiemian.com","11467.com","adobe.com","cncn.org.cn","7k7k.com","techweb.com.cn","fanli.com","tibet.cn","bankofchina.com","iconfont.cn","3dwwwgame.com","dbw.cn","icbc.com.cn","amazon.co.uk","55haitao.com","anjuke.com","xinjunshi.com","mydigit.cn","oeeee.com","jiayuan.com","sq.cn","p5w.net","avmo.pw","pixiv.net","niuche.com","qidian.com","vmall.com","6pm.com","skycn.com","wtoip.com","xiaomi.cn","sznews.com","zhibo8.cc","dgtle.com","cyzone.cn","fudan.edu.cn","saraba1st.com","jumei.com","jiameng.com","xitek.com","tmall.com","qianzhan.com","xinhuanet.com","pcgames.com.cn","chinaz.com","stockstar.com","voc.com.cn","iqiyi.com","lesports.com","sinaimg.cn","ed2000.com","bitauto.com","znds.com","alexa.cn","xcar.com.cn","reddit.com","salesforce.com","xueqiu.com","paypal.com","youku.com","lagou.com","focus.cn","joyme.com","southcn.com","haosou.com","cnki.net","a9vg.com","bigccq.cn","dix3.com","hjenglish.com","steampowered.com","07073.com","to8to.com","gome.com.cn","4399.com","cr173.com","wangtu.com","365jia.cn","fengniao.com","amazon.de","lianjia.com","w3school.com.cn","douban.com","baiducontent.com","viidii.info","yhd.com","huomaotv.cn","pingan.com","51.la","wanfangdata.com.cn","imdb.com","tianya.cn","yinxiang.com","thepaper.cn","123cha.com","baomihua.com","dangdang.com","fobshanghai.com","qunar.com","2mnd56.com","jjwxc.net","alitrip.com","ycwb.com","boc.cn","ebrun.com","tower.im","kuaidi100.com","stackexchange.com","youboy.com","tmall.hk","5dcar.com","zhanqi.tv","battlenet.com.cn","facebook.com","umeng.com","linkedin.com","amazon.fr","pc6.com","apple.com","51cto.com","eastmoney.com","huya.com","gh0089.com","douyu.com","wordpress.com","dygang.com","zaobao.com","3987.com","uuu9.com","iiyi.com","ems.com.cn","google.co.jp","yxdown.com","haitao.com","newsmth.net","hc360.com","pconline.com.cn","sina.cn","189.cn","dotamax.com","sonhoo.com","gfan.com","bjrcb.com","duowan.com","yunpan.cn","jb51.net","pcbaby.com.cn","miercn.com","runoob.com","miui.com","soku.com","admaimai.com","chiphell.com","cn163.net","sanguosha.com","toutiao.com","ku6.com","meituan.com","globaltimes.cn","kdnet.net","chsi.com.cn","pcauto.com.cn","makepolo.com","zybang.com","dilidili.com","ttmeiju.com","hao123.com","engadget.com","baidu.com","baidu.com.cn","ifeng.com","google.cn","sohu.com","netease.com","weibo.com","wish.com","cdstm.cn","familydoctor.com.cn","163.com","jianshu.com","ooopic.com","cmbchina.com","jiyoujia.com","zhaopin.com","icloud.com","51sole.com","mi.com","ynet.com","stackoverflow.com","17ok.com","6vhao.com","51auto.com","youtube.com","enet.com.cn","zealer.com","docin.com","godaddy.com","force.com","ithome.com","firefoxchina.cn","liepin.com","uc.cn","iteye.com","tgbus.com","quanjing.com","chengdu.cn","wikipedia.org","178.com","eol.cn","verycd.com","zjol.com.cn","atpanel.com","ganji.com","sourceforge.net","eelly.com","99114.com","btso.pw","btime.com","icolor.com.cn","tuniu.com","58pic.com","oracle.com","wenkang.cn","52pojie.cn","cqnews.net","39yst.com","panda.tv","jqw.com","zimuzu.tv","g4d7.com","babyschool.com.cn","hexun.com","babytree.com","linktech.cn","yahoo.com","iciba.com","t66y.com","ea3w.com","qyer.com","duba.com","netcoc.com","10010.com","sina.com.cn","flyertea.com","youdao.com","qinqinbaby.com","qq.com","jmw.com.cn","chekb.com","weiyun.com","yjbys.com","dxy.cn","kafan.cn","aizhan.com","amazon.cn","cankaoxiaoxi.com","sf-express.com","jd.com","ccb.com.cn","qingdaonews.com","go108.com.cn","wtoutiao.com","kaola.com","1905.com","dwnews.com","cctv.com","cri.cn"
		};
	}

	static Boolean is_white (String host) {
		for (String s: whilte_list) {
			if (s.length() == host.length()) {
				if (host.equals(s)) {
					return true;
				}
			} else if (s.length() < host.length()) {
				if (host.endsWith("." + s)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static double score (String host) {
		double result = 0.0;
		host = host.toLowerCase();
		if (!is_white(host)) {
			if (host.length() > 20) {
				result += (host.length() - 20) * 0.1;
			}
			for (String s: whilte_list) {
				int p = host.indexOf(s);
				if (p > 1 && (host.charAt(p - 1) == '.' || host.charAt(p - 1) == '-')) {
					return (double)s.length();
				}
			}
			host = host.replace("0", "o");
			host = host.replace("l", "1");
			//host = host.replace("-", "");
			for (String s: whilte_list) {
				s = s.replace("0", "o");
				s = s.replace("l", "1");
				int p = host.indexOf(s);
				if (p == 0 || (p > 1 && (host.charAt(p - 1) == '.' || host.charAt(p - 1) == '-'))) {
					return (double)s.length() + 2;
				}
			}
		}
		return result;
	}

   	public static void main(String[] args) {
   		System.out.println("t".endsWith("t"));
   		System.out.println("qq.com: " + score("qq.com"));
   		System.out.println("www.qq.com: " + score("www.qq.com"));
   		System.out.println("www.q-q.com: " + score("www.q-q.com"));
   		System.out.println("www.a-qq.com: " + score("www.a-qq.com"));
   		System.out.println("www.qq.com.monster.com: " + score("www.qq.com.monster.com"));
   		System.out.println("10086.cn: " + score("10086.cn"));
   		System.out.println("l0086.cn: " + score("l0086.cn"));
   		System.out.println("monster.com: " + score("monster.com"));
   		System.out.println("xagfjd.com: " + score("xagfjd.com"));
   		return;
   	}
}
