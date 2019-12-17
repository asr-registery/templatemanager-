/**
 * 
 */
package af.asr.templatemanager.exception.common.templatemanager.exception;

import af.asr.authadapter.exception.common.ServiceError;
import org.springframework.security.core.AuthenticationException;

import java.util.ArrayList;
import java.util.List;

public class AuthManagerException extends AuthenticationException {

	/**
	 * 
	 */

	private String errorCode;
	private static final long serialVersionUID = 4060346018688709387L;

	/**
	 * Constructor the initialize Handler exception
	 * 
	 * @param errorCode    The error code for this exception
	 * @param errorMessage The error message for this exception
	 */
	public AuthManagerException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
	}
	
	public AuthManagerException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorMessage, rootCause);
		this.errorCode = errorCode;
	}
	
	/**
	 * This variable holds the MosipErrors list.
	 */
	private List<ServiceError> list = new ArrayList<>();

	/**
	 * @param list The error list.
	 */
	public AuthManagerException(String errorCode,List<ServiceError> list) {
		super(errorCode);
		this.list = list;
	}

	/**
	 * Getter for error list.
	 * 
	 * @return The error list.
	 */
	public List<ServiceError> getList() {
		return list;
	}
}
