package deob;

@ObfuscatedName("aq")
public class class44 extends class195 {

    @ObfuscatedName("aq.d")
    public static class184 field1012 = new class184(64);

    @ObfuscatedName("aq.z")
    public int field1008;

    @ObfuscatedName("aq.y")
    public int field1010;

    @ObfuscatedName("aq.e")
    public int field1011;

    @ObfuscatedName("de.n(II)Laq;")
    public static class44 method2618(int arg0) {
        class44 var1 = (class44) field1012.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3065.method2948(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method868(new class111(var2));
        }
        field1012.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.d(Ldl;I)V")
    public void method868(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method857(arg0, var2);
        }
    }

    @ObfuscatedName("aq.z(Ldl;II)V")
    public void method857(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1008 = arg0.method2231();
            this.field1010 = arg0.method2228();
            this.field1011 = arg0.method2228();
        }
    }
}
