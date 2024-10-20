package deob;

@ObfuscatedName("jg")
public class class265 extends class206 {

    @ObfuscatedName("jg.g")
    public static class201 field3479 = new class201(64);

    @ObfuscatedName("jg.m")
    public char field3484;

    @ObfuscatedName("jg.h")
    public char field3481;

    @ObfuscatedName("jg.i")
    public String field3480 = "null";

    @ObfuscatedName("jg.w")
    public int field3483;

    @ObfuscatedName("jg.t")
    public int field3485 = 0;

    @ObfuscatedName("jg.d")
    public int[] field3486;

    @ObfuscatedName("jg.z")
    public int[] field3482;

    @ObfuscatedName("jg.k")
    public String[] field3478;

    @ObfuscatedName("bq.s(II)Ljg;")
    public static class265 method892(int arg0) {
        class265 var1 = (class265) field3479.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3487.method4231(8, arg0);
        class265 var3 = new class265();
        if (var2 != null) {
            var3.method4540(new class185(var2));
        }
        field3479.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.g(Lgy;B)V")
    public void method4540(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4541(arg0, var2);
        }
    }

    @ObfuscatedName("jg.m(Lgy;IB)V")
    public void method4541(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3484 = (char) arg0.method3239();
        } else if (arg1 == 2) {
            this.field3481 = (char) arg0.method3239();
        } else if (arg1 == 3) {
            this.field3480 = arg0.method3248();
        } else if (arg1 == 4) {
            this.field3483 = arg0.method3292();
        } else if (arg1 == 5) {
            this.field3485 = arg0.method3241();
            this.field3486 = new int[this.field3485];
            this.field3478 = new String[this.field3485];
            for (int var3 = 0; var3 < this.field3485; var3++) {
                this.field3486[var3] = arg0.method3292();
                this.field3478[var3] = arg0.method3248();
            }
        } else if (arg1 == 6) {
            this.field3485 = arg0.method3241();
            this.field3486 = new int[this.field3485];
            this.field3482 = new int[this.field3485];
            for (int var4 = 0; var4 < this.field3485; var4++) {
                this.field3486[var4] = arg0.method3292();
                this.field3482[var4] = arg0.method3292();
            }
        }
    }

    @ObfuscatedName("jg.h(I)I")
    public int method4539() {
        return this.field3485;
    }
}
