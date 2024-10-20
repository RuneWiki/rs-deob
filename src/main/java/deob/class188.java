package deob;

@ObfuscatedName("gm")
public class class188 extends class130 {

    @ObfuscatedName("gm.i")
    public static class125 field2753 = new class125(64);

    @ObfuscatedName("gm.a")
    public int field2750 = 0;

    @ObfuscatedName("dd.u(Lgt;B)V")
    public static void method1850(class183 arg0) {
        Statics.field2752 = arg0;
        Statics.field2751 = Statics.field2752.method3122(16);
    }

    @ObfuscatedName("af.x(II)Lgm;")
    public static class188 method672(int arg0) {
        class188 var1 = (class188) field2753.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2752.method3071(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3208(new class154(var2));
        }
        field2753.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.i(Len;S)V")
    public void method3208(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3209(arg0, var2);
        }
    }

    @ObfuscatedName("gm.a(Len;II)V")
    public void method3209(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2750 = arg0.method2581();
        }
    }
}
