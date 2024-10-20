package deob;

@ObfuscatedName("ez")
public class class145 {

    @ObfuscatedName("ez.c")
    public class127 field2444 = new class127((byte[]) null);

    @ObfuscatedName("ez.q")
    public int field2449;

    @ObfuscatedName("ez.y")
    public int[] field2443;

    @ObfuscatedName("ez.v")
    public int[] field2448;

    @ObfuscatedName("ez.g")
    public int[] field2445;

    @ObfuscatedName("ez.x")
    public int[] field2446;

    @ObfuscatedName("ez.u")
    public int field2447;

    @ObfuscatedName("ez.a")
    public long field2452;

    @ObfuscatedName("ez.h")
    public static final byte[] field2450 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2781(arg0);
    }

    @ObfuscatedName("ez.c([B)V")
    public void method2781(byte[] arg0) {
        this.field2444.field2057 = arg0;
        this.field2444.field2052 = 10;
        int var2 = this.field2444.method2327();
        this.field2449 = this.field2444.method2327();
        this.field2447 = 500000;
        this.field2443 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2444.method2323();
            int var5 = this.field2444.method2323();
            if (var4 == 1297379947) {
                this.field2443[var3] = this.field2444.field2052;
                var3++;
            }
            this.field2444.field2052 += var5;
        }
        this.field2452 = 0L;
        this.field2448 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2448[var6] = this.field2443[var6];
        }
        this.field2445 = new int[var2];
        this.field2446 = new int[var2];
    }

    @ObfuscatedName("ez.q()V")
    public void method2758() {
        this.field2444.field2057 = null;
        this.field2443 = null;
        this.field2448 = null;
        this.field2445 = null;
        this.field2446 = null;
    }

    @ObfuscatedName("ez.y()Z")
    public boolean method2759() {
        return this.field2444.field2057 != null;
    }

    @ObfuscatedName("ez.v()I")
    public int method2760() {
        return this.field2448.length;
    }

    @ObfuscatedName("ez.g(I)V")
    public void method2767(int arg0) {
        this.field2444.field2052 = this.field2448[arg0];
    }

    @ObfuscatedName("ez.x(I)V")
    public void method2762(int arg0) {
        this.field2448[arg0] = this.field2444.field2052;
    }

    @ObfuscatedName("ez.u()V")
    public void method2756() {
        this.field2444.field2052 = -1;
    }

    @ObfuscatedName("ez.l(I)V")
    public void method2764(int arg0) {
        int var2 = this.field2444.method2342();
        this.field2445[arg0] += var2;
    }

    @ObfuscatedName("ez.a(I)I")
    public int method2773(int arg0) {
        return this.method2766(arg0);
    }

    @ObfuscatedName("ez.h(I)I")
    public int method2766(int arg0) {
        byte var2 = this.field2444.field2057[this.field2444.field2052];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2446[arg0] = var3;
            this.field2444.field2052++;
        } else {
            var3 = this.field2446[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2812(arg0, var3);
        }
        int var4 = this.field2444.method2342();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2444.field2057[this.field2444.field2052] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2444.field2052++;
                this.field2446[arg0] = var5;
                return this.method2812(arg0, var5);
            }
        }
        this.field2444.field2052 += var4;
        return 0;
    }

    @ObfuscatedName("ez.t(II)I")
    public int method2812(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2450[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2444.method2383() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2444.method2383() << 16;
            }
            return var8;
        }
        int var3 = this.field2444.method2383();
        int var4 = this.field2444.method2342();
        if (var3 == 47) {
            this.field2444.field2052 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2444.method2322();
            var4 -= 3;
            int var6 = this.field2445[arg0];
            this.field2452 += (long) (this.field2447 - var5) * (long) var6;
            this.field2447 = var5;
            this.field2444.field2052 += var4;
            return 2;
        } else {
            this.field2444.field2052 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ez.m(I)J")
    public long method2768(int arg0) {
        return (long) this.field2447 * (long) arg0 + this.field2452;
    }

    @ObfuscatedName("ez.s()I")
    public int method2799() {
        int var1 = this.field2448.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2448[var4] >= 0 && this.field2445[var4] < var3) {
                var2 = var4;
                var3 = this.field2445[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ez.j()Z")
    public boolean method2769() {
        int var1 = this.field2448.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2448[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ez.b(J)V")
    public void method2757(long arg0) {
        this.field2452 = arg0;
        int var3 = this.field2448.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2445[var4] = 0;
            this.field2446[var4] = 0;
            this.field2444.field2052 = this.field2443[var4];
            this.method2764(var4);
            this.field2448[var4] = this.field2444.field2052;
        }
    }
}
