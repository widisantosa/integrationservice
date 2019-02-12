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

import com.investasikita.integration.client.interfaces.ProductServiceProxy;
import com.investasikita.integration.client.interfaces.TransactionServiceProxy;
import com.investasikita.integration.client.model.MutualFundNAV;
import com.investasikita.integration.service.MutualFundNAVService;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;
import com.investasikita.integration.service.util.JSONReaderUtil;

@Service
@Transactional
public class MutualFundNAVServiceImpl implements MutualFundNAVService {
	private final Logger log = LoggerFactory.getLogger(MutualFundNAVServiceImpl.class);

	static ProductServiceProxy productService;
	static TransactionServiceProxy transactionService;

	public MutualFundNAVServiceImpl(ProductServiceProxy productService, TransactionServiceProxy transactionService) {
		this.productService = productService;
		this.transactionService = transactionService;
	}

	@Override
	public String getAllLastNAV() throws IOException {
		try {
			MutualFundNAVDTO mfn = new MutualFundNAVDTO();
			mfn = productService.findLastMutualFundNAVByMutualFundCode();
			log.debug("Data NAV : " + mfn.getValue());
 			transactionService.createMutualFundNAV(mfn);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage().toString();
		}

		return null;
	}

	@Override
	public MutualFundNAVDTO save(MutualFundNAVDTO mutualFundNAVDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
