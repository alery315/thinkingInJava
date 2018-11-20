package holding_object;

import com.alibaba.fastjson.JSON;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.invoke.VolatileCallSite;
import java.util.*;

public class Test_510 {

    public static void main(String[] args) {

        String jsonString =
                "[{\"Accept\":\"*/*\",\"Accept-Encoding\":\"gzip,deflate,br\",\"Accept-Language\":\"zh-CN,zh;\",\"Cache-Control\":\"no-cache\",\"Connection\":\"close\",\"Content-Length\":\"229\",\"Content-Type\":\"multipart/form-data;\",\"Host\":\"httpbin.org\",\"User-Agent\":\"Mozilla/5.0(X11;Linuxx86_64)\",\"json\":\"true\",\"origin\":\"223.72.79.75\",\"url\":\"https://httpbin.org/post\"}]";

        JSONArray jsonArray = new JSONArray(jsonString);

        JSONObject jsonObject = (JSONObject) jsonArray.get(0);

        System.out.println(jsonObject);

        Iterator iterator = jsonObject.keys();

        List<Object> list = new ArrayList<>();


        // for each 大法
        for (String key : jsonObject.keySet()) {
            list.add(jsonObject.getString(key));
        }

        // iterator 迭代器
//        while (iterator.hasNext()) {
//            try {
//                list.add(jsonObject.getString((String) iterator.next()));
//            } catch (JSONException e) {
//                System.out.println(e.toString());
//            }
//        }
//
        Object[] objects = list.toArray();

        System.out.println(Arrays.toString(objects));


        List<Map> list1 = (List<Map>) JSON.parse(jsonString);

        Map<String, Object> map = list1.get(0);

        System.out.println(Arrays.toString(map.values().toArray()));



    }


}
