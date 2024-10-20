package deob;

@ObfuscatedName("kw")
public class class304 {

    @ObfuscatedName("kw.f")
    public static char[] field3748 = new char[64];

    @ObfuscatedName("kw.e")
    public static char[] field3746;

    @ObfuscatedName("kw.v")
    public static char[] field3749;

    @ObfuscatedName("kw.y")
    public static int[] field3747;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3748[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3748[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3748[var2] = (char) (var2 + 48 - 52);
        }
        field3748[62] = '+';
        field3748[63] = '/';
        field3746 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3746[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3746[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3746[var5] = (char) (var5 + 48 - 52);
        }
        field3746[62] = '*';
        field3746[63] = '-';
        field3749 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3749[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3749[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3749[var8] = (char) (var8 + 48 - 52);
        }
        field3749[62] = '-';
        field3749[63] = '_';
        field3747 = new int[128];
        for (int var9 = 0; var9 < field3747.length; var9++) {
            field3747[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3747[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3747[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3747[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3747;
        field3747[43] = 62;
        var13[42] = 62;
        int[] var14 = field3747;
        field3747[47] = 63;
        var14[45] = 63;
    }

    public class304() throws Throwable {
        throw new Error();
    }
}
