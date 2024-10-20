package deob;

@ObfuscatedName("ix")
public class class255 extends class206 {

    @ObfuscatedName("ix.v")
    public static class201 field3406 = new class201(64);

    @ObfuscatedName("ix.y")
    public boolean field3407 = false;

    @ObfuscatedName("in.n(II)Lix;")
    public static class255 method3900(int arg0) {
        class255 var1 = (class255) field3406.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3409.method3931(19, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4110(new class185(var2));
        }
        field3406.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.v(Lgv;I)V")
    public void method4110(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4108(arg0, var2);
        }
    }

    @ObfuscatedName("ix.y(Lgv;II)V")
    public void method4108(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3407 = true;
        }
    }
}
