package util;

public class Preferences extends XMLReaderWriter {
	private static final String ADDRESS = "preferences.xml";
	
	public Preferences() {
		readXML(ADDRESS);
	}

	public static String getAddress() {
		return address;
	}
	
	public static boolean isLink() {
		return link;
	}
	
	public static boolean isPublicStats() {
		return publicStats;
	}
	
	public static String[] getIDSet() {
		String[] IDSet = {id, secret};
		return IDSet;
	}
	
	public static void setAddress(String a) {
		address = a;
		writeXML(ADDRESS);
	}
	
	public static void setLink(boolean l) {
		link = l;
		writeXML(ADDRESS);
	}

	public static void setPublicStats(boolean p) {
		publicStats = p;
		writeXML(ADDRESS);
	}
	
	public static void setIDSet(String[] s) {
		id = s[0];
		secret = s[1];
		writeXML(ADDRESS);
	}
	
}
