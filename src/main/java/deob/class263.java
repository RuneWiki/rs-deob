package deob;

@ObfuscatedName("jx")
public class class263 extends class185 {

    @ObfuscatedName("jx.v")
    public static class155 field3342 = new class155(64);

    @ObfuscatedName("jx.x")
    public char field3340;

    @ObfuscatedName("jx.w")
    public char field3343;

    @ObfuscatedName("jx.t")
    public String field3344 = class234.field2792;

    @ObfuscatedName("jx.j")
    public int field3345;

    @ObfuscatedName("jx.n")
    public int field3346 = 0;

    @ObfuscatedName("jx.p")
    public int[] field3347;

    @ObfuscatedName("jx.l")
    public int[] field3348;

    @ObfuscatedName("jx.z")
    public String[] field3352;

    @ObfuscatedName("jb.h(Lib;I)V")
    public static void method4176(class245 arg0) {
        Statics.field3350 = arg0;
    }

    @ObfuscatedName("hn.v(II)Ljx;")
    public static class263 method3538(int arg0) {
        class263 var1 = (class263) field3342.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3350.method3834(8, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4199(new class311(var2));
        }
        field3342.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.x(Lkj;B)V")
    public void method4199(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4200(arg0, var2);
        }
    }

    @ObfuscatedName("jx.w(Lkj;II)V")
    public void method4200(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3340 = (char) arg0.method5274();
        } else if (arg1 == 2) {
            this.field3343 = (char) arg0.method5274();
        } else if (arg1 == 3) {
            this.field3344 = arg0.method5202();
        } else if (arg1 == 4) {
            this.field3345 = arg0.method5120();
        } else if (arg1 == 5) {
            this.field3346 = arg0.method5342();
            this.field3347 = new int[this.field3346];
            this.field3352 = new String[this.field3346];
            for (int var3 = 0; var3 < this.field3346; var3++) {
                this.field3347[var3] = arg0.method5120();
                this.field3352[var3] = arg0.method5202();
            }
        } else if (arg1 == 6) {
            this.field3346 = arg0.method5342();
            this.field3347 = new int[this.field3346];
            this.field3348 = new int[this.field3346];
            for (int var4 = 0; var4 < this.field3346; var4++) {
                this.field3347[var4] = arg0.method5120();
                this.field3348[var4] = arg0.method5120();
            }
        }
    }

    @ObfuscatedName("jx.t(I)I")
    public int method4201() {
        return this.field3346;
    }
}
