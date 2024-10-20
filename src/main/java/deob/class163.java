package deob;

@ObfuscatedName("fg")
public class class163 extends class142 {

    @ObfuscatedName("fg.z")
    public static class100 field2479 = new class100(64);

    @ObfuscatedName("fg.g")
    public int field2478 = 0;

    @ObfuscatedName("cy.z(Lch;I)V")
    public static void method1237(class86 arg0) {
        Statics.field537 = arg0;
        Statics.field2352 = Statics.field537.method1054(16);
    }

    @ObfuscatedName("ez.g(II)Lfg;")
    public static class163 method1584(int arg0) {
        class163 var1 = (class163) field2479.method1244((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field537.method1044(16, arg0);
        class163 var3 = new class163();
        if (var2 != null) {
            var3.method2571(new class135(var2));
        }
        field2479.method1246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fg.q(Lev;I)V")
    public void method2571(class135 arg0) {
        while (true) {
            int var2 = arg0.method1600();
            if (var2 == 0) {
                return;
            }
            this.method2572(arg0, var2);
        }
    }

    @ObfuscatedName("fg.i(Lev;II)V")
    public void method2572(class135 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2478 = arg0.method1602();
        }
    }

    @ObfuscatedName("cz.s(I)V")
    public static void method1148() {
        field2479.method1253();
    }
}
