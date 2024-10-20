package deob;

@ObfuscatedName("hs")
public class class218 {

    @ObfuscatedName("hs.m")
    public class202 field2569 = new class202((byte[]) null);

    @ObfuscatedName("hs.f")
    public int field2564;

    @ObfuscatedName("hs.q")
    public int[] field2565;

    @ObfuscatedName("hs.w")
    public int[] field2566;

    @ObfuscatedName("hs.o")
    public int[] field2576;

    @ObfuscatedName("hs.u")
    public int[] field2563;

    @ObfuscatedName("hs.g")
    public int field2568;

    @ObfuscatedName("hs.e")
    public long field2571;

    @ObfuscatedName("hs.x")
    public static final byte[] field2572 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class218() {
    }

    public class218(byte[] arg0) {
        this.method3904(arg0);
    }

    @ObfuscatedName("hs.m([B)V")
    public void method3904(byte[] arg0) {
        this.field2569.field2440 = arg0;
        this.field2569.field2439 = 10;
        int var2 = this.field2569.method3530();
        this.field2564 = this.field2569.method3530();
        this.field2568 = 500000;
        this.field2565 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2569.method3620();
            int var5 = this.field2569.method3620();
            if (var4 == 1297379947) {
                this.field2565[var3] = this.field2569.field2439;
                var3++;
            }
            this.field2569.field2439 += var5;
        }
        this.field2571 = 0L;
        this.field2566 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2566[var6] = this.field2565[var6];
        }
        this.field2576 = new int[var2];
        this.field2563 = new int[var2];
    }

    @ObfuscatedName("hs.f()V")
    public void method3965() {
        this.field2569.field2440 = null;
        this.field2565 = null;
        this.field2566 = null;
        this.field2576 = null;
        this.field2563 = null;
    }

    @ObfuscatedName("hs.q()Z")
    public boolean method3906() {
        return this.field2569.field2440 != null;
    }

    @ObfuscatedName("hs.w()I")
    public int method3930() {
        return this.field2566.length;
    }

    @ObfuscatedName("hs.o(I)V")
    public void method3908(int arg0) {
        this.field2569.field2439 = this.field2566[arg0];
    }

    @ObfuscatedName("hs.u(I)V")
    public void method3909(int arg0) {
        this.field2566[arg0] = this.field2569.field2439;
    }

    @ObfuscatedName("hs.g()V")
    public void method3910() {
        this.field2569.field2439 = -1;
    }

    @ObfuscatedName("hs.l(I)V")
    public void method3911(int arg0) {
        int var2 = this.field2569.method3523();
        this.field2576[arg0] += var2;
    }

    @ObfuscatedName("hs.e(I)I")
    public int method3912(int arg0) {
        return this.method3913(arg0);
    }

    @ObfuscatedName("hs.x(I)I")
    public int method3913(int arg0) {
        byte var2 = this.field2569.field2440[this.field2569.field2439];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2563[arg0] = var3;
            this.field2569.field2439++;
        } else {
            var3 = this.field2563[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3907(arg0, var3);
        }
        int var4 = this.field2569.method3523();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2569.field2440[this.field2569.field2439] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2569.field2439++;
                this.field2563[arg0] = var5;
                return this.method3907(arg0, var5);
            }
        }
        this.field2569.field2439 += var4;
        return 0;
    }

    @ObfuscatedName("hs.d(II)I")
    public int method3907(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2572[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2569.method3551() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2569.method3551() << 16;
            }
            return var8;
        }
        int var3 = this.field2569.method3551();
        int var4 = this.field2569.method3523();
        if (var3 == 47) {
            this.field2569.field2439 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2569.method3421();
            var4 -= 3;
            int var6 = this.field2576[arg0];
            this.field2571 += (long) (this.field2568 - var5) * (long) var6;
            this.field2568 = var5;
            this.field2569.field2439 += var4;
            return 2;
        } else {
            this.field2569.field2439 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hs.a(I)J")
    public long method3915(int arg0) {
        return (long) this.field2568 * (long) arg0 + this.field2571;
    }

    @ObfuscatedName("hs.z()I")
    public int method3916() {
        int var1 = this.field2566.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2566[var4] >= 0 && this.field2576[var4] < var3) {
                var2 = var4;
                var3 = this.field2576[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hs.j()Z")
    public boolean method3935() {
        int var1 = this.field2566.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2566[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hs.s(J)V")
    public void method3918(long arg0) {
        this.field2571 = arg0;
        int var3 = this.field2566.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2576[var4] = 0;
            this.field2563[var4] = 0;
            this.field2569.field2439 = this.field2565[var4];
            this.method3911(var4);
            this.field2566[var4] = this.field2569.field2439;
        }
    }
}
