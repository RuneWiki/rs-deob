package deob;

@ObfuscatedName("qn")
public class class419 {

    @ObfuscatedName("qn.ap")
    public static char[] field4746 = new char[64];

    @ObfuscatedName("qn.aw")
    public static char[] field4745;

    @ObfuscatedName("qn.ak")
    public static char[] field4744;

    @ObfuscatedName("qn.aj")
    public static int[] field4747;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4746[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4746[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4746[var2] = (char) (var2 + 48 - 52);
        }
        field4746[62] = '+';
        field4746[63] = '/';
        field4745 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field4745[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field4745[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field4745[var5] = (char) (var5 + 48 - 52);
        }
        field4745[62] = '*';
        field4745[63] = '-';
        field4744 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field4744[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field4744[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field4744[var8] = (char) (var8 + 48 - 52);
        }
        field4744[62] = '-';
        field4744[63] = '_';
        field4747 = new int[128];
        for (int var9 = 0; var9 < field4747.length; var9++) {
            field4747[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field4747[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field4747[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field4747[var12] = var12 - 48 + 52;
        }
        int[] var13 = field4747;
        field4747[43] = 62;
        var13[42] = 62;
        int[] var14 = field4747;
        field4747[47] = 63;
        var14[45] = 63;
    }

    public class419() throws Throwable {
        throw new Error();
    }
}
