package deob;

@ObfuscatedName("fp")
public class class163 extends class387 {

    @ObfuscatedName("fp.s")
    public static class249 field1757 = new class249(64);

    @ObfuscatedName("fp.e")
    public int field1758 = 0;

    @ObfuscatedName("du.c(Lkq;I)V")
    public static void method2434(class307 arg0) {
        Statics.field1756 = arg0;
        Statics.field1755 = Statics.field1756.method5029(16);
    }

    @ObfuscatedName("ag.l(II)Lfp;")
    public static class163 method740(int arg0) {
        class163 var1 = (class163) field1757.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1756.method5066(16, arg0);
        class163 var3 = new class163();
        if (var2 != null) {
            var3.method2835(new class421(var2));
        }
        field1757.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fp.s(Lpi;B)V")
    public void method2835(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2836(arg0, var2);
        }
    }

    @ObfuscatedName("fp.e(Lpi;II)V")
    public void method2836(class421 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1758 = arg0.method6666();
        }
    }

    @ObfuscatedName("cs.r(I)V")
    public static void method2113() {
        field1757.method4475();
    }
}
