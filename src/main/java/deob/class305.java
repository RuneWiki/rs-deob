package deob;

@ObfuscatedName("kx")
public class class305 {

    @ObfuscatedName("kx.s")
    public static char[] field3756 = new char[64];

    @ObfuscatedName("kx.t")
    public static char[] field3757;

    @ObfuscatedName("kx.v")
    public static char[] field3758;

    @ObfuscatedName("kx.j")
    public static int[] field3761;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3756[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3756[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3756[var2] = (char) (var2 + 48 - 52);
        }
        field3756[62] = '+';
        field3756[63] = '/';
        field3757 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3757[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3757[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3757[var5] = (char) (var5 + 48 - 52);
        }
        field3757[62] = '*';
        field3757[63] = '-';
        field3758 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3758[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3758[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3758[var8] = (char) (var8 + 48 - 52);
        }
        field3758[62] = '-';
        field3758[63] = '_';
        field3761 = new int[128];
        for (int var9 = 0; var9 < field3761.length; var9++) {
            field3761[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3761[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3761[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3761[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3761;
        field3761[43] = 62;
        var13[42] = 62;
        int[] var14 = field3761;
        field3761[47] = 63;
        var14[45] = 63;
    }

    public class305() throws Throwable {
        throw new Error();
    }
}
