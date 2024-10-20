package deob;

@ObfuscatedName("jz")
public class class281 extends class219 {

    @ObfuscatedName("jz.e")
    public static class213 field3565 = new class213(64);

    @ObfuscatedName("jz.b")
    public char field3558;

    @ObfuscatedName("jz.z")
    public char field3559;

    @ObfuscatedName("jz.n")
    public String field3560 = class252.field3028;

    @ObfuscatedName("jz.l")
    public int field3561;

    @ObfuscatedName("jz.s")
    public int field3556 = 0;

    @ObfuscatedName("jz.y")
    public int[] field3563;

    @ObfuscatedName("jz.c")
    public int[] field3564;

    @ObfuscatedName("jz.h")
    public String[] field3557;

    @ObfuscatedName("ff.g(Ljr;I)V")
    public static void method3205(class262 arg0) {
        Statics.field3562 = arg0;
    }

    @ObfuscatedName("jz.b(Lgg;I)V")
    public void method4637(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4638(arg0, var2);
        }
    }

    @ObfuscatedName("jz.z(Lgg;II)V")
    public void method4638(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3558 = (char) arg0.method3332();
        } else if (arg1 == 2) {
            this.field3559 = (char) arg0.method3332();
        } else if (arg1 == 3) {
            this.field3560 = arg0.method3429();
        } else if (arg1 == 4) {
            this.field3561 = arg0.method3472();
        } else if (arg1 == 5) {
            this.field3556 = arg0.method3310();
            this.field3563 = new int[this.field3556];
            this.field3557 = new String[this.field3556];
            for (int var3 = 0; var3 < this.field3556; var3++) {
                this.field3563[var3] = arg0.method3472();
                this.field3557[var3] = arg0.method3429();
            }
        } else if (arg1 == 6) {
            this.field3556 = arg0.method3310();
            this.field3563 = new int[this.field3556];
            this.field3564 = new int[this.field3556];
            for (int var4 = 0; var4 < this.field3556; var4++) {
                this.field3563[var4] = arg0.method3472();
                this.field3564[var4] = arg0.method3472();
            }
        }
    }

    @ObfuscatedName("jz.n(B)I")
    public int method4639() {
        return this.field3556;
    }
}
