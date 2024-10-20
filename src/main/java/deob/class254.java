package deob;

@ObfuscatedName("ib")
public class class254 extends class195 {

    @ObfuscatedName("ib.c")
    public static class190 field3400 = new class190(64);

    @ObfuscatedName("ib.e")
    public char field3399;

    @ObfuscatedName("ib.v")
    public char field3401;

    @ObfuscatedName("ib.b")
    public String field3397 = "null";

    @ObfuscatedName("ib.y")
    public int field3402;

    @ObfuscatedName("ib.h")
    public int field3398 = 0;

    @ObfuscatedName("ib.x")
    public int[] field3404;

    @ObfuscatedName("ib.f")
    public int[] field3405;

    @ObfuscatedName("ib.n")
    public String[] field3406;

    @ObfuscatedName("fx.i(II)Lib;")
    public static class254 method3074(int arg0) {
        class254 var1 = (class254) field3400.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3403.method3769(8, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4121(new class174(var2));
        }
        field3400.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.c(Lfx;B)V")
    public void method4121(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4120(arg0, var2);
        }
    }

    @ObfuscatedName("ib.e(Lfx;II)V")
    public void method4120(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3399 = (char) arg0.method2870();
        } else if (arg1 == 2) {
            this.field3401 = (char) arg0.method2870();
        } else if (arg1 == 3) {
            this.field3397 = arg0.method2878();
        } else if (arg1 == 4) {
            this.field3402 = arg0.method2875();
        } else if (arg1 == 5) {
            this.field3398 = arg0.method2872();
            this.field3404 = new int[this.field3398];
            this.field3406 = new String[this.field3398];
            for (int var3 = 0; var3 < this.field3398; var3++) {
                this.field3404[var3] = arg0.method2875();
                this.field3406[var3] = arg0.method2878();
            }
        } else if (arg1 == 6) {
            this.field3398 = arg0.method2872();
            this.field3404 = new int[this.field3398];
            this.field3405 = new int[this.field3398];
            for (int var4 = 0; var4 < this.field3398; var4++) {
                this.field3404[var4] = arg0.method2875();
                this.field3405[var4] = arg0.method2875();
            }
        }
    }
}
