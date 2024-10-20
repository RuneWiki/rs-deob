package deob;

@ObfuscatedName("ir")
public class class243 extends class183 {

    @ObfuscatedName("ir.i")
    public static class155 field3208 = new class155(64);

    @ObfuscatedName("ir.y")
    public boolean field3207 = false;

    @ObfuscatedName("hn.f(IB)Lir;")
    public static class243 method3654(int arg0) {
        class243 var1 = (class243) field3208.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3206.method3752(19, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method4001(new class300(var2));
        }
        field3208.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.i(Lkq;I)V")
    public void method4001(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4000(arg0, var2);
        }
    }

    @ObfuscatedName("ir.y(Lkq;II)V")
    public void method4000(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3207 = true;
        }
    }
}
