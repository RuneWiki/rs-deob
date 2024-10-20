package deob;

@ObfuscatedName("gg")
public class class195 extends class130 {

    @ObfuscatedName("gg.y")
    public static class125 field2831 = new class125(64);

    @ObfuscatedName("gg.o")
    public int field2832;

    @ObfuscatedName("gg.r")
    public int field2833;

    @ObfuscatedName("gg.w")
    public int field2837;

    @ObfuscatedName("ds.k(Lgh;I)V")
    public static void method2031(class183 arg0) {
        Statics.field2187 = arg0;
    }

    @ObfuscatedName("k.y(II)Lgg;")
    public static class195 method14(int arg0) {
        class195 var1 = (class195) field2831.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2187.method3065(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3321(new class161(var2));
        }
        field2831.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.o(Lfm;I)V")
    public void method3321(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3318(arg0, var2);
        }
    }

    @ObfuscatedName("gg.r(Lfm;II)V")
    public void method3318(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2832 = arg0.method2735();
            this.field2833 = arg0.method2733();
            this.field2837 = arg0.method2733();
        }
    }
}
