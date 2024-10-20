package deob;

@ObfuscatedName("gc")
public class class191 {

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.k(Lcl;I)V")
    public static void method79(class102 arg0) {
        Statics.field2894 = arg0;
    }

    @ObfuscatedName("n.b(Ldi;Ljava/lang/String;B)I")
    public static int method180(class107 arg0, String arg1) {
        int var2 = arg0.field1862;
        byte[] var3 = class201.method2923(arg1);
        arg0.method2229(var3.length);
        arg0.field1862 += Statics.field2894.method2053(var3, 0, var3.length, arg0.field1857, arg0.field1862);
        return arg0.field1862 - var2;
    }

    @ObfuscatedName("w.e(Ldi;B)Ljava/lang/String;")
    public static String method136(class107 arg0) {
        return method1335(arg0, 32767);
    }

    @ObfuscatedName("bo.i(Ldi;IB)Ljava/lang/String;")
    public static String method1335(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2128();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1862 += Statics.field2894.method2052(arg0.field1857, arg0.field1862, var3, 0, var2);
            return class201.method3028(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
