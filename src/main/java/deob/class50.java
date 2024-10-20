package deob;

@ObfuscatedName("ag")
public class class50 extends class204 {

    @ObfuscatedName("ag.s")
    public static class193 field1092 = new class193(64);

    @ObfuscatedName("ag.q")
    public boolean field1093 = false;

    @ObfuscatedName("cg.f(Lfx;B)V")
    public static void method1778(class167 arg0) {
        Statics.field1091 = arg0;
    }

    @ObfuscatedName("ap.s(II)Lag;")
    public static class50 method937(int arg0) {
        class50 var1 = (class50) field1092.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1091.method3038(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method982(new class119(var2));
        }
        field1092.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.q(Ldn;I)V")
    public void method982(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method983(arg0, var2);
        }
    }

    @ObfuscatedName("ag.g(Ldn;II)V")
    public void method983(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1093 = true;
        }
    }
}
