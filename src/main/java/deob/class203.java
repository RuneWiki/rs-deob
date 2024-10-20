package deob;

@ObfuscatedName("gm")
public class class203 {

    public class203() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.c(Ldx;B)Ljava/lang/String;")
    public static String method2413(class108 arg0) {
        return method1614(arg0, 32767);
    }

    @ObfuscatedName("cg.j(Ldx;II)Ljava/lang/String;")
    public static String method1614(class108 arg0, int arg1) {
        try {
            int var2 = arg0.method2227();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1826 += Statics.field2952.method2064(arg0.field1830, arg0.field1826, var3, 0, var2);
            return class213.method125(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
