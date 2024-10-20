package deob;

@ObfuscatedName("it")
public class class240 extends class176 {

    @ObfuscatedName("it.f")
    public static class146 field3207 = new class146(64);

    @ObfuscatedName("it.b")
    public int field3208 = 0;

    @ObfuscatedName("db.u(II)Lit;")
    public static class240 method2513(int arg0) {
        class240 var1 = (class240) field3207.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3209.method3928(5, arg0);
        class240 var3 = new class240();
        if (var2 != null) {
            var3.method4026(new class300(var2));
        }
        field3207.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.f(Lkg;B)V")
    public void method4026(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4028(arg0, var2);
        }
    }

    @ObfuscatedName("it.b(Lkg;II)V")
    public void method4028(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3208 = arg0.method5337();
        }
    }
}
