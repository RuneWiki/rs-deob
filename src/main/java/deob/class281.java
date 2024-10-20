package deob;

@ObfuscatedName("jd")
public class class281 extends class219 {

    @ObfuscatedName("jd.k")
    public static class213 field3564 = new class213(64);

    @ObfuscatedName("jd.t")
    public char field3560;

    @ObfuscatedName("jd.d")
    public char field3561;

    @ObfuscatedName("jd.h")
    public String field3566 = class252.field3032;

    @ObfuscatedName("jd.m")
    public int field3563;

    @ObfuscatedName("jd.z")
    public int field3567 = 0;

    @ObfuscatedName("jd.i")
    public int[] field3565;

    @ObfuscatedName("jd.u")
    public int[] field3558;

    @ObfuscatedName("jd.x")
    public String[] field3562;

    @ObfuscatedName("af.o(Ljf;B)V")
    public static void method371(class262 arg0) {
        Statics.field3559 = arg0;
    }

    @ObfuscatedName("jd.k(Lgc;I)V")
    public void method4561(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4565(arg0, var2);
        }
    }

    @ObfuscatedName("jd.t(Lgc;IB)V")
    public void method4565(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3560 = (char) arg0.method3205();
        } else if (arg1 == 2) {
            this.field3561 = (char) arg0.method3205();
        } else if (arg1 == 3) {
            this.field3566 = arg0.method3284();
        } else if (arg1 == 4) {
            this.field3563 = arg0.method3254();
        } else if (arg1 == 5) {
            this.field3567 = arg0.method3207();
            this.field3565 = new int[this.field3567];
            this.field3562 = new String[this.field3567];
            for (int var3 = 0; var3 < this.field3567; var3++) {
                this.field3565[var3] = arg0.method3254();
                this.field3562[var3] = arg0.method3284();
            }
        } else if (arg1 == 6) {
            this.field3567 = arg0.method3207();
            this.field3565 = new int[this.field3567];
            this.field3558 = new int[this.field3567];
            for (int var4 = 0; var4 < this.field3567; var4++) {
                this.field3565[var4] = arg0.method3254();
                this.field3558[var4] = arg0.method3254();
            }
        }
    }

    @ObfuscatedName("jd.d(I)I")
    public int method4571() {
        return this.field3567;
    }
}
