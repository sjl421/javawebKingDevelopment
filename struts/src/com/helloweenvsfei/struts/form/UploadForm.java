/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.helloweenvsfei.struts.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

/**
 * MyEclipse Struts Creation date: 05-03-2008
 * 
 * XDoclet definition:
 * 
 * @struts.form name="uploadForm"
 */
public class UploadForm extends ActionForm {

	private static final long serialVersionUID = 4007691117706656067L;

	private FormFile file;

	private String action;

	private String text;

	public FormFile getFile() {
		return file;
	}

	public void setFile(FormFile file) {
		this.file = file;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}