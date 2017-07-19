package main.java.phishing;

import java.util.LinkedList;
import java.util.List;

import main.java.utils.Pair;

public class ScoreTitle {
	static List<Pair<String, Double>> sensitive_word;
	
	static {
		sensitive_word = new LinkedList<Pair<String, Double>>();
		sensitive_word.add(new Pair<String, Double>("訝��쎖亮녑츎若섊퐨-訝��쎖亮녑츎岳앶솴竊덆썓�썴竊됭궊餓썸쐣�솏�뀶�뤈-岳앶솴竊뚪벛烏뚳펽�뒘壅�", 8.0));
		sensitive_word.add(new Pair<String, Double>("曆섇츧營� - 曆�!�닊�뼔轝�", 8.0));
		sensitive_word.add(new Pair<String, Double>("雅т툥�븚�윃-雅т툥�븚�윃若섉뼶營묊쳶!", 8.0));
		sensitive_word.add(new Pair<String, Double>("雅т툥-轝�瓦롧쇉壤�", 8.0));
		sensitive_word.add(new Pair<String, Double>("雅т툥(JD.COM)-瀯쇔릦營묋눌腰뽭��-閭ｅ뱚鵝롣뻔�곩뱚兀ⓧ퓷�슌�곲뀓�곩룋�뿶�곮슥�씭兀��돥竊�", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖燁삣뒯若섉뼶營묊쳶", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖�걫�싩퐨訝딂맓訝싧럢", 8.0));
		sensitive_word.add(new Pair<String, Double>("�땹若곫삌兀�(Suning) -瀯쇔릦營묇툓兀��돥�븚�윃,閭ｅ뱚烏뚩뇻,�뀲�쎖�걫岳�,兀㎩댆餓섉Ь竊�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�뵪�댎�쇉壤� - �땹若곫삌兀�", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝듿ㄹ�뙧竊뚦갚鸚잋틙", 8.0));
		sensitive_word.add(new Pair<String, Double>("營묇툓擁끻툊1�뤇佯쀯펽�쐛�뒟�쐛�뮦�쐛�뿶�뿴", 8.0));
		sensitive_word.add(new Pair<String, Double>("1�뤇佯쀧쇉壤�", 8.0));
		sensitive_word.add(new Pair<String, Double>("雅싮ß��-營묇툓兀��돥�븚�윃竊싪쫨營묋눌, 弱길씎Z.cn!", 8.0));
		sensitive_word.add(new Pair<String, Double>("Amazon &#30331;&#24405;", 8.0));
		sensitive_word.add(new Pair<String, Double>("�뵱�뱚鴉싷펷�렅Vipshop.com竊됬돶�뜓鴉싷폏訝�若뜸툜�뿨�걳�돶�뜓�쉪營묊쳶_簾�岳앮�ｅ뱚_簾�岳앬퐥餓�_兀㎩댆餓섉Ь", 8.0));
		sensitive_word.add(new Pair<String, Double>("�뵱�뱚鴉싩퐨塋숂쇉壤�", 8.0));
		sensitive_word.add(new Pair<String, Double>("獰롣맒瑥닳�붺쇋窯녺쉪�뀲�릡野쇠눌", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤� 竊� 獰롣맒瑥�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�삌瓦끿퐨-訝볞툣�쉪�뵷�꼹�곫빊�쟻若띄뵷�곫뎸�쑛�곫굵饔��뵪�뱚�곲엹�쐨�쇍兀㎫퐨訝딀빊�쟻鸚㎩뜓�쑛 - �삌瓦끿퐨", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쎖獰롥쑉瀛�(GOME)-瀯쇔릦營묋눌�븚�윃竊뚧�ｅ뱚鵝롣뻔�곩뱚兀ⓧ퓷�슌�곩엮�잓�곮씨�곩츎恙껅쐨�뒦竊�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�뵪�댎�쇉壤�-�쎖獰롥쑉瀛�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�걳獰롣폍�뱚 - �먩엨�잌뀓葉롥틭 �뱚�뎹�삻鴉ょ쟻�묉�ｅ뱚�뙑倻녶뱚�썴兀�營묊쳶BJ,�뛽訝뉒뵪�댎�렓�뜍,�땰弱�30鸚⒵뿞�씉餓띌��兀�!", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤뺠걳獰�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�뜋訝뷴븚�윃若섊퐨-�룓堊쎾뜋訝뷸뎸�쑛(", 8.0));
		sensitive_word.add(new Pair<String, Double>("轝�瓦롨�욥뿮訝��쎖兩븃�얗벛烏뚨퐨塋�", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖兩븃�얗벛烏� 訝や볶若€댎營묇툓�벛烏�", 8.0));
		sensitive_word.add(new Pair<String, Double>("雅ㅹ�싮벛烏� - 雅ㅹ벛�뇫�엻營�", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝�營묌�싦말窈� -- �떅�븚�벛烏뚦츟�뼶營묊쳶", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖�벛烏뚦뀲�릡�뿨�댎營묊쳶", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖藥ε븚�벛烏뚥릎�쎖營묊쳶", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖�넑訝싮벛烏�", 8.0));
		sensitive_word.add(new Pair<String, Double>("腰뽭〉 - 亮욕룕�벛烏�", 8.0));
		sensitive_word.add(new Pair<String, Double>("訝��쎖�궙�붃�궓�뱞�벛烏�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤� - 壤볟퐪營�", 8.0));
		sensitive_word.add(new Pair<String, Double>("壤볟퐪�붺퐨訝딂눌�돥訝�恙껓폏�쎗阿╉�곫칾惹담�곭풆倻녴�곩�뜹콉�곫빊�쟻�곩�띄뵷�곫쐨獒끹�곲엹�똿嶺됵펽閭ｅ뱚鵝롣뻔竊뚩뇻�댆餓섉Ь", 8.0));
		sensitive_word.add(new Pair<String, Double>("126營묉삌�뀓兀백궙--鵝좂쉪訝볞툣�뵷耶먬궙掠�", 8.0));
		sensitive_word.add(new Pair<String, Double>("163營묉삌�뀓兀백궙--訝��뻼�궙嶸긺К訝��뱚�뎹", 8.0));
		sensitive_word.add(new Pair<String, Double>("鴉곦툣�궙嶸깁쥍�닼��|163鴉곦툣�궙嶸�-營묉삌鴉곦툣�궙嶸�-鸚뽬뉨鴉곦툣�궙嶸�-訝��뻼鴉곦툣�궙嶸깁쫿�됧뱚�뎹鰲ｅ넶�뼶旅�", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤뷦Q�궙嶸�", 8.0));
		sensitive_word.add(new Pair<String, Double>("QQ令븅뿴-�늽雅ョ뵟域삼펽�븰鵝뤸꽏�뒯", 8.0));
		sensitive_word.add(new Pair<String, Double>("孃��뜗-�쉹�뿶�쉹�쑑�룕�렟�뼭縟쒍틟", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤� - �뵱餓섇츧", 8.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤� | 獰롥썴營�", 8.0));
		sensitive_word.add(new Pair<String, Double>("[若�]轝�瓦롨�욥뿮�뀲�쎖岳←뵪�쑉瀛욜뵵瑥룝릎恙�", 15.0));
		sensitive_word.add(new Pair<String, Double>("�쇉壤�", 2.0));
		sensitive_word.add(new Pair<String, Double>("�쇉�솁", 3.0));
		sensitive_word.add(new Pair<String, Double>("訝�也�", 2.0));
		sensitive_word.add(new Pair<String, Double>("�듊也�", 2.0));
		sensitive_word.add(new Pair<String, Double>("岳←뵪", 2.0));
	}

	public static double score(String title) {
		double result = 0.0;
		for (Pair<String, Double> p: sensitive_word) {
			if (title.indexOf(p.first) != -1 && p.second > result) {
				result = p.second;
			}
		}
		return result;
	}

   	public static void main(String[] args) {
   		System.out.println(score("[若�]轝�瓦롨�욥뿮�뀲�쎖岳←뵪�쑉瀛욜뵵瑥룝릎恙�"));
   		System.out.println(score(" [若�]轝�瓦롨�욥뿮�뀲�쎖岳←뵪�쑉瀛욜뵵瑥룝릎恙� "));
   	}
}
