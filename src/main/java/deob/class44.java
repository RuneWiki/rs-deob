package deob;

@ObfuscatedName("al")
public class class44 extends class195 {

    @ObfuscatedName("al.l")
    public static class184 field999 = new class184(64);

    @ObfuscatedName("al.g")
    public int field1000;

    @ObfuscatedName("al.u")
    public int field1001;

    @ObfuscatedName("al.q")
    public int field1002;

    @ObfuscatedName("ey.o(II)Lal;")
    public static class44 method2912(int arg0) {
        class44 var1 = (class44) field999.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1003.method2940(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method892(new class111(var2));
        }
        field999.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.l(Ldk;I)V")
    public void method892(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("al.g(Ldk;II)V")
    public void method889(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1000 = arg0.method2397();
            this.field1001 = arg0.method2219();
            this.field1002 = arg0.method2219();
        }
    }
}
