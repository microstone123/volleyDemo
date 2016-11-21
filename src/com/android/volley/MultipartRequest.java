package com.android.volley;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.android.volley.part.Part;
import com.android.volley.toolbox.StringRequest;

public class MultipartRequest extends StringRequest {
	private Part[] parts;

	public MultipartRequest(String url, Part[] parts, Response.Listener<String> listener,
			Response.ErrorListener errorListener) {
		super(Method.POST, url, listener, errorListener);
		this.parts = parts;
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getBodyContentType() {
		return "multipart/form-data; boundary=" + Part.getBoundary();
	}

	@Override
	public byte[] getBody() throws AuthFailureError {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			Part.sendParts(baos, parts);
		} catch (IOException e) {
			VolleyLog.e(e, "error when sending parts to output!");
		}
		return baos.toByteArray();
	}
}
