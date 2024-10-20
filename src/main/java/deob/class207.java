package deob;

@ObfuscatedName("gu")
public class class207 {

    @ObfuscatedName("gu.q")
    public static char[] field3091 = new char[64];

    @ObfuscatedName("gu.d")
    public static char[] field3093;

    @ObfuscatedName("gu.h")
    public static int[] field3090;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3091[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3091[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3091[var2] = (char) (var2 + 48 - 52);
        }
        field3091[62] = '+';
        field3091[63] = '/';
        field3093 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3093[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3093[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3093[var5] = (char) (var5 + 48 - 52);
        }
        field3093[62] = '*';
        field3093[63] = '-';
        field3090 = new int[128];
        for (int var6 = 0; var6 < field3090.length; var6++) {
            field3090[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3090[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3090[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3090[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3090;
        field3090[43] = 62;
        var10[42] = 62;
        int[] var11 = field3090;
        field3090[47] = 63;
        var11[45] = 63;
    }

    public class207() throws Throwable {
        throw new Error();
    }
}
