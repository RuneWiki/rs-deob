package deob;

@ObfuscatedName("it")
public class class257 extends class185 {

    @ObfuscatedName("it.c")
    public static class155 field3300 = new class155(64);

    @ObfuscatedName("it.y")
    public int field3301 = -1;

    @ObfuscatedName("it.h")
    public int[] field3302;

    @ObfuscatedName("it.z")
    public short[] field3303;

    @ObfuscatedName("it.e")
    public short[] field3304;

    @ObfuscatedName("it.q")
    public short[] field3299;

    @ObfuscatedName("it.l")
    public short[] field3305;

    @ObfuscatedName("it.s")
    public int[] field3307 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("it.b")
    public boolean field3308 = false;

    @ObfuscatedName("ir.n(Lig;Lig;I)V")
    public static void method3961(class245 arg0, class245 arg1) {
        Statics.field3306 = arg0;
        Statics.field3298 = arg1;
        Statics.field3297 = Statics.field3306.method4008(3);
    }

    @ObfuscatedName("it.d(Lkx;I)V")
    public void method4252(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4253(arg0, var2);
        }
    }

    @ObfuscatedName("it.c(Lkx;II)V")
    public void method4253(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3301 = arg0.method5310();
        } else if (arg1 == 2) {
            int var3 = arg0.method5310();
            this.field3302 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3302[var4] = arg0.method5247();
            }
        } else if (arg1 == 3) {
            this.field3308 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5310();
            this.field3303 = new short[var5];
            this.field3304 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3303[var6] = (short) arg0.method5247();
                this.field3304[var6] = (short) arg0.method5247();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5310();
            this.field3299 = new short[var7];
            this.field3305 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3299[var8] = (short) arg0.method5247();
                this.field3305[var8] = (short) arg0.method5247();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3307[arg1 - 60] = arg0.method5247();
        }
    }

    @ObfuscatedName("it.y(B)Z")
    public boolean method4247() {
        if (this.field3302 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3302.length; var2++) {
            if (!Statics.field3298.method4024(this.field3302[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("it.h(B)Lek;")
    public class131 method4248() {
        if (this.field3302 == null) {
            return null;
        }
        class131[] var1 = new class131[this.field3302.length];
        for (int var2 = 0; var2 < this.field3302.length; var2++) {
            var1[var2] = class131.method2777(Statics.field3298, this.field3302[var2], 0);
        }
        class131 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class131(var1, var1.length);
        }
        if (this.field3303 != null) {
            for (int var4 = 0; var4 < this.field3303.length; var4++) {
                var3.method2715(this.field3303[var4], this.field3304[var4]);
            }
        }
        if (this.field3299 != null) {
            for (int var5 = 0; var5 < this.field3299.length; var5++) {
                var3.method2714(this.field3299[var5], this.field3305[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("it.z(B)Z")
    public boolean method4245() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3307[var2] != -1 && !Statics.field3298.method4024(this.field3307[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("it.e(I)Lek;")
    public class131 method4244() {
        class131[] var1 = new class131[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3307[var3] != -1) {
                var1[var2++] = class131.method2777(Statics.field3298, this.field3307[var3], 0);
            }
        }
        class131 var4 = new class131(var1, var2);
        if (this.field3303 != null) {
            for (int var5 = 0; var5 < this.field3303.length; var5++) {
                var4.method2715(this.field3303[var5], this.field3304[var5]);
            }
        }
        if (this.field3299 != null) {
            for (int var6 = 0; var6 < this.field3299.length; var6++) {
                var4.method2714(this.field3299[var6], this.field3305[var6]);
            }
        }
        return var4;
    }
}
