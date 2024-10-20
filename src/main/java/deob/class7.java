package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("q")
public class class7 implements class12 {

    @ObfuscatedName("q.x")
    public final MessageDigest field28 = this.method64();

    public class7(class11 arg0) {
    }

    @ObfuscatedName("q.x(ILjava/lang/String;J)Z")
    public boolean method60(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method68(arg1, arg2);
        return method74(var5) >= arg0;
    }

    @ObfuscatedName("q.m([B)I")
    public static int method74(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method62(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("q.k(B)I")
    public static int method62(byte arg0) {
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

    @ObfuscatedName("q.d(Ljava/lang/String;J)[B")
    public byte[] method68(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field28.reset();
        try {
            this.field28.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field28.digest();
    }

    @ObfuscatedName("q.w()Ljava/security/MessageDigest;")
    public MessageDigest method64() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
