package deob;

@ObfuscatedName("fu")
public class class162 extends class387 {

    @ObfuscatedName("fu.l")
    public static class249 field1752 = new class249(64);

    @ObfuscatedName("fu.s")
    public int field1753 = 0;

    @ObfuscatedName("dk.c(Lkq;I)V")
    public static void method2607(class307 arg0) {
        Statics.field1751 = arg0;
    }

    @ObfuscatedName("db.l(II)Lfu;")
    public static class162 method2377(int arg0) {
        class162 var1 = (class162) field1752.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1751.method5066(5, arg0);
        class162 var3 = new class162();
        if (var2 != null) {
            var3.method2833(new class421(var2));
        }
        field1752.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fu.s(Lpi;S)V")
    public void method2833(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2821(arg0, var2);
        }
    }

    @ObfuscatedName("fu.e(Lpi;II)V")
    public void method2821(class421 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1753 = arg0.method6666();
        }
    }
}
