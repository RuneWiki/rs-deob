package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("n")
public class class7 implements class12 {

    @ObfuscatedName("n.h")
    public final MessageDigest field21 = this.method54();

    public class7(class11 arg0) {
    }

    @ObfuscatedName("n.h(ILjava/lang/String;J)Z")
    public boolean method50(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method53(arg1, arg2);
        return method51(var5) >= arg0;
    }

    @ObfuscatedName("n.v([B)I")
    public static int method51(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method60(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("n.x(B)I")
    public static int method60(byte arg0) {
        int var1 = 0;
        if (arg0 == 0) {
            var1 = 8;
        } else {
            for (int var2 = arg0 & 0xFF; (var2 & 0x80) == 0; var2 <<= 0x1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("n.w(Ljava/lang/String;J)[B")
    public byte[] method53(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field21.reset();
        try {
            this.field21.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field21.digest();
    }

    @ObfuscatedName("n.t()Ljava/security/MessageDigest;")
    public MessageDigest method54() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
