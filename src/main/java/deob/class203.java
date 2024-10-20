package deob;

@ObfuscatedName("gn")
public class class203 {

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.e(Lco;I)V")
    public static void method2040(class103 arg0) {
        Statics.field2951 = arg0;
    }

    @ObfuscatedName("es.v(Ldd;Ljava/lang/String;B)I")
    public static int method2706(class108 arg0, String arg1) {
        int var2 = arg0.field1841;
        byte[] var3 = class213.method2360(arg1);
        arg0.method2120(var3.length);
        arg0.field1841 += Statics.field2951.method2042(var3, 0, var3.length, arg0.field1842, arg0.field1841);
        return arg0.field1841 - var2;
    }

    @ObfuscatedName("dy.k(Ldd;B)Ljava/lang/String;")
    public static String method2513(class108 arg0) {
        String var4;
        try {
            int var1 = arg0.method2135();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field1841 += Statics.field2951.method2044(arg0.field1842, arg0.field1841, var2, 0, var1);
            String var3 = class213.method3347(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
