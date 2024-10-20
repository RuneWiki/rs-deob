package deob;

@ObfuscatedName("kk")
public class class291 {

    @ObfuscatedName("kk.q")
    public static char[] field3674 = new char[64];

    @ObfuscatedName("kk.w")
    public static char[] field3673;

    @ObfuscatedName("kk.e")
    public static char[] field3675;

    @ObfuscatedName("kk.p")
    public static int[] field3672;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3674[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3674[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3674[var2] = (char) (var2 + 48 - 52);
        }
        field3674[62] = '+';
        field3674[63] = '/';
        field3673 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3673[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3673[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3673[var5] = (char) (var5 + 48 - 52);
        }
        field3673[62] = '*';
        field3673[63] = '-';
        field3675 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3675[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3675[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3675[var8] = (char) (var8 + 48 - 52);
        }
        field3675[62] = '-';
        field3675[63] = '_';
        field3672 = new int[128];
        for (int var9 = 0; var9 < field3672.length; var9++) {
            field3672[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3672[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3672[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3672[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3672;
        field3672[43] = 62;
        var13[42] = 62;
        int[] var14 = field3672;
        field3672[47] = 63;
        var14[45] = 63;
    }

    public class291() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hj.q([BIII)Ljava/lang/String;")
    public static String method3729(byte[] arg0, int arg1, int arg2) {
        StringBuilder var3 = new StringBuilder();
        for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
            int var5 = arg0[var4] & 0xFF;
            var3.append(field3674[var5 >>> 2]);
            if (var4 < arg2 - 1) {
                int var6 = arg0[var4 + 1] & 0xFF;
                var3.append(field3674[(var5 & 0x3) << 4 | var6 >>> 4]);
                if (var4 < arg2 - 2) {
                    int var7 = arg0[var4 + 2] & 0xFF;
                    var3.append(field3674[(var6 & 0xF) << 2 | var7 >>> 6]).append(field3674[var7 & 0x3F]);
                } else {
                    var3.append(field3674[(var6 & 0xF) << 2]).append("=");
                }
            } else {
                var3.append(field3674[(var5 & 0x3) << 4]).append("==");
            }
        }
        return var3.toString();
    }
}
