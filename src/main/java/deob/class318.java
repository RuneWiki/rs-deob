package deob;

@ObfuscatedName("lk")
public class class318 {

    @ObfuscatedName("lk.c")
    public static char[] field3925 = new char[64];

    @ObfuscatedName("lk.i")
    public static char[] field3924;

    @ObfuscatedName("lk.o")
    public static int[] field3926;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3925[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3925[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3925[var2] = (char) (var2 + 48 - 52);
        }
        field3925[62] = '+';
        field3925[63] = '/';
        field3924 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3924[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3924[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3924[var5] = (char) (var5 + 48 - 52);
        }
        field3924[62] = '*';
        field3924[63] = '-';
        field3926 = new int[128];
        for (int var6 = 0; var6 < field3926.length; var6++) {
            field3926[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3926[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3926[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3926[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3926;
        field3926[43] = 62;
        var10[42] = 62;
        int[] var11 = field3926;
        field3926[47] = 63;
        var11[45] = 63;
    }

    public class318() throws Throwable {
        throw new Error();
    }
}
