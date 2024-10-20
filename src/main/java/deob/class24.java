package deob;

@ObfuscatedName("gv")
public class class24 {

    public class24() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.o(Ldy;II)Ljava/lang/String;")
    public static String method1179(class31 arg0, int arg1) {
        try {
            int var2 = arg0.method384();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field172 += Statics.field117.method621(arg0.field168, arg0.field172, var3, 0, var2);
            return class89.method588(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @ObfuscatedName("bt.p(Ldy;Ljava/lang/String;B)I")
    public static int method1983(class31 arg0, String arg1) {
        int var2 = arg0.field172;
        byte[] var3 = class89.method1550(arg1);
        arg0.method369(var3.length);
        arg0.field172 += Statics.field117.method625(var3, 0, var3.length, arg0.field168, arg0.field172);
        return arg0.field172 - var2;
    }

    @ObfuscatedName("ck.j(Lde;B)V")
    public static void method2784(class37 arg0) {
        Statics.field117 = arg0;
    }
}
