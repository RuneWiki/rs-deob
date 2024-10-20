package deob;

@ObfuscatedName("hx")
public class class218 {

    @ObfuscatedName("hx.s")
    public class185 field2682 = new class185((byte[]) null);

    @ObfuscatedName("hx.g")
    public int field2684;

    @ObfuscatedName("hx.m")
    public int[] field2671;

    @ObfuscatedName("hx.h")
    public int[] field2674;

    @ObfuscatedName("hx.i")
    public int[] field2675;

    @ObfuscatedName("hx.w")
    public int[] field2681;

    @ObfuscatedName("hx.t")
    public int field2677;

    @ObfuscatedName("hx.z")
    public long field2679;

    @ObfuscatedName("hx.k")
    public static final byte[] field2680 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class218() {
    }

    public class218(byte[] arg0) {
        this.method3977(arg0);
    }

    @ObfuscatedName("hx.s([B)V")
    public void method3977(byte[] arg0) {
        this.field2682.field2512 = arg0;
        this.field2682.field2514 = 10;
        int var2 = this.field2682.method3241();
        this.field2684 = this.field2682.method3241();
        this.field2677 = 500000;
        this.field2671 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2682.method3292();
            int var5 = this.field2682.method3292();
            if (var4 == 1297379947) {
                this.field2671[var3] = this.field2682.field2514;
                var3++;
            }
            this.field2682.field2514 += var5;
        }
        this.field2679 = 0L;
        this.field2674 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2674[var6] = this.field2671[var6];
        }
        this.field2675 = new int[var2];
        this.field2681 = new int[var2];
    }

    @ObfuscatedName("hx.g()V")
    public void method3960() {
        this.field2682.field2512 = null;
        this.field2671 = null;
        this.field2674 = null;
        this.field2675 = null;
        this.field2681 = null;
    }

    @ObfuscatedName("hx.m()Z")
    public boolean method3984() {
        return this.field2682.field2512 != null;
    }

    @ObfuscatedName("hx.h()I")
    public int method3962() {
        return this.field2674.length;
    }

    @ObfuscatedName("hx.i(I)V")
    public void method4001(int arg0) {
        this.field2682.field2514 = this.field2674[arg0];
    }

    @ObfuscatedName("hx.w(I)V")
    public void method3964(int arg0) {
        this.field2674[arg0] = this.field2682.field2514;
    }

    @ObfuscatedName("hx.t()V")
    public void method3972() {
        this.field2682.field2514 = -1;
    }

    @ObfuscatedName("hx.d(I)V")
    public void method3966(int arg0) {
        int var2 = this.field2682.method3256();
        this.field2675[arg0] += var2;
    }

    @ObfuscatedName("hx.z(I)I")
    public int method3958(int arg0) {
        return this.method3968(arg0);
    }

    @ObfuscatedName("hx.k(I)I")
    public int method3968(int arg0) {
        byte var2 = this.field2682.field2512[this.field2682.field2514];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2681[arg0] = var3;
            this.field2682.field2514++;
        } else {
            var3 = this.field2681[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3969(arg0, var3);
        }
        int var4 = this.field2682.method3256();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2682.field2512[this.field2682.field2514] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2682.field2514++;
                this.field2681[arg0] = var5;
                return this.method3969(arg0, var5);
            }
        }
        this.field2682.field2514 += var4;
        return 0;
    }

    @ObfuscatedName("hx.c(II)I")
    public int method3969(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2680[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2682.method3239() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2682.method3239() << 16;
            }
            return var8;
        }
        int var3 = this.field2682.method3239();
        int var4 = this.field2682.method3256();
        if (var3 == 47) {
            this.field2682.field2514 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2682.method3243();
            var4 -= 3;
            int var6 = this.field2675[arg0];
            this.field2679 += (long) (this.field2677 - var5) * (long) var6;
            this.field2677 = var5;
            this.field2682.field2514 += var4;
            return 2;
        } else {
            this.field2682.field2514 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hx.o(I)J")
    public long method3970(int arg0) {
        return (long) this.field2677 * (long) arg0 + this.field2679;
    }

    @ObfuscatedName("hx.l()I")
    public int method3971() {
        int var1 = this.field2674.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2674[var4] >= 0 && this.field2675[var4] < var3) {
                var2 = var4;
                var3 = this.field2675[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hx.f()Z")
    public boolean method3973() {
        int var1 = this.field2674.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2674[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hx.q(J)V")
    public void method3961(long arg0) {
        this.field2679 = arg0;
        int var3 = this.field2674.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2675[var4] = 0;
            this.field2681[var4] = 0;
            this.field2682.field2514 = this.field2671[var4];
            this.method3966(var4);
            this.field2674[var4] = this.field2682.field2514;
        }
    }
}
