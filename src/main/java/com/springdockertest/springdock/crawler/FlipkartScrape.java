package com.springdockertest.springdock.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
//
//public class FlipkartScrape {
//
//    public List<Flipkart> list = new ArrayList<Flipkart>();
//
//    public List<Flipkart> extractLink(String search) {
//        Flipkart flipkart = new Flipkart();
//        try {
//            Document document = Jsoup.connect("https://www.flipkart.com/search?q="+search+"&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off").get();
//            System.out.print("Find the response");
//            Elements elementsList = document.select("div[class=_1AtVbE col-12-12]");
//
//            for (Element element : elementsList) {
//                flipkart.setProductName(element.select("a").text());
//                flipkart.setProductUrl(element.select("a").first().attr("href"));
//                flipkart.setProductCode(element.select("div").attr("data-id"));
//                flipkart.setProductImage(element.select("img").first().attr("src"));
//
//                list.add(flipkart);
//            }
//
//        } catch (Exception es) {
//        }
//
//        return list;
//    }
//}
