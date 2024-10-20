package deob;

@ObfuscatedName("ao")
public class class48 extends class204 {

    @ObfuscatedName("ao.s")
    public static class193 field1072 = new class193(64);

    @ObfuscatedName("ao.q")
    public int field1070;

    @ObfuscatedName("ao.g")
    public int field1074;

    @ObfuscatedName("ao.m")
    public int field1071;

    @ObfuscatedName("eu.f(Lfx;I)V")
    public static void method2798(class167 arg0) {
        Statics.field1069 = arg0;
    }

    @ObfuscatedName("ao.s(Ldn;I)V")
    public void method962(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method963(arg0, var2);
        }
    }

    @ObfuscatedName("ao.q(Ldn;II)V")
    public void method963(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1070 = arg0.method2353();
            this.field1074 = arg0.method2363();
            this.field1071 = arg0.method2363();
        }
    }
}
