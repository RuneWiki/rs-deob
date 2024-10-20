package deob;

@ObfuscatedName("gy")
public class class207 {

    @ObfuscatedName("gy.n")
    public class174 field2574 = new class174((byte[]) null);

    @ObfuscatedName("gy.p")
    public int field2572;

    @ObfuscatedName("gy.i")
    public int[] field2573;

    @ObfuscatedName("gy.j")
    public int[] field2582;

    @ObfuscatedName("gy.f")
    public int[] field2577;

    @ObfuscatedName("gy.m")
    public int[] field2575;

    @ObfuscatedName("gy.c")
    public int field2576;

    @ObfuscatedName("gy.h")
    public long field2579;

    @ObfuscatedName("gy.g")
    public static final byte[] field2571 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3580(arg0);
    }

    @ObfuscatedName("gy.n([B)V")
    public void method3580(byte[] arg0) {
        this.field2574.field2401 = arg0;
        this.field2574.field2400 = 10;
        int var2 = this.field2574.method3065();
        this.field2572 = this.field2574.method3065();
        this.field2576 = 500000;
        this.field2573 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2574.method3058();
            int var5 = this.field2574.method3058();
            if (var4 == 1297379947) {
                this.field2573[var3] = this.field2574.field2400;
                var3++;
            }
            this.field2574.field2400 += var5;
        }
        this.field2579 = 0L;
        this.field2582 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2582[var6] = this.field2573[var6];
        }
        this.field2577 = new int[var2];
        this.field2575 = new int[var2];
    }

    @ObfuscatedName("gy.p()V")
    public void method3581() {
        this.field2574.field2401 = null;
        this.field2573 = null;
        this.field2582 = null;
        this.field2577 = null;
        this.field2575 = null;
    }

    @ObfuscatedName("gy.i()Z")
    public boolean method3582() {
        return this.field2574.field2401 != null;
    }

    @ObfuscatedName("gy.j()I")
    public int method3583() {
        return this.field2582.length;
    }

    @ObfuscatedName("gy.f(I)V")
    public void method3607(int arg0) {
        this.field2574.field2400 = this.field2582[arg0];
    }

    @ObfuscatedName("gy.m(I)V")
    public void method3621(int arg0) {
        this.field2582[arg0] = this.field2574.field2400;
    }

    @ObfuscatedName("gy.c()V")
    public void method3630() {
        this.field2574.field2400 = -1;
    }

    @ObfuscatedName("gy.z(I)V")
    public void method3585(int arg0) {
        int var2 = this.field2574.method2937();
        this.field2577[arg0] += var2;
    }

    @ObfuscatedName("gy.h(I)I")
    public int method3589(int arg0) {
        return this.method3588(arg0);
    }

    @ObfuscatedName("gy.g(I)I")
    public int method3588(int arg0) {
        byte var2 = this.field2574.field2401[this.field2574.field2400];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2575[arg0] = var3;
            this.field2574.field2400++;
        } else {
            var3 = this.field2575[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3605(arg0, var3);
        }
        int var4 = this.field2574.method2937();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2574.field2401[this.field2574.field2400] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2574.field2400++;
                this.field2575[arg0] = var5;
                return this.method3605(arg0, var5);
            }
        }
        this.field2574.field2400 += var4;
        return 0;
    }

    @ObfuscatedName("gy.e(II)I")
    public int method3605(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2571[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2574.method2925() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2574.method2925() << 16;
            }
            return var8;
        }
        int var3 = this.field2574.method2925();
        int var4 = this.field2574.method2937();
        if (var3 == 47) {
            this.field2574.field2400 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2574.method2910();
            var4 -= 3;
            int var6 = this.field2577[arg0];
            this.field2579 += (long) (this.field2576 - var5) * (long) var6;
            this.field2576 = var5;
            this.field2574.field2400 += var4;
            return 2;
        } else {
            this.field2574.field2400 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gy.o(I)J")
    public long method3590(int arg0) {
        return (long) this.field2576 * (long) arg0 + this.field2579;
    }

    @ObfuscatedName("gy.x()I")
    public int method3591() {
        int var1 = this.field2582.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2582[var4] >= 0 && this.field2577[var4] < var3) {
                var2 = var4;
                var3 = this.field2577[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gy.a()Z")
    public boolean method3592() {
        int var1 = this.field2582.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2582[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.y(J)V")
    public void method3598(long arg0) {
        this.field2579 = arg0;
        int var3 = this.field2582.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2577[var4] = 0;
            this.field2575[var4] = 0;
            this.field2574.field2400 = this.field2573[var4];
            this.method3585(var4);
            this.field2582[var4] = this.field2574.field2400;
        }
    }
}
