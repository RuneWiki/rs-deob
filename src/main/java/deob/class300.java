package deob;

@ObfuscatedName("kr")
public class class300 {

    @ObfuscatedName("kr.m")
    public static char[] field3678 = new char[64];

    @ObfuscatedName("kr.o")
    public static char[] field3675;

    @ObfuscatedName("kr.q")
    public static char[] field3676;

    @ObfuscatedName("kr.j")
    public static int[] field3674;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3678[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3678[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3678[var2] = (char) (var2 + 48 - 52);
        }
        field3678[62] = '+';
        field3678[63] = '/';
        field3675 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3675[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3675[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3675[var5] = (char) (var5 + 48 - 52);
        }
        field3675[62] = '*';
        field3675[63] = '-';
        field3676 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3676[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3676[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3676[var8] = (char) (var8 + 48 - 52);
        }
        field3676[62] = '-';
        field3676[63] = '_';
        field3674 = new int[128];
        for (int var9 = 0; var9 < field3674.length; var9++) {
            field3674[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3674[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3674[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3674[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3674;
        field3674[43] = 62;
        var13[42] = 62;
        int[] var14 = field3674;
        field3674[47] = 63;
        var14[45] = 63;
    }

    public class300() throws Throwable {
        throw new Error();
    }
}
