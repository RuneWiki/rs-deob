package deob;

@ObfuscatedName("je")
public class class262 extends class206 {

    @ObfuscatedName("je.v")
    public static class201 field3471 = new class201(64);

    @ObfuscatedName("je.y")
    public int field3473;

    @ObfuscatedName("je.r")
    public int field3472;

    @ObfuscatedName("je.h")
    public int field3474;

    @ObfuscatedName("ha.n(IB)Lje;")
    public static class262 method3884(int arg0) {
        class262 var1 = (class262) field3471.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3470.method3931(14, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4205(new class185(var2));
        }
        field3471.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.v(Lgv;B)V")
    public void method4205(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4206(arg0, var2);
        }
    }

    @ObfuscatedName("je.y(Lgv;II)V")
    public void method4206(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3473 = arg0.method3015();
            this.field3472 = arg0.method3021();
            this.field3474 = arg0.method3021();
        }
    }
}
