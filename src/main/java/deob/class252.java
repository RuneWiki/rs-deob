package deob;

@ObfuscatedName("ir")
public class class252 extends class176 {

    @ObfuscatedName("ir.j")
    public static class146 field3297 = new class146(64);

    @ObfuscatedName("ir.i")
    public char field3298;

    @ObfuscatedName("ir.k")
    public char field3301;

    @ObfuscatedName("ir.u")
    public String field3305 = class225.field2929;

    @ObfuscatedName("ir.n")
    public int field3307;

    @ObfuscatedName("ir.t")
    public int field3302 = 0;

    @ObfuscatedName("ir.q")
    public int[] field3303;

    @ObfuscatedName("ir.x")
    public int[] field3304;

    @ObfuscatedName("ir.d")
    public String[] field3296;

    @ObfuscatedName("cd.s(IB)Lir;")
    public static class252 method1880(int arg0) {
        class252 var1 = (class252) field3297.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3299.method3790(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4137(new class300(var2));
        }
        field3297.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.j(Lky;I)V")
    public void method4137(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4142(arg0, var2);
        }
    }

    @ObfuscatedName("ir.i(Lky;II)V")
    public void method4142(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = (char) arg0.method5179();
        } else if (arg1 == 2) {
            this.field3301 = (char) arg0.method5179();
        } else if (arg1 == 3) {
            this.field3305 = arg0.method5150();
        } else if (arg1 == 4) {
            this.field3307 = arg0.method5056();
        } else if (arg1 == 5) {
            this.field3302 = arg0.method5054();
            this.field3303 = new int[this.field3302];
            this.field3296 = new String[this.field3302];
            for (int var3 = 0; var3 < this.field3302; var3++) {
                this.field3303[var3] = arg0.method5056();
                this.field3296[var3] = arg0.method5150();
            }
        } else if (arg1 == 6) {
            this.field3302 = arg0.method5054();
            this.field3303 = new int[this.field3302];
            this.field3304 = new int[this.field3302];
            for (int var4 = 0; var4 < this.field3302; var4++) {
                this.field3303[var4] = arg0.method5056();
                this.field3304[var4] = arg0.method5056();
            }
        }
    }

    @ObfuscatedName("ir.k(B)I")
    public int method4138() {
        return this.field3302;
    }
}
