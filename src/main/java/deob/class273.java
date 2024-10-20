package deob;

@ObfuscatedName("jf")
public class class273 extends class214 {

    @ObfuscatedName("jf.s")
    public static class208 field3425 = new class208(64);

    @ObfuscatedName("jf.g")
    public char field3422;

    @ObfuscatedName("jf.x")
    public char field3424;

    @ObfuscatedName("jf.h")
    public String field3423 = class246.field2885;

    @ObfuscatedName("jf.f")
    public int field3421;

    @ObfuscatedName("jf.p")
    public int field3426 = 0;

    @ObfuscatedName("jf.m")
    public int[] field3427;

    @ObfuscatedName("jf.q")
    public int[] field3428;

    @ObfuscatedName("jf.b")
    public String[] field3429;

    @ObfuscatedName("jf.s(Lgx;B)V")
    public void method4790(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4796(arg0, var2);
        }
    }

    @ObfuscatedName("jf.g(Lgx;II)V")
    public void method4796(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3422 = (char) arg0.method3443();
        } else if (arg1 == 2) {
            this.field3424 = (char) arg0.method3443();
        } else if (arg1 == 3) {
            this.field3423 = arg0.method3647();
        } else if (arg1 == 4) {
            this.field3421 = arg0.method3460();
        } else if (arg1 == 5) {
            this.field3426 = arg0.method3610();
            this.field3427 = new int[this.field3426];
            this.field3429 = new String[this.field3426];
            for (int var3 = 0; var3 < this.field3426; var3++) {
                this.field3427[var3] = arg0.method3460();
                this.field3429[var3] = arg0.method3647();
            }
        } else if (arg1 == 6) {
            this.field3426 = arg0.method3610();
            this.field3427 = new int[this.field3426];
            this.field3428 = new int[this.field3426];
            for (int var4 = 0; var4 < this.field3426; var4++) {
                this.field3427[var4] = arg0.method3460();
                this.field3428[var4] = arg0.method3460();
            }
        }
    }

    @ObfuscatedName("jf.x(I)I")
    public int method4791() {
        return this.field3426;
    }
}
