package com.example.demo.velocity.directive;

import org.apache.velocity.runtime.directive.Parse;

public class ExtendsDirective extends Parse {

	@Override
	public String getName() {
		return "extends";
	}

}
