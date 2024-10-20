package deob;

@ObfuscatedName("ij")
public class class250 extends class183 {

    @ObfuscatedName("ij.i")
    public static class155 field3271 = new class155(64);

    @ObfuscatedName("ij.y")
    public char field3275;

    @ObfuscatedName("ij.w")
    public int field3273;

    @ObfuscatedName("ij.p")
    public String field3274;

    @ObfuscatedName("ij.b")
    public boolean field3272 = true;

    @ObfuscatedName("g.f(II)Lij;")
    public static class250 method255(int arg0) {
        class250 var1 = (class250) field3271.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3270.method3752(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4115(new class300(var2));
        }
        var3.method4121();
        field3271.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.i(B)V")
    public void method4121() {
    }

    @ObfuscatedName("ij.y(Lkq;I)V")
    public void method4115(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4127(arg0, var2);
        }
    }

    @ObfuscatedName("ij.w(Lkq;II)V")
    public void method4127(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3275 = class288.method3751(arg0.method5297());
        } else if (arg1 == 2) {
            this.field3273 = arg0.method5192();
        } else if (arg1 == 4) {
            this.field3272 = false;
        } else if (arg1 == 5) {
            this.field3274 = arg0.method5119();
        }
    }

    @ObfuscatedName("ij.p(I)Z")
    public boolean method4116() {
        return this.field3275 == 's';
    }

    @ObfuscatedName("t.b(I)V")
    public static void method159() {
        field3271.method3102();
    }
}
