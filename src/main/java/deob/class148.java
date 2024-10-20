package deob;

@ObfuscatedName("ec")
public class class148 {

    @ObfuscatedName("ec.c")
    public static final char[] field2441 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    public class148() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.j([BIII)Ljava/lang/String;")
    public static String method167(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = field2441[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }
                    var6 = var7;
                }
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }
}
