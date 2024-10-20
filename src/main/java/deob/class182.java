package deob;

@ObfuscatedName("fh")
public class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.z(Ldp;B)V")
    public static void method1229(class119 arg0) {
        Statics.field2776 = arg0;
    }

    @ObfuscatedName("cv.h(Ldq;Ljava/lang/String;B)I")
    public static int method2027(class126 arg0, String arg1) {
        int var2 = arg0.field2003;
        byte[] var3 = class148.method2429(arg1);
        arg0.method2448(var3.length);
        arg0.field2003 += Statics.field2776.method2361(var3, 0, var3.length, arg0.field2007, arg0.field2003);
        return arg0.field2003 - var2;
    }

    @ObfuscatedName("e.c(Ldq;I)Ljava/lang/String;")
    public static String method143(class126 arg0) {
        String var4;
        try {
            int var1 = arg0.method2463();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field2003 += Statics.field2776.method2362(arg0.field2007, arg0.field2003, var2, 0, var1);
            String var3 = class148.method2212(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
