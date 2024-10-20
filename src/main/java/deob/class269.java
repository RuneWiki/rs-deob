package deob;

@ObfuscatedName("jd")
public class class269 extends class209 {

    @ObfuscatedName("jd.q")
    public static class203 field3380 = new class203(64);

    @ObfuscatedName("jd.m")
    public char field3381;

    @ObfuscatedName("jd.j")
    public char field3382;

    @ObfuscatedName("jd.g")
    public String field3383 = class240.field3056;

    @ObfuscatedName("jd.i")
    public int field3388;

    @ObfuscatedName("jd.h")
    public int field3385 = 0;

    @ObfuscatedName("jd.l")
    public int[] field3386;

    @ObfuscatedName("jd.d")
    public int[] field3387;

    @ObfuscatedName("jd.o")
    public String[] field3384;

    @ObfuscatedName("dz.c(IS)Ljd;")
    public static class269 method2550(int arg0) {
        class269 var1 = (class269) field3380.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3379.method4210(8, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4614(new class185(var2));
        }
        field3380.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.q(Lgg;B)V")
    public void method4614(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4615(arg0, var2);
        }
    }

    @ObfuscatedName("jd.m(Lgg;II)V")
    public void method4615(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3381 = (char) arg0.method3243();
        } else if (arg1 == 2) {
            this.field3382 = (char) arg0.method3243();
        } else if (arg1 == 3) {
            this.field3383 = arg0.method3251();
        } else if (arg1 == 4) {
            this.field3388 = arg0.method3323();
        } else if (arg1 == 5) {
            this.field3385 = arg0.method3245();
            this.field3386 = new int[this.field3385];
            this.field3384 = new String[this.field3385];
            for (int var3 = 0; var3 < this.field3385; var3++) {
                this.field3386[var3] = arg0.method3323();
                this.field3384[var3] = arg0.method3251();
            }
        } else if (arg1 == 6) {
            this.field3385 = arg0.method3245();
            this.field3386 = new int[this.field3385];
            this.field3387 = new int[this.field3385];
            for (int var4 = 0; var4 < this.field3385; var4++) {
                this.field3386[var4] = arg0.method3323();
                this.field3387[var4] = arg0.method3323();
            }
        }
    }

    @ObfuscatedName("jd.j(B)I")
    public int method4616() {
        return this.field3385;
    }
}
