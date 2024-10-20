package deob;

@ObfuscatedName("jx")
public class class263 extends class185 {

    @ObfuscatedName("jx.v")
    public static class155 field3345 = new class155(64);

    @ObfuscatedName("jx.d")
    public char field3348;

    @ObfuscatedName("jx.c")
    public char field3355;

    @ObfuscatedName("jx.y")
    public String field3351 = class234.field2795;

    @ObfuscatedName("jx.h")
    public int field3349;

    @ObfuscatedName("jx.z")
    public int field3346 = 0;

    @ObfuscatedName("jx.e")
    public int[] field3344;

    @ObfuscatedName("jx.q")
    public int[] field3352;

    @ObfuscatedName("jx.l")
    public String[] field3353;

    @ObfuscatedName("ai.n(II)Ljx;")
    public static class263 method659(int arg0) {
        class263 var1 = (class263) field3345.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3350.method4032(8, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4357(new class311(var2));
        }
        field3345.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.v(Lkx;I)V")
    public void method4357(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4351(arg0, var2);
        }
    }

    @ObfuscatedName("jx.d(Lkx;IB)V")
    public void method4351(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3348 = (char) arg0.method5310();
        } else if (arg1 == 2) {
            this.field3355 = (char) arg0.method5310();
        } else if (arg1 == 3) {
            this.field3351 = arg0.method5465();
        } else if (arg1 == 4) {
            this.field3349 = arg0.method5455();
        } else if (arg1 == 5) {
            this.field3346 = arg0.method5247();
            this.field3344 = new int[this.field3346];
            this.field3353 = new String[this.field3346];
            for (int var3 = 0; var3 < this.field3346; var3++) {
                this.field3344[var3] = arg0.method5455();
                this.field3353[var3] = arg0.method5465();
            }
        } else if (arg1 == 6) {
            this.field3346 = arg0.method5247();
            this.field3344 = new int[this.field3346];
            this.field3352 = new int[this.field3346];
            for (int var4 = 0; var4 < this.field3346; var4++) {
                this.field3344[var4] = arg0.method5455();
                this.field3352[var4] = arg0.method5455();
            }
        }
    }

    @ObfuscatedName("jx.c(I)I")
    public int method4352() {
        return this.field3346;
    }
}
