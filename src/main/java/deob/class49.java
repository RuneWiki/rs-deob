package deob;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.b")
	public static char[] field645 = new char[100];

	@ObfuscatedName("wb.c")
	public static char[] field646 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("wb.a(IILkb;)Ljava/lang/String;")
	public static String method249(int arg0, class37 arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg0; var4++) {
			int var5 = arg1.method201();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field645[var2++] = field646[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field645[var2++] = field646[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field645[var2++] = field646[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field645[var2++] = field646[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field645[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field645[var9] = (char) (field645[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!') {
				var8 = true;
			}
		}

		return new String(field645, 0, var2);
	}

	@ObfuscatedName("wb.a(Ljava/lang/String;ZLkb;)V")
	public static void method250(String arg0, class37 arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}

		arg0 = arg0.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			char var4 = arg0.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field646.length; var6++) {
				if (field646[var6] == var4) {
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
					arg1.method193(var5);
				}
			} else if (var5 < 13) {
				arg1.method193((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg1.method193((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg1.method193(var2 << 4);
		}
	}
}
