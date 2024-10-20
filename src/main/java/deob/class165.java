package deob;

@ObfuscatedName("fg")
public class class165 {

    @ObfuscatedName("fg.a")
    public static char[] field2707 = new char[64];

    @ObfuscatedName("fg.d")
    public static char[] field2705;

    @ObfuscatedName("fg.v")
    public static int[] field2706;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2707[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2707[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2707[var2] = (char) (var2 + 48 - 52);
        }
        field2707[62] = '+';
        field2707[63] = '/';
        field2705 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field2705[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field2705[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field2705[var5] = (char) (var5 + 48 - 52);
        }
        field2705[62] = '*';
        field2705[63] = '-';
        field2706 = new int[128];
        for (int var6 = 0; var6 < field2706.length; var6++) {
            field2706[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field2706[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field2706[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field2706[var9] = var9 - 48 + 52;
        }
        int[] var10 = field2706;
        field2706[43] = 62;
        var10[42] = 62;
        int[] var11 = field2706;
        field2706[47] = 63;
        var11[45] = 63;
    }

    public class165() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.a([BI)Ljava/lang/String;")
    public static String method3005(byte[] arg0) {
        int var1 = arg0.length;
        StringBuilder var2 = new StringBuilder();
        for (int var3 = 0; var3 < var1; var3 += 3) {
            int var4 = arg0[var3] & 0xFF;
            var2.append(field2707[var4 >>> 2]);
            if (var3 < var1 - 1) {
                int var5 = arg0[var3 + 1] & 0xFF;
                var2.append(field2707[(var4 & 0x3) << 4 | var5 >>> 4]);
                if (var3 < var1 - 2) {
                    int var6 = arg0[var3 + 2] & 0xFF;
                    var2.append(field2707[(var5 & 0xF) << 2 | var6 >>> 6]).append(field2707[var6 & 0x3F]);
                } else {
                    var2.append(field2707[(var5 & 0xF) << 2]).append("=");
                }
            } else {
                var2.append(field2707[(var4 & 0x3) << 4]).append("==");
            }
        }
        return var2.toString();
    }
}
