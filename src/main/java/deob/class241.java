package deob;

@ObfuscatedName("iz")
public class class241 extends class195 {

    @ObfuscatedName("iz.w")
    public static class190 field3287 = new class190(64);

    @ObfuscatedName("iz.a")
    public int field3288 = 0;

    @ObfuscatedName("hg.i(II)Liz;")
    public static class241 method3587(int arg0) {
        class241 var1 = (class241) field3287.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3286.method3768(5, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3912(new class174(var2));
        }
        field3287.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.w(Lfp;B)V")
    public void method3912(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method3913(arg0, var2);
        }
    }

    @ObfuscatedName("iz.a(Lfp;II)V")
    public void method3913(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3288 = arg0.method2882();
        }
    }
}
