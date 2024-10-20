package deob;

@ObfuscatedName("ev")
public class class144 {

    @ObfuscatedName("ev.x")
    public class127 field2402 = new class127((byte[]) null);

    @ObfuscatedName("ev.p")
    public int field2392;

    @ObfuscatedName("ev.k")
    public int[] field2394;

    @ObfuscatedName("ev.a")
    public int[] field2391;

    @ObfuscatedName("ev.q")
    public int[] field2395;

    @ObfuscatedName("ev.j")
    public int[] field2396;

    @ObfuscatedName("ev.v")
    public int field2397;

    @ObfuscatedName("ev.l")
    public long field2399;

    @ObfuscatedName("ev.s")
    public static final byte[] field2400 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class144() {
    }

    public class144(byte[] arg0) {
        this.method2799(arg0);
    }

    @ObfuscatedName("ev.x([B)V")
    public void method2799(byte[] arg0) {
        this.field2402.field2015 = arg0;
        this.field2402.field2008 = 10;
        int var2 = this.field2402.method2539();
        this.field2392 = this.field2402.method2539();
        this.field2397 = 500000;
        this.field2394 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2402.method2415();
            int var5 = this.field2402.method2415();
            if (var4 == 1297379947) {
                this.field2394[var3] = this.field2402.field2008;
                var3++;
            }
            this.field2402.field2008 += var5;
        }
        this.field2399 = 0L;
        this.field2391 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2391[var6] = this.field2394[var6];
        }
        this.field2395 = new int[var2];
        this.field2396 = new int[var2];
    }

    @ObfuscatedName("ev.p()V")
    public void method2800() {
        this.field2402.field2015 = null;
        this.field2394 = null;
        this.field2391 = null;
        this.field2395 = null;
        this.field2396 = null;
    }

    @ObfuscatedName("ev.k()Z")
    public boolean method2801() {
        return this.field2402.field2015 != null;
    }

    @ObfuscatedName("ev.a()I")
    public int method2814() {
        return this.field2391.length;
    }

    @ObfuscatedName("ev.q(I)V")
    public void method2803(int arg0) {
        this.field2402.field2008 = this.field2391[arg0];
    }

    @ObfuscatedName("ev.j(I)V")
    public void method2820(int arg0) {
        this.field2391[arg0] = this.field2402.field2008;
    }

    @ObfuscatedName("ev.v()V")
    public void method2806() {
        this.field2402.field2008 = -1;
    }

    @ObfuscatedName("ev.w(I)V")
    public void method2809(int arg0) {
        int var2 = this.field2402.method2425();
        this.field2395[arg0] += var2;
    }

    @ObfuscatedName("ev.l(I)I")
    public int method2807(int arg0) {
        return this.method2808(arg0);
    }

    @ObfuscatedName("ev.s(I)I")
    public int method2808(int arg0) {
        byte var2 = this.field2402.field2015[this.field2402.field2008];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2396[arg0] = var3;
            this.field2402.field2008++;
        } else {
            var3 = this.field2396[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2831(arg0, var3);
        }
        int var4 = this.field2402.method2425();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2402.field2015[this.field2402.field2008] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2402.field2008++;
                this.field2396[arg0] = var5;
                return this.method2831(arg0, var5);
            }
        }
        this.field2402.field2008 += var4;
        return 0;
    }

    @ObfuscatedName("ev.n(II)I")
    public int method2831(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2400[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2402.method2484() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2402.method2484() << 16;
            }
            return var8;
        }
        int var3 = this.field2402.method2484();
        int var4 = this.field2402.method2425();
        if (var3 == 47) {
            this.field2402.field2008 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2402.method2403();
            var4 -= 3;
            int var6 = this.field2395[arg0];
            this.field2399 += (long) (this.field2397 - var5) * (long) var6;
            this.field2397 = var5;
            this.field2402.field2008 += var4;
            return 2;
        } else {
            this.field2402.field2008 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ev.c(I)J")
    public long method2810(int arg0) {
        return (long) this.field2397 * (long) arg0 + this.field2399;
    }

    @ObfuscatedName("ev.h()I")
    public int method2818() {
        int var1 = this.field2391.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2391[var4] >= 0 && this.field2395[var4] < var3) {
                var2 = var4;
                var3 = this.field2395[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ev.u()Z")
    public boolean method2816() {
        int var1 = this.field2391.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2391[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ev.y(J)V")
    public void method2834(long arg0) {
        this.field2399 = arg0;
        int var3 = this.field2391.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2395[var4] = 0;
            this.field2396[var4] = 0;
            this.field2402.field2008 = this.field2394[var4];
            this.method2809(var4);
            this.field2391[var4] = this.field2402.field2008;
        }
    }
}
