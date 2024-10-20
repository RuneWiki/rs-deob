package deob;

@ObfuscatedName("iy")
public class class245 extends class195 {

    @ObfuscatedName("iy.j")
    public static class190 field3319 = new class190(64);

    @ObfuscatedName("iy.n")
    public boolean field3322 = false;

    @ObfuscatedName("fx.a(IS)Liy;")
    public static class245 method3108(int arg0) {
        class245 var1 = (class245) field3319.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3321.method3787(15, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3943(new class174(var2));
        }
        field3319.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.j(Lfe;B)V")
    public void method3943(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3949(arg0, var2);
        }
    }

    @ObfuscatedName("iy.n(Lfe;II)V")
    public void method3949(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3322 = true;
        }
    }
}
