package ua.kh.butov.subpub.exception;

public abstract class AbstractApplicationException extends IllegalArgumentException {
	private static final long serialVersionUID = -2942793223432480993L;
	private final int code;

	public AbstractApplicationException(String s, int code) {
		super(s);
		this.code = code;
	}

	public AbstractApplicationException(Throwable cause, int code) {
		super(cause);
		this.code = code;
	}

	public AbstractApplicationException(String message, Throwable cause, int code) {
		super(message, cause);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}