package deob;

@ObfuscatedName("fu")
public class class162 extends class382 {

    @ObfuscatedName("fu.b")
    public static class249 field1741 = new class249(64);

    @ObfuscatedName("fu.p")
    public int field1740 = 0;

    @ObfuscatedName("ce.c(II)Lfu;")
    public static class162 method2042(int arg0) {
        class162 var1 = (class162) field1741.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1742.method5053(5, arg0);
        class162 var3 = new class162();
        if (var2 != null) {
            var3.method2850(new class419(var2));
        }
        field1741.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fu.b(Lpi;I)V")
    public void method2850(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method2860(arg0, var2);
        }
    }

    @ObfuscatedName("fu.p(Lpi;IB)V")
    public void method2860(class419 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1740 = arg0.method6672();
        }
    }
}
