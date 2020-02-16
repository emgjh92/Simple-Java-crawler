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
		// Jsoup �� �̿��� ����Ʈ �û� ���� top 5 ũ�Ѹ�
				String url = "https://news.nate.com/rank/interest?sc=sisa"; //Ÿ�� URL
				Document docu = null; // saving the all page source

				try {docu = Jsoup.connect(url).get();}
				catch (IOException e) {e.printStackTrace();}
				
				//mlt01 �ױ� select
				Elements element = docu.select("div.mlt01");    
				//title �з�
				Iterator<Element> dist = element.select("strong.tit").iterator();
				
				
				while (dist.hasNext()) {
					for(int i=1; i<6; i++) {
						System.out.print("["+i+"]  ");
						System.out.println(dist.next().text()+"\n");
					}
				}
	
	}
}
