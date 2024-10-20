package deob;

@ObfuscatedName("ic")
public class class246 extends class196 {

    @ObfuscatedName("ic.j")
    public static class191 field3322 = new class191(64);

    @ObfuscatedName("ic.a")
    public boolean field3323 = false;

    @ObfuscatedName("fa.i(Lii;I)V")
    public static void method2962(class237 arg0) {
        Statics.field3326 = arg0;
    }

    @ObfuscatedName("al.j(II)Lic;")
    public static class246 method253(int arg0) {
        class246 var1 = (class246) field3322.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3326.method3824(15, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method3999(new class175(var2));
        }
        field3322.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.a(Lfp;B)V")
    public void method3999(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4000(arg0, var2);
        }
    }

    @ObfuscatedName("ic.r(Lfp;II)V")
    public void method4000(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3323 = true;
        }
    }
}
