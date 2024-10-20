package deob;

@ObfuscatedName("hm")
public class class218 {

    @ObfuscatedName("hm.p")
    public class185 field2655 = new class185((byte[]) null);

    @ObfuscatedName("hm.i")
    public int field2654;

    @ObfuscatedName("hm.w")
    public int[] field2659;

    @ObfuscatedName("hm.s")
    public int[] field2653;

    @ObfuscatedName("hm.j")
    public int[] field2657;

    @ObfuscatedName("hm.a")
    public int[] field2658;

    @ObfuscatedName("hm.t")
    public int field2663;

    @ObfuscatedName("hm.m")
    public long field2661;

    @ObfuscatedName("hm.h")
    public static final byte[] field2662 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class218() {
    }

    public class218(byte[] arg0) {
        this.method3791(arg0);
    }

    @ObfuscatedName("hm.p([B)V")
    public void method3791(byte[] arg0) {
        this.field2655.field2491 = arg0;
        this.field2655.field2488 = 10;
        int var2 = this.field2655.method3124();
        this.field2654 = this.field2655.method3124();
        this.field2663 = 500000;
        this.field2659 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2655.method3127();
            int var5 = this.field2655.method3127();
            if (var4 == 1297379947) {
                this.field2659[var3] = this.field2655.field2488;
                var3++;
            }
            this.field2655.field2488 += var5;
        }
        this.field2661 = 0L;
        this.field2653 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2653[var6] = this.field2659[var6];
        }
        this.field2657 = new int[var2];
        this.field2658 = new int[var2];
    }

    @ObfuscatedName("hm.i()V")
    public void method3777() {
        this.field2655.field2491 = null;
        this.field2659 = null;
        this.field2653 = null;
        this.field2657 = null;
        this.field2658 = null;
    }

    @ObfuscatedName("hm.w()Z")
    public boolean method3778() {
        return this.field2655.field2491 != null;
    }

    @ObfuscatedName("hm.s()I")
    public int method3779() {
        return this.field2653.length;
    }

    @ObfuscatedName("hm.j(I)V")
    public void method3780(int arg0) {
        this.field2655.field2488 = this.field2653[arg0];
    }

    @ObfuscatedName("hm.a(I)V")
    public void method3781(int arg0) {
        this.field2653[arg0] = this.field2655.field2488;
    }

    @ObfuscatedName("hm.t()V")
    public void method3818() {
        this.field2655.field2488 = -1;
    }

    @ObfuscatedName("hm.r(I)V")
    public void method3783(int arg0) {
        int var2 = this.field2655.method3155();
        this.field2657[arg0] += var2;
    }

    @ObfuscatedName("hm.m(I)I")
    public int method3784(int arg0) {
        return this.method3802(arg0);
    }

    @ObfuscatedName("hm.h(I)I")
    public int method3802(int arg0) {
        byte var2 = this.field2655.field2491[this.field2655.field2488];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2658[arg0] = var3;
            this.field2655.field2488++;
        } else {
            var3 = this.field2658[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3785(arg0, var3);
        }
        int var4 = this.field2655.method3155();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2655.field2491[this.field2655.field2488] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2655.field2488++;
                this.field2658[arg0] = var5;
                return this.method3785(arg0, var5);
            }
        }
        this.field2655.field2488 += var4;
        return 0;
    }

    @ObfuscatedName("hm.o(II)I")
    public int method3785(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2662[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2655.method3197() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2655.method3197() << 16;
            }
            return var8;
        }
        int var3 = this.field2655.method3197();
        int var4 = this.field2655.method3155();
        if (var3 == 47) {
            this.field2655.field2488 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2655.method3138();
            var4 -= 3;
            int var6 = this.field2657[arg0];
            this.field2661 += (long) (this.field2663 - var5) * (long) var6;
            this.field2663 = var5;
            this.field2655.field2488 += var4;
            return 2;
        } else {
            this.field2655.field2488 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hm.x(I)J")
    public long method3792(int arg0) {
        return (long) this.field2663 * (long) arg0 + this.field2661;
    }

    @ObfuscatedName("hm.q()I")
    public int method3787() {
        int var1 = this.field2653.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2653[var4] >= 0 && this.field2657[var4] < var3) {
                var2 = var4;
                var3 = this.field2657[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hm.d()Z")
    public boolean method3788() {
        int var1 = this.field2653.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2653[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hm.l(J)V")
    public void method3822(long arg0) {
        this.field2661 = arg0;
        int var3 = this.field2653.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2657[var4] = 0;
            this.field2658[var4] = 0;
            this.field2655.field2488 = this.field2659[var4];
            this.method3783(var4);
            this.field2653[var4] = this.field2655.field2488;
        }
    }
}
