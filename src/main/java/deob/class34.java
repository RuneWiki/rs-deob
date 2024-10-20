package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("aw")
public class class34 implements class31 {

    @ObfuscatedName("aw.f")
    public final MessageDigest field228 = this.method224();

    public class34(class37 arg0) {
    }

    @ObfuscatedName("aw.f(ILjava/lang/String;J)Z")
    public boolean method220(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method223(arg1, arg2);
        return method219(var5) >= arg0;
    }

    @ObfuscatedName("aw.o([B)I")
    public static int method219(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method225(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.u(B)I")
    public static int method225(byte arg0) {
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

    @ObfuscatedName("aw.p(Ljava/lang/String;J)[B")
    public byte[] method223(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field228.reset();
        try {
            this.field228.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field228.digest();
    }

    @ObfuscatedName("aw.b()Ljava/security/MessageDigest;")
    public MessageDigest method224() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
