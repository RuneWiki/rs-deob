package deob;

@ObfuscatedName("hx")
public class class220 {

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gz.h(Lhu;I)V")
    public static void method3348(class219 arg0) {
        Statics.field2529 = arg0;
    }

    @ObfuscatedName("ea.v(Lkj;Ljava/lang/String;I)I")
    public static int method3126(class311 arg0, String arg1) {
        int var2 = arg0.field3752;
        byte[] var3 = class299.method2012(arg1);
        arg0.method5198(var3.length);
        arg0.field3752 += Statics.field2529.method3641(var3, 0, var3.length, arg0.field3753, arg0.field3752);
        return arg0.field3752 - var2;
    }

    @ObfuscatedName("cw.x(Lkj;B)Ljava/lang/String;")
    public static String method1976(class311 arg0) {
        String var4;
        try {
            int var1 = arg0.method5096();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field3752 += Statics.field2529.method3645(arg0.field3753, arg0.field3752, var2, 0, var1);
            String var3 = class299.method3286(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
