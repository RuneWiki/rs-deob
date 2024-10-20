package deob;

@ObfuscatedName("gc")
public class class187 extends class130 {

    @ObfuscatedName("gc.c")
    public static class125 field2770 = new class125(64);

    @ObfuscatedName("gc.f")
    public int field2771 = 0;

    @ObfuscatedName("cq.s(IB)Lgc;")
    public static class187 method1754(int arg0) {
        class187 var1 = (class187) field2770.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2775.method2986(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3123(new class154(var2));
        }
        field2770.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.c(Lea;B)V")
    public void method3123(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3119(arg0, var2);
        }
    }

    @ObfuscatedName("gc.f(Lea;II)V")
    public void method3119(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2771 = arg0.method2541();
        }
    }
}
