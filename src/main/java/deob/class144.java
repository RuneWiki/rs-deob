package deob;

@ObfuscatedName("eq")
public class class144 {

    @ObfuscatedName("eq.i")
    public class127 field2413 = new class127((byte[]) null);

    @ObfuscatedName("eq.w")
    public int field2410;

    @ObfuscatedName("eq.f")
    public int[] field2411;

    @ObfuscatedName("eq.e")
    public int[] field2416;

    @ObfuscatedName("eq.t")
    public int[] field2414;

    @ObfuscatedName("eq.d")
    public int[] field2418;

    @ObfuscatedName("eq.p")
    public int field2415;

    @ObfuscatedName("eq.r")
    public long field2422;

    @ObfuscatedName("eq.l")
    public static final byte[] field2412 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2877(arg0);
    }

    @ObfuscatedName("eq.i([B)V")
    public void method2877(byte[] arg0) {
        this.field2413.field2049 = arg0;
        this.field2413.field2045 = 10;
        int var2 = this.field2413.method2615();
        this.field2410 = this.field2413.method2615();
        this.field2415 = 500000;
        this.field2411 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2413.method2457();
            int var5 = this.field2413.method2457();
            if (var4 == 1297379947) {
                this.field2411[var3] = this.field2413.field2045;
                var3++;
            }
            this.field2413.field2045 += var5;
        }
        this.field2422 = 0L;
        this.field2416 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2416[var6] = this.field2411[var6];
        }
        this.field2414 = new int[var2];
        this.field2418 = new int[var2];
    }

    @ObfuscatedName("eq.w()V")
    public void method2833() {
        this.field2413.field2049 = null;
        this.field2411 = null;
        this.field2416 = null;
        this.field2414 = null;
        this.field2418 = null;
    }

    @ObfuscatedName("eq.f()Z")
    public boolean method2832() {
        return this.field2413.field2049 != null;
    }

    @ObfuscatedName("eq.e()I")
    public int method2834() {
        return this.field2416.length;
    }

    @ObfuscatedName("eq.t(I)V")
    public void method2836(int arg0) {
        this.field2413.field2045 = this.field2416[arg0];
    }

    @ObfuscatedName("eq.d(I)V")
    public void method2837(int arg0) {
        this.field2416[arg0] = this.field2413.field2045;
    }

    @ObfuscatedName("eq.p()V")
    public void method2849() {
        this.field2413.field2045 = -1;
    }

    @ObfuscatedName("eq.k(I)V")
    public void method2839(int arg0) {
        int var2 = this.field2413.method2467();
        this.field2414[arg0] += var2;
    }

    @ObfuscatedName("eq.r(I)I")
    public int method2840(int arg0) {
        return this.method2841(arg0);
    }

    @ObfuscatedName("eq.l(I)I")
    public int method2841(int arg0) {
        byte var2 = this.field2413.field2049[this.field2413.field2045];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2418[arg0] = var3;
            this.field2413.field2045++;
        } else {
            var3 = this.field2418[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2842(arg0, var3);
        }
        int var4 = this.field2413.method2467();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2413.field2049[this.field2413.field2045] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2413.field2045++;
                this.field2418[arg0] = var5;
                return this.method2842(arg0, var5);
            }
        }
        this.field2413.field2045 += var4;
        return 0;
    }

    @ObfuscatedName("eq.a(II)I")
    public int method2842(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2412[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2413.method2472() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2413.method2472() << 16;
            }
            return var8;
        }
        int var3 = this.field2413.method2472();
        int var4 = this.field2413.method2467();
        if (var3 == 47) {
            this.field2413.field2045 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2413.method2608();
            var4 -= 3;
            int var6 = this.field2414[arg0];
            this.field2422 += (long) (this.field2415 - var5) * (long) var6;
            this.field2415 = var5;
            this.field2413.field2045 += var4;
            return 2;
        } else {
            this.field2413.field2045 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eq.z(I)J")
    public long method2843(int arg0) {
        return (long) this.field2415 * (long) arg0 + this.field2422;
    }

    @ObfuscatedName("eq.s()I")
    public int method2853() {
        int var1 = this.field2416.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2416[var4] >= 0 && this.field2414[var4] < var3) {
                var2 = var4;
                var3 = this.field2414[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eq.m()Z")
    public boolean method2845() {
        int var1 = this.field2416.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2416[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eq.u(J)V")
    public void method2846(long arg0) {
        this.field2422 = arg0;
        int var3 = this.field2416.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2414[var4] = 0;
            this.field2418[var4] = 0;
            this.field2413.field2045 = this.field2411[var4];
            this.method2839(var4);
            this.field2416[var4] = this.field2413.field2045;
        }
    }
}
