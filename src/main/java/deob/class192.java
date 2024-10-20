package deob;

@ObfuscatedName("gl")
public class class192 {

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.k(Lcm;B)V")
    public static void method3196(class102 arg0) {
        Statics.field2907 = arg0;
    }

    @ObfuscatedName("dt.y(Ldy;I)Ljava/lang/String;")
    public static String method2471(class107 arg0) {
        String var4;
        try {
            int var1 = arg0.method2151();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1838 += Statics.field2907.method2064(arg0.field1844, arg0.field1838, var2, 0, var1);
            String var3 = class202.method3004(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
