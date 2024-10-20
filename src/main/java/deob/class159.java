package deob;

@ObfuscatedName("fl")
public class class159 {

    @ObfuscatedName("fl.y")
    public class107 field2668 = new class107((byte[]) null);

    @ObfuscatedName("fl.u")
    public int field2664;

    @ObfuscatedName("fl.k")
    public int[] field2672;

    @ObfuscatedName("fl.v")
    public int[] field2666;

    @ObfuscatedName("fl.l")
    public int[] field2667;

    @ObfuscatedName("fl.g")
    public int[] field2671;

    @ObfuscatedName("fl.a")
    public int field2669;

    @ObfuscatedName("fl.r")
    public long field2673;

    @ObfuscatedName("fl.w")
    public static final byte[] field2663 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class159() {
    }

    public class159(byte[] arg0) {
        this.method2946(arg0);
    }

    @ObfuscatedName("fl.y([B)V")
    public void method2946(byte[] arg0) {
        this.field2668.field1856 = arg0;
        this.field2668.field1854 = 10;
        int var2 = this.field2668.method2111();
        this.field2664 = this.field2668.method2111();
        this.field2669 = 500000;
        this.field2672 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2668.method2114();
            int var5 = this.field2668.method2114();
            if (var4 == 1297379947) {
                this.field2672[var3] = this.field2668.field1854;
                var3++;
            }
            this.field2668.field1854 += var5;
        }
        this.field2673 = 0L;
        this.field2666 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2666[var6] = this.field2672[var6];
        }
        this.field2667 = new int[var2];
        this.field2671 = new int[var2];
    }

    @ObfuscatedName("fl.u()V")
    public void method2947() {
        this.field2668.field1856 = null;
        this.field2672 = null;
        this.field2666 = null;
        this.field2667 = null;
        this.field2671 = null;
    }

    @ObfuscatedName("fl.k()Z")
    public boolean method2948() {
        return this.field2668.field1856 != null;
    }

    @ObfuscatedName("fl.v()I")
    public int method2979() {
        return this.field2666.length;
    }

    @ObfuscatedName("fl.l(I)V")
    public void method2954(int arg0) {
        this.field2668.field1854 = this.field2666[arg0];
    }

    @ObfuscatedName("fl.g(I)V")
    public void method2951(int arg0) {
        this.field2666[arg0] = this.field2668.field1854;
    }

    @ObfuscatedName("fl.a()V")
    public void method2952() {
        this.field2668.field1854 = -1;
    }

    @ObfuscatedName("fl.x(I)V")
    public void method2953(int arg0) {
        int var2 = this.field2668.method2124();
        this.field2667[arg0] += var2;
    }

    @ObfuscatedName("fl.r(I)I")
    public int method2998(int arg0) {
        return this.method2955(arg0);
    }

    @ObfuscatedName("fl.w(I)I")
    public int method2955(int arg0) {
        byte var2 = this.field2668.field1856[this.field2668.field1854];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2671[arg0] = var3;
            this.field2668.field1854++;
        } else {
            var3 = this.field2671[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2956(arg0, var3);
        }
        int var4 = this.field2668.method2124();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2668.field1856[this.field2668.field1854] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2668.field1854++;
                this.field2671[arg0] = var5;
                return this.method2956(arg0, var5);
            }
        }
        this.field2668.field1854 += var4;
        return 0;
    }

    @ObfuscatedName("fl.c(II)I")
    public int method2956(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2663[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2668.method2109() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2668.method2109() << 16;
            }
            return var8;
        }
        int var3 = this.field2668.method2109();
        int var4 = this.field2668.method2124();
        if (var3 == 47) {
            this.field2668.field1854 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2668.method2113();
            var4 -= 3;
            int var6 = this.field2667[arg0];
            this.field2673 += (long) (this.field2669 - var5) * (long) var6;
            this.field2669 = var5;
            this.field2668.field1854 += var4;
            return 2;
        } else {
            this.field2668.field1854 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fl.f(I)J")
    public long method2957(int arg0) {
        return (long) this.field2669 * (long) arg0 + this.field2673;
    }

    @ObfuscatedName("fl.o()I")
    public int method2958() {
        int var1 = this.field2666.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2666[var4] >= 0 && this.field2667[var4] < var3) {
                var2 = var4;
                var3 = this.field2667[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fl.p()Z")
    public boolean method2976() {
        int var1 = this.field2666.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2666[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fl.n(J)V")
    public void method2962(long arg0) {
        this.field2673 = arg0;
        int var3 = this.field2666.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2667[var4] = 0;
            this.field2671[var4] = 0;
            this.field2668.field1854 = this.field2672[var4];
            this.method2953(var4);
            this.field2666[var4] = this.field2668.field1854;
        }
    }
}
