package deob;

@ObfuscatedName("jz")
public class class285 extends class346 {

    @ObfuscatedName("jz.o")
    public static class199 field3459 = new class199(64);

    @ObfuscatedName("jz.u")
    public char field3458;

    @ObfuscatedName("jz.p")
    public char field3461;

    @ObfuscatedName("jz.b")
    public String field3465 = class246.field2920;

    @ObfuscatedName("jz.e")
    public int field3463;

    @ObfuscatedName("jz.k")
    public int field3464 = 0;

    @ObfuscatedName("jz.g")
    public int[] field3467;

    @ObfuscatedName("jz.h")
    public int[] field3466;

    @ObfuscatedName("jz.n")
    public String[] field3460;

    @ObfuscatedName("fe.f(II)Ljz;")
    public static class285 method2749(int arg0) {
        class285 var1 = (class285) field3459.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3462.method3933(8, arg0);
        class285 var3 = new class285();
        if (var2 != null) {
            var3.method4428(new class382(var2));
        }
        field3459.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.o(Lnu;I)V")
    public void method4428(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4426(arg0, var2);
        }
    }

    @ObfuscatedName("jz.u(Lnu;II)V")
    public void method4426(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3458 = (char) arg0.method5856();
        } else if (arg1 == 2) {
            this.field3461 = (char) arg0.method5856();
        } else if (arg1 == 3) {
            this.field3465 = arg0.method5865();
        } else if (arg1 == 4) {
            this.field3463 = arg0.method5861();
        } else if (arg1 == 5) {
            this.field3464 = arg0.method5858();
            this.field3467 = new int[this.field3464];
            this.field3460 = new String[this.field3464];
            for (int var3 = 0; var3 < this.field3464; var3++) {
                this.field3467[var3] = arg0.method5861();
                this.field3460[var3] = arg0.method5865();
            }
        } else if (arg1 == 6) {
            this.field3464 = arg0.method5858();
            this.field3467 = new int[this.field3464];
            this.field3466 = new int[this.field3464];
            for (int var4 = 0; var4 < this.field3464; var4++) {
                this.field3467[var4] = arg0.method5861();
                this.field3466[var4] = arg0.method5861();
            }
        }
    }

    @ObfuscatedName("jz.p(I)I")
    public int method4425() {
        return this.field3464;
    }
}
