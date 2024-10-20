package deob;

@ObfuscatedName("ag")
public class class42 extends class183 {

    @ObfuscatedName("ag.s")
    public static class172 field977 = new class172(64);

    @ObfuscatedName("ag.h")
    public int field973;

    @ObfuscatedName("ag.m")
    public int field974;

    @ObfuscatedName("ag.u")
    public int field979;

    @ObfuscatedName("fo.g(Leh;B)V")
    public static void method3116(class147 arg0) {
        Statics.field980 = arg0;
    }

    @ObfuscatedName("ag.s(Ldi;I)V")
    public void method802(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method803(arg0, var2);
        }
    }

    @ObfuscatedName("ag.h(Ldi;IB)V")
    public void method803(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field973 = arg0.method2166();
            this.field974 = arg0.method2101();
            this.field979 = arg0.method2101();
        }
    }
}
