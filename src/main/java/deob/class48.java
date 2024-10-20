package deob;

@ObfuscatedName("aj")
public class class48 extends class204 {

    @ObfuscatedName("aj.f")
    public static class193 field1069 = new class193(64);

    @ObfuscatedName("aj.i")
    public int field1060;

    @ObfuscatedName("aj.h")
    public int field1059;

    @ObfuscatedName("aj.q")
    public int field1061;

    @ObfuscatedName("m.o(IB)Laj;")
    public static class48 method85(int arg0) {
        class48 var1 = (class48) field1069.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1068.method3030(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method925(new class119(var2));
        }
        field1069.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.f(Ldc;B)V")
    public void method925(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method926(arg0, var2);
        }
    }

    @ObfuscatedName("aj.i(Ldc;IB)V")
    public void method926(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1060 = arg0.method2292();
            this.field1059 = arg0.method2290();
            this.field1061 = arg0.method2290();
        }
    }

    @ObfuscatedName("dj.h(I)V")
    public static void method2596() {
        field1069.method3452();
    }
}
