package deob;

@ObfuscatedName("ew")
public class class151 extends class348 {

    @ObfuscatedName("ew.e")
    public static class222 field1713 = new class222(64);

    @ObfuscatedName("ew.v")
    public int field1709;

    @ObfuscatedName("ew.y")
    public int field1712;

    @ObfuscatedName("ew.j")
    public int field1714;

    @ObfuscatedName("ew.o")
    public static final int[] field1711 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1711[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("fs.f(II)Lew;")
    public static class151 method3012(int arg0) {
        class151 var1 = (class151) field1713.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1715.method4504(14, arg0);
        class151 var3 = new class151();
        if (var2 != null) {
            var3.method2620(new class384(var2));
        }
        field1713.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ew.e(Lnt;I)V")
    public void method2620(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2614(arg0, var2);
        }
    }

    @ObfuscatedName("ew.v(Lnt;IB)V")
    public void method2614(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1709 = arg0.method5899();
            this.field1712 = arg0.method5902();
            this.field1714 = arg0.method5902();
        }
    }
}
