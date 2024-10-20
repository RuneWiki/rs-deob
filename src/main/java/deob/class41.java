package deob;

@ObfuscatedName("af")
public class class41 extends class173 {

    @ObfuscatedName("af.n")
    public static class169 field1023 = new class169(64);

    @ObfuscatedName("af.c")
    public int field1021 = 0;

    @ObfuscatedName("cm.v(Ley;I)V")
    public static void method1876(class151 arg0) {
        Statics.field1018 = arg0;
        Statics.field1020 = Statics.field1018.method2971(16);
    }

    @ObfuscatedName("a.f(IB)Laf;")
    public static class41 method199(int arg0) {
        class41 var1 = (class41) field1023.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1018.method3020(16, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method891(new class126(var2));
        }
        field1023.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.n(Ldr;I)V")
    public void method891(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method898(arg0, var2);
        }
    }

    @ObfuscatedName("af.c(Ldr;II)V")
    public void method898(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1021 = arg0.method2468();
        }
    }
}
