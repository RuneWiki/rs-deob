package deob;

@ObfuscatedName("ge")
public class class191 {

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.k(Lde;I)Ljava/lang/String;")
    public static String method3071(class107 arg0) {
        return method2802(arg0, 32767);
    }

    @ObfuscatedName("eg.r(Lde;II)Ljava/lang/String;")
    public static String method2802(class107 arg0, int arg1) {
        try {
            int var2 = arg0.method2124();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1863 += Statics.field2901.method2057(arg0.field1865, arg0.field1863, var3, 0, var2);
            return class201.method487(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
