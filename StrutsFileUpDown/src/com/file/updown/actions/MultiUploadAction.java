/**
 * 
 */
package com.file.updown.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jack
 *
 */
public class MultiUploadAction extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7742575125049374632L;

	/**
	 * 
	 */
	public MultiUploadAction() {

	}

	private List<File> upload = new ArrayList<File>();
	private List<String> uploadFileName = new ArrayList<String>();
	private List<String> uploadContentType = new ArrayList<String>();

	private HttpServletRequest httpServletRequest;

	public String execute() {

		List<FilePOJO> filePOJOs = new ArrayList<FilePOJO>();

		for (int i = 0; i < upload.size(); i++) {
			File file = upload.get(i);
			String fileName = uploadFileName.get(i);
			String fileContentType = uploadContentType.get(i);
			filePOJOs.add(new FilePOJO(file, fileName, fileContentType));
		}

		for (FilePOJO filePOJO : filePOJOs) {
			try {
				String filePath = httpServletRequest.getSession().getServletContext().getRealPath("/");
				System.out.println("Server path:" + filePath);
				File fileToCreate = new File(filePath, filePOJO.getFileName());
				FileUtils.copyFile(filePOJO.getFile(), fileToCreate);
			} catch (Exception e) {
				e.printStackTrace();
				addActionError(e.getMessage());
			}
		}

		return SUCCESS;
	}

	/**
	 * @return the upload
	 */
	public List<File> getUpload() {
		return upload;
	}

	/**
	 * @param upload the upload to set
	 */
	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	/**
	 * @return the uploadFileNames
	 */
	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	/**
	 * @param uploadFileNames the uploadFileNames to set
	 */
	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	/**
	 * @return the uploadContentTypes
	 */
	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	/**
	 * @param uploadContentTypes the uploadContentTypes to set
	 */
	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;

	}

}
