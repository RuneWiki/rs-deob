package deob;

@ObfuscatedName("jg")
public class class265 extends class206 {

    @ObfuscatedName("jg.w")
    public static class201 field3478 = new class201(64);

    @ObfuscatedName("jg.e")
    public char field3479;

    @ObfuscatedName("jg.k")
    public char field3477;

    @ObfuscatedName("jg.u")
    public String field3484 = "null";

    @ObfuscatedName("jg.z")
    public int field3482;

    @ObfuscatedName("jg.t")
    public int field3483 = 0;

    @ObfuscatedName("jg.f")
    public int[] field3480;

    @ObfuscatedName("jg.g")
    public int[] field3485;

    @ObfuscatedName("jg.j")
    public String[] field3486;

    @ObfuscatedName("ce.a(Lib;I)V")
    public static void method1510(class247 arg0) {
        Statics.field3481 = arg0;
    }

    @ObfuscatedName("n.w(II)Ljg;")
    public static class265 method59(int arg0) {
        class265 var1 = (class265) field3478.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3481.method3897(8, arg0);
        class265 var3 = new class265();
        if (var2 != null) {
            var3.method4236(new class185(var2));
        }
        field3478.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.e(Lgh;B)V")
    public void method4236(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4239(arg0, var2);
        }
    }

    @ObfuscatedName("jg.k(Lgh;II)V")
    public void method4239(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3479 = (char) arg0.method2962();
        } else if (arg1 == 2) {
            this.field3477 = (char) arg0.method2962();
        } else if (arg1 == 3) {
            this.field3484 = arg0.method3168();
        } else if (arg1 == 4) {
            this.field3482 = arg0.method2967();
        } else if (arg1 == 5) {
            this.field3483 = arg0.method3194();
            this.field3480 = new int[this.field3483];
            this.field3486 = new String[this.field3483];
            for (int var3 = 0; var3 < this.field3483; var3++) {
                this.field3480[var3] = arg0.method2967();
                this.field3486[var3] = arg0.method3168();
            }
        } else if (arg1 == 6) {
            this.field3483 = arg0.method3194();
            this.field3480 = new int[this.field3483];
            this.field3485 = new int[this.field3483];
            for (int var4 = 0; var4 < this.field3483; var4++) {
                this.field3480[var4] = arg0.method2967();
                this.field3485[var4] = arg0.method2967();
            }
        }
    }
}
