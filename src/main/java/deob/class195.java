package deob;

@ObfuscatedName("gc")
public class class195 extends class130 {

    @ObfuscatedName("gc.j")
    public static class125 field2847 = new class125(64);

    @ObfuscatedName("gc.c")
    public int field2845;

    @ObfuscatedName("gc.d")
    public int field2848;

    @ObfuscatedName("gc.w")
    public int field2849;

    @ObfuscatedName("co.x(Lgk;B)V")
    public static void method1890(class183 arg0) {
        Statics.field2846 = arg0;
    }

    @ObfuscatedName("fb.j(IB)Lgc;")
    public static class195 method2993(int arg0) {
        class195 var1 = (class195) field2847.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2846.method3121(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3345(new class154(var2));
        }
        field2847.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.c(Lek;I)V")
    public void method3345(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3346(arg0, var2);
        }
    }

    @ObfuscatedName("gc.d(Lek;II)V")
    public void method3346(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2845 = arg0.method2745();
            this.field2848 = arg0.method2701();
            this.field2849 = arg0.method2701();
        }
    }
}
