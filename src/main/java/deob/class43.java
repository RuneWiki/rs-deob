package deob;

@ObfuscatedName("ay")
public class class43 extends class185 {

    @ObfuscatedName("ay.v")
    public static class174 field992 = new class174(64);

    @ObfuscatedName("ay.k")
    public int field998;

    @ObfuscatedName("ay.g")
    public int field1000;

    @ObfuscatedName("ay.q")
    public int field995;

    @ObfuscatedName("j.e(Lep;B)V")
    public static void method130(class149 arg0) {
        Statics.field994 = arg0;
    }

    @ObfuscatedName("af.v(II)Lay;")
    public static class43 method534(int arg0) {
        class43 var1 = (class43) field992.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field994.method2721(14, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method802(new class108(var2));
        }
        field992.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.k(Ldd;I)V")
    public void method802(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method801(arg0, var2);
        }
    }

    @ObfuscatedName("ay.g(Ldd;II)V")
    public void method801(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field998 = arg0.method2124();
            this.field1000 = arg0.method2122();
            this.field995 = arg0.method2122();
        }
    }
}
