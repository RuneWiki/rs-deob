package deob;

@ObfuscatedName("jl")
public class class269 extends class209 {

    @ObfuscatedName("jl.l")
    public static class203 field3416 = new class203(64);

    @ObfuscatedName("jl.w")
    public char field3408;

    @ObfuscatedName("jl.s")
    public char field3409;

    @ObfuscatedName("jl.e")
    public String field3410 = class240.field2865;

    @ObfuscatedName("jl.a")
    public int field3412;

    @ObfuscatedName("jl.c")
    public int field3414 = 0;

    @ObfuscatedName("jl.p")
    public int[] field3413;

    @ObfuscatedName("jl.r")
    public int[] field3407;

    @ObfuscatedName("jl.m")
    public String[] field3415;

    @ObfuscatedName("fd.f(II)Ljl;")
    public static class269 method3089(int arg0) {
        class269 var1 = (class269) field3416.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3411.method4289(8, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4666(new class185(var2));
        }
        field3416.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jl.l(Lgm;B)V")
    public void method4666(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4667(arg0, var2);
        }
    }

    @ObfuscatedName("jl.w(Lgm;II)V")
    public void method4667(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3408 = (char) arg0.method3344();
        } else if (arg1 == 2) {
            this.field3409 = (char) arg0.method3344();
        } else if (arg1 == 3) {
            this.field3410 = arg0.method3353();
        } else if (arg1 == 4) {
            this.field3412 = arg0.method3432();
        } else if (arg1 == 5) {
            this.field3414 = arg0.method3346();
            this.field3413 = new int[this.field3414];
            this.field3415 = new String[this.field3414];
            for (int var3 = 0; var3 < this.field3414; var3++) {
                this.field3413[var3] = arg0.method3432();
                this.field3415[var3] = arg0.method3353();
            }
        } else if (arg1 == 6) {
            this.field3414 = arg0.method3346();
            this.field3413 = new int[this.field3414];
            this.field3407 = new int[this.field3414];
            for (int var4 = 0; var4 < this.field3414; var4++) {
                this.field3413[var4] = arg0.method3432();
                this.field3407[var4] = arg0.method3432();
            }
        }
    }

    @ObfuscatedName("jl.s(I)I")
    public int method4665() {
        return this.field3414;
    }
}
