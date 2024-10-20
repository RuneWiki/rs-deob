package deob;

@ObfuscatedName("mp")
public class class360 {

    @ObfuscatedName("mp.h")
    public static char[] field4351 = new char[64];

    @ObfuscatedName("mp.e")
    public static char[] field4354;

    @ObfuscatedName("mp.v")
    public static char[] field4353;

    @ObfuscatedName("mp.x")
    public static int[] field4352;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4351[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4351[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4351[var2] = (char) (var2 + 48 - 52);
        }
        field4351[62] = '+';
        field4351[63] = '/';
        field4354 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field4354[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field4354[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field4354[var5] = (char) (var5 + 48 - 52);
        }
        field4354[62] = '*';
        field4354[63] = '-';
        field4353 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field4353[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field4353[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field4353[var8] = (char) (var8 + 48 - 52);
        }
        field4353[62] = '-';
        field4353[63] = '_';
        field4352 = new int[128];
        for (int var9 = 0; var9 < field4352.length; var9++) {
            field4352[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field4352[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field4352[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field4352[var12] = var12 - 48 + 52;
        }
        int[] var13 = field4352;
        field4352[43] = 62;
        var13[42] = 62;
        int[] var14 = field4352;
        field4352[47] = 63;
        var14[45] = 63;
    }

    public class360() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("go.h([BI)Ljava/lang/String;")
    public static String method3309(byte[] arg0) {
        int var1 = arg0.length;
        StringBuilder var2 = new StringBuilder();
        for (int var3 = 0; var3 < var1; var3 += 3) {
            int var4 = arg0[var3] & 0xFF;
            var2.append(field4351[var4 >>> 2]);
            if (var3 < var1 - 1) {
                int var5 = arg0[var3 + 1] & 0xFF;
                var2.append(field4351[(var4 & 0x3) << 4 | var5 >>> 4]);
                if (var3 < var1 - 2) {
                    int var6 = arg0[var3 + 2] & 0xFF;
                    var2.append(field4351[(var5 & 0xF) << 2 | var6 >>> 6]).append(field4351[var6 & 0x3F]);
                } else {
                    var2.append(field4351[(var5 & 0xF) << 2]).append("=");
                }
            } else {
                var2.append(field4351[(var4 & 0x3) << 4]).append("==");
            }
        }
        return var2.toString();
    }
}
