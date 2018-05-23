package com.jjozwik;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";

        String regex1 = "[A-Z]{1}(\\s)[a-z]{4}(\\s)[a-z]{1}(\\s)[a-z]{4}(\\.)";

        System.out.println(challenge1.matches(regex1));

        String challenge2 = "I want a ball.";

        System.out.println(challenge2.matches(regex1));

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(challenge1);

        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);

        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";

        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";

        String regex2 = "[a-z]{20}";
        String regex22 = "[abcdefg]+";
        String regex222 = "[a-g]+";
        String regex3 = "^a{3}bc{8}d{3}ef{3}g$";

        System.out.println(challenge5.matches(regex2));
        System.out.println(challenge5.matches(regex22));
        System.out.println(challenge5.matches(regex222));

        System.out.println("____________");
        System.out.println(challenge5.matches(regex3));


        String challenge7 = "abcd.135";

        String regex4 = "^[\\D]+\\.[\\d]+$";

        System.out.println(challenge7.matches(regex4));


        String challenge8 = "abcd.135uvqz.7tzik.999";

        Pattern regex5 = Pattern.compile("[\\d]+");


        Matcher matcher2 = regex5.matcher(challenge8);

        while(matcher2.find()){
            System.out.println("Occurence: " + matcher2.group());
        }

        System.out.println("________");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

        System.out.println(challenge9);

        matcher2.reset();
        matcher2 = regex5.matcher(challenge9);

        while(matcher2.find()){
            System.out.println("Occurence: " + matcher2.group());
        }

        System.out.println("________");

        String regex6 = "[\\d]+";

        Pattern pattern2 = Pattern.compile(regex6);
        Matcher matcher3 = pattern2.matcher(challenge9);

        while (matcher3.find()){
            System.out.println("Start " + matcher3.group().substring(0,1) + "\tEnd: "
                    +matcher3.group().substring(matcher3.group().length()-1, matcher3.group().length()));

        }

        Pattern pattern3 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher4 = pattern3.matcher(challenge9);

        while(matcher4.find()){
//            System.out.println(matcher4.groupCount());
            System.out.println("Start_: " + matcher4.start(1) + " end_: " + (matcher4.end(1)-1));
        }

        System.out.println("_____________");

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        System.out.println(challenge11);

        Pattern pattern11 = Pattern.compile("(\\d+\\,\\s\\d+)");
//        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);

        while(matcher11.find()){
            System.out.println("Occurence: " + matcher11.group());
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

//        String regex14 = "(^\\d{5}$)|(^\\d{5}-\\d{4}$)";
//        String regex14 = "^\\d{5}(-\\d{4})?$";

        String regex14 = "^(\\d{5})|(\\d{5}-\\d{4})$";

        System.out.println(challenge12.matches(regex14));
        System.out.println(challenge13.matches(regex14));


    }
}
