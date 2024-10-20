package deob;

@ObfuscatedName("ag")
public class class42 extends class183 {

    @ObfuscatedName("ag.i")
    public static class172 field979 = new class172(64);

    @ObfuscatedName("ag.k")
    public int field983;

    @ObfuscatedName("ag.e")
    public int field981;

    @ObfuscatedName("ag.w")
    public int field982;

    @ObfuscatedName("dq.g(II)Lag;")
    public static class42 method2377(int arg0) {
        class42 var1 = (class42) field979.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field984.method2734(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method784(new class107(var2));
        }
        field979.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.i(Ldk;B)V")
    public void method784(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method786(arg0, var2);
        }
    }

    @ObfuscatedName("ag.k(Ldk;IB)V")
    public void method786(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field983 = arg0.method2094();
            this.field981 = arg0.method2092();
            this.field982 = arg0.method2092();
        }
    }

    @ObfuscatedName("ah.e(B)V")
    public static void method549() {
        field979.method3138();
    }
}
