package deob;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfuscatedName("k")
public class class7 implements class12 {

    @ObfuscatedName("k.f")
    public final MessageDigest field22 = this.method82();

    public class7(class11 arg0) {
    }

    @ObfuscatedName("k.f(ILjava/lang/String;J)Z")
    public boolean method66(int arg0, String arg1, long arg2) {
        byte[] var5 = this.method68(arg1, arg2);
        return method64(var5) >= arg0;
    }

    @ObfuscatedName("k.b([B)I")
    public static int method64(byte[] arg0) {
        int var1 = 0;
        byte[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            byte var4 = var2[var3];
            int var5 = method67(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }
        return var1;
    }

    @ObfuscatedName("k.l(B)I")
    public static int method67(byte arg0) {
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

    @ObfuscatedName("k.m(Ljava/lang/String;J)[B")
    public byte[] method68(String arg0, long arg1) {
        StringBuilder var4 = new StringBuilder();
        var4.append(arg0).append(Long.toHexString(arg1));
        this.field22.reset();
        try {
            this.field22.update(var4.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
        }
        return this.field22.digest();
    }

    @ObfuscatedName("k.z()Ljava/security/MessageDigest;")
    public MessageDigest method82() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
