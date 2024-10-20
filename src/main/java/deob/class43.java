package deob;

@ObfuscatedName("aa")
public class class43 extends class185 {

    @ObfuscatedName("aa.v")
    public static class174 field992 = new class174(64);

    @ObfuscatedName("aa.m")
    public int field984;

    @ObfuscatedName("aa.e")
    public int field986;

    @ObfuscatedName("aa.h")
    public int field987;

    @ObfuscatedName("l.x(II)Laa;")
    public static class43 method118(int arg0) {
        class43 var1 = (class43) field992.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field989.method2751(14, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method828(new class108(var2));
        }
        field992.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.v(Ldm;B)V")
    public void method828(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method829(arg0, var2);
        }
    }

    @ObfuscatedName("aa.m(Ldm;IS)V")
    public void method829(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field984 = arg0.method2129();
            this.field986 = arg0.method2299();
            this.field987 = arg0.method2299();
        }
    }

    @ObfuscatedName("gd.e(B)V")
    public static void method3361() {
        field992.method3181();
    }
}
