package deob;

@ObfuscatedName("gp")
public class class198 extends class151 {

    @ObfuscatedName("gp.c")
    public static class146 field2868 = new class146(64);

    @ObfuscatedName("gp.n")
    public int field2866;

    @ObfuscatedName("gp.q")
    public int field2869;

    @ObfuscatedName("gp.t")
    public int field2870;

    @ObfuscatedName("aw.d(Lgd;I)V")
    public static void method757(class185 arg0) {
        Statics.field2867 = arg0;
    }

    @ObfuscatedName("fd.c(II)Lgp;")
    public static class198 method2846(int arg0) {
        class198 var1 = (class198) field2868.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2867.method3129(14, arg0);
        class198 var3 = new class198();
        if (var2 != null) {
            var3.method3368(new class130(var2));
        }
        field2868.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.n(Ldu;I)V")
    public void method3368(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3355(arg0, var2);
        }
    }

    @ObfuscatedName("gp.q(Ldu;II)V")
    public void method3355(class130 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2866 = arg0.method2232();
            this.field2869 = arg0.method2379();
            this.field2870 = arg0.method2379();
        }
    }

    @ObfuscatedName("du.t(B)V")
    public static void method2239() {
        field2868.method2603();
    }
}
