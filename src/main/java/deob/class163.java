package deob;

@ObfuscatedName("fb")
public class class163 extends class382 {

    @ObfuscatedName("fb.p")
    public static class249 field1745 = new class249(64);

    @ObfuscatedName("fb.m")
    public int field1746 = 0;

    @ObfuscatedName("bo.c(IB)Lfb;")
    public static class163 method2017(int arg0) {
        class163 var1 = (class163) field1745.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1747.method5053(16, arg0);
        class163 var3 = new class163();
        if (var2 != null) {
            var3.method2861(new class419(var2));
        }
        field1745.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fb.b(Lpi;I)V")
    public void method2861(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method2862(arg0, var2);
        }
    }

    @ObfuscatedName("fb.p(Lpi;II)V")
    public void method2862(class419 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1746 = arg0.method6672();
        }
    }
}
