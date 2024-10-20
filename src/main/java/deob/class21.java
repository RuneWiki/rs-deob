package deob;

@ObfuscatedName("fq")
public final class class21 {

    public class21() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.v(Ljava/lang/CharSequence;B)I")
    public static int method1526(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (var4 <= 127) {
                var2++;
            } else if (var4 <= 2047) {
                var2 += 2;
            } else {
                var2 += 3;
            }
        }
        return var2;
    }

    @ObfuscatedName("as.c([BILjava/lang/CharSequence;B)I")
    public static int method2961(byte[] arg0, int arg1, CharSequence arg2) {
        int var3 = arg2.length();
        int var4 = arg1;
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg2.charAt(var5);
            if (var6 <= 127) {
                arg0[var4++] = (byte) var6;
            } else if (var6 <= 2047) {
                arg0[var4++] = (byte) (0xC0 | var6 >> 6);
                arg0[var4++] = (byte) (0x80 | var6 & 0x3F);
            } else {
                arg0[var4++] = (byte) (0xE0 | var6 >> 12);
                arg0[var4++] = (byte) (0x80 | var6 >> 6 & 0x3F);
                arg0[var4++] = (byte) (0x80 | var6 & 0x3F);
            }
        }
        return var4 - arg1;
    }
}
