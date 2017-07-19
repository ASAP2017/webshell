package main.java.phishing;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import main.java.utils.Pair;

public class ScoreContent {
	static List<Pair<Pattern, Double>> sensitive_word;
	static List<Pair<Pattern, Double>> sensitive_word_once;
	
	static {
		sensitive_word = new LinkedList<Pair<Pattern, Double>>();
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*轝�瓦롥뀎訝답벵訝쒎븚�윃.*"), 10.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*轝�瓦롧쇉壤�(�뜋訝�|�떦�옖|QQ|qq|�끍溫�|�끍溫칝q|�끍溫칀Q|�쇍佯�|雅т툥|曆섇츧|�뵱餓섇츧|獰롥썴|孃�岳�|�뼭役ゅ쒜�뜗)躍먨뤇.*"), 8.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*藥꿰퍘�룕�붂.{0,20}也뽭뇫.*"), 10.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*Forgot Apple ID or password.*"), 10.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*亦→쐣Apple ID.{10}�렟�쑉�닗兩뷰�訝�.*"), 10.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*鹽쇔뱚.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*也뽭뇫.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*訝�也�.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*�듊也�.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*壅싮뮦.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*窯앭벧.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*�뀓兀�.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*�룕�붂.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*訝뗥룕.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*�쇉�솁.*"), 1.0));
		sensitive_word.add(new Pair<Pattern, Double>(Pattern.compile(".*�쇉壤�.*"), 1.0));
		sensitive_word_once = new LinkedList<Pair<Pattern, Double>>();
	}
	
	public static double score(String text) {
		double result = 0.0;
		for (Pair<Pattern, Double> p: sensitive_word) {
			if (p.first.matcher(text).matches()) {
				result += p.second;
			}
		}
		return result;
	}

   	public static void main(String[] args) {
   		System.out.println(score("藥꿰퍘�룕�붂 17332305 �뀇也뽭뇫"));
   	}
}
