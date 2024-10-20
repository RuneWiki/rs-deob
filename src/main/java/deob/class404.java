package deob;

@ObfuscatedName("pe")
public final class class404 {

    public class404() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.az(Ljava/lang/CharSequence;I)[B")
    public static byte[] method397(CharSequence arg0) {
        int var1 = arg0.length();
        byte[] var2 = new byte[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (var4 > 127) {
                var2[var3] = 63;
            } else {
                var2[var3] = (byte) var4;
            }
        }
        return var2;
    }
}
