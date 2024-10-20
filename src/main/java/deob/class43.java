package deob;

@ObfuscatedName("ae")
public class class43 extends class176 {

    @ObfuscatedName("ae.r")
    public static class172 field1046 = new class172(64);

    @ObfuscatedName("ae.l")
    public int field1047 = 0;

    @ObfuscatedName("client.i(IB)Lae;")
    public static class43 method562(int arg0) {
        class43 var1 = (class43) field1046.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1044.method3043(16, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method903(new class128(var2));
        }
        field1046.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.b(Lds;I)V")
    public void method903(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method902(arg0, var2);
        }
    }

    @ObfuscatedName("ae.r(Lds;II)V")
    public void method902(class128 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1047 = arg0.method2473();
        }
    }

    @ObfuscatedName("y.l(B)V")
    public static void method238() {
        field1046.method3279();
    }
}
