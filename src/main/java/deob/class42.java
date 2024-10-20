package deob;

@ObfuscatedName("ag")
public class class42 extends class182 {

    @ObfuscatedName("ag.o")
    public static class171 field989 = new class171(64);

    @ObfuscatedName("ag.y")
    public int field988;

    @ObfuscatedName("ag.b")
    public int field991;

    @ObfuscatedName("ag.w")
    public int field990;

    @ObfuscatedName("l.e(II)Lag;")
    public static class42 method74(int arg0) {
        class42 var1 = (class42) field989.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field997.method2709(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method799(new class107(var2));
        }
        field989.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.o(Ldl;B)V")
    public void method799(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method800(arg0, var2);
        }
    }

    @ObfuscatedName("ag.y(Ldl;IB)V")
    public void method800(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field988 = arg0.method2232();
            this.field991 = arg0.method2123();
            this.field990 = arg0.method2123();
        }
    }

    @ObfuscatedName("eh.b(I)V")
    public static void method2623() {
        field989.method3065();
    }
}
