package deob;

@ObfuscatedName("ia")
public class class243 extends class176 {

    @ObfuscatedName("ia.f")
    public static class146 field3241 = new class146(64);

    @ObfuscatedName("ia.b")
    public boolean field3242 = false;

    @ObfuscatedName("az.u(IB)Lia;")
    public static class243 method651(int arg0) {
        class243 var1 = (class243) field3241.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3245.method3928(19, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method4080(new class300(var2));
        }
        field3241.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.f(Lkg;I)V")
    public void method4080(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4081(arg0, var2);
        }
    }

    @ObfuscatedName("ia.b(Lkg;IB)V")
    public void method4081(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3242 = true;
        }
    }
}
