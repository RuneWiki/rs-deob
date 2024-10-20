package deob;

@ObfuscatedName("el")
public class class139 extends class349 {

    @ObfuscatedName("el.t")
    public static class223 field1522 = new class223(64);

    @ObfuscatedName("el.v")
    public int field1523 = 0;

    @ObfuscatedName("cb.s(Ljy;I)V")
    public static void method1864(class277 arg0) {
        Statics.field1525 = arg0;
    }

    @ObfuscatedName("ca.t(II)Lel;")
    public static class139 method2111(int arg0) {
        class139 var1 = (class139) field1522.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1525.method4459(5, arg0);
        class139 var3 = new class139();
        if (var2 != null) {
            var3.method2379(new class385(var2));
        }
        field1522.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("el.v(Lnv;I)V")
    public void method2379(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2387(arg0, var2);
        }
    }

    @ObfuscatedName("el.j(Lnv;II)V")
    public void method2387(class385 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1523 = arg0.method6053();
        }
    }
}
