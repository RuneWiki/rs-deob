package deob;

@ObfuscatedName("iv")
public class class255 extends class196 {

    @ObfuscatedName("iv.j")
    public static class191 field3402 = new class191(64);

    @ObfuscatedName("iv.a")
    public char field3403;

    @ObfuscatedName("iv.r")
    public char field3404;

    @ObfuscatedName("iv.o")
    public String field3409 = "null";

    @ObfuscatedName("iv.n")
    public int field3406;

    @ObfuscatedName("iv.q")
    public int field3407 = 0;

    @ObfuscatedName("iv.b")
    public int[] field3408;

    @ObfuscatedName("iv.k")
    public int[] field3405;

    @ObfuscatedName("iv.s")
    public String[] field3410;

    @ObfuscatedName("ga.i(II)Liv;")
    public static class255 method3501(int arg0) {
        class255 var1 = (class255) field3402.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3411.method3824(8, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4154(new class175(var2));
        }
        field3402.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.j(Lfp;B)V")
    public void method4154(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4153(arg0, var2);
        }
    }

    @ObfuscatedName("iv.a(Lfp;II)V")
    public void method4153(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3403 = (char) arg0.method2999();
        } else if (arg1 == 2) {
            this.field3404 = (char) arg0.method2999();
        } else if (arg1 == 3) {
            this.field3409 = arg0.method3002();
        } else if (arg1 == 4) {
            this.field3406 = arg0.method2998();
        } else if (arg1 == 5) {
            this.field3407 = arg0.method2995();
            this.field3408 = new int[this.field3407];
            this.field3410 = new String[this.field3407];
            for (int var3 = 0; var3 < this.field3407; var3++) {
                this.field3408[var3] = arg0.method2998();
                this.field3410[var3] = arg0.method3002();
            }
        } else if (arg1 == 6) {
            this.field3407 = arg0.method2995();
            this.field3408 = new int[this.field3407];
            this.field3405 = new int[this.field3407];
            for (int var4 = 0; var4 < this.field3407; var4++) {
                this.field3408[var4] = arg0.method2998();
                this.field3405[var4] = arg0.method2998();
            }
        }
    }
}
