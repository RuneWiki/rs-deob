package deob;

@ObfuscatedName("gl")
public class class207 {

    @ObfuscatedName("gl.n")
    public static char[] field3078 = new char[64];

    @ObfuscatedName("gl.d")
    public static char[] field3080;

    @ObfuscatedName("gl.m")
    public static int[] field3079;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3078[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3078[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3078[var2] = (char) (var2 + 48 - 52);
        }
        field3078[62] = '+';
        field3078[63] = '/';
        field3080 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3080[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3080[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3080[var5] = (char) (var5 + 48 - 52);
        }
        field3080[62] = '*';
        field3080[63] = '-';
        field3079 = new int[128];
        for (int var6 = 0; var6 < field3079.length; var6++) {
            field3079[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3079[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3079[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3079[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3079;
        field3079[43] = 62;
        var10[42] = 62;
        int[] var11 = field3079;
        field3079[47] = 63;
        var11[45] = 63;
    }

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.n([BI)Ljava/lang/String;")
    public static String method1831(byte[] arg0) {
        int var1 = arg0.length;
        StringBuilder var2 = new StringBuilder();
        for (int var3 = 0; var3 < var1; var3 += 3) {
            int var4 = arg0[var3] & 0xFF;
            var2.append(field3078[var4 >>> 2]);
            if (var3 < var1 - 1) {
                int var5 = arg0[var3 + 1] & 0xFF;
                var2.append(field3078[(var4 & 0x3) << 4 | var5 >>> 4]);
                if (var3 < var1 - 2) {
                    int var6 = arg0[var3 + 2] & 0xFF;
                    var2.append(field3078[(var5 & 0xF) << 2 | var6 >>> 6]).append(field3078[var6 & 0x3F]);
                } else {
                    var2.append(field3078[(var5 & 0xF) << 2]).append("=");
                }
            } else {
                var2.append(field3078[(var4 & 0x3) << 4]).append("==");
            }
        }
        return var2.toString();
    }
}
