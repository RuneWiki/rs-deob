package deob;

@ObfuscatedName("in")
public class class254 extends class195 {

    @ObfuscatedName("in.s")
    public static class190 field3409 = new class190(64);

    @ObfuscatedName("in.q")
    public char field3401;

    @ObfuscatedName("in.o")
    public char field3402;

    @ObfuscatedName("in.g")
    public String field3403 = "null";

    @ObfuscatedName("in.v")
    public int field3404;

    @ObfuscatedName("in.p")
    public int field3400 = 0;

    @ObfuscatedName("in.e")
    public int[] field3406;

    @ObfuscatedName("in.d")
    public int[] field3407;

    @ObfuscatedName("in.x")
    public String[] field3408;

    @ObfuscatedName("dw.w(II)Lin;")
    public static class254 method2228(int arg0) {
        class254 var1 = (class254) field3409.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3399.method3876(8, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4219(new class174(var2));
        }
        field3409.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.s(Lfz;I)V")
    public void method4219(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4220(arg0, var2);
        }
    }

    @ObfuscatedName("in.q(Lfz;II)V")
    public void method4220(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3401 = (char) arg0.method2971();
        } else if (arg1 == 2) {
            this.field3402 = (char) arg0.method2971();
        } else if (arg1 == 3) {
            this.field3403 = arg0.method3111();
        } else if (arg1 == 4) {
            this.field3404 = arg0.method3131();
        } else if (arg1 == 5) {
            this.field3400 = arg0.method3178();
            this.field3406 = new int[this.field3400];
            this.field3408 = new String[this.field3400];
            for (int var3 = 0; var3 < this.field3400; var3++) {
                this.field3406[var3] = arg0.method3131();
                this.field3408[var3] = arg0.method3111();
            }
        } else if (arg1 == 6) {
            this.field3400 = arg0.method3178();
            this.field3406 = new int[this.field3400];
            this.field3407 = new int[this.field3400];
            for (int var4 = 0; var4 < this.field3400; var4++) {
                this.field3406[var4] = arg0.method3131();
                this.field3407[var4] = arg0.method3131();
            }
        }
    }
}
