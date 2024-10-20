package deob;

@ObfuscatedName("oq")
public class class384 {

    @ObfuscatedName("oq.at")
    public static char[] field4392 = new char[64];

    @ObfuscatedName("oq.an")
    public static char[] field4393;

    @ObfuscatedName("oq.av")
    public static char[] field4394;

    @ObfuscatedName("oq.as")
    public static int[] field4395;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4392[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4392[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4392[var2] = (char) (var2 + 48 - 52);
        }
        field4392[62] = '+';
        field4392[63] = '/';
        field4393 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field4393[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field4393[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field4393[var5] = (char) (var5 + 48 - 52);
        }
        field4393[62] = '*';
        field4393[63] = '-';
        field4394 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field4394[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field4394[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field4394[var8] = (char) (var8 + 48 - 52);
        }
        field4394[62] = '-';
        field4394[63] = '_';
        field4395 = new int[128];
        for (int var9 = 0; var9 < field4395.length; var9++) {
            field4395[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field4395[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field4395[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field4395[var12] = var12 - 48 + 52;
        }
        int[] var13 = field4395;
        field4395[43] = 62;
        var13[42] = 62;
        int[] var14 = field4395;
        field4395[47] = 63;
        var14[45] = 63;
    }

    public class384() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ny.at([BIIB)Ljava/lang/String;")
    public static String method6075(byte[] arg0, int arg1, int arg2) {
        StringBuilder var3 = new StringBuilder();
        for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
            int var5 = arg0[var4] & 0xFF;
            var3.append(field4392[var5 >>> 2]);
            if (var4 < arg2 - 1) {
                int var6 = arg0[var4 + 1] & 0xFF;
                var3.append(field4392[(var5 & 0x3) << 4 | var6 >>> 4]);
                if (var4 < arg2 - 2) {
                    int var7 = arg0[var4 + 2] & 0xFF;
                    var3.append(field4392[(var6 & 0xF) << 2 | var7 >>> 6]).append(field4392[var7 & 0x3F]);
                } else {
                    var3.append(field4392[(var6 & 0xF) << 2]).append("=");
                }
            } else {
                var3.append(field4392[(var5 & 0x3) << 4]).append("==");
            }
        }
        return var3.toString();
    }
}
