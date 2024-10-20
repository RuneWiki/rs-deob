package deob;

@ObfuscatedName("ih")
public class class252 extends class176 {

    @ObfuscatedName("ih.t")
    public static class146 field3305 = new class146(64);

    @ObfuscatedName("ih.n")
    public char field3306;

    @ObfuscatedName("ih.q")
    public char field3304;

    @ObfuscatedName("ih.v")
    public String field3308 = class225.field2836;

    @ObfuscatedName("ih.l")
    public int field3309;

    @ObfuscatedName("ih.c")
    public int field3310 = 0;

    @ObfuscatedName("ih.o")
    public int[] field3311;

    @ObfuscatedName("ih.i")
    public int[] field3312;

    @ObfuscatedName("ih.d")
    public String[] field3307;

    @ObfuscatedName("ad.a(Lhq;I)V")
    public static void method528(class234 arg0) {
        Statics.field3313 = arg0;
    }

    @ObfuscatedName("hf.t(IB)Lih;")
    public static class252 method3732(int arg0) {
        class252 var1 = (class252) field3305.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3313.method3873(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4248(new class300(var2));
        }
        field3305.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.n(Lkc;S)V")
    public void method4248(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4247(arg0, var2);
        }
    }

    @ObfuscatedName("ih.q(Lkc;II)V")
    public void method4247(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3306 = (char) arg0.method5123();
        } else if (arg1 == 2) {
            this.field3304 = (char) arg0.method5123();
        } else if (arg1 == 3) {
            this.field3308 = arg0.method5132();
        } else if (arg1 == 4) {
            this.field3309 = arg0.method5155();
        } else if (arg1 == 5) {
            this.field3310 = arg0.method5166();
            this.field3311 = new int[this.field3310];
            this.field3307 = new String[this.field3310];
            for (int var3 = 0; var3 < this.field3310; var3++) {
                this.field3311[var3] = arg0.method5155();
                this.field3307[var3] = arg0.method5132();
            }
        } else if (arg1 == 6) {
            this.field3310 = arg0.method5166();
            this.field3311 = new int[this.field3310];
            this.field3312 = new int[this.field3310];
            for (int var4 = 0; var4 < this.field3310; var4++) {
                this.field3311[var4] = arg0.method5155();
                this.field3312[var4] = arg0.method5155();
            }
        }
    }

    @ObfuscatedName("ih.v(I)I")
    public int method4251() {
        return this.field3310;
    }
}
