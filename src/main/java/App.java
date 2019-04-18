
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
	static String url1="http://www.sercankaradeniz.com/bet.html";
	static String tipster1WinColourCode="#FF0000";
	static String tipster1LossColourCode="#00CC00";
    public static void main( String[] args ) throws IOException
    {
    	List<Result> todayTips=new ArrayList<Result>();
		
		URL apsURL = new URL(url1);
		URLConnection yc = apsURL.openConnection();

		
		//Very imp section below
		//study target request and simulate

		yc.addRequestProperty("X-Requested-With", "com.bettingtipsapp.bettingtips");
		yc.addRequestProperty("Host", "www.sercankaradeniz.com");
		yc.setRequestProperty("User-Agent",
				"Mozilla/5.0 (Linux; Android 5.1.1; SM-G903F Build/LMY47X; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/51.0.2704.81 Mobile Safari/537.36");
        //
		
		String html = "";
		
		 /*BufferedReader in = new BufferedReader(new
		 InputStreamReader(yc.getInputStream())); String inputLine; while
		 ((inputLine = in.readLine()) != null) html += inputLine; in.close();*/
		 

		html = "<!DOCTYPE html><!-- saved from url=(0033)http://bettingtips.zz.mu/bet.html --><html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'><meta charset='utf-8'><title>Betting Tips</title><link href='public_html/bet_files/stil.css' rel='stylesheet' type='text/css'><style type='text/css'>body table tbody tr td {	background-color: #C9F;	color: #FFFFFF;}body,td,th {	font-size: xx-small;	text-align: center;}body {	background-color: #0C9;}</style><script>  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');  ga('create', 'UA-65980720-2', 'auto');  ga('send', 'pageview');</script><!-- TemplateParam name='OptionalRegion1' type='boolean' value='true' --></head><body style='-webkit-box-shadow: inset 0px 0px 0px #000000; box-shadow: inset 0px 0px 0px #000000; color: #333; font-size: xx-small; background-color: #000000;'><table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr bgcolor='#FF0000'>      <th height='29' bgcolor='#00FF00' style='background-color: #333333; color: #FFFF33; font-family: Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif; font-style: normal; font-weight: bolder; font-size: large; text-align: center; border-radius: 5px;'><p>      <em>02.08.2016 BETTING TIPS</em>      </p></th>    </tr>  </tbody></table><table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr bgcolor='#FF0000'>      <th height='30' align='center' bgcolor='#00FFFF' style='color: #000; font-family: Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif; font-style: normal; font-weight: bolder; font-size: medium; text-align: center; border-radius: 5px;'><p>        <a href='https://play.google.com/store/apps/details?id=com.bettingtipsapp.bettingtips'><span style='color: #000'><span style='color: #000'>WE NEED YOUR HELP!</span> PLEASE CLICK GIVE 5 STARS! </span></a>      </p></th>    </tr>  </tbody></table><table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr>      <td width='13%' height='38' style='background-color: #3E3E3E; text-align: center; border-radius: 10px;'><p>        <span style='text-align: center'><img src='finn.png' alt='' width='35' height='35'></span>      </p></td>      <td width='30%' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Consolas, &#39;Andale Mono&#39;, &#39;Lucida Console&#39;, &#39;Lucida Sans Typewriter&#39;, Monaco, &#39;Courier New&#39;, monospace; font-style: normal; font-weight: bold; font-size: small; text-align: center; border-radius: 5px;'><p>        PK 35      </p></td>      <td width='34%' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Consolas, &#39;Andale Mono&#39;, &#39;Lucida Console&#39;, &#39;Lucida Sans Typewriter&#39;, Monaco, &#39;Courier New&#39;, monospace; font-style: normal; font-weight: bolder; font-size: small; text-align: center; border-radius: 5px;'>Ilves</td>      <td width='9%' rowspan='2' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Baskerville, 'Palatino Linotype', Palatino, 'Century Schoolbook L', 'Times New Roman', serif; font-weight: bold; font-size: medium; text-align: center; border-radius: 10px; font-style: normal;'><p>        1.35      </p></td>      <td width='14%' rowspan='2' bgcolor='#000000' style='color: #FFFFFF; background-color: #333333; font-style: normal; font-size: large; text-decoration: none; text-align: center; border-radius: 10px 10px 10vmin; font-weight: bold; font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif;'>?</td>    </tr>    <tr>      <td width='13%' style='background-color: #333333; text-align: center; border-radius: 10px; font-size: small; color: #FFF;'><p>        17:30      </p></td>      <td height='19' colspan='2' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; text-align: center; font-style: normal; font-variant: normal; font-size: small; border-radius: 5px;'><blockquote>Over 1.5</blockquote></td>    </tr>  </tbody></table><table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr bgcolor='#FF0000'>      <th height='31' align='center' bgcolor='#00CC00' style='color: #000024; font-family: Segoe, 'Segoe UI', 'DejaVu Sans', 'Trebuchet MS', Verdana, sans-serif; font-style: normal; font-weight: bolder; font-size: large; text-align: center; border-radius: 5px;'><p>        <a href='https://play.google.com/store/apps/details?id=com.bettingtipsapp.vipbettingpremium'><span style='color: #FF0'><span style='color: #000'>31/07 NEW VIP APP! TODAY WON 4/4 %99 SUCCES! CLICK AND DOWNLOAD! </span></span></a>      </p></th>    </tr>  </tbody></table><table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr>      <td width='13%' height='38' style='background-color: #3E3E3E; text-align: center; border-radius: 10px;'><p>        <span style='text-align: center'><img src='cll.png' alt='' width='35' height='35'></span>      </p></td>      <td width='30%' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Consolas, &#39;Andale Mono&#39;, &#39;Lucida Console&#39;, &#39;Lucida Sans Typewriter&#39;, Monaco, &#39;Courier New&#39;, monospace; font-style: normal; font-weight: bold; font-size: small; text-align: center; border-radius: 5px;'><p>        Karabakh Agdam      </p></td>      <td width='34%' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Consolas, &#39;Andale Mono&#39;, &#39;Lucida Console&#39;, &#39;Lucida Sans Typewriter&#39;, Monaco, &#39;Courier New&#39;, monospace; font-style: normal; font-weight: bolder; font-size: small; text-align: center; border-radius: 5px;'>Viktoria Plzen</td>      <td width='9%' rowspan='2' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Baskerville, 'Palatino Linotype', Palatino, 'Century Schoolbook L', 'Times New Roman', serif; font-weight: bold; font-size: medium; text-align: center; border-radius: 10px; font-style: normal;'><p>        1.40      </p></td>      <td width='14%' rowspan='2' bgcolor='#000000' style='color: #FFFFFF; background-color: #333333; font-style: normal; font-size: large; text-decoration: none; text-align: center; border-radius: 10px 10px 10vmin; font-weight: bold; font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif;'>?</td>    </tr>    <tr>      <td width='13%' style='background-color: #333333; text-align: center; border-radius: 10px; font-size: small; color: #FFF;'><p>        18:30      </p></td>      <td height='19' colspan='2' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; text-align: center; font-style: normal; font-variant: normal; font-size: small; border-radius: 5px;'><blockquote>Under 2.5</blockquote></td>    </tr>  </tbody></table>.<table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr>      <td width='13%' height='38' style='background-color: #3E3E3E; text-align: center; border-radius: 10px;'><p>        <span style='text-align: center'><img src='isvec.png' alt='' width='35' height='35'></span>      </p></td>      <td width='30%' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Consolas, &#39;Andale Mono&#39;, &#39;Lucida Console&#39;, &#39;Lucida Sans Typewriter&#39;, Monaco, &#39;Courier New&#39;, monospace; font-style: normal; font-weight: bold; font-size: small; text-align: center; border-radius: 5px;'><p>        Orgryte IS      </p></td>      <td width='34%' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Consolas, &#39;Andale Mono&#39;, &#39;Lucida Console&#39;, &#39;Lucida Sans Typewriter&#39;, Monaco, &#39;Courier New&#39;, monospace; font-style: normal; font-weight: bolder; font-size: small; text-align: center; border-radius: 5px;'>Åtvidabergs FF</td>      <td width='9%' rowspan='2' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Baskerville, 'Palatino Linotype', Palatino, 'Century Schoolbook L', 'Times New Roman', serif; font-weight: bold; font-size: medium; text-align: center; border-radius: 10px; font-style: normal;'><p>        1.40      </p></td>      <td width='14%' rowspan='2' bgcolor='#000000' style='color: #FFFFFF; background-color: #333333; font-style: normal; font-size: large; text-decoration: none; text-align: center; border-radius: 10px 10px 10vmin; font-weight: bold; font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif;'>?</td>    </tr>    <tr>      <td width='13%' style='background-color: #333333; text-align: center; border-radius: 10px; font-size: small; color: #FFF;'><p>      19:00      </p></td>      <td height='19' colspan='2' style='background-color: #3E3E3E; color: #FFFFFF; font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; text-align: center; font-style: normal; font-variant: normal; font-size: small; border-radius: 5px;'><blockquote>Under 3.5</blockquote></td>    </tr>  </tbody></table><table width='100%' border='0' cellpadding='2' cellspacing='2'>  <tbody>    <tr>      <td width='50%' bgcolor='#CCCCCC' style='background-color: #CCCCCC; text-align: center; border-radius: 10px; font-family: aclonica; font-style: normal; font-weight: 400; font-size: small; color: #FFF;'><a href='public_html/bet.html'>TODAY'S TIPS</a></td>      <td width='50%' height='22' colspan='2' bgcolor='#D6D6D6' style='text-align: center; color: #FFF; background-color: #999999; border-radius: 10px; font-size: small;'><a href='old.html'>OLD TIPS</a></td>    </tr>  </tbody></table></body></html>";

		System.out.println(html);
		org.jsoup.nodes.Document doc = Jsoup.parse(html, "", Parser.xmlParser());
		Elements ele = doc.select("body > table");
		for (Element node : ele) {
			int i=0;
			int b=i;
			try
			{
			String EventDate=node.select("tbody > tr > th > p > em").text();
			break;
			}
			catch(Exception ex)
			{
				
			}
			Elements rows= node.select("tbody > tr");
			if(rows.size()==2)
			{
				String leagueimageName=node.select("tbody > tr:nth-child(1) > td:nth-child(1) > p > span > img").first().attr("src");
				String match=node.select("tbody > tr:nth-child(1) > td:nth-child(2) > p").text() +" - "+node.select("tbody > tr:nth-child(1) > td:nth-child(3)").text();
				
				String odds=node.select("tbody > tr:nth-child(1) > td:nth-child(4) > p").text() ;
				String condition=node.select("tbody > tr:nth-child(2) > td:nth-child(2) > blockquote").text() ;
				String matchTime=node.select("tbody > tr:nth-child(2) > td:nth-child(1) > p").text() ;
				int ifTipWon=-1;
				String resultColourCode=node.select("tbody > tr:nth-child(1) > td:nth-child(5)").first().attr("background-color");
				if(resultColourCode.equals(tipster1WinColourCode))
				{
					ifTipWon=1;
					
				}
				else if(resultColourCode.equals(tipster1LossColourCode))
				{
					ifTipWon=0;
				}
				
				Result r =new Result(match,condition,leagueimageName,odds,ifTipWon,matchTime);
				todayTips.add(r);
			}
		}
    }
}
