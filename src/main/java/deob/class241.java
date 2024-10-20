package deob;

@ObfuscatedName("id")
public class class241 extends class195 {

    @ObfuscatedName("id.h")
    public static class190 field3267 = new class190(64);

    @ObfuscatedName("id.u")
    public int field3268 = 0;

    @ObfuscatedName("as.i(II)Lid;")
    public static class241 method579(int arg0) {
        class241 var1 = (class241) field3267.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3269.method3836(5, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3990(new class174(var2));
        }
        field3267.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.h(Lfv;I)V")
    public void method3990(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method3989(arg0, var2);
        }
    }

    @ObfuscatedName("id.u(Lfv;II)V")
    public void method3989(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3268 = arg0.method2932();
        }
    }
}
