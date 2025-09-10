package deob;

@ObfuscatedName("rg")
public class class445 {

	@ObfuscatedName("rg.af")
	public static char[] field5144 = new char[64];

	@ObfuscatedName("rg.aw")
	public static char[] field5147;

	@ObfuscatedName("rg.at")
	public static char[] field5146;

	@ObfuscatedName("rg.ac")
	public static int[] field5145;

	static {
		for (int var0 = 0; var0 < 26; var0++) {
			field5144[var0] = (char) (var0 + 65);
		}
		for (int var1 = 26; var1 < 52; var1++) {
			field5144[var1] = (char) (var1 + 97 - 26);
		}
		for (int var2 = 52; var2 < 62; var2++) {
			field5144[var2] = (char) (var2 + 48 - 52);
		}
		field5144[62] = '+';
		field5144[63] = '/';
		field5147 = new char[64];
		for (int var3 = 0; var3 < 26; var3++) {
			field5147[var3] = (char) (var3 + 65);
		}
		for (int var4 = 26; var4 < 52; var4++) {
			field5147[var4] = (char) (var4 + 97 - 26);
		}
		for (int var5 = 52; var5 < 62; var5++) {
			field5147[var5] = (char) (var5 + 48 - 52);
		}
		field5147[62] = '*';
		field5147[63] = '-';
		field5146 = new char[64];
		for (int var6 = 0; var6 < 26; var6++) {
			field5146[var6] = (char) (var6 + 65);
		}
		for (int var7 = 26; var7 < 52; var7++) {
			field5146[var7] = (char) (var7 + 97 - 26);
		}
		for (int var8 = 52; var8 < 62; var8++) {
			field5146[var8] = (char) (var8 + 48 - 52);
		}
		field5146[62] = '-';
		field5146[63] = '_';
		field5145 = new int[128];
		for (int var9 = 0; var9 < field5145.length; var9++) {
			field5145[var9] = -1;
		}
		for (int var10 = 65; var10 <= 90; var10++) {
			field5145[var10] = var10 - 65;
		}
		for (int var11 = 97; var11 <= 122; var11++) {
			field5145[var11] = var11 - 97 + 26;
		}
		for (int var12 = 48; var12 <= 57; var12++) {
			field5145[var12] = var12 - 48 + 52;
		}
		int[] var13 = field5145;
		field5145[43] = 62;
		var13[42] = 62;
		int[] var14 = field5145;
		field5145[47] = 63;
		var14[45] = 63;
	}

	public class445() throws Throwable {
		throw new Error();
	}
}
