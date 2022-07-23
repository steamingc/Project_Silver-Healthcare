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
	
	
	String imgUrl;		//������ũ
	String title;		//�������
	String spanArticle;	//��� ����� ����
	String content;		//��� ��ü ����

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
				//��� ����, ����, ��ũ ���
				articleElement = photoElements.get(i);
				aElements = articleElement.select("a");
				aElement = aElements.get(0);
				
				articleUrl = aElement.attr("href");	//��縵ũ
				
				imgElement = aElement.select("img").get(0);
				imgUrl = imgElement.attr("src");	//������ũ
				title = imgElement.attr("alt");		//�������
				
				//����� ª�� ��� ���� ���
				spanElement = spanElements.get(i);
				spanArticle = spanElement.text();//��� ����� ����
				
				subDoc = Jsoup.connect(articleUrl).get();
				contentElement = subDoc.getElementById("contents");
				content = contentElement.text();	//��� ��ü ����
				
				arr[i] = title;
				arr2[i] = spanArticle;
				
//				System.out.println(title);			//��� ���� ����ϱ�
//				System.out.println(spanArticle);	//��� ����� ����ϱ�
//				System.out.println(content);		//��� ���� ����ϱ�
//				System.out.println();
			}
			System.out.println("ũ�Ѹ� ����");
		}

	}

		
