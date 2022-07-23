package News;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class News {
	String url;
	Document doc, subDoc;
	Elements elements, photoElements, spanElements, aElements;
	Element element, articleElement, aElement, imgElement, spanElement, contentElement;
	String articleUrl;
	
	
	String imgUrl;		//사진링크
	String title;		//기사제목
	String spanArticle;	//기사 썸네일 내용
	String content;		//기사 전체 내용

	String[] arr, arr2;
	
	public String[] getArr() {
		return arr;
	}
	
	public String[] getArr2() {
		return arr2;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

	public String getTitle() {
		return title;
	}

	public String getSpanArticle() {
		return spanArticle;
	}

	public String getContent() {
		return content;
	}

	
	public News() {
		try {
			crawling();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
//	public void returnNews() throws IOException {
//		new News();
//		
//		for(int i=0; i<photoElements.size(); i++) {
//			System.out.println(arr[i]);
//			System.out.println();
//			System.out.println(arr2[i]);
//		}
//	}
	
	
	public static void main(String[] args) throws IOException {
		new News();
//		p.returnNews();
//		new News();
	}
	
//	public static void main(String[] args) throws IOException {
	public void crawling() throws IOException {
			url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid1=103&sid2=241&date=20220721&page=2";
			doc = Jsoup.connect(url).get();
			elements = doc.getElementsByAttributeValue("class", "type06_headline");
			
			element = elements.get(0);
			photoElements = element.getElementsByAttributeValue("class", "photo");
			spanElements = element.getElementsByAttributeValue("class", "lede");
			
			arr = new String[photoElements.size()];
			arr2 = new String[photoElements.size()];
			
			for(int i=0; i<photoElements.size(); i++) {
				//기사 제목, 사진, 링크 출력
				articleElement = photoElements.get(i);
				aElements = articleElement.select("a");
				aElement = aElements.get(0);
				
				articleUrl = aElement.attr("href");	//기사링크
				
				imgElement = aElement.select("img").get(0);
				imgUrl = imgElement.attr("src");	//사진링크
				title = imgElement.attr("alt");		//기사제목
				
				//썸네일 짧은 기사 내용 출력
				spanElement = spanElements.get(i);
				spanArticle = spanElement.text();//기사 썸네일 내용
				
				subDoc = Jsoup.connect(articleUrl).get();
				contentElement = subDoc.getElementById("contents");
				content = contentElement.text();	//기사 전체 내용
				
				arr[i] = title;
				arr2[i] = spanArticle;
				
//				System.out.println(title);			//기사 제목 출력하기
//				System.out.println(spanArticle);	//기사 썸네일 출력하기
//				System.out.println(content);		//기사 내용 출력하기
//				System.out.println();
			}
			System.out.println("크롤링 종료");
		}

	}

		
