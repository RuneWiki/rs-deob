package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("ar")
public class class6 implements class3 {

    @ObfuscatedName("ar.am")
    public final MessageDigest field6 = this.method20();

    public class6(class9 arg0) {
    }

    @ObfuscatedName("ar.am(ILjava/lang/String;J)Z")
    public boolean method17(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method19(arg1, arg2);
        return method27(var5) >= arg0;
    }

    @ObfuscatedName("ar.ap([B)I")
    public static int method27(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method29(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.af(B)I")
    public static int method29(byte arg0) {
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

    @ObfuscatedName("ar.aj(Ljava/lang/String;J)[B")
    public byte[] method19(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field6.reset();
        try {
            this.field6.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field6.digest();
    }

    @ObfuscatedName("ar.aq()Ljava/security/MessageDigest;")
    public MessageDigest method20() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
