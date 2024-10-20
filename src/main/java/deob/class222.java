package deob;

@ObfuscatedName("hf")
public class class222 {

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.z(Lda;B)Ljava/lang/String;")
    public static String method1130(class119 arg0) {
        String var4;
        try {
            int var1 = arg0.method2301();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1986 += Statics.field3169.method2230(arg0.field1987, arg0.field1986, var2, 0, var1);
            String var3 = class165.method1882(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
