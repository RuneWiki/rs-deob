package deob;

@ObfuscatedName("fg")
public class class181 {

    public class181() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.m(Lcf;I)V")
    public static void method1003(class99 arg0) {
        Statics.field2839 = arg0;
    }

    @ObfuscatedName("o.k(Lcb;Ljava/lang/String;I)I")
    public static int method508(class104 arg0, String arg1) {
        int var2 = arg0.field1806;
        byte[] var3 = class191.method1762(arg1);
        arg0.method2209(var3.length);
        arg0.field1806 += Statics.field2839.method2061(var3, 0, var3.length, arg0.field1808, arg0.field1806);
        return arg0.field1806 - var2;
    }

    @ObfuscatedName("aa.y(Lcb;I)Ljava/lang/String;")
    public static String method796(class104 arg0) {
        return method2412(arg0, 32767);
    }

    @ObfuscatedName("ds.g(Lcb;II)Ljava/lang/String;")
    public static String method2412(class104 arg0, int arg1) {
        try {
            int var2 = arg0.method2143();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1806 += Statics.field2839.method2063(arg0.field1808, arg0.field1806, var3, 0, var2);
            return Statics.method1356(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
