/**
 * 
 */
package com.file.updown.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jack
 *
 */
public class DownloadAction extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -902824756793958764L;

	/**
	 * 
	 */
	public DownloadAction() {

	}

	private InputStream inputStream;

	private HttpServletRequest httpServletRequest;

	// getter for the inputStream

	private long contentLength;
	String fileName = null;

	public String execute() throws FileNotFoundException {

		String filePath = httpServletRequest.getSession().getServletContext().getRealPath("/");

		fileName = httpServletRequest.getParameter("fileName");

		File fileToDownload = new File(filePath + fileName);
		inputStream = new FileInputStream(fileToDownload);

		contentLength = fileToDownload.length();
		return SUCCESS;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the inputStream
	 */
	public InputStream getInputStream() {
		return inputStream;
	}

	/**
	 * @param inputStream the inputStream to set
	 */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	/**
	 * @return the contentLength
	 */
	public long getContentLength() {
		return contentLength;
	}

	/**
	 * @param contentLength the contentLength to set
	 */
	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

}
