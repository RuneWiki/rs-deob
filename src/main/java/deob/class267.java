package deob;

@ObfuscatedName("jv")
public class class267 extends class209 {

    @ObfuscatedName("jv.s")
    public static class203 field3355 = new class203(64);

    @ObfuscatedName("jv.o")
    public char field3356;

    @ObfuscatedName("jv.k")
    public int field3357;

    @ObfuscatedName("jv.u")
    public String field3358;

    @ObfuscatedName("jv.i")
    public boolean field3359 = true;

    @ObfuscatedName("iw.v(Lis;I)V")
    public static void method4446(class250 arg0) {
        Statics.field3354 = arg0;
    }

    @ObfuscatedName("gp.s(II)Ljv;")
    public static class267 method3597(int arg0) {
        class267 var1 = (class267) field3355.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3354.method4270(11, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4615(new class185(var2));
        }
        var3.method4619();
        field3355.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.o(I)V")
    public void method4619() {
    }

    @ObfuscatedName("jv.k(Lgx;B)V")
    public void method4615(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4636(arg0, var2);
        }
    }

    @ObfuscatedName("jv.u(Lgx;IB)V")
    public void method4636(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3275();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class304.field3748[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3356 = var6;
        } else if (arg1 == 2) {
            this.field3357 = arg0.method3279();
        } else if (arg1 == 4) {
            this.field3359 = false;
        } else if (arg1 == 5) {
            this.field3358 = arg0.method3490();
        }
    }

    @ObfuscatedName("jv.i(B)Z")
    public boolean method4617() {
        return this.field3356 == 's';
    }

    @ObfuscatedName("iw.t(I)V")
    public static void method4445() {
        field3355.method3697();
    }
}
