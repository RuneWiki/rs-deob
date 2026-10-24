package deob;

@ObfuscatedName("ub")
public final class class47 {

	@ObfuscatedName("ub.e")
	public static char[] field631 = new char[12];

	@ObfuscatedName("ub.f")
	public static char[] field632 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("ub.a(Ljava/lang/String;)J")
	public static long method226(String arg0) {
		arg0 = arg0.trim();
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

		return var1;
	}

	@ObfuscatedName("ub.a(BJ)Ljava/lang/String;")
	public static String method227(long arg0) {
		if (arg0 >= 0L && arg0 < 6582952005840035281L) {
			int var2 = 0;
			while (arg0 != 0L) {
				long var3 = arg0;
				arg0 /= 37L;
				field631[11 - var2++] = field632[(int) (var3 - arg0 * 37L)];
			}

			return new String(field631, 12 - var2, var2);
		}

		return "invalid_name";
	}

	@ObfuscatedName("ub.a(Ljava/lang/String;I)J")
	public static long method228(String arg0) {
		arg0 = arg0.toLowerCase();
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var1 = var1 * 61L + arg0.charAt(var3) - 32L;
		}

		return var1;
	}

	@ObfuscatedName("ub.b(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method229(String arg0) {
		arg0 = arg0.toLowerCase().trim();
		String var1 = "";
		for (int var2 = 0; var2 < arg0.length() && var2 < 12; var2++) {
			char var3 = arg0.charAt(var2);
			if (var3 >= 'a' && var3 <= 'z') {
				var1 = var1 + var3;
			} else if (var3 >= '0' && var3 <= '9') {
				var1 = var1 + var3;
			} else {
				var1 = var1 + '_';
			}
		}

		while (var1.endsWith("_")) {
			var1 = var1.substring(0, var1.length() - 1);
		}

		while (var1.startsWith("_")) {
			var1 = var1.substring(1);
		}

		return var1;
	}

	@ObfuscatedName("ub.c(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method230(String arg0) {
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

	@ObfuscatedName("ub.d(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method231(String arg0) {
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

	@ObfuscatedName("ub.a(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method232(String arg0) {
		String var1 = "";
		for (int var2 = 0; var2 < arg0.length(); var2++) {
			var1 = var1 + "*";
		}

		return var1;
	}
}
