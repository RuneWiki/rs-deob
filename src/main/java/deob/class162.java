package deob;

@ObfuscatedName("fg")
public class class162 {

    @ObfuscatedName("fg.t")
    public static char[] field2669 = new char[64];

    @ObfuscatedName("fg.i")
    public static char[] field2668;

    @ObfuscatedName("fg.g")
    public static int[] field2670;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2669[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2669[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2669[var2] = (char) (var2 + 48 - 52);
        }
        field2669[62] = '+';
        field2669[63] = '/';
        field2668 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field2668[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field2668[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field2668[var5] = (char) (var5 + 48 - 52);
        }
        field2668[62] = '*';
        field2668[63] = '-';
        field2670 = new int[128];
        for (int var6 = 0; var6 < field2670.length; var6++) {
            field2670[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field2670[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field2670[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field2670[var9] = var9 - 48 + 52;
        }
        int[] var10 = field2670;
        field2670[43] = 62;
        var10[42] = 62;
        int[] var11 = field2670;
        field2670[47] = 63;
        var11[45] = 63;
    }

    public class162() throws Throwable {
        throw new Error();
    }
}
