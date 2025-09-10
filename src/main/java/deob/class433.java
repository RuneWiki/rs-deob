package deob;

import java.util.Locale;

@class435
@class354
@ObfuscatedName("qh")
public class class433 implements class431 {

	@ObfuscatedName("qh.af")
	public static final class433 field5101 = new class433("EN", "en", "English", class434.field5121, 0, "GB");

	@ObfuscatedName("qh.aw")
	public static final class433 field5097 = new class433("DE", "de", "German", class434.field5121, 1, "DE");

	@ObfuscatedName("qh.at")
	public static final class433 field5095 = new class433("FR", "fr", "French", class434.field5121, 2, "FR");

	@ObfuscatedName("qh.ac")
	public static final class433 field5096 = new class433("PT", "pt", "Portuguese", class434.field5121, 3, "BR");

	@ObfuscatedName("qh.ap")
	public static final class433 field5093 = new class433("NL", "nl", "Dutch", class434.field5108, 4, "NL");

	@ObfuscatedName("qh.aq")
	public static final class433 field5098 = new class433("ES", "es", "Spanish", class434.field5108, 5, "ES");

	@ObfuscatedName("qh.ao")
	public static final class433 field5099 = new class433("ES_MX", "es-mx", "Spanish (Latin American)", class434.field5121, 6, "MX");

	@ObfuscatedName("qh.as")
	public final String field5100;

	@ObfuscatedName("qh.al")
	public static final class433[] field5094;

	@ObfuscatedName("qh.au")
	public final int field5102;

	@ObfuscatedName("qh.ai")
	public final String field5103;

	static {
		class433[] var0 = method8005();
		field5094 = new class433[var0.length];
		class433[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class433 var3 = var1[var2];
			if (field5094[var3.field5102] != null) {
				throw new IllegalStateException();
			}
			field5094[var3.field5102] = var3;
		}
	}

	@ObfuscatedName("qh.at(I)[Lqh;")
	public static class433[] method8005() {
		return new class433[] { field5098, field5095, field5097, field5096, field5101, field5093, field5099 };
	}

	public class433(String arg0, String arg1, String arg2, class434 arg3, int arg4, String arg5) {
		this.field5100 = arg0;
		this.field5103 = arg1;
		this.field5102 = arg4;
		if (arg5 == null) {
			new Locale(arg1.substring(0, 2));
		} else {
			new Locale(arg1.substring(0, 2), arg5);
		}
	}

	@ObfuscatedName("qh.ac(II)Lqh;")
	public static class433 method7996(int arg0) {
		return arg0 >= 0 && arg0 < field5094.length ? field5094[arg0] : null;
	}

	@ObfuscatedName("qh.ap(I)Ljava/lang/String;")
	public String method7998() {
		return this.field5103;
	}

	@ObfuscatedName("qh.af(I)I")
	public int method34() {
		return this.field5102;
	}

	public String toString() {
		return this.method7998().toLowerCase(Locale.ENGLISH);
	}
}
