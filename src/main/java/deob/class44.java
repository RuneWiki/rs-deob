package deob;

@ObfuscatedName("ax")
public class class44 extends class195 {

    @ObfuscatedName("ax.b")
    public static class184 field990 = new class184(64);

    @ObfuscatedName("ax.p")
    public int field989;

    @ObfuscatedName("ax.e")
    public int field991;

    @ObfuscatedName("ax.i")
    public int field993;

    @ObfuscatedName("w.t(Lfj;B)V")
    public static void method524(class158 arg0) {
        Statics.field994 = arg0;
    }

    @ObfuscatedName("n.b(II)Lax;")
    public static class44 method592(int arg0) {
        class44 var1 = (class44) field990.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field994.method2881(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method892(new class111(var2));
        }
        field990.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.p(Ldc;I)V")
    public void method892(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method908(arg0, var2);
        }
    }

    @ObfuscatedName("ax.e(Ldc;II)V")
    public void method908(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field989 = arg0.method2255();
            this.field991 = arg0.method2172();
            this.field993 = arg0.method2172();
        }
    }

    @ObfuscatedName("bo.i(I)V")
    public static void method1409() {
        field990.method3342();
    }
}
