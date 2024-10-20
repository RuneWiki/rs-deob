package deob;

@ObfuscatedName("pf")
public class class402 {

    @ObfuscatedName("pf.am")
    public static char[] field4494 = new char[64];

    @ObfuscatedName("pf.ap")
    public static char[] field4493;

    @ObfuscatedName("pf.af")
    public static char[] field4495;

    @ObfuscatedName("pf.aj")
    public static int[] field4496;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4494[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4494[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4494[var2] = (char) (var2 + 48 - 52);
        }
        field4494[62] = '+';
        field4494[63] = '/';
        field4493 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field4493[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field4493[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field4493[var5] = (char) (var5 + 48 - 52);
        }
        field4493[62] = '*';
        field4493[63] = '-';
        field4495 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field4495[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field4495[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field4495[var8] = (char) (var8 + 48 - 52);
        }
        field4495[62] = '-';
        field4495[63] = '_';
        field4496 = new int[128];
        for (int var9 = 0; var9 < field4496.length; var9++) {
            field4496[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field4496[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field4496[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field4496[var12] = var12 - 48 + 52;
        }
        int[] var13 = field4496;
        field4496[43] = 62;
        var13[42] = 62;
        int[] var14 = field4496;
        field4496[47] = 63;
        var14[45] = 63;
    }

    public class402() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hp.am([BIII)Ljava/lang/String;")
    public static String method3731(byte[] arg0, int arg1, int arg2) {
        StringBuilder var3 = new StringBuilder();
        for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
            int var5 = arg0[var4] & 0xFF;
            var3.append(field4494[var5 >>> 2]);
            if (var4 < arg2 - 1) {
                int var6 = arg0[var4 + 1] & 0xFF;
                var3.append(field4494[(var5 & 0x3) << 4 | var6 >>> 4]);
                if (var4 < arg2 - 2) {
                    int var7 = arg0[var4 + 2] & 0xFF;
                    var3.append(field4494[(var6 & 0xF) << 2 | var7 >>> 6]).append(field4494[var7 & 0x3F]);
                } else {
                    var3.append(field4494[(var6 & 0xF) << 2]).append("=");
                }
            } else {
                var3.append(field4494[(var5 & 0x3) << 4]).append("==");
            }
        }
        return var3.toString();
    }
}
