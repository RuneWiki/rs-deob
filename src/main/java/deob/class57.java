package deob;

@ObfuscatedName("ba")
public class class57 extends class208 {

    @ObfuscatedName("ba.n")
    public static class197 field1210 = new class197(64);

    @ObfuscatedName("ba.t")
    public int field1211 = 0;

    @ObfuscatedName("el.f(Lfj;I)V")
    public static void method2830(class171 arg0) {
        Statics.field1209 = arg0;
        Statics.field1212 = Statics.field1209.method3124(16);
    }

    @ObfuscatedName("cj.e(II)Lba;")
    public static class57 method1845(int arg0) {
        class57 var1 = (class57) field1210.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1209.method3107(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1138(new class123(var2));
        }
        field1210.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ba.n(Ldx;I)V")
    public void method1138(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method1150(arg0, var2);
        }
    }

    @ObfuscatedName("ba.t(Ldx;IB)V")
    public void method1150(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1211 = arg0.method2401();
        }
    }

    @ObfuscatedName("do.v(I)V")
    public static void method2317() {
        field1210.method3572();
    }
}
