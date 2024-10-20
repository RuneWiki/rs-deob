package deob;

@ObfuscatedName("gv")
public class class191 {

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.e(Ldl;Ljava/lang/String;I)I")
    public static int method2767(class107 arg0, String arg1) {
        int var2 = arg0.field1841;
        byte[] var3 = class201.method3228(arg1);
        arg0.method2063(var3.length);
        arg0.field1841 += Statics.field2902.method2006(var3, 0, var3.length, arg0.field1840, arg0.field1841);
        return arg0.field1841 - var2;
    }

    @ObfuscatedName("dm.o(Ldl;I)Ljava/lang/String;")
    public static String method2349(class107 arg0) {
        return method1730(arg0, 32767);
    }

    @ObfuscatedName("cw.y(Ldl;II)Ljava/lang/String;")
    public static String method1730(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2078();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1841 += Statics.field2902.method2007(arg0.field1840, arg0.field1841, var3, 0, var2);
            return class201.method2464(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
