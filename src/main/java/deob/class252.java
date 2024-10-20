package deob;

@ObfuscatedName("iv")
public class class252 extends class176 {

    @ObfuscatedName("iv.w")
    public static class146 field3316 = new class146(64);

    @ObfuscatedName("iv.e")
    public char field3318;

    @ObfuscatedName("iv.p")
    public char field3322;

    @ObfuscatedName("iv.k")
    public String field3319 = class225.field2772;

    @ObfuscatedName("iv.l")
    public int field3320;

    @ObfuscatedName("iv.b")
    public int field3321 = 0;

    @ObfuscatedName("iv.i")
    public int[] field3317;

    @ObfuscatedName("iv.c")
    public int[] field3323;

    @ObfuscatedName("iv.f")
    public String[] field3324;

    @ObfuscatedName("em.q(II)Liv;")
    public static class252 method2995(int arg0) {
        class252 var1 = (class252) field3316.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3315.method3775(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4150(new class301(var2));
        }
        field3316.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.w(Lkf;B)V")
    public void method4150(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4154(arg0, var2);
        }
    }

    @ObfuscatedName("iv.e(Lkf;IB)V")
    public void method4154(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3318 = (char) arg0.method5077();
        } else if (arg1 == 2) {
            this.field3322 = (char) arg0.method5077();
        } else if (arg1 == 3) {
            this.field3319 = arg0.method5076();
        } else if (arg1 == 4) {
            this.field3320 = arg0.method5072();
        } else if (arg1 == 5) {
            this.field3321 = arg0.method5069();
            this.field3317 = new int[this.field3321];
            this.field3324 = new String[this.field3321];
            for (int var3 = 0; var3 < this.field3321; var3++) {
                this.field3317[var3] = arg0.method5072();
                this.field3324[var3] = arg0.method5076();
            }
        } else if (arg1 == 6) {
            this.field3321 = arg0.method5069();
            this.field3317 = new int[this.field3321];
            this.field3323 = new int[this.field3321];
            for (int var4 = 0; var4 < this.field3321; var4++) {
                this.field3317[var4] = arg0.method5072();
                this.field3323[var4] = arg0.method5072();
            }
        }
    }

    @ObfuscatedName("iv.p(B)I")
    public int method4152() {
        return this.field3321;
    }
}
