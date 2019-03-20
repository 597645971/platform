package com.platform.utils.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.springframework.util.Assert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.platform.constant.response.ResponseConstant;
import com.platform.model.common.SystemException;
import com.platform.response.ResponseMsg;
import com.platform.response.ResponseMsg.ResponseCode;

public class BatchUtil {

	public ResponseMsg batchDelete(Consumer<String> deleteAction, String ids) {
		Assert.notNull(ids, "ids");
		List<String> arr = JSONArray.parseArray(JSONObject.parseObject(ids).getString("ids"), String.class);
		List<Map<String, Object>> errList = new ArrayList<>();
		for (int i = 0; i < arr.size(); i++) {
			try {
				deleteAction.accept(arr.get(i));
			} catch (SystemException e) {
				Map<String, Object> err = new HashMap<>();
				err.put("i", i);
				err.put("msg", e.getMessage());
				errList.add(err);
			} catch (Exception e) {
				Map<String, Object> err = new HashMap<>();
				err.put("i", i);
				err.put("msg", ResponseConstant.FAIL);
				errList.add(err);
			}
		}
		if(CollectionUtil.isNotEmpty(errList)) {
			return new ResponseMsg(ResponseCode.WARN, errList);
		}
		return new ResponseMsg(ResponseCode.SUCCESS, ResponseConstant.SUCCESS);
	}
	
	
}
