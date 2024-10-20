package deob;

@ObfuscatedName("hd")
public class class220 {

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lx.x(Lkb;Ljava/lang/String;B)I")
    public static int method5487(class310 arg0, String arg1) {
        int var2 = arg0.field3711;
        byte[] var3 = class298.method607(arg1);
        arg0.method5164(var3.length);
        arg0.field3711 += Statics.field2514.method3672(var3, 0, var3.length, arg0.field3710, arg0.field3711);
        return arg0.field3711 - var2;
    }

    @ObfuscatedName("fh.m(Lkb;I)Ljava/lang/String;")
    public static String method3269(class310 arg0) {
        String var4;
        try {
            int var1 = arg0.method5151();
            if (var1 > 32767) {
                var1 = 32767;
            }
            byte[] var2 = new byte[var1];
            arg0.field3711 += Statics.field2514.method3671(arg0.field3710, arg0.field3711, var2, 0, var1);
            String var3 = class298.method435(var2, 0, var1);
            var4 = var3;
        } catch (Exception var6) {
            var4 = "Cabbage";
        }
        return var4;
    }
}
