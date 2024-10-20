package deob;

@ObfuscatedName("je")
public class class271 {

    @ObfuscatedName("je.i")
    public static char[] field3676 = new char[64];

    @ObfuscatedName("je.j")
    public static char[] field3675;

    @ObfuscatedName("je.a")
    public static int[] field3674;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3676[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3676[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3676[var2] = (char) (var2 + 48 - 52);
        }
        field3676[62] = '+';
        field3676[63] = '/';
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
        field3674 = new int[128];
        for (int var6 = 0; var6 < field3674.length; var6++) {
            field3674[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3674[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3674[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3674[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3674;
        field3674[43] = 62;
        var10[42] = 62;
        int[] var11 = field3674;
        field3674[47] = 63;
        var11[45] = 63;
    }

    public class271() throws Throwable {
        throw new Error();
    }
}
