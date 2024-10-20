package deob;

@ObfuscatedName("hr")
public class class223 {

    @ObfuscatedName("hr.v")
    public class185 field2561 = new class185((byte[]) null);

    @ObfuscatedName("hr.s")
    public int field2560;

    @ObfuscatedName("hr.o")
    public int[] field2554;

    @ObfuscatedName("hr.k")
    public int[] field2557;

    @ObfuscatedName("hr.u")
    public int[] field2558;

    @ObfuscatedName("hr.i")
    public int[] field2559;

    @ObfuscatedName("hr.t")
    public int field2562;

    @ObfuscatedName("hr.l")
    public long field2566;

    @ObfuscatedName("hr.b")
    public static final byte[] field2563 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class223() {
    }

    public class223(byte[] arg0) {
        this.method4017(arg0);
    }

    @ObfuscatedName("hr.v([B)V")
    public void method4017(byte[] arg0) {
        this.field2561.field2387 = arg0;
        this.field2561.field2386 = 10;
        int var2 = this.field2561.method3276();
        this.field2560 = this.field2561.method3276();
        this.field2562 = 500000;
        this.field2554 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2561.method3279();
            int var5 = this.field2561.method3279();
            if (var4 == 1297379947) {
                this.field2554[var3] = this.field2561.field2386;
                var3++;
            }
            this.field2561.field2386 += var5;
        }
        this.field2566 = 0L;
        this.field2557 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2557[var6] = this.field2554[var6];
        }
        this.field2558 = new int[var2];
        this.field2559 = new int[var2];
    }

    @ObfuscatedName("hr.s()V")
    public void method4048() {
        this.field2561.field2387 = null;
        this.field2554 = null;
        this.field2557 = null;
        this.field2558 = null;
        this.field2559 = null;
    }

    @ObfuscatedName("hr.o()Z")
    public boolean method4018() {
        return this.field2561.field2387 != null;
    }

    @ObfuscatedName("hr.k()I")
    public int method4019() {
        return this.field2557.length;
    }

    @ObfuscatedName("hr.u(I)V")
    public void method4020(int arg0) {
        this.field2561.field2386 = this.field2557[arg0];
    }

    @ObfuscatedName("hr.i(I)V")
    public void method4014(int arg0) {
        this.field2557[arg0] = this.field2561.field2386;
    }

    @ObfuscatedName("hr.t()V")
    public void method4022() {
        this.field2561.field2386 = -1;
    }

    @ObfuscatedName("hr.c(I)V")
    public void method4023(int arg0) {
        int var2 = this.field2561.method3292();
        this.field2558[arg0] += var2;
    }

    @ObfuscatedName("hr.w(I)I")
    public int method4024(int arg0) {
        return this.method4051(arg0);
    }

    @ObfuscatedName("hr.a(I)I")
    public int method4051(int arg0) {
        byte var2 = this.field2561.field2387[this.field2561.field2386];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2559[arg0] = var3;
            this.field2561.field2386++;
        } else {
            var3 = this.field2559[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4026(arg0, var3);
        }
        int var4 = this.field2561.method3292();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2561.field2387[this.field2561.field2386] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2561.field2386++;
                this.field2559[arg0] = var5;
                return this.method4026(arg0, var5);
            }
        }
        this.field2561.field2386 += var4;
        return 0;
    }

    @ObfuscatedName("hr.z(II)I")
    public int method4026(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2563[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2561.method3274() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2561.method3274() << 16;
            }
            return var8;
        }
        int var3 = this.field2561.method3274();
        int var4 = this.field2561.method3292();
        if (var3 == 47) {
            this.field2561.field2386 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2561.method3494();
            var4 -= 3;
            int var6 = this.field2558[arg0];
            this.field2566 += (long) (this.field2562 - var5) * (long) var6;
            this.field2562 = var5;
            this.field2561.field2386 += var4;
            return 2;
        } else {
            this.field2561.field2386 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hr.e(I)J")
    public long method4027(int arg0) {
        return (long) this.field2562 * (long) arg0 + this.field2566;
    }

    @ObfuscatedName("hr.q()I")
    public int method4028() {
        int var1 = this.field2557.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2557[var4] >= 0 && this.field2558[var4] < var3) {
                var2 = var4;
                var3 = this.field2558[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hr.j()Z")
    public boolean method4059() {
        int var1 = this.field2557.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2557[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hr.y(J)V")
    public void method4029(long arg0) {
        this.field2566 = arg0;
        int var3 = this.field2557.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2558[var4] = 0;
            this.field2559[var4] = 0;
            this.field2561.field2386 = this.field2554[var4];
            this.method4023(var4);
            this.field2557[var4] = this.field2561.field2386;
        }
    }
}
