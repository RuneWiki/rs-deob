package deob;

@ObfuscatedName("ab")
public class class51 extends class204 {

    @ObfuscatedName("ab.m")
    public static class193 field1079 = new class193(64);

    @ObfuscatedName("ab.f")
    public int field1080 = 0;

    @ObfuscatedName("fi.j(II)Lab;")
    public static class51 method3344(int arg0) {
        class51 var1 = (class51) field1079.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1082.method3124(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1020(new class119(var2));
        }
        field1079.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.m(Ldc;B)V")
    public void method1020(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method1028(arg0, var2);
        }
    }

    @ObfuscatedName("ab.f(Ldc;IB)V")
    public void method1028(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1080 = arg0.method2374();
        }
    }
}
