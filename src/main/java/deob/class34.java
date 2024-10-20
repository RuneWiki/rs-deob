package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("ag")
public class class34 implements class31 {

    @ObfuscatedName("ag.v")
    public final MessageDigest field250 = this.method222();

    public class34(class37 arg0) {
    }

    @ObfuscatedName("ag.v(ILjava/lang/String;J)Z")
    public boolean method208(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method211(arg1, arg2);
        return method209(var5) >= arg0;
    }

    @ObfuscatedName("ag.n([B)I")
    public static int method209(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method210(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("ag.f(B)I")
    public static int method210(byte arg0) {
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

    @ObfuscatedName("ag.y(Ljava/lang/String;J)[B")
    public byte[] method211(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field250.reset();
        try {
            this.field250.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field250.digest();
    }

    @ObfuscatedName("ag.p()Ljava/security/MessageDigest;")
    public MessageDigest method222() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
