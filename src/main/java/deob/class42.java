package deob;

@ObfuscatedName("ag")
public class class42 extends class174 {

    @ObfuscatedName("ag.v")
    public static class170 field1034 = new class170(64);

    @ObfuscatedName("ag.p")
    public int field1035 = 0;

    @ObfuscatedName("j.j(Lez;I)V")
    public static void method5(class152 arg0) {
        Statics.field1033 = arg0;
        Statics.field1032 = Statics.field1033.method2969(16);
    }

    @ObfuscatedName("bw.r(IB)Lag;")
    public static class42 method1501(int arg0) {
        class42 var1 = (class42) field1034.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1033.method3016(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method886(new class127(var2));
        }
        field1034.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.v(Ldn;I)V")
    public void method886(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("ag.p(Ldn;IS)V")
    public void method873(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1035 = arg0.method2609();
        }
    }

    @ObfuscatedName("n.e(B)V")
    public static void method238() {
        field1034.method3258();
    }
}
