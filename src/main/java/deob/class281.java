package deob;

@ObfuscatedName("jn")
public class class281 extends class219 {

    @ObfuscatedName("jn.i")
    public static class213 field3557 = new class213(64);

    @ObfuscatedName("jn.o")
    public char field3555;

    @ObfuscatedName("jn.j")
    public char field3556;

    @ObfuscatedName("jn.k")
    public String field3559 = class252.field3012;

    @ObfuscatedName("jn.x")
    public int field3558;

    @ObfuscatedName("jn.z")
    public int field3562 = 0;

    @ObfuscatedName("jn.p")
    public int[] field3560;

    @ObfuscatedName("jn.w")
    public int[] field3561;

    @ObfuscatedName("jn.r")
    public String[] field3553;

    @ObfuscatedName("h.c(Ljm;I)V")
    public static void method118(class262 arg0) {
        Statics.field3554 = arg0;
    }

    @ObfuscatedName("jn.i(Lgp;I)V")
    public void method4581(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4580(arg0, var2);
        }
    }

    @ObfuscatedName("jn.o(Lgp;II)V")
    public void method4580(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3555 = (char) arg0.method3429();
        } else if (arg1 == 2) {
            this.field3556 = (char) arg0.method3429();
        } else if (arg1 == 3) {
            this.field3559 = arg0.method3427();
        } else if (arg1 == 4) {
            this.field3558 = arg0.method3230();
        } else if (arg1 == 5) {
            this.field3562 = arg0.method3218();
            this.field3560 = new int[this.field3562];
            this.field3553 = new String[this.field3562];
            for (int var3 = 0; var3 < this.field3562; var3++) {
                this.field3560[var3] = arg0.method3230();
                this.field3553[var3] = arg0.method3427();
            }
        } else if (arg1 == 6) {
            this.field3562 = arg0.method3218();
            this.field3560 = new int[this.field3562];
            this.field3561 = new int[this.field3562];
            for (int var4 = 0; var4 < this.field3562; var4++) {
                this.field3560[var4] = arg0.method3230();
                this.field3561[var4] = arg0.method3230();
            }
        }
    }

    @ObfuscatedName("jn.j(I)I")
    public int method4576() {
        return this.field3562;
    }
}
