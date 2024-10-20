package deob;

@ObfuscatedName("bb")
public final class class53 {

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.f([BILjava/lang/CharSequence;I)I")
    public static int method187(byte[] arg0, int arg1, CharSequence arg2) {
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
