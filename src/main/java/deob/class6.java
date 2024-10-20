package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("aq")
public class class6 implements class3 {

    @ObfuscatedName("aq.ac")
    public final MessageDigest field7 = this.method17();

    public class6(class9 arg0) {
    }

    @ObfuscatedName("aq.ac(ILjava/lang/String;J)Z")
    public boolean method13(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method20(arg1, arg2);
        return method14(var5) >= arg0;
    }

    @ObfuscatedName("aq.ae([B)I")
    public static int method14(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method15(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.ag(B)I")
    public static int method15(byte arg0) {
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

    @ObfuscatedName("aq.am(Ljava/lang/String;J)[B")
    public byte[] method20(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field7.reset();
        try {
            this.field7.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field7.digest();
    }

    @ObfuscatedName("aq.ax()Ljava/security/MessageDigest;")
    public MessageDigest method17() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
