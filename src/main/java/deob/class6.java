package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("ai")
public class class6 implements class3 {

    @ObfuscatedName("ai.au")
    public final MessageDigest field13 = this.method16();

    public class6(class9 arg0) {
    }

    @ObfuscatedName("ai.au(ILjava/lang/String;J)Z")
    public boolean method26(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method15(arg1, arg2);
        return method13(var5) >= arg0;
    }

    @ObfuscatedName("ai.ae([B)I")
    public static int method13(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method24(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.ao(B)I")
    public static int method24(byte arg0) {
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

    @ObfuscatedName("ai.at(Ljava/lang/String;J)[B")
    public byte[] method15(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field13.reset();
        try {
            this.field13.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field13.digest();
    }

    @ObfuscatedName("ai.ac()Ljava/security/MessageDigest;")
    public MessageDigest method16() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
