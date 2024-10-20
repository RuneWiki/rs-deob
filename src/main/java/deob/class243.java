package deob;

@ObfuscatedName("im")
public class class243 extends class196 {

    @ObfuscatedName("im.a")
    public static class191 field3289 = new class191(64);

    @ObfuscatedName("im.r")
    public int field3290 = 0;

    @ObfuscatedName("ac.i(II)Lim;")
    public static class243 method479(int arg0) {
        class243 var1 = (class243) field3289.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3288.method3824(16, arg0);
        class243 var3 = new class243();
        if (var2 != null) {
            var3.method3960(new class175(var2));
        }
        field3289.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.j(Lfp;B)V")
    public void method3960(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method3961(arg0, var2);
        }
    }

    @ObfuscatedName("im.a(Lfp;II)V")
    public void method3961(class175 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3290 = arg0.method2995();
        }
    }
}
