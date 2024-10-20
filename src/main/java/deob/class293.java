package deob;

@ObfuscatedName("kj")
public class class293 {

    @ObfuscatedName("kj.p")
    public static char[] field3772 = new char[64];

    @ObfuscatedName("kj.i")
    public static char[] field3773;

    @ObfuscatedName("kj.w")
    public static int[] field3774;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3772[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3772[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3772[var2] = (char) (var2 + 48 - 52);
        }
        field3772[62] = '+';
        field3772[63] = '/';
        field3773 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3773[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3773[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3773[var5] = (char) (var5 + 48 - 52);
        }
        field3773[62] = '*';
        field3773[63] = '-';
        field3774 = new int[128];
        for (int var6 = 0; var6 < field3774.length; var6++) {
            field3774[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field3774[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field3774[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field3774[var9] = var9 - 48 + 52;
        }
        int[] var10 = field3774;
        field3774[43] = 62;
        var10[42] = 62;
        int[] var11 = field3774;
        field3774[47] = 63;
        var11[45] = 63;
    }

    public class293() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.p([BB)Ljava/lang/String;")
    public static String method1875(byte[] arg0) {
        int var1 = arg0.length;
        StringBuilder var2 = new StringBuilder();
        for (int var3 = 0; var3 < var1; var3 += 3) {
            int var4 = arg0[var3] & 0xFF;
            var2.append(field3772[var4 >>> 2]);
            if (var3 < var1 - 1) {
                int var5 = arg0[var3 + 1] & 0xFF;
                var2.append(field3772[(var4 & 0x3) << 4 | var5 >>> 4]);
                if (var3 < var1 - 2) {
                    int var6 = arg0[var3 + 2] & 0xFF;
                    var2.append(field3772[(var5 & 0xF) << 2 | var6 >>> 6]).append(field3772[var6 & 0x3F]);
                } else {
                    var2.append(field3772[(var5 & 0xF) << 2]).append("=");
                }
            } else {
                var2.append(field3772[(var4 & 0x3) << 4]).append("==");
            }
        }
        return var2.toString();
    }
}
