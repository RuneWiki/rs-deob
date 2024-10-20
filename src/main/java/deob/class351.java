package deob;

@ObfuscatedName("ny")
public class class351 {

    public class351() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.at(Lnh;I)V")
    public static void method438(class350 arg0) {
        Statics.field3833 = arg0;
    }

    @ObfuscatedName("by.ah(Luj;Ljava/lang/String;B)I")
    public static int method818(class527 arg0, String arg1) {
        int var2 = arg0.field5137;
        byte[] var3 = class397.method5589(arg1);
        arg0.method8408(var3.length);
        arg0.field5137 += Statics.field3833.method6177(var3, 0, var3.length, arg0.field5140, arg0.field5137);
        return arg0.field5137 - var2;
    }

    @ObfuscatedName("ej.ar(Luj;I)Ljava/lang/String;")
    public static String method2923(class527 arg0) {
        return method317(arg0, 32767);
    }

    @ObfuscatedName("an.ao(Luj;II)Ljava/lang/String;")
    public static String method317(class527 arg0, int arg1) {
        try {
            int var2 = arg0.method8426();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field5137 += Statics.field3833.method6178(arg0.field5140, arg0.field5137, var3, 0, var2);
            return class397.method1794(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
