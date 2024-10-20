package deob;

@ObfuscatedName("mr")
public class class364 {

    @ObfuscatedName("mr.f")
    public static char[] field4364 = new char[64];

    @ObfuscatedName("mr.w")
    public static char[] field4365;

    @ObfuscatedName("mr.v")
    public static char[] field4368;

    @ObfuscatedName("mr.s")
    public static int[] field4363;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4364[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4364[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4364[var2] = (char) (var2 + 48 - 52);
        }
        field4364[62] = '+';
        field4364[63] = '/';
        field4365 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field4365[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field4365[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field4365[var5] = (char) (var5 + 48 - 52);
        }
        field4365[62] = '*';
        field4365[63] = '-';
        field4368 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field4368[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field4368[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field4368[var8] = (char) (var8 + 48 - 52);
        }
        field4368[62] = '-';
        field4368[63] = '_';
        field4363 = new int[128];
        for (int var9 = 0; var9 < field4363.length; var9++) {
            field4363[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field4363[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field4363[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field4363[var12] = var12 - 48 + 52;
        }
        int[] var13 = field4363;
        field4363[43] = 62;
        var13[42] = 62;
        int[] var14 = field4363;
        field4363[47] = 63;
        var14[45] = 63;
    }

    public class364() throws Throwable {
        throw new Error();
    }
}
