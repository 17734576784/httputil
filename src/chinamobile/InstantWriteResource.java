/**   
* @Title: getDeviceInfo.java 
* @Package chinamobile 
* @Description: TODO(用一句话描述该文件做什么) 
* @author dbr
* @date 2019年1月3日 上午9:56:12 
* @version V1.0   
*/
package chinamobile;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import httpUtil.HttpsClientUtil;
import httpUtil.StreamClosedHttpResponse;

/** 
* @ClassName: getDeviceInfo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author dbr
* @date 2019年1月3日 上午9:56:12 
*  
*/
public class InstantWriteResource {

	/**
	 * @throws Exception  
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			String urlReg="https://118.24.175.15:443/chinamobile/instantresource";
			JSONObject json = new JSONObject();
			json.put("imei", "000001956811234");
			json.put("obj_id", "1");
			json.put("obj_inst_id", "1");
			json.put("mode", "2");
			
			JSONArray array = new JSONArray();
			JSONObject item = new JSONObject();
			
			item.put("res_id", 1);
			item.put("type", 1);
			item.put("val", 1);
			array.add(item);
			
			json.put("data", array);
			
	       HttpsClientUtil httpsClientUtil = new HttpsClientUtil();
	       StreamClosedHttpResponse responseReg = httpsClientUtil.doPostJsonGetStatusLine(urlReg, json.toJSONString());

	       System.out.println("RegisterDirectlyConnectedDevice, response content:");
	       System.out.print(responseReg.getStatusLine());
	       System.out.println(responseReg.getContent());
	       System.out.println();
	}

}
