/**
 * 
 */
package com.file.updown.actions;

import java.io.File;

/**
 * @author jack
 *
 */
public class FilePOJO {

	/**
	 * 
	 */
	public FilePOJO() {
		// TODO Auto-generated constructor stub
	}

	private File file;
	private String fileName;
	private String fileContentType;

	/**
	 * @param file
	 * @param fileName
	 * @param fileContentType
	 */
	public FilePOJO(File file, String fileName, String fileContentType) {
		this.file = file;
		this.fileName = fileName;
		this.fileContentType = fileContentType;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
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
	 * @return the fileContentType
	 */
	public String getFileContentType() {
		return fileContentType;
	}

	/**
	 * @param fileContentType the fileContentType to set
	 */
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	@Override
	public String toString() {
		return "FilePOJO [file=" + file + ", fileName=" + fileName + ", fileContentType=" + fileContentType + "]";
	}

}
