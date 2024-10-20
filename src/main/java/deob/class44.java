package deob;

@ObfuscatedName("as")
public class class44 extends class180 {

    @ObfuscatedName("as.u")
    public static class170 field991 = new class170(64);

    @ObfuscatedName("as.k")
    public int field985 = 0;

    @ObfuscatedName("aa.y(Lev;I)V")
    public static void method548(class145 arg0) {
        Statics.field988 = arg0;
    }

    @ObfuscatedName("i.u(IB)Las;")
    public static class44 method457(int arg0) {
        class44 var1 = (class44) field991.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field988.method2704(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method839(new class107(var2));
        }
        field991.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.k(Ldo;I)V")
    public void method839(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("as.v(Ldo;II)V")
    public void method828(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field985 = arg0.method2111();
        }
    }
}
