package deob;

@ObfuscatedName("ei")
public class class152 extends class365 {

    @ObfuscatedName("ei.w")
    public static class236 field1607 = new class236(64);

    @ObfuscatedName("ei.s")
    public int field1608 = 0;

    @ObfuscatedName("cr.i(IB)Lei;")
    public static class152 method2172(int arg0) {
        class152 var1 = (class152) field1607.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1611.method4743(5, arg0);
        class152 var3 = new class152();
        if (var2 != null) {
            var3.method2666(new class401(var2));
        }
        field1607.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ei.w(Lop;I)V")
    public void method2666(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2662(arg0, var2);
        }
    }

    @ObfuscatedName("ei.s(Lop;II)V")
    public void method2662(class401 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1608 = arg0.method6242();
        }
    }
}
