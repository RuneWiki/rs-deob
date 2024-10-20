package deob;

@ObfuscatedName("ez")
public class class152 {

    @ObfuscatedName("ez.o")
    public static char[] field2527 = new char[64];

    @ObfuscatedName("ez.l")
    public static char[] field2526;

    @ObfuscatedName("ez.g")
    public static int[] field2525;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2527[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2527[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2527[var2] = (char) (var2 + 48 - 52);
        }
        field2527[62] = '+';
        field2527[63] = '/';
        field2526 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field2526[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field2526[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field2526[var5] = (char) (var5 + 48 - 52);
        }
        field2526[62] = '*';
        field2526[63] = '-';
        field2525 = new int[128];
        for (int var6 = 0; var6 < field2525.length; var6++) {
            field2525[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field2525[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field2525[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field2525[var9] = var9 - 48 + 52;
        }
        int[] var10 = field2525;
        field2525[43] = 62;
        var10[42] = 62;
        int[] var11 = field2525;
        field2525[47] = 63;
        var11[45] = 63;
    }

    public class152() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.o([BB)Ljava/lang/String;")
    public static String method1402(byte[] arg0) {
        return method1374(arg0, 0, arg0.length);
    }

    @ObfuscatedName("by.l([BIII)Ljava/lang/String;")
    public static String method1374(byte[] arg0, int arg1, int arg2) {
        StringBuilder var3 = new StringBuilder();
        for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
            int var5 = arg0[var4] & 0xFF;
            var3.append(field2527[var5 >>> 2]);
            if (var4 < arg2 - 1) {
                int var6 = arg0[var4 + 1] & 0xFF;
                var3.append(field2527[(var5 & 0x3) << 4 | var6 >>> 4]);
                if (var4 < arg2 - 2) {
                    int var7 = arg0[var4 + 2] & 0xFF;
                    var3.append(field2527[(var6 & 0xF) << 2 | var7 >>> 6]).append(field2527[var7 & 0x3F]);
                } else {
                    var3.append(field2527[(var6 & 0xF) << 2]).append("=");
                }
            } else {
                var3.append(field2527[(var5 & 0x3) << 4]).append("==");
            }
        }
        return var3.toString();
    }
}
