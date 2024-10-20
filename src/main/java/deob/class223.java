package deob;

@ObfuscatedName("hr")
public class class223 {

    @ObfuscatedName("hr.y")
    public class185 field2569 = new class185((byte[]) null);

    @ObfuscatedName("hr.c")
    public int field2577;

    @ObfuscatedName("hr.n")
    public int[] field2566;

    @ObfuscatedName("hr.u")
    public int[] field2575;

    @ObfuscatedName("hr.i")
    public int[] field2568;

    @ObfuscatedName("hr.r")
    public int[] field2570;

    @ObfuscatedName("hr.j")
    public int field2564;

    @ObfuscatedName("hr.e")
    public long field2572;

    @ObfuscatedName("hr.s")
    public static final byte[] field2573 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class223() {
    }

    public class223(byte[] arg0) {
        this.method3992(arg0);
    }

    @ObfuscatedName("hr.y([B)V")
    public void method3992(byte[] arg0) {
        this.field2569.field2373 = arg0;
        this.field2569.field2374 = 10;
        int var2 = this.field2569.method3280();
        this.field2577 = this.field2569.method3280();
        this.field2564 = 500000;
        this.field2566 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2569.method3374();
            int var5 = this.field2569.method3374();
            if (var4 == 1297379947) {
                this.field2566[var3] = this.field2569.field2374;
                var3++;
            }
            this.field2569.field2374 += var5;
        }
        this.field2572 = 0L;
        this.field2575 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2575[var6] = this.field2566[var6];
        }
        this.field2568 = new int[var2];
        this.field2570 = new int[var2];
    }

    @ObfuscatedName("hr.c()V")
    public void method3993() {
        this.field2569.field2373 = null;
        this.field2566 = null;
        this.field2575 = null;
        this.field2568 = null;
        this.field2570 = null;
    }

    @ObfuscatedName("hr.n()Z")
    public boolean method4006() {
        return this.field2569.field2373 != null;
    }

    @ObfuscatedName("hr.u()I")
    public int method4027() {
        return this.field2575.length;
    }

    @ObfuscatedName("hr.i(I)V")
    public void method4013(int arg0) {
        this.field2569.field2374 = this.field2575[arg0];
    }

    @ObfuscatedName("hr.p(I)V")
    public void method4033(int arg0) {
        this.field2575[arg0] = this.field2569.field2374;
    }

    @ObfuscatedName("hr.e()V")
    public void method3997() {
        this.field2569.field2374 = -1;
    }

    @ObfuscatedName("hr.s(I)V")
    public void method3998(int arg0) {
        int var2 = this.field2569.method3414();
        this.field2568[arg0] += var2;
    }

    @ObfuscatedName("hr.v(I)I")
    public int method3999(int arg0) {
        return this.method4029(arg0);
    }

    @ObfuscatedName("hr.k(I)I")
    public int method4029(int arg0) {
        byte var2 = this.field2569.field2373[this.field2569.field2374];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2570[arg0] = var3;
            this.field2569.field2374++;
        } else {
            var3 = this.field2570[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4001(arg0, var3);
        }
        int var4 = this.field2569.method3414();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2569.field2373[this.field2569.field2374] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2569.field2374++;
                this.field2570[arg0] = var5;
                return this.method4001(arg0, var5);
            }
        }
        this.field2569.field2374 += var4;
        return 0;
    }

    @ObfuscatedName("hr.o(II)I")
    public int method4001(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2573[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2569.method3299() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2569.method3299() << 16;
            }
            return var8;
        }
        int var3 = this.field2569.method3299();
        int var4 = this.field2569.method3414();
        if (var3 == 47) {
            this.field2569.field2374 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2569.method3272();
            var4 -= 3;
            int var6 = this.field2568[arg0];
            this.field2572 += (long) (this.field2564 - var5) * (long) var6;
            this.field2564 = var5;
            this.field2569.field2374 += var4;
            return 2;
        } else {
            this.field2569.field2374 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hr.q(I)J")
    public long method4002(int arg0) {
        return (long) this.field2564 * (long) arg0 + this.field2572;
    }

    @ObfuscatedName("hr.l()I")
    public int method4000() {
        int var1 = this.field2575.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2575[var4] >= 0 && this.field2568[var4] < var3) {
                var2 = var4;
                var3 = this.field2568[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hr.f()Z")
    public boolean method3996() {
        int var1 = this.field2575.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2575[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hr.z(J)V")
    public void method4035(long arg0) {
        this.field2572 = arg0;
        int var3 = this.field2575.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2568[var4] = 0;
            this.field2570[var4] = 0;
            this.field2569.field2374 = this.field2566[var4];
            this.method3998(var4);
            this.field2575[var4] = this.field2569.field2374;
        }
    }
}
