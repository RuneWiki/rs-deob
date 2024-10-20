package deob;

@ObfuscatedName("eh")
public class class144 {

    @ObfuscatedName("eh.y")
    public class127 field2411 = new class127((byte[]) null);

    @ObfuscatedName("eh.m")
    public int field2404;

    @ObfuscatedName("eh.d")
    public int[] field2400;

    @ObfuscatedName("eh.k")
    public int[] field2401;

    @ObfuscatedName("eh.n")
    public int[] field2402;

    @ObfuscatedName("eh.s")
    public int[] field2403;

    @ObfuscatedName("eh.x")
    public int field2398;

    @ObfuscatedName("eh.j")
    public long field2406;

    @ObfuscatedName("eh.p")
    public static final byte[] field2407 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2859(arg0);
    }

    @ObfuscatedName("eh.y([B)V")
    public void method2859(byte[] arg0) {
        this.field2411.field2037 = arg0;
        this.field2411.field2036 = 10;
        int var2 = this.field2411.method2460();
        this.field2404 = this.field2411.method2460();
        this.field2398 = 500000;
        this.field2400 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2411.method2628();
            int var5 = this.field2411.method2628();
            if (var4 == 1297379947) {
                this.field2400[var3] = this.field2411.field2036;
                var3++;
            }
            this.field2411.field2036 += var5;
        }
        this.field2406 = 0L;
        this.field2401 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2401[var6] = this.field2400[var6];
        }
        this.field2402 = new int[var2];
        this.field2403 = new int[var2];
    }

    @ObfuscatedName("eh.m()V")
    public void method2860() {
        this.field2411.field2037 = null;
        this.field2400 = null;
        this.field2401 = null;
        this.field2402 = null;
        this.field2403 = null;
    }

    @ObfuscatedName("eh.d()Z")
    public boolean method2861() {
        return this.field2411.field2037 != null;
    }

    @ObfuscatedName("eh.k()I")
    public int method2862() {
        return this.field2401.length;
    }

    @ObfuscatedName("eh.n(I)V")
    public void method2863(int arg0) {
        this.field2411.field2036 = this.field2401[arg0];
    }

    @ObfuscatedName("eh.s(I)V")
    public void method2864(int arg0) {
        this.field2401[arg0] = this.field2411.field2036;
    }

    @ObfuscatedName("eh.x()V")
    public void method2902() {
        this.field2411.field2036 = -1;
    }

    @ObfuscatedName("eh.b(I)V")
    public void method2879(int arg0) {
        int var2 = this.field2411.method2651();
        this.field2402[arg0] += var2;
    }

    @ObfuscatedName("eh.j(I)I")
    public int method2880(int arg0) {
        return this.method2868(arg0);
    }

    @ObfuscatedName("eh.p(I)I")
    public int method2868(int arg0) {
        byte var2 = this.field2411.field2037[this.field2411.field2036];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2403[arg0] = var3;
            this.field2411.field2036++;
        } else {
            var3 = this.field2403[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2869(arg0, var3);
        }
        int var4 = this.field2411.method2651();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2411.field2037[this.field2411.field2036] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2411.field2036++;
                this.field2403[arg0] = var5;
                return this.method2869(arg0, var5);
            }
        }
        this.field2411.field2036 += var4;
        return 0;
    }

    @ObfuscatedName("eh.l(II)I")
    public int method2869(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2407[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2411.method2534() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2411.method2534() << 16;
            }
            return var8;
        }
        int var3 = this.field2411.method2534();
        int var4 = this.field2411.method2651();
        if (var3 == 47) {
            this.field2411.field2036 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2411.method2462();
            var4 -= 3;
            int var6 = this.field2402[arg0];
            this.field2406 += (long) (this.field2398 - var5) * (long) var6;
            this.field2398 = var5;
            this.field2411.field2036 += var4;
            return 2;
        } else {
            this.field2411.field2036 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eh.i(I)J")
    public long method2870(int arg0) {
        return (long) this.field2398 * (long) arg0 + this.field2406;
    }

    @ObfuscatedName("eh.r()I")
    public int method2872() {
        int var1 = this.field2401.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2401[var4] >= 0 && this.field2402[var4] < var3) {
                var2 = var4;
                var3 = this.field2402[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eh.o()Z")
    public boolean method2866() {
        int var1 = this.field2401.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2401[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eh.c(J)V")
    public void method2877(long arg0) {
        this.field2406 = arg0;
        int var3 = this.field2401.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2402[var4] = 0;
            this.field2403[var4] = 0;
            this.field2411.field2036 = this.field2400[var4];
            this.method2879(var4);
            this.field2401[var4] = this.field2411.field2036;
        }
    }
}
