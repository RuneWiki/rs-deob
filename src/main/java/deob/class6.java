package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("ap")
public class class6 implements class3 {

    @ObfuscatedName("ap.at")
    public final MessageDigest field11 = this.method19();

    public class6(class9 arg0) {
    }

    @ObfuscatedName("ap.at(ILjava/lang/String;J)Z")
    public boolean method15(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method18(arg1, arg2);
        return method16(var5) >= arg0;
    }

    @ObfuscatedName("ap.an([B)I")
    public static int method16(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method17(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.av(B)I")
    public static int method17(byte arg0) {
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

    @ObfuscatedName("ap.as(Ljava/lang/String;J)[B")
    public byte[] method18(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field11.reset();
        try {
            this.field11.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field11.digest();
    }

    @ObfuscatedName("ap.ax()Ljava/security/MessageDigest;")
    public MessageDigest method19() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
