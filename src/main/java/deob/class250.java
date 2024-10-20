package deob;

@ObfuscatedName("if")
public class class250 extends class176 {

    @ObfuscatedName("if.n")
    public static class146 field3283 = new class146(64);

    @ObfuscatedName("if.v")
    public char field3282;

    @ObfuscatedName("if.u")
    public int field3289;

    @ObfuscatedName("if.r")
    public String field3286;

    @ObfuscatedName("if.p")
    public boolean field3287 = true;

    @ObfuscatedName("eg.z(II)Lif;")
    public static class250 method2965(int arg0) {
        class250 var1 = (class250) field3283.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3285.method3726(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4062(new class300(var2));
        }
        var3.method4061();
        field3283.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.n(B)V")
    public void method4061() {
    }

    @ObfuscatedName("if.v(Lkl;I)V")
    public void method4062(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4063(arg0, var2);
        }
    }

    @ObfuscatedName("if.u(Lkl;II)V")
    public void method4063(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3282 = class288.method669(arg0.method5002());
        } else if (arg1 == 2) {
            this.field3289 = arg0.method5085();
        } else if (arg1 == 4) {
            this.field3287 = false;
        } else if (arg1 == 5) {
            this.field3286 = arg0.method4999();
        }
    }

    @ObfuscatedName("if.r(B)Z")
    public boolean method4072() {
        return this.field3282 == 's';
    }

    @ObfuscatedName("dz.p(B)V")
    public static void method2481() {
        field3283.method2995();
    }
}
