package deob;

@ObfuscatedName("ag")
public class class51 extends class204 {

    @ObfuscatedName("ag.v")
    public static class193 field1098 = new class193(64);

    @ObfuscatedName("ag.r")
    public int field1099 = 0;

    @ObfuscatedName("fz.i(II)Lag;")
    public static class51 method3228(int arg0) {
        class51 var1 = (class51) field1098.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1097.method3035(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1004(new class119(var2));
        }
        field1098.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.v(Ldx;B)V")
    public void method1004(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method1005(arg0, var2);
        }
    }

    @ObfuscatedName("ag.r(Ldx;II)V")
    public void method1005(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1099 = arg0.method2347();
        }
    }
}
