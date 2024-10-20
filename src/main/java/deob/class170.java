package deob;

@ObfuscatedName("fl")
public class class170 extends class404 {

    @ObfuscatedName("fl.c")
    public static class257 field1796 = new class257(64);

    @ObfuscatedName("fl.i")
    public int field1797 = 0;

    @ObfuscatedName("hh.v(Lln;I)V")
    public static void method4028(class316 arg0) {
        Statics.field1800 = arg0;
    }

    @ObfuscatedName("bd.c(II)Lfl;")
    public static class170 method1909(int arg0) {
        class170 var1 = (class170) field1796.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1800.method5296(5, arg0);
        class170 var3 = new class170();
        if (var2 != null) {
            var3.method3025(new class438(var2));
        }
        field1796.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fl.i(Lpi;I)V")
    public void method3025(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3028(arg0, var2);
        }
    }

    @ObfuscatedName("fl.f(Lpi;II)V")
    public void method3028(class438 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1797 = arg0.method7148();
        }
    }
}
