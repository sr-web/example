package so.sauru.web.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import so.sauru.web.restar.Controller;
import so.sauru.web.restar.Router;

public class Leg extends Controller {

	@Override
	public HashMap<String, Object> index(HashMap<String, Object> params) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		HashMap<String, Object> elem1 = new HashMap<String, Object>();
		HashMap<String, Object> elem2 = new HashMap<String, Object>();
		HashMap<String, Object> elem3 = new HashMap<String, Object>();
		HashMap<String, Object> elem4 = new HashMap<String, Object>();
		ArrayList<HashMap<?, ?>> list = new ArrayList<HashMap<?, ?>>();
		elem1.put("name", "front-left");
		elem1.put("length", "600");
		elem1.put("finger", "4");
		list.add(elem1);
		if (((String) params.get(Router.ID)).equals("*")) {
			elem2.put("name", "front-right");
			elem2.put("length", "600");
			elem2.put("finger", "4");
			list.add(elem2);
			elem3.put("name", "rear-left");
			elem3.put("length", "700");
			elem3.put("finger", "4");
			list.add(elem3);
			elem4.put("name", "rear-right");
			elem4.put("length", "700");
			elem4.put("finger", "4");
			list.add(elem4);
		} else {
			logger.trace("ok, just for " + (String) params.get(Router.ID));
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data.put(this.getClass().getSimpleName().toLowerCase(), list);
		return data;
	}

	@Override
	public HashMap<String, Object> create(HashMap<String, Object> message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> update(HashMap<String, Object> message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> delete(HashMap<String, Object> message) {
		// TODO Auto-generated method stub
		return null;
	}
}
