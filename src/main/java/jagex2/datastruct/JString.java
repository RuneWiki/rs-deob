package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public final class JString {

	@ObfuscatedName("yb.g")
	public static final char[] USERHASH_CHAR = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("yb.a(Ljava/lang/String;)J")
	public static long toUserhash(String arg0) {
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length() && var3 < 12; var3++) {
			char var4 = arg0.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += var4 + 1 - 65;
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += var4 + 1 - 97;
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += var4 + 27 - 48;
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("yb.a(IJ)Ljava/lang/String;")
	public static String toRawUsername(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return "invalid_name";
		} else if (arg0 % 37L == 0L) {
			return "invalid_name";
		} else {
			int var2 = 0;
			char[] var3 = new char[12];
			while (arg0 != 0L) {
				long var4 = arg0;
				arg0 /= 37L;
				var3[11 - var2++] = USERHASH_CHAR[(int) (var4 - arg0 * 37L)];
			}

			return new String(var3, 12 - var2, var2);
		}
	}

	@ObfuscatedName("yb.a(ILjava/lang/String;)J")
	public static long hashCode(String arg0) {
		arg0 = arg0.toUpperCase();
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var1 = var1 * 61L + arg0.charAt(var3) - 32L;
			var1 = var1 + (var1 >> 56) & 0xFFFFFFFFFFFFFFL;
		}

		return var1;
	}

	@ObfuscatedName("yb.a(BI)Ljava/lang/String;")
	public static String formatIPv4(int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@ObfuscatedName("yb.b(ILjava/lang/String;)Ljava/lang/String;")
	public static String toScreenName(String arg0) {
		if (arg0.length() > 0) {
			char[] var1 = arg0.toCharArray();
			for (int var2 = 0; var2 < var1.length; var2++) {
				if (var1[var2] == '_') {
					var1[var2] = ' ';
					if (var2 + 1 < var1.length && var1[var2 + 1] >= 'a' && var1[var2 + 1] <= 'z') {
						var1[var2 + 1] = (char) (var1[var2 + 1] + 'A' - 97);
					}
				}
			}

			if (var1[0] >= 'a' && var1[0] <= 'z') {
				var1[0] = (char) (var1[0] + 'A' - 97);
			}

			return new String(var1);
		}

		return arg0;
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static String toSentenceCase(String arg0) {
		arg0 = arg0.toLowerCase();
		char[] var1 = arg0.toCharArray();
		int var2 = var1.length;
		boolean var3 = true;
		for (int var4 = 0; var4 < var2; var4++) {
			char var5 = var1[var4];
			if (var3 && var5 >= 'a' && var5 <= 'z') {
				var1[var4] = (char) (var1[var4] - 32);
				var3 = false;
			}

			if (var5 == '.' || var5 == '!') {
				var3 = true;
			}
		}

		return new String(var1);
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String getRepeatedCharacter(String arg0) {
		StringBuffer var1 = new StringBuffer();
		for (int var2 = 0; var2 < arg0.length(); var2++) {
			var1.append("*");
		}

		return var1.toString();
	}
}
