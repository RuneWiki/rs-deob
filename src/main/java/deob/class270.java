package deob;

@ObfuscatedName("jy")
public class class270 {

    @ObfuscatedName("jy.i")
    public static char[] field3685 = new char[64];

    @ObfuscatedName("jy.w")
    public static char[] field3688;

    @ObfuscatedName("jy.a")
    public static int[] field3686;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3685[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3685[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3685[var2] = (char) (var2 + 48 - 52);
        }
        field3685[62] = '+';
        field3685[63] = '/';
        field3688 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3688[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3688[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3688[var5] = (char) (var5 + 48 - 52);
        }
        field3688[62] = '*';
        field3688[63] = '-';
        field3686 = new int[128];
        for (int var6 = 0; var6 < field3686.length; var6++) {
            field3686[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3686[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3686[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3686[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3686;
        field3686[43] = 62;
        var10[42] = 62;
        int[] var11 = field3686;
        field3686[47] = 63;
        var11[45] = 63;
    }

    public class270() throws Throwable {
        throw new Error();
    }
}
