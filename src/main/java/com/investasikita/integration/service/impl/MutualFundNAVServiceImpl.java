package com.investasikita.integration.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investasikita.integration.client.interfaces.ProductServiceProxy;
import com.investasikita.integration.client.interfaces.TransactionServiceProxy;
import com.investasikita.integration.service.MutualFundNAVService;
import com.investasikita.integration.service.dto.InvestmentMutualFundDTO;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;

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
	public void getAllLastNAV() {
		try {
			MutualFundNAVDTO mfn;
			// transactionService.delete();

			List<Object[]> obj = productService.getLastNAVAllMutualFund();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			log.debug("obj.size():" + obj.size());

			for (int i = 0; i < obj.size(); i++) {
				mfn = new MutualFundNAVDTO();
				mfn.setId(Long.valueOf(obj.get(i)[0].toString()));
				mfn.setMutualFundCode(obj.get(i)[1].toString());
				mfn.setValue(new BigDecimal(obj.get(i)[3].toString()));
				mfn.setEffectiveDate((sdf.parse(obj.get(i)[2].toString())).toInstant());
				mfn.setStatus("APPROVED");
				mfn.setCreatedAt(Instant.now());
				mfn.setCreatedBy("system");
				mfn.setUpdatedAt(Instant.now());
				mfn.setUpdatedBy("system");
				// log.debug("Id :" + mfn.getEffectiveDate());
				transactionService.createMutualFundNAV(mfn);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage().toString();
		}
	}

	@Override
	public void getAllInventmentMutualFund() {
		try {
			InvestmentMutualFundDTO im;
			// transactionService.delete();

			List<Object[]> obj = productService.getAllProductsInvestmentManager();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			log.debug("obj.size():" + obj.size());
			Random r = new Random();
			int rNumber = r.nextInt(99 - 10) + 10;

			for (int i = 0; i < obj.size(); i++) {
				im = new InvestmentMutualFundDTO();
				im.setId((long)rNumber);
 				im.setMutualFundCode(obj.get(i)[0].toString());
				im.setMutualFundName(obj.get(i)[1].toString());
				im.setMutualFundType(obj.get(i)[2].toString());
				im.setInvestCode(obj.get(i)[3].toString());
				im.setInvestName(obj.get(i)[4].toString());
				im.setProductType("MUTUALFUND");
				im.setLogoPath("");
 				// log.debug("Id :" + mfn.getEffectiveDate());
				transactionService.createInvestmentMutualFund(im);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage().toString();
		}
	}
	
}
