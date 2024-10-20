package deob;

@ObfuscatedName("ao")
public class class44 extends class181 {

    @ObfuscatedName("ao.u")
    public static class171 field1010 = new class171(64);

    @ObfuscatedName("ao.x")
    public int field1006 = 0;

    @ObfuscatedName("ac.b(II)Lao;")
    public static class44 method722(int arg0) {
        class44 var1 = (class44) field1010.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method2692(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method820(new class107(var2));
        }
        field1010.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.u(Ldh;S)V")
    public void method820(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method829(arg0, var2);
        }
    }

    @ObfuscatedName("ao.x(Ldh;II)V")
    public void method829(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1006 = arg0.method2136();
        }
    }
}
