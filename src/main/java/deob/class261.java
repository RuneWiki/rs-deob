package deob;

@ObfuscatedName("jz")
public class class261 extends class202 {

    @ObfuscatedName("jz.p")
    public static class197 field3453 = new class197(64);

    @ObfuscatedName("jz.i")
    public char field3454;

    @ObfuscatedName("jz.j")
    public char field3455;

    @ObfuscatedName("jz.v")
    public String field3456 = "null";

    @ObfuscatedName("jz.x")
    public int field3458;

    @ObfuscatedName("jz.e")
    public int field3452 = 0;

    @ObfuscatedName("jz.l")
    public int[] field3459;

    @ObfuscatedName("jz.b")
    public int[] field3460;

    @ObfuscatedName("jz.n")
    public String[] field3461;

    @ObfuscatedName("jz.m(Lfv;I)V")
    public void method4280(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4286(arg0, var2);
        }
    }

    @ObfuscatedName("jz.p(Lfv;II)V")
    public void method4286(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3454 = (char) arg0.method3012();
        } else if (arg1 == 2) {
            this.field3455 = (char) arg0.method3012();
        } else if (arg1 == 3) {
            this.field3456 = arg0.method3021();
        } else if (arg1 == 4) {
            this.field3458 = arg0.method3017();
        } else if (arg1 == 5) {
            this.field3452 = arg0.method3009();
            this.field3459 = new int[this.field3452];
            this.field3461 = new String[this.field3452];
            for (int var3 = 0; var3 < this.field3452; var3++) {
                this.field3459[var3] = arg0.method3017();
                this.field3461[var3] = arg0.method3021();
            }
        } else if (arg1 == 6) {
            this.field3452 = arg0.method3009();
            this.field3459 = new int[this.field3452];
            this.field3460 = new int[this.field3452];
            for (int var4 = 0; var4 < this.field3452; var4++) {
                this.field3459[var4] = arg0.method3017();
                this.field3460[var4] = arg0.method3017();
            }
        }
    }
}
