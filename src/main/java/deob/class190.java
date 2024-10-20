package deob;

@ObfuscatedName("gj")
public class class190 extends class130 {

    @ObfuscatedName("gj.g")
    public static class125 field2782 = new class125(64);

    @ObfuscatedName("gj.x")
    public boolean field2785 = false;

    @ObfuscatedName("ed.p(II)Lgj;")
    public static class190 method2527(int arg0) {
        class190 var1 = (class190) field2782.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2787.method3044(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3194(new class154(var2));
        }
        field2782.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.g(Lev;I)V")
    public void method3194(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3195(arg0, var2);
        }
    }

    @ObfuscatedName("gj.x(Lev;IB)V")
    public void method3195(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2785 = true;
        }
    }
}
