package com.lipengyun.common.utils;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * 测试类
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月16日 上午9:23:57
 */
public class StreamUtilTest {

	/**
	 * 全部关闭
	 * @Title: testCloseAll 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testCloseAll() {
		 FileInputStream ips;
		try {
			ips = new FileInputStream("E:\\\\nanayun\\\\nanayun\\\\index.java");
			StreamUtil.closeAll(ips);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	/**
	 * 拷贝文件
	 * @Title: testCopy 
	 * @Description: TODO
	 * @throws IOException
	 * @return: void
	 */
	@Test
	public void testCopy() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\nanayun\\nanayun\\index.java");
		FileOutputStream fos = new FileOutputStream("E:\\nanayun\\nanayun");
		 StreamUtil.copy(fis, fos,true, false);
	}

	/**
	 * 读取文件内容
	 * 
	 * @Title: testReadTextFileInputStream 
	 * @Description: TODO
	 * @throws FileNotFoundException
	 * @return: void
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("E:\\nanayun\\nanayun\\index.java");
		
	}

	@Test
	public void testReadTextFileFile() {
		 
	}

	/**
	 * 返回输入的姓名
	 * @Title: testReadStringFromSystemIn 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testReadStringFromSystemIn() {
		StreamUtil.readStringFromSystemIn("请输入您的姓名:");
	}

	/**
	 * 返回输入的年龄,必须为数值格式
	 * @Title: testReadIntFromSystemIn 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testReadIntFromSystemIn() {
		 StreamUtil.readIntFromSystemIn("请输入您的年龄:");
	}

}
