package deob;

@ObfuscatedName("im")
public class class254 extends class195 {

    @ObfuscatedName("im.m")
    public static class190 field3409 = new class190(64);

    @ObfuscatedName("im.e")
    public char field3408;

    @ObfuscatedName("im.t")
    public char field3414;

    @ObfuscatedName("im.w")
    public String field3410 = "null";

    @ObfuscatedName("im.z")
    public int field3413;

    @ObfuscatedName("im.j")
    public int field3412 = 0;

    @ObfuscatedName("im.i")
    public int[] field3406;

    @ObfuscatedName("im.f")
    public int[] field3411;

    @ObfuscatedName("im.c")
    public String[] field3415;

    @ObfuscatedName("ct.p(Lil;B)V")
    public static void method1544(class236 arg0) {
        Statics.field3407 = arg0;
    }

    @ObfuscatedName("fb.m(IB)Lim;")
    public static class254 method3038(int arg0) {
        class254 var1 = (class254) field3409.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3407.method3720(8, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4036(new class174(var2));
        }
        field3409.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.e(Lfr;I)V")
    public void method4036(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4038(arg0, var2);
        }
    }

    @ObfuscatedName("im.t(Lfr;IB)V")
    public void method4038(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3408 = (char) arg0.method2810();
        } else if (arg1 == 2) {
            this.field3414 = (char) arg0.method2810();
        } else if (arg1 == 3) {
            this.field3410 = arg0.method2818();
        } else if (arg1 == 4) {
            this.field3413 = arg0.method2803();
        } else if (arg1 == 5) {
            this.field3412 = arg0.method2824();
            this.field3406 = new int[this.field3412];
            this.field3415 = new String[this.field3412];
            for (int var3 = 0; var3 < this.field3412; var3++) {
                this.field3406[var3] = arg0.method2803();
                this.field3415[var3] = arg0.method2818();
            }
        } else if (arg1 == 6) {
            this.field3412 = arg0.method2824();
            this.field3406 = new int[this.field3412];
            this.field3411 = new int[this.field3412];
            for (int var4 = 0; var4 < this.field3412; var4++) {
                this.field3406[var4] = arg0.method2803();
                this.field3411[var4] = arg0.method2803();
            }
        }
    }
}
