package io.cucumber.Transform;

import cucumber.api.Transformer;

public class TransformData extends Transformer<String> {

	@Override
	public String transform(String arg0) {
		// TODO Auto-generated method stub
		return arg0+"TransformationData";
	}

}
