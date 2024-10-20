package deob;

@ObfuscatedName("hj")
public class class214 {

    @ObfuscatedName("hj.d")
    public class181 field2660 = new class181((byte[]) null);

    @ObfuscatedName("hj.x")
    public int field2653;

    @ObfuscatedName("hj.k")
    public int[] field2654;

    @ObfuscatedName("hj.z")
    public int[] field2655;

    @ObfuscatedName("hj.v")
    public int[] field2656;

    @ObfuscatedName("hj.m")
    public int[] field2657;

    @ObfuscatedName("hj.b")
    public int field2662;

    @ObfuscatedName("hj.p")
    public long field2652;

    @ObfuscatedName("hj.r")
    public static final byte[] field2658 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class214() {
    }

    public class214(byte[] arg0) {
        this.method3697(arg0);
    }

    @ObfuscatedName("hj.d([B)V")
    public void method3697(byte[] arg0) {
        this.field2660.field2496 = arg0;
        this.field2660.field2498 = 10;
        int var2 = this.field2660.method3179();
        this.field2653 = this.field2660.method3179();
        this.field2662 = 500000;
        this.field2654 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2660.method3041();
            int var5 = this.field2660.method3041();
            if (var4 == 1297379947) {
                this.field2654[var3] = this.field2660.field2498;
                var3++;
            }
            this.field2660.field2498 += var5;
        }
        this.field2652 = 0L;
        this.field2655 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2655[var6] = this.field2654[var6];
        }
        this.field2656 = new int[var2];
        this.field2657 = new int[var2];
    }

    @ObfuscatedName("hj.x()V")
    public void method3698() {
        this.field2660.field2496 = null;
        this.field2654 = null;
        this.field2655 = null;
        this.field2656 = null;
        this.field2657 = null;
    }

    @ObfuscatedName("hj.k()Z")
    public boolean method3699() {
        return this.field2660.field2496 != null;
    }

    @ObfuscatedName("hj.z()I")
    public int method3700() {
        return this.field2655.length;
    }

    @ObfuscatedName("hj.v(I)V")
    public void method3701(int arg0) {
        this.field2660.field2498 = this.field2655[arg0];
    }

    @ObfuscatedName("hj.m(I)V")
    public void method3711(int arg0) {
        this.field2655[arg0] = this.field2660.field2498;
    }

    @ObfuscatedName("hj.b()V")
    public void method3720() {
        this.field2660.field2498 = -1;
    }

    @ObfuscatedName("hj.t(I)V")
    public void method3704(int arg0) {
        int var2 = this.field2660.method3053();
        this.field2656[arg0] += var2;
    }

    @ObfuscatedName("hj.p(I)I")
    public int method3725(int arg0) {
        return this.method3706(arg0);
    }

    @ObfuscatedName("hj.r(I)I")
    public int method3706(int arg0) {
        byte var2 = this.field2660.field2496[this.field2660.field2498];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2657[arg0] = var3;
            this.field2660.field2498++;
        } else {
            var3 = this.field2657[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3746(arg0, var3);
        }
        int var4 = this.field2660.method3053();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2660.field2496[this.field2660.field2498] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2660.field2498++;
                this.field2657[arg0] = var5;
                return this.method3746(arg0, var5);
            }
        }
        this.field2660.field2498 += var4;
        return 0;
    }

    @ObfuscatedName("hj.l(II)I")
    public int method3746(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2658[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2660.method3204() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2660.method3204() << 16;
            }
            return var8;
        }
        int var3 = this.field2660.method3204();
        int var4 = this.field2660.method3053();
        if (var3 == 47) {
            this.field2660.field2498 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2660.method3235();
            var4 -= 3;
            int var6 = this.field2656[arg0];
            this.field2652 += (long) (this.field2662 - var5) * (long) var6;
            this.field2662 = var5;
            this.field2660.field2498 += var4;
            return 2;
        } else {
            this.field2660.field2498 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hj.u(I)J")
    public long method3708(int arg0) {
        return (long) this.field2662 * (long) arg0 + this.field2652;
    }

    @ObfuscatedName("hj.c()I")
    public int method3734() {
        int var1 = this.field2655.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2655[var4] >= 0 && this.field2656[var4] < var3) {
                var2 = var4;
                var3 = this.field2656[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hj.j()Z")
    public boolean method3723() {
        int var1 = this.field2655.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2655[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hj.f(J)V")
    public void method3709(long arg0) {
        this.field2652 = arg0;
        int var3 = this.field2655.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2656[var4] = 0;
            this.field2657[var4] = 0;
            this.field2660.field2498 = this.field2654[var4];
            this.method3704(var4);
            this.field2655[var4] = this.field2660.field2498;
        }
    }
}
