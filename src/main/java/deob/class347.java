package deob;

@ObfuscatedName("mz")
public class class347 {

    @ObfuscatedName("mz.v")
    public static char[] field4137 = new char[64];

    @ObfuscatedName("mz.c")
    public static char[] field4134;

    @ObfuscatedName("mz.i")
    public static char[] field4135;

    @ObfuscatedName("mz.f")
    public static int[] field4136;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4137[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4137[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4137[var2] = (char) (var2 + 48 - 52);
        }
        field4137[62] = '+';
        field4137[63] = '/';
        field4134 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field4134[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field4134[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field4134[var5] = (char) (var5 + 48 - 52);
        }
        field4134[62] = '*';
        field4134[63] = '-';
        field4135 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field4135[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field4135[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field4135[var8] = (char) (var8 + 48 - 52);
        }
        field4135[62] = '-';
        field4135[63] = '_';
        field4136 = new int[128];
        for (int var9 = 0; var9 < field4136.length; var9++) {
            field4136[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field4136[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field4136[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field4136[var12] = var12 - 48 + 52;
        }
        int[] var13 = field4136;
        field4136[43] = 62;
        var13[42] = 62;
        int[] var14 = field4136;
        field4136[47] = 63;
        var14[45] = 63;
    }

    public class347() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.v([BB)Ljava/lang/String;")
    public static String method1062(byte[] arg0) {
        return Statics.method3879(arg0, 0, arg0.length);
    }
}
