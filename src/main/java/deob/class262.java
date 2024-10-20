package deob;

@ObfuscatedName("jr")
public class class262 extends class185 {

    @ObfuscatedName("jr.o")
    public static class155 field3354 = new class155(64);

    @ObfuscatedName("jr.q")
    public char field3347;

    @ObfuscatedName("jr.j")
    public char field3346;

    @ObfuscatedName("jr.p")
    public String field3348 = class234.field2799;

    @ObfuscatedName("jr.g")
    public int field3349;

    @ObfuscatedName("jr.n")
    public int field3351 = 0;

    @ObfuscatedName("jr.u")
    public int[] field3352;

    @ObfuscatedName("jr.a")
    public int[] field3353;

    @ObfuscatedName("jr.z")
    public String[] field3350;

    @ObfuscatedName("bv.o(II)Ljr;")
    public static class262 method1055(int arg0) {
        class262 var1 = (class262) field3354.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4068.method3891(8, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4312(new class310(var2));
        }
        field3354.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.q(Lkn;I)V")
    public void method4312(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4311(arg0, var2);
        }
    }

    @ObfuscatedName("jr.j(Lkn;IB)V")
    public void method4311(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3347 = (char) arg0.method5227();
        } else if (arg1 == 2) {
            this.field3346 = (char) arg0.method5227();
        } else if (arg1 == 3) {
            this.field3348 = arg0.method5236();
        } else if (arg1 == 4) {
            this.field3349 = arg0.method5209();
        } else if (arg1 == 5) {
            this.field3351 = arg0.method5283();
            this.field3352 = new int[this.field3351];
            this.field3350 = new String[this.field3351];
            for (int var3 = 0; var3 < this.field3351; var3++) {
                this.field3352[var3] = arg0.method5209();
                this.field3350[var3] = arg0.method5236();
            }
        } else if (arg1 == 6) {
            this.field3351 = arg0.method5283();
            this.field3352 = new int[this.field3351];
            this.field3353 = new int[this.field3351];
            for (int var4 = 0; var4 < this.field3351; var4++) {
                this.field3352[var4] = arg0.method5209();
                this.field3353[var4] = arg0.method5209();
            }
        }
    }

    @ObfuscatedName("jr.p(S)I")
    public int method4314() {
        return this.field3351;
    }
}
