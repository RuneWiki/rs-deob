package deob;

@ObfuscatedName("kh")
public class class290 {

    @ObfuscatedName("kh.c")
    public static char[] field3627 = new char[64];

    @ObfuscatedName("kh.x")
    public static char[] field3629;

    @ObfuscatedName("kh.t")
    public static char[] field3628;

    @ObfuscatedName("kh.g")
    public static int[] field3630;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3627[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3627[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3627[var2] = (char) (var2 + 48 - 52);
        }
        field3627[62] = '+';
        field3627[63] = '/';
        field3629 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3629[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3629[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3629[var5] = (char) (var5 + 48 - 52);
        }
        field3629[62] = '*';
        field3629[63] = '-';
        field3628 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3628[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3628[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3628[var8] = (char) (var8 + 48 - 52);
        }
        field3628[62] = '-';
        field3628[63] = '_';
        field3630 = new int[128];
        for (int var9 = 0; var9 < field3630.length; var9++) {
            field3630[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3630[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3630[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3630[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3630;
        field3630[43] = 62;
        var13[42] = 62;
        int[] var14 = field3630;
        field3630[47] = 63;
        var14[45] = 63;
    }

    public class290() throws Throwable {
        throw new Error();
    }
}
