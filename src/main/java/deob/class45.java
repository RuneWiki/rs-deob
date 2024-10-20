package deob;

@ObfuscatedName("ak")
public class class45 extends class185 {

    @ObfuscatedName("ak.v")
    public static class174 field1015 = new class174(64);

    @ObfuscatedName("ak.k")
    public int field1023 = 0;

    @ObfuscatedName("w.e(Lep;B)V")
    public static void method122(class149 arg0) {
        Statics.field1014 = arg0;
    }

    @ObfuscatedName("fh.v(II)Lak;")
    public static class45 method3136(int arg0) {
        class45 var1 = (class45) field1015.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method2721(5, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method836(new class108(var2));
        }
        field1015.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.k(Ldd;I)V")
    public void method836(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method823(arg0, var2);
        }
    }

    @ObfuscatedName("ak.g(Ldd;IB)V")
    public void method823(class108 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1023 = arg0.method2124();
        }
    }
}
