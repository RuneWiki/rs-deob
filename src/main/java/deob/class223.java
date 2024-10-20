package deob;

@ObfuscatedName("hm")
public class class223 {

    @ObfuscatedName("hm.f")
    public class185 field2597 = new class185((byte[]) null);

    @ObfuscatedName("hm.l")
    public int field2589;

    @ObfuscatedName("hm.w")
    public int[] field2590;

    @ObfuscatedName("hm.s")
    public int[] field2591;

    @ObfuscatedName("hm.e")
    public int[] field2595;

    @ObfuscatedName("hm.a")
    public int[] field2593;

    @ObfuscatedName("hm.c")
    public int field2594;

    @ObfuscatedName("hm.r")
    public long field2596;

    @ObfuscatedName("hm.m")
    public static final byte[] field2588 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class223() {
    }

    public class223(byte[] arg0) {
        this.method4045(arg0);
    }

    @ObfuscatedName("hm.f([B)V")
    public void method4045(byte[] arg0) {
        this.field2597.field2415 = arg0;
        this.field2597.field2414 = 10;
        int var2 = this.field2597.method3346();
        this.field2589 = this.field2597.method3346();
        this.field2594 = 500000;
        this.field2590 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2597.method3432();
            int var5 = this.field2597.method3432();
            if (var4 == 1297379947) {
                this.field2590[var3] = this.field2597.field2414;
                var3++;
            }
            this.field2597.field2414 += var5;
        }
        this.field2596 = 0L;
        this.field2591 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2591[var6] = this.field2590[var6];
        }
        this.field2595 = new int[var2];
        this.field2593 = new int[var2];
    }

    @ObfuscatedName("hm.l()V")
    public void method4046() {
        this.field2597.field2415 = null;
        this.field2590 = null;
        this.field2591 = null;
        this.field2595 = null;
        this.field2593 = null;
    }

    @ObfuscatedName("hm.w()Z")
    public boolean method4064() {
        return this.field2597.field2415 != null;
    }

    @ObfuscatedName("hm.s()I")
    public int method4079() {
        return this.field2591.length;
    }

    @ObfuscatedName("hm.e(I)V")
    public void method4058(int arg0) {
        this.field2597.field2414 = this.field2591[arg0];
    }

    @ObfuscatedName("hm.c(I)V")
    public void method4050(int arg0) {
        this.field2591[arg0] = this.field2597.field2414;
    }

    @ObfuscatedName("hm.p()V")
    public void method4043() {
        this.field2597.field2414 = -1;
    }

    @ObfuscatedName("hm.r(I)V")
    public void method4052(int arg0) {
        int var2 = this.field2597.method3351();
        this.field2595[arg0] += var2;
    }

    @ObfuscatedName("hm.m(I)I")
    public int method4053(int arg0) {
        return this.method4054(arg0);
    }

    @ObfuscatedName("hm.d(I)I")
    public int method4054(int arg0) {
        byte var2 = this.field2597.field2415[this.field2597.field2414];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2593[arg0] = var3;
            this.field2597.field2414++;
        } else {
            var3 = this.field2593[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4078(arg0, var3);
        }
        int var4 = this.field2597.method3351();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2597.field2415[this.field2597.field2414] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2597.field2414++;
                this.field2593[arg0] = var5;
                return this.method4078(arg0, var5);
            }
        }
        this.field2597.field2414 += var4;
        return 0;
    }

    @ObfuscatedName("hm.z(II)I")
    public int method4078(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2588[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2597.method3344() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2597.method3344() << 16;
            }
            return var8;
        }
        int var3 = this.field2597.method3344();
        int var4 = this.field2597.method3351();
        if (var3 == 47) {
            this.field2597.field2414 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2597.method3348();
            var4 -= 3;
            int var6 = this.field2595[arg0];
            this.field2596 += (long) (this.field2594 - var5) * (long) var6;
            this.field2594 = var5;
            this.field2597.field2414 += var4;
            return 2;
        } else {
            this.field2597.field2414 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hm.x(I)J")
    public long method4056(int arg0) {
        return (long) this.field2594 * (long) arg0 + this.field2596;
    }

    @ObfuscatedName("hm.v()I")
    public int method4057() {
        int var1 = this.field2591.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2591[var4] >= 0 && this.field2595[var4] < var3) {
                var2 = var4;
                var3 = this.field2595[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hm.g()Z")
    public boolean method4066() {
        int var1 = this.field2591.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2591[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hm.u(J)V")
    public void method4059(long arg0) {
        this.field2596 = arg0;
        int var3 = this.field2591.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2595[var4] = 0;
            this.field2593[var4] = 0;
            this.field2597.field2414 = this.field2590[var4];
            this.method4052(var4);
            this.field2591[var4] = this.field2597.field2414;
        }
    }
}
