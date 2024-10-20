package deob;

@ObfuscatedName("hh")
public class class220 {

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.n(Lkx;Ljava/lang/String;B)I")
    public static int method3411(class311 arg0, String arg1) {
        int var2 = arg0.field3747;
        byte[] var3 = class299.method31(arg1);
        arg0.method5243(var3.length);
        arg0.field3747 += Statics.field2541.method3798(var3, 0, var3.length, arg0.field3746, arg0.field3747);
        return arg0.field3747 - var2;
    }

    @ObfuscatedName("fp.v(Lkx;I)Ljava/lang/String;")
    public static String method3388(class311 arg0) {
        return method579(arg0, 32767);
    }

    @ObfuscatedName("as.d(Lkx;II)Ljava/lang/String;")
    public static String method579(class311 arg0, int arg1) {
        try {
            int var2 = arg0.method5259();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field3747 += Statics.field2541.method3793(arg0.field3746, arg0.field3747, var3, 0, var2);
            return class299.method2924(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
