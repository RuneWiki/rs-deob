package deob;

@ObfuscatedName("kc")
public class class308 {

    @ObfuscatedName("kc.m")
    public static char[] field3793 = new char[64];

    @ObfuscatedName("kc.f")
    public static char[] field3792;

    @ObfuscatedName("kc.q")
    public static char[] field3796;

    @ObfuscatedName("kc.w")
    public static int[] field3794;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3793[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3793[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3793[var2] = (char) (var2 + 48 - 52);
        }
        field3793[62] = '+';
        field3793[63] = '/';
        field3792 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3792[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3792[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3792[var5] = (char) (var5 + 48 - 52);
        }
        field3792[62] = '*';
        field3792[63] = '-';
        field3796 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3796[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3796[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3796[var8] = (char) (var8 + 48 - 52);
        }
        field3796[62] = '-';
        field3796[63] = '_';
        field3794 = new int[128];
        for (int var9 = 0; var9 < field3794.length; var9++) {
            field3794[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3794[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3794[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3794[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3794;
        field3794[43] = 62;
        var13[42] = 62;
        int[] var14 = field3794;
        field3794[47] = 63;
        var14[45] = 63;
    }

    public class308() throws Throwable {
        throw new Error();
    }
}
