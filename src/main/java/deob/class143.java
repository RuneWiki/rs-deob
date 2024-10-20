package deob;

@ObfuscatedName("ed")
public class class143 {

    @ObfuscatedName("ed.u")
    public class126 field2407 = new class126((byte[]) null);

    @ObfuscatedName("ed.k")
    public int field2395;

    @ObfuscatedName("ed.x")
    public int[] field2394;

    @ObfuscatedName("ed.m")
    public int[] field2397;

    @ObfuscatedName("ed.n")
    public int[] field2396;

    @ObfuscatedName("ed.q")
    public int[] field2399;

    @ObfuscatedName("ed.a")
    public int field2400;

    @ObfuscatedName("ed.j")
    public long field2402;

    @ObfuscatedName("ed.l")
    public static final byte[] field2403 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2824(arg0);
    }

    @ObfuscatedName("ed.u([B)V")
    public void method2824(byte[] arg0) {
        this.field2407.field2022 = arg0;
        this.field2407.field2024 = 10;
        int var2 = this.field2407.method2450();
        this.field2395 = this.field2407.method2450();
        this.field2400 = 500000;
        this.field2394 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2407.method2526();
            int var5 = this.field2407.method2526();
            if (var4 == 1297379947) {
                this.field2394[var3] = this.field2407.field2024;
                var3++;
            }
            this.field2407.field2024 += var5;
        }
        this.field2402 = 0L;
        this.field2397 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2397[var6] = this.field2394[var6];
        }
        this.field2396 = new int[var2];
        this.field2399 = new int[var2];
    }

    @ObfuscatedName("ed.k()V")
    public void method2825() {
        this.field2407.field2022 = null;
        this.field2394 = null;
        this.field2397 = null;
        this.field2396 = null;
        this.field2399 = null;
    }

    @ObfuscatedName("ed.x()Z")
    public boolean method2826() {
        return this.field2407.field2022 != null;
    }

    @ObfuscatedName("ed.m()I")
    public int method2848() {
        return this.field2397.length;
    }

    @ObfuscatedName("ed.n(I)V")
    public void method2828(int arg0) {
        this.field2407.field2024 = this.field2397[arg0];
    }

    @ObfuscatedName("ed.q(I)V")
    public void method2829(int arg0) {
        this.field2397[arg0] = this.field2407.field2024;
    }

    @ObfuscatedName("ed.a()V")
    public void method2830() {
        this.field2407.field2024 = -1;
    }

    @ObfuscatedName("ed.g(I)V")
    public void method2831(int arg0) {
        int var2 = this.field2407.method2463();
        this.field2396[arg0] += var2;
    }

    @ObfuscatedName("ed.j(I)I")
    public int method2854(int arg0) {
        return this.method2845(arg0);
    }

    @ObfuscatedName("ed.l(I)I")
    public int method2845(int arg0) {
        byte var2 = this.field2407.field2022[this.field2407.field2024];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2399[arg0] = var3;
            this.field2407.field2024++;
        } else {
            var3 = this.field2399[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2834(arg0, var3);
        }
        int var4 = this.field2407.method2463();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2407.field2022[this.field2407.field2024] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2407.field2024++;
                this.field2399[arg0] = var5;
                return this.method2834(arg0, var5);
            }
        }
        this.field2407.field2024 += var4;
        return 0;
    }

    @ObfuscatedName("ed.w(II)I")
    public int method2834(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2403[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2407.method2559() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2407.method2559() << 16;
            }
            return var8;
        }
        int var3 = this.field2407.method2559();
        int var4 = this.field2407.method2463();
        if (var3 == 47) {
            this.field2407.field2024 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2407.method2452();
            var4 -= 3;
            int var6 = this.field2396[arg0];
            this.field2402 += (long) (this.field2400 - var5) * (long) var6;
            this.field2400 = var5;
            this.field2407.field2024 += var4;
            return 2;
        } else {
            this.field2407.field2024 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ed.z(I)J")
    public long method2823(int arg0) {
        return (long) this.field2400 * (long) arg0 + this.field2402;
    }

    @ObfuscatedName("ed.e()I")
    public int method2837() {
        int var1 = this.field2397.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2397[var4] >= 0 && this.field2396[var4] < var3) {
                var2 = var4;
                var3 = this.field2396[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ed.b()Z")
    public boolean method2835() {
        int var1 = this.field2397.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2397[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ed.c(J)V")
    public void method2838(long arg0) {
        this.field2402 = arg0;
        int var3 = this.field2397.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2396[var4] = 0;
            this.field2399[var4] = 0;
            this.field2407.field2024 = this.field2394[var4];
            this.method2831(var4);
            this.field2397[var4] = this.field2407.field2024;
        }
    }
}
