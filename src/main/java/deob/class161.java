package deob;

@ObfuscatedName("fu")
public class class161 {

    @ObfuscatedName("fu.n")
    public static char[] field2622 = new char[64];

    @ObfuscatedName("fu.d")
    public static char[] field2623;

    @ObfuscatedName("fu.s")
    public static int[] field2621;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2622[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2622[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2622[var2] = (char) (var2 + 48 - 52);
        }
        field2622[62] = '+';
        field2622[63] = '/';
        field2623 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field2623[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field2623[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field2623[var5] = (char) (var5 + 48 - 52);
        }
        field2623[62] = '*';
        field2623[63] = '-';
        field2621 = new int[128];
        for (int var6 = 0; var6 < field2621.length; var6++) {
            field2621[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field2621[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field2621[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field2621[var9] = var9 - 48 + 52;
        }
        int[] var10 = field2621;
        field2621[43] = 62;
        var10[42] = 62;
        int[] var11 = field2621;
        field2621[47] = 63;
        var11[45] = 63;
    }

    public class161() throws Throwable {
        throw new Error();
    }
}
