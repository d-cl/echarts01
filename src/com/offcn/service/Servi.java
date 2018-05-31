package com.offcn.service;

import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.offcn.bean.GCSize;
import com.offcn.bean.Sta;
import com.offcn.mapper.GCMapper;
import com.offcn.mapper.StaMapper;

@Service
public class Servi {

	@Autowired
	private GCMapper gm;
	@Autowired
	private StaMapper sm;
	
	@Transactional(readOnly=true)
	public String getCount(){
		List<GCSize> list = gm.getCount();
		String str = JSONArray.fromObject(list).toString();
		return str;
	}
	
	@Transactional(readOnly=true)
	public String getSta(){
		List<Sta> list = sm.getSta();
		return JSONArray.fromObject(list).toString();
	}
}
