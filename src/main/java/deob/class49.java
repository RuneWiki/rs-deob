package deob;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.b")
	public static char[] field653 = new char[100];

	@ObfuscatedName("wb.c")
	public static char[] field654 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("wb.a(Lkb;BI)Ljava/lang/String;")
	public static String method265(class37 arg0, int arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0.method216();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field653[var2++] = field654[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field653[var2++] = field654[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field653[var2++] = field654[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field653[var2++] = field654[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field653[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field653[var9] = (char) (field653[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!') {
				var8 = true;
			}
		}

		return new String(field653, 0, var2);
	}

	@ObfuscatedName("wb.a(Lkb;Ljava/lang/String;B)V")
	public static void method266(class37 arg0, String arg1) {
		if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}

		arg1 = arg1.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			char var4 = arg1.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field654.length; var6++) {
				if (field654[var6] == var4) {
					var5 = var6;
					break;
				}
			}

			if (var5 > 12) {
				var5 += 195;
			}

			if (var2 == -1) {
				if (var5 < 13) {
					var2 = var5;
				} else {
					arg0.method206(var5);
				}
			} else if (var5 < 13) {
				arg0.method206((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg0.method206((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg0.method206(var2 << 4);
		}
	}
}
