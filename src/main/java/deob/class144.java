package deob;

@ObfuscatedName("eh")
public class class144 {

    @ObfuscatedName("eh.g")
    public class127 field2408 = new class127((byte[]) null);

    @ObfuscatedName("eh.m")
    public int field2401;

    @ObfuscatedName("eh.v")
    public int[] field2400;

    @ObfuscatedName("eh.r")
    public int[] field2406;

    @ObfuscatedName("eh.n")
    public int[] field2402;

    @ObfuscatedName("eh.i")
    public int[] field2399;

    @ObfuscatedName("eh.s")
    public int field2404;

    @ObfuscatedName("eh.d")
    public long field2398;

    @ObfuscatedName("eh.t")
    public static final byte[] field2403 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2824(arg0);
    }

    @ObfuscatedName("eh.g([B)V")
    public void method2824(byte[] arg0) {
        this.field2408.field2028 = arg0;
        this.field2408.field2023 = 10;
        int var2 = this.field2408.method2416();
        this.field2401 = this.field2408.method2416();
        this.field2404 = 500000;
        this.field2400 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2408.method2430();
            int var5 = this.field2408.method2430();
            if (var4 == 1297379947) {
                this.field2400[var3] = this.field2408.field2023;
                var3++;
            }
            this.field2408.field2023 += var5;
        }
        this.field2398 = 0L;
        this.field2406 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2406[var6] = this.field2400[var6];
        }
        this.field2402 = new int[var2];
        this.field2399 = new int[var2];
    }

    @ObfuscatedName("eh.m()V")
    public void method2867() {
        this.field2408.field2028 = null;
        this.field2400 = null;
        this.field2406 = null;
        this.field2402 = null;
        this.field2399 = null;
    }

    @ObfuscatedName("eh.v()Z")
    public boolean method2869() {
        return this.field2408.field2028 != null;
    }

    @ObfuscatedName("eh.r()I")
    public int method2827() {
        return this.field2406.length;
    }

    @ObfuscatedName("eh.n(I)V")
    public void method2828(int arg0) {
        this.field2408.field2023 = this.field2406[arg0];
    }

    @ObfuscatedName("eh.i(I)V")
    public void method2829(int arg0) {
        this.field2406[arg0] = this.field2408.field2023;
    }

    @ObfuscatedName("eh.s()V")
    public void method2830() {
        this.field2408.field2023 = -1;
    }

    @ObfuscatedName("eh.w(I)V")
    public void method2831(int arg0) {
        int var2 = this.field2408.method2429();
        this.field2402[arg0] += var2;
    }

    @ObfuscatedName("eh.d(I)I")
    public int method2840(int arg0) {
        return this.method2865(arg0);
    }

    @ObfuscatedName("eh.t(I)I")
    public int method2865(int arg0) {
        byte var2 = this.field2408.field2028[this.field2408.field2023];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2399[arg0] = var3;
            this.field2408.field2023++;
        } else {
            var3 = this.field2399[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2832(arg0, var3);
        }
        int var4 = this.field2408.method2429();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2408.field2028[this.field2408.field2023] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2408.field2023++;
                this.field2399[arg0] = var5;
                return this.method2832(arg0, var5);
            }
        }
        this.field2408.field2023 += var4;
        return 0;
    }

    @ObfuscatedName("eh.f(II)I")
    public int method2832(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2403[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2408.method2414() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2408.method2414() << 16;
            }
            return var8;
        }
        int var3 = this.field2408.method2414();
        int var4 = this.field2408.method2429();
        if (var3 == 47) {
            this.field2408.field2023 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2408.method2479();
            var4 -= 3;
            int var6 = this.field2402[arg0];
            this.field2398 += (long) (this.field2404 - var5) * (long) var6;
            this.field2404 = var5;
            this.field2408.field2023 += var4;
            return 2;
        } else {
            this.field2408.field2023 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eh.b(I)J")
    public long method2834(int arg0) {
        return (long) this.field2404 * (long) arg0 + this.field2398;
    }

    @ObfuscatedName("eh.z()I")
    public int method2835() {
        int var1 = this.field2406.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2406[var4] >= 0 && this.field2402[var4] < var3) {
                var2 = var4;
                var3 = this.field2402[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eh.l()Z")
    public boolean method2826() {
        int var1 = this.field2406.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2406[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eh.e(J)V")
    public void method2837(long arg0) {
        this.field2398 = arg0;
        int var3 = this.field2406.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2402[var4] = 0;
            this.field2399[var4] = 0;
            this.field2408.field2023 = this.field2400[var4];
            this.method2831(var4);
            this.field2406[var4] = this.field2408.field2023;
        }
    }
}
