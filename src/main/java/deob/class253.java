package deob;

@ObfuscatedName("iw")
public class class253 extends class196 {

    @ObfuscatedName("iw.n")
    public static class191 field3379 = new class191(64);

    @ObfuscatedName("iw.g")
    public char field3378;

    @ObfuscatedName("iw.y")
    public int field3381;

    @ObfuscatedName("iw.w")
    public String field3382;

    @ObfuscatedName("iw.k")
    public boolean field3383 = true;

    @ObfuscatedName("hq.e(II)Liw;")
    public static class253 method3666(int arg0) {
        class253 var1 = (class253) field3379.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3385.method3817(11, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4135(new class175(var2));
        }
        var3.method4139();
        field3379.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.n(I)V")
    public void method4139() {
    }

    @ObfuscatedName("iw.g(Lfh;I)V")
    public void method4135(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4136(arg0, var2);
        }
    }

    @ObfuscatedName("iw.y(Lfh;IB)V")
    public void method4136(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3378 = class268.method4181(arg0.method2998());
        } else if (arg1 == 2) {
            this.field3381 = arg0.method2933();
        } else if (arg1 == 4) {
            this.field3383 = false;
        } else if (arg1 == 5) {
            this.field3382 = arg0.method3113();
        }
    }

    @ObfuscatedName("iw.w(B)Z")
    public boolean method4134() {
        return this.field3378 == 's';
    }

    @ObfuscatedName("t.k(I)V")
    public static void method136() {
        field3379.method3282();
    }
}
