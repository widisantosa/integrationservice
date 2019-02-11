package com.investasikita.integration.service.impl;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investasikita.integration.service.MutualFundNAVService;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;
import com.investasikita.integration.service.util.JSONReaderUtil;

@Service
@Transactional
//@AuthorizedUserFeignClient(name = "mftransactionservice")
public class MutualFundNAVServiceImpl implements MutualFundNAVService {
	private final Logger log = LoggerFactory.getLogger(MutualFundNAVServiceImpl.class);

	private static final String PRODUCT_SERVICE_NAV_API = "http://localhost:8084/mutual-fund-navs/getlastnavbycode/";
	private static final String TRANSACTION_SERVICE_NAV_API = "http://localhost:8085/mutual-fund-navs/getlastnavbycode/";

	// private final MutualFundNAVService mutualFundNAVService;
	// public MutualFundNAVServiceImpl(MutualFundNAVService mutualFundNAVService) {
	// this.mutualFundNAVService = mutualFundNAVService;
	// }

	@Override
	public String getAllLastNAV() throws IOException {
		try {
			HttpClient client = new DefaultHttpClient();
			JSONObject json = JSONReaderUtil.readJSONUrl(PRODUCT_SERVICE_NAV_API);
			/*
			 * MutualFundNAVDTO obj = new MutualFundNAVDTO(); obj.setId(json.getLong("id"));
			 * obj.setEffectiveDate((Instant) (json.get("effective_date")));
			 * obj.setValue(new BigDecimal(json.getDouble("jhi_value")));
			 * obj.setCreatedAt((Instant) json.get("created_at"));
			 * obj.setCreatedBy(json.getString("created_by")); obj.setUpdatedAt((Instant)
			 * json.get("updated_at")); obj.setUpdatedBy(json.getString("updated_by"));
			 * obj.setStatus(json.getString("status"));
			 * obj.setMutualFundCode(json.getString("mutual_fund_code"));
			 */
			HttpPost post = new HttpPost(TRANSACTION_SERVICE_NAV_API);
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("id", json.getLong("id"));
			jsonObj.put("effective_date", json.get("effective_date"));
			jsonObj.put("jhi_value", json.get("jhi_value"));
			jsonObj.put("created_at", json.get("created_at"));
			jsonObj.put("created_by", json.get("created_by"));
			jsonObj.put("updated_at", json.get("updated_at"));
			jsonObj.put("updated_by", json.get("updated_by"));
			jsonObj.put("status", json.get("status"));
			jsonObj.put("mutual_fund_code", json.get("mutual_fund_code"));
			StringEntity se = new StringEntity(jsonObj.toString());
			// StringEntity input = new StringEntity('product');
			post.setEntity(se);
			HttpResponse response = client.execute(post);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public MutualFundNAVDTO save(MutualFundNAVDTO mutualFundNAVDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
