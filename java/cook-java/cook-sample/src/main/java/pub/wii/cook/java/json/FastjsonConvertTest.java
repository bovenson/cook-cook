package pub.wii.cook.java.json;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.tuple.Pair;

public class FastjsonConvertTest {
    public static Pair<String, String> getJsonString() {
        JSONObject jsonParams = new JSONObject();
        jsonParams.put("linden.version", "0.0.1");
        jsonParams.put("index.refresh.time", "60");
        jsonParams.put("search.rate.limit", 200);
        jsonParams.put("enable.parallel.search", false);
        JSONObject json = new JSONObject();
        json.put("domain", "domain");
        json.put("cluster", "cluster");
        json.put("schema", "schema");
        json.put("plugins", "plugins");
        json.put("params", jsonParams.toJSONString());
        System.out.println(jsonParams);
        System.out.println(json);
        return Pair.of(jsonParams.toJSONString(), json.toJSONString());
    }

    public static void main(String[] args) {
        String s = "{\"adapt_id\":\"\",\"adapt_self\":6672130,\"app_id\":1,\"area_id\":4,\"category_description\":\"\",\"category_name\":\"行動電源\",\"comment_num\":0,\"commodity_id\":317501,\"commodity_name\":\"小米行動電源2C 20000mAh 白色\",\"commodity_short_name\":\"小米行動電源2C 20000mAh 白色\",\"commodity_sort\":0,\"description\":\"\",\"has_store\":0,\"is_batched\":0,\"is_discount\":0,\"is_new\":0,is_real\":1,\"is_sale\":1,\"keywords\":\"行動電源,小米行動電源2C20000mAh\",\"last_index_time\":1599479776,\"market_price\":159,\"pattrvalue_1\":\"\",\"pattrvalue_2\":\"\",\"pattrvalue_3\":\"\",\"pattrvalue_4\":\"\",\"pattrvalprice\":159,\"product_description\":\"\",\"product_id\":3353,\"product_name\":\"小米行動電源2C 20000mAh\",\"product_short_name\":\"小米行動電源2C 20000mAh\",\"product_sort\":0,\"search_score\":0,\"search_top\":0,\"spec_value_id\":\"2\",\"update_time\":1535946707,\"add_time\":1513679993,\"adapt_ids\":null,\"category_id\":69,\"id\":0,\"brand_id\":0}";
        // JSON
    }
}
