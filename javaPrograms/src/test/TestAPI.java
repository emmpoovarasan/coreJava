package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class TestAPI {

	public void HTTPClientTestAPI(){
		String url = "http://api.espn.com/v1/sports/?apikey="; //"http://api.espn.com/v1/now/?apikey=";
		String apikey = "txe3cw2jb4vu54xcp2j597yj";
		HttpURLConnection con = null;
		try {
			con = (HttpURLConnection) (new URL(url+apikey)).openConnection();
			con.getConnectTimeout();
			con.setRequestMethod("GET");
			con.setDoInput(true);
			con.setDoOutput(true);
			con.connect();
			InputStream is = null;
			
			StringBuffer buf = new StringBuffer();
			is = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line=null;
			while( (line = br.readLine()) !=null ){
				buf.append(line+"\r\n");
				System.out.println(line);
				is.close();
				con.disconnect();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String a[]){
		TestAPI ta = new TestAPI();
		ta.HTTPClientTestAPI();
	}
}
