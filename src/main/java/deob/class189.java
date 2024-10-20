package deob;

@ObfuscatedName("gw")
public class class189 extends class130 {

    @ObfuscatedName("gw.y")
    public static class125 field2762 = new class125(64);

    @ObfuscatedName("gw.o")
    public boolean field2763 = false;

    @ObfuscatedName("gv.k(Lgh;I)V")
    public static void method3273(class183 arg0) {
        Statics.field2766 = arg0;
    }

    @ObfuscatedName("ej.y(II)Lgw;")
    public static class189 method2510(int arg0) {
        class189 var1 = (class189) field2762.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2766.method3065(19, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3223(new class161(var2));
        }
        field2762.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.o(Lfm;I)V")
    public void method3223(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3212(arg0, var2);
        }
    }

    @ObfuscatedName("gw.r(Lfm;II)V")
    public void method3212(class161 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2763 = true;
        }
    }
}
