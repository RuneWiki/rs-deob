package deob;

@ObfuscatedName("ku")
public class class307 {

    @ObfuscatedName("ku.f")
    public static char[] field3791 = new char[64];

    @ObfuscatedName("ku.l")
    public static char[] field3792;

    @ObfuscatedName("ku.w")
    public static char[] field3793;

    @ObfuscatedName("ku.s")
    public static int[] field3794;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3791[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3791[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3791[var2] = (char) (var2 + 48 - 52);
        }
        field3791[62] = '+';
        field3791[63] = '/';
        field3792 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3792[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3792[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3792[var5] = (char) (var5 + 48 - 52);
        }
        field3792[62] = '*';
        field3792[63] = '-';
        field3793 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3793[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3793[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3793[var8] = (char) (var8 + 48 - 52);
        }
        field3793[62] = '-';
        field3793[63] = '_';
        field3794 = new int[128];
        for (int var9 = 0; var9 < field3794.length; var9++) {
            field3794[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3794[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3794[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3794[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3794;
        field3794[43] = 62;
        var13[42] = 62;
        int[] var14 = field3794;
        field3794[47] = 63;
        var14[45] = 63;
    }

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.f([BIIB)Ljava/lang/String;")
    public static String method950(byte[] arg0, int arg1, int arg2) {
        StringBuilder var3 = new StringBuilder();
        for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
            int var5 = arg0[var4] & 0xFF;
            var3.append(field3791[var5 >>> 2]);
            if (var4 < arg2 - 1) {
                int var6 = arg0[var4 + 1] & 0xFF;
                var3.append(field3791[(var5 & 0x3) << 4 | var6 >>> 4]);
                if (var4 < arg2 - 2) {
                    int var7 = arg0[var4 + 2] & 0xFF;
                    var3.append(field3791[(var6 & 0xF) << 2 | var7 >>> 6]).append(field3791[var7 & 0x3F]);
                } else {
                    var3.append(field3791[(var6 & 0xF) << 2]).append("=");
                }
            } else {
                var3.append(field3791[(var5 & 0x3) << 4]).append("==");
            }
        }
        return var3.toString();
    }
}
