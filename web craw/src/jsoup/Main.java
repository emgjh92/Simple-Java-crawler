package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.Iterator;
//Jsoup Lib

public class Main {
	public static void main(String[] args) {
		// Jsoup 을 이용한 네이트 시사 뉴스 top 5 크롤링
				String url = "https://news.nate.com/rank/interest?sc=sisa"; //타겟 URL
				Document docu = null; // saving the all page source

				try {docu = Jsoup.connect(url).get();}
				catch (IOException e) {e.printStackTrace();}
				
				//mlt01 테그 select
				Elements element = docu.select("div.mlt01");    
				//title 분류
				Iterator<Element> dist = element.select("strong.tit").iterator();
				
				
				while (dist.hasNext()) {
					for(int i=1; i<6; i++) {
						System.out.print("["+i+"]  ");
						System.out.println(dist.next().text()+"\n");
					}
				}
	
	}
}
