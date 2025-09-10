package deob;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class354
@ObfuscatedName("mj")
public class class334 {

	@ObfuscatedName("mj.at")
	public static final HashMap field3833 = new HashMap();

	static {
		Calendar.getInstance(method6493("Europe/London"));
	}

	public class334() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("mj.af(Ljava/lang/String;I)Ljava/util/TimeZone;")
	public static TimeZone method6493(String arg0) {
		HashMap var1 = field3833;
		synchronized (field3833) {
			TimeZone var2 = (TimeZone) field3833.get(arg0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(arg0);
				field3833.put(arg0, var2);
			}
			return var2;
		}
	}
}
