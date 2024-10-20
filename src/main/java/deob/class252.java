package deob;

@ObfuscatedName("ia")
public class class252 {

    public class252() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iy.t(Lnv;Ljava/lang/String;I)I")
    public static int method4188(class385 arg0, String arg1) {
        int var2 = arg0.field4182;
        byte[] var3 = class304.method2118(arg1);
        arg0.method5956(var3.length);
        arg0.field4182 += Statics.field3117.method4328(var3, 0, var3.length, arg0.field4184, arg0.field4182);
        return arg0.field4182 - var2;
    }

    @ObfuscatedName("fs.v(Lnv;I)Ljava/lang/String;")
    public static String method3227(class385 arg0) {
        String var4;
        try {
            int var1 = arg0.method5972();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field4182 += Statics.field3117.method4327(arg0.field4184, arg0.field4182, var2, 0, var1);
            String var3 = Statics.method4687(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
