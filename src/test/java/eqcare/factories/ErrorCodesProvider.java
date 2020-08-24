package eqcare.factories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ErrorCodesProvider {
	private static Properties properties;
	static InputStream inputStream;

	private static ErrorCodesProvider instance = null;

	private ErrorCodesProvider() {

		String propFileName = "Config/errorCodes.properties";
		properties = new Properties();
		try {
			inputStream = new FileInputStream(propFileName);
			if (inputStream != null) {
				properties.load(inputStream);
			}
		} catch (IOException e) {
			System.err.println("Cannot read errorCodes.properties file.");
			e.printStackTrace();
		}
	}

	public static String read(String key) {
		String value = System.getProperty(key);
		if (value != null) {
			return value;
		}

		value = System.getenv(key);
		if (value != null) {
			return value;
		}

		value = getInstance().get(key);
		if (value != null) {
			return value;
		}

		return getInstance().get(key);
	}

	@SuppressWarnings("unchecked")
	public static <T> T read(String key, T defaultValue) {
		String value = read(key);
		try {
			if (value == null) {
				return defaultValue;
			}

			if (defaultValue instanceof Integer) {
				return (T) Integer.valueOf(value);
			}
			if (defaultValue instanceof String) {
				return (T) value;
			}
			if (defaultValue instanceof Boolean) {
				return (T) Boolean.valueOf(value);
			}
		} catch (Exception e) {
			return defaultValue;
		}

		return null;
	}

	private String get(String key) {
		return (String) properties.get(key);
	}

	private static ErrorCodesProvider getInstance() {
		return instance == null ? new ErrorCodesProvider() : instance;
	}
}
