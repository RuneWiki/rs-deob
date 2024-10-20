package deob;

@ObfuscatedName("iu")
public class class257 extends class209 {

    @ObfuscatedName("iu.m")
    public static class203 field3269 = new class203(64);

    @ObfuscatedName("iu.j")
    public int field3266 = 0;

    @ObfuscatedName("fv.c(Lih;B)V")
    public static void method3131(class250 arg0) {
        Statics.field3268 = arg0;
        Statics.field3267 = Statics.field3268.method4222(16);
    }

    @ObfuscatedName("fp.q(IB)Liu;")
    public static class257 method3091(int arg0) {
        class257 var1 = (class257) field3269.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3268.method4210(16, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4413(new class185(var2));
        }
        field3269.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.m(Lgg;I)V")
    public void method4413(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4411(arg0, var2);
        }
    }

    @ObfuscatedName("iu.j(Lgg;II)V")
    public void method4411(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3266 = arg0.method3245();
        }
    }
}
