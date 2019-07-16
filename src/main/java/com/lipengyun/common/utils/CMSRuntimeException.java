package com.lipengyun.common.utils;

/**
 * 抛出自定义异常
 * @ClassName: CMSRuntimeException 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月16日 上午8:47:56
 */
public class CMSRuntimeException extends RuntimeException{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public CMSRuntimeException() {
		super();
	}
	
	public CMSRuntimeException(String message) {
		super(message);
	}
	
}
