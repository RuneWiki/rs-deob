package deob;

@ObfuscatedName("gz")
public class class207 {

    @ObfuscatedName("gz.i")
    public class174 field2580 = new class174((byte[]) null);

    @ObfuscatedName("gz.w")
    public int field2569;

    @ObfuscatedName("gz.a")
    public int[] field2570;

    @ObfuscatedName("gz.t")
    public int[] field2568;

    @ObfuscatedName("gz.s")
    public int[] field2572;

    @ObfuscatedName("gz.r")
    public int[] field2573;

    @ObfuscatedName("gz.v")
    public int field2574;

    @ObfuscatedName("gz.j")
    public long field2576;

    @ObfuscatedName("gz.k")
    public static final byte[] field2578 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3554(arg0);
    }

    @ObfuscatedName("gz.i([B)V")
    public void method3554(byte[] arg0) {
        this.field2580.field2405 = arg0;
        this.field2580.field2399 = 10;
        int var2 = this.field2580.method2882();
        this.field2569 = this.field2580.method2882();
        this.field2574 = 500000;
        this.field2570 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2580.method2885();
            int var5 = this.field2580.method2885();
            if (var4 == 1297379947) {
                this.field2570[var3] = this.field2580.field2399;
                var3++;
            }
            this.field2580.field2399 += var5;
        }
        this.field2576 = 0L;
        this.field2568 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2568[var6] = this.field2570[var6];
        }
        this.field2572 = new int[var2];
        this.field2573 = new int[var2];
    }

    @ObfuscatedName("gz.w()V")
    public void method3514() {
        this.field2580.field2405 = null;
        this.field2570 = null;
        this.field2568 = null;
        this.field2572 = null;
        this.field2573 = null;
    }

    @ObfuscatedName("gz.a()Z")
    public boolean method3508() {
        return this.field2580.field2405 != null;
    }

    @ObfuscatedName("gz.t()I")
    public int method3509() {
        return this.field2568.length;
    }

    @ObfuscatedName("gz.s(I)V")
    public void method3510(int arg0) {
        this.field2580.field2399 = this.field2568[arg0];
    }

    @ObfuscatedName("gz.r(I)V")
    public void method3511(int arg0) {
        this.field2568[arg0] = this.field2580.field2399;
    }

    @ObfuscatedName("gz.v()V")
    public void method3512() {
        this.field2580.field2399 = -1;
    }

    @ObfuscatedName("gz.y(I)V")
    public void method3513(int arg0) {
        int var2 = this.field2580.method2965();
        this.field2572[arg0] += var2;
    }

    @ObfuscatedName("gz.j(I)I")
    public int method3515(int arg0) {
        return this.method3507(arg0);
    }

    @ObfuscatedName("gz.k(I)I")
    public int method3507(int arg0) {
        byte var2 = this.field2580.field2405[this.field2580.field2399];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2573[arg0] = var3;
            this.field2580.field2399++;
        } else {
            var3 = this.field2573[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3516(arg0, var3);
        }
        int var4 = this.field2580.method2965();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2580.field2405[this.field2580.field2399] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2580.field2399++;
                this.field2573[arg0] = var5;
                return this.method3516(arg0, var5);
            }
        }
        this.field2580.field2399 += var4;
        return 0;
    }

    @ObfuscatedName("gz.e(II)I")
    public int method3516(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2578[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2580.method3061() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2580.method3061() << 16;
            }
            return var8;
        }
        int var3 = this.field2580.method3061();
        int var4 = this.field2580.method2965();
        if (var3 == 47) {
            this.field2580.field2399 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2580.method2917();
            var4 -= 3;
            int var6 = this.field2572[arg0];
            this.field2576 += (long) (this.field2574 - var5) * (long) var6;
            this.field2574 = var5;
            this.field2580.field2399 += var4;
            return 2;
        } else {
            this.field2580.field2399 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gz.o(I)J")
    public long method3526(int arg0) {
        return (long) this.field2574 * (long) arg0 + this.field2576;
    }

    @ObfuscatedName("gz.z()I")
    public int method3550() {
        int var1 = this.field2568.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2568[var4] >= 0 && this.field2572[var4] < var3) {
                var2 = var4;
                var3 = this.field2572[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gz.l()Z")
    public boolean method3521() {
        int var1 = this.field2568.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2568[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gz.c(J)V")
    public void method3517(long arg0) {
        this.field2576 = arg0;
        int var3 = this.field2568.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2572[var4] = 0;
            this.field2573[var4] = 0;
            this.field2580.field2399 = this.field2570[var4];
            this.method3513(var4);
            this.field2568[var4] = this.field2580.field2399;
        }
    }
}
