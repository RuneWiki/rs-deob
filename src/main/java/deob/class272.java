package deob;

@ObfuscatedName("jh")
public class class272 extends class214 {

    @ObfuscatedName("jh.h")
    public static class208 field3411 = new class208(64);

    @ObfuscatedName("jh.l")
    public char field3410;

    @ObfuscatedName("jh.g")
    public char field3416;

    @ObfuscatedName("jh.b")
    public String field3408 = class245.field2894;

    @ObfuscatedName("jh.a")
    public int field3413;

    @ObfuscatedName("jh.c")
    public int field3414 = 0;

    @ObfuscatedName("jh.z")
    public int[] field3415;

    @ObfuscatedName("jh.j")
    public int[] field3409;

    @ObfuscatedName("jh.d")
    public String[] field3417;

    @ObfuscatedName("g.n(Lij;I)V")
    public static void method25(class254 arg0) {
        Statics.field3412 = arg0;
    }

    @ObfuscatedName("fa.h(II)Ljh;")
    public static class272 method3386(int arg0) {
        class272 var1 = (class272) field3411.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3412.method4494(8, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4813(new class190(var2));
        }
        field3411.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.l(Lgc;I)V")
    public void method4813(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4814(arg0, var2);
        }
    }

    @ObfuscatedName("jh.g(Lgc;II)V")
    public void method4814(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3410 = (char) arg0.method3511();
        } else if (arg1 == 2) {
            this.field3416 = (char) arg0.method3511();
        } else if (arg1 == 3) {
            this.field3408 = arg0.method3520();
        } else if (arg1 == 4) {
            this.field3413 = arg0.method3562();
        } else if (arg1 == 5) {
            this.field3414 = arg0.method3513();
            this.field3415 = new int[this.field3414];
            this.field3417 = new String[this.field3414];
            for (int var3 = 0; var3 < this.field3414; var3++) {
                this.field3415[var3] = arg0.method3562();
                this.field3417[var3] = arg0.method3520();
            }
        } else if (arg1 == 6) {
            this.field3414 = arg0.method3513();
            this.field3415 = new int[this.field3414];
            this.field3409 = new int[this.field3414];
            for (int var4 = 0; var4 < this.field3414; var4++) {
                this.field3415[var4] = arg0.method3562();
                this.field3409[var4] = arg0.method3562();
            }
        }
    }

    @ObfuscatedName("jh.b(B)I")
    public int method4823() {
        return this.field3414;
    }
}
