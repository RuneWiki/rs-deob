package deob;

@ObfuscatedName("jn")
public class class265 extends class206 {

    @ObfuscatedName("jn.v")
    public static class201 field3492 = new class201(64);

    @ObfuscatedName("jn.y")
    public char field3491;

    @ObfuscatedName("jn.r")
    public char field3493;

    @ObfuscatedName("jn.h")
    public String field3490 = "null";

    @ObfuscatedName("jn.d")
    public int field3488;

    @ObfuscatedName("jn.s")
    public int field3489 = 0;

    @ObfuscatedName("jn.b")
    public int[] field3494;

    @ObfuscatedName("jn.e")
    public int[] field3495;

    @ObfuscatedName("jn.f")
    public String[] field3496;

    @ObfuscatedName("fh.n(Lil;I)V")
    public static void method2926(class247 arg0) {
        Statics.field2899 = arg0;
    }

    @ObfuscatedName("av.v(IB)Ljn;")
    public static class265 method456(int arg0) {
        class265 var1 = (class265) field3492.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2899.method3931(8, arg0);
        class265 var3 = new class265();
        if (var2 != null) {
            var3.method4260(new class185(var2));
        }
        field3492.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.y(Lgv;I)V")
    public void method4260(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4256(arg0, var2);
        }
    }

    @ObfuscatedName("jn.r(Lgv;II)V")
    public void method4256(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3491 = (char) arg0.method3021();
        } else if (arg1 == 2) {
            this.field3493 = (char) arg0.method3021();
        } else if (arg1 == 3) {
            this.field3490 = arg0.method3030();
        } else if (arg1 == 4) {
            this.field3488 = arg0.method3026();
        } else if (arg1 == 5) {
            this.field3489 = arg0.method3015();
            this.field3494 = new int[this.field3489];
            this.field3496 = new String[this.field3489];
            for (int var3 = 0; var3 < this.field3489; var3++) {
                this.field3494[var3] = arg0.method3026();
                this.field3496[var3] = arg0.method3030();
            }
        } else if (arg1 == 6) {
            this.field3489 = arg0.method3015();
            this.field3494 = new int[this.field3489];
            this.field3495 = new int[this.field3489];
            for (int var4 = 0; var4 < this.field3489; var4++) {
                this.field3494[var4] = arg0.method3026();
                this.field3495[var4] = arg0.method3026();
            }
        }
    }

    @ObfuscatedName("jn.h(I)I")
    public int method4270() {
        return this.field3489;
    }
}
