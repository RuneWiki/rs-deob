package deob;

@ObfuscatedName("jk")
public class class270 {

    @ObfuscatedName("jk.c")
    public static char[] field3661 = new char[64];

    @ObfuscatedName("jk.o")
    public static char[] field3664;

    @ObfuscatedName("jk.i")
    public static int[] field3659;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3661[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3661[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3661[var2] = (char) (var2 + 48 - 52);
        }
        field3661[62] = '+';
        field3661[63] = '/';
        field3664 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3664[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3664[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3664[var5] = (char) (var5 + 48 - 52);
        }
        field3664[62] = '*';
        field3664[63] = '-';
        field3659 = new int[128];
        for (int var6 = 0; var6 < field3659.length; var6++) {
            field3659[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3659[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3659[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3659[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3659;
        field3659[43] = 62;
        var10[42] = 62;
        int[] var11 = field3659;
        field3659[47] = 63;
        var11[45] = 63;
    }

    public class270() throws Throwable {
        throw new Error();
    }
}
