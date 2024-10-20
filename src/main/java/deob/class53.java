package deob;

@ObfuscatedName("bz")
public class class53 extends class204 {

    @ObfuscatedName("bz.y")
    public static class193 field1126 = new class193(64);

    @ObfuscatedName("bz.u")
    public int field1122 = 0;

    @ObfuscatedName("fz.m(IB)Lbz;")
    public static class53 method3027(int arg0) {
        class53 var1 = (class53) field1126.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3187.method3080(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1094(new class119(var2));
        }
        field1126.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bz.l(Ldx;I)V")
    public void method1094(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method1096(arg0, var2);
        }
    }

    @ObfuscatedName("bz.y(Ldx;IB)V")
    public void method1096(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1122 = arg0.method2541();
        }
    }
}
