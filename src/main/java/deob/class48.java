package deob;

@ObfuscatedName("ad")
public class class48 extends class204 {

    @ObfuscatedName("ad.m")
    public static class193 field1048 = new class193(64);

    @ObfuscatedName("ad.f")
    public int field1051;

    @ObfuscatedName("ad.l")
    public int field1049;

    @ObfuscatedName("ad.u")
    public int field1058;

    @ObfuscatedName("b.j(II)Lad;")
    public static class48 method664(int arg0) {
        class48 var1 = (class48) field1048.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1047.method3124(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method984(new class119(var2));
        }
        field1048.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.m(Ldc;I)V")
    public void method984(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method992(arg0, var2);
        }
    }

    @ObfuscatedName("ad.f(Ldc;II)V")
    public void method992(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1051 = arg0.method2374();
            this.field1049 = arg0.method2372();
            this.field1058 = arg0.method2372();
        }
    }
}
