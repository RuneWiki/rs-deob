package deob;

@ObfuscatedName("im")
public class class253 extends class206 {

    @ObfuscatedName("im.y")
    public static class201 field3377 = new class201(64);

    @ObfuscatedName("im.r")
    public int field3376 = 0;

    @ObfuscatedName("cf.n(II)Lim;")
    public static class253 method1603(int arg0) {
        class253 var1 = (class253) field3377.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field695.method3931(16, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4082(new class185(var2));
        }
        field3377.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.v(Lgv;I)V")
    public void method4082(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4081(arg0, var2);
        }
    }

    @ObfuscatedName("im.y(Lgv;II)V")
    public void method4081(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3376 = arg0.method3015();
        }
    }
}
