package deob;

@ObfuscatedName("iu")
public class class254 extends class198 {

    @ObfuscatedName("iu.o")
    public static class193 field3390 = new class193(64);

    @ObfuscatedName("iu.x")
    public int field3389;

    @ObfuscatedName("iu.k")
    public int field3392;

    @ObfuscatedName("iu.f")
    public int field3391;

    @ObfuscatedName("o.w(Liq;B)V")
    public static void method2(class239 arg0) {
        Statics.field3397 = arg0;
    }

    @ObfuscatedName("eu.o(IB)Liu;")
    public static class254 method2346(int arg0) {
        class254 var1 = (class254) field3390.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3397.method3754(14, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4032(new class177(var2));
        }
        field3390.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.x(Lfi;I)V")
    public void method4032(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4030(arg0, var2);
        }
    }

    @ObfuscatedName("iu.k(Lfi;II)V")
    public void method4030(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3389 = arg0.method2886();
            this.field3392 = arg0.method2931();
            this.field3391 = arg0.method2931();
        }
    }

    @ObfuscatedName("cm.f(I)V")
    public static void method1675() {
        field3390.method3242();
    }
}
