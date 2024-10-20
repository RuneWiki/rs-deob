package deob;

@ObfuscatedName("ag")
public class class50 extends class204 {

    @ObfuscatedName("ag.d")
    public static class193 field1096 = new class193(64);

    @ObfuscatedName("ag.g")
    public boolean field1090 = false;

    @ObfuscatedName("dy.y(Lfu;I)V")
    public static void method2626(class167 arg0) {
        Statics.field1089 = arg0;
    }

    @ObfuscatedName("bm.d(II)Lag;")
    public static class50 method1062(int arg0) {
        class50 var1 = (class50) field1096.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1089.method3045(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method967(new class119(var2));
        }
        field1096.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.g(Ldd;I)V")
    public void method967(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method968(arg0, var2);
        }
    }

    @ObfuscatedName("ag.w(Ldd;II)V")
    public void method968(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1090 = true;
        }
    }
}
