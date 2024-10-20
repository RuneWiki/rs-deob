package deob;

@ObfuscatedName("az")
public class class51 extends class204 {

    @ObfuscatedName("az.r")
    public static class193 field1098 = new class193(64);

    @ObfuscatedName("az.f")
    public int field1099 = 0;

    @ObfuscatedName("cb.a(Lfz;S)V")
    public static void method2058(class167 arg0) {
        Statics.field1101 = arg0;
    }

    @ObfuscatedName("az.r(Lds;I)V")
    public void method1007(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method1016(arg0, var2);
        }
    }

    @ObfuscatedName("az.f(Lds;II)V")
    public void method1016(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1099 = arg0.method2347();
        }
    }
}
