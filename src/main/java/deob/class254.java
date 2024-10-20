package deob;

@ObfuscatedName("if")
public class class254 extends class195 {

    @ObfuscatedName("if.o")
    public static class190 field3383 = new class190(64);

    @ObfuscatedName("if.m")
    public char field3379;

    @ObfuscatedName("if.g")
    public char field3378;

    @ObfuscatedName("if.d")
    public String field3381 = "null";

    @ObfuscatedName("if.b")
    public int field3382;

    @ObfuscatedName("if.k")
    public int field3384 = 0;

    @ObfuscatedName("if.f")
    public int[] field3377;

    @ObfuscatedName("if.j")
    public int[] field3385;

    @ObfuscatedName("if.q")
    public String[] field3386;

    @ObfuscatedName("dy.e(IB)Lif;")
    public static class254 method1907(int arg0) {
        class254 var1 = (class254) field3383.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3380.method3760(8, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4096(new class174(var2));
        }
        field3383.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.o(Lfw;I)V")
    public void method4096(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4101(arg0, var2);
        }
    }

    @ObfuscatedName("if.m(Lfw;II)V")
    public void method4101(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3379 = (char) arg0.method2891();
        } else if (arg1 == 2) {
            this.field3378 = (char) arg0.method2891();
        } else if (arg1 == 3) {
            this.field3381 = arg0.method2899();
        } else if (arg1 == 4) {
            this.field3382 = arg0.method2896();
        } else if (arg1 == 5) {
            this.field3384 = arg0.method2930();
            this.field3377 = new int[this.field3384];
            this.field3386 = new String[this.field3384];
            for (int var3 = 0; var3 < this.field3384; var3++) {
                this.field3377[var3] = arg0.method2896();
                this.field3386[var3] = arg0.method2899();
            }
        } else if (arg1 == 6) {
            this.field3384 = arg0.method2930();
            this.field3377 = new int[this.field3384];
            this.field3385 = new int[this.field3384];
            for (int var4 = 0; var4 < this.field3384; var4++) {
                this.field3377[var4] = arg0.method2896();
                this.field3385[var4] = arg0.method2896();
            }
        }
    }
}
