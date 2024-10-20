package deob;

@ObfuscatedName("el")
public class class143 {

    @ObfuscatedName("el.z")
    public class126 field2374 = new class126((byte[]) null);

    @ObfuscatedName("el.h")
    public int field2368;

    @ObfuscatedName("el.c")
    public int[] field2369;

    @ObfuscatedName("el.p")
    public int[] field2370;

    @ObfuscatedName("el.i")
    public int[] field2371;

    @ObfuscatedName("el.v")
    public int[] field2372;

    @ObfuscatedName("el.l")
    public int field2373;

    @ObfuscatedName("el.g")
    public long field2367;

    @ObfuscatedName("el.t")
    public static final byte[] field2376 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2882(arg0);
    }

    @ObfuscatedName("el.z([B)V")
    public void method2882(byte[] arg0) {
        this.field2374.field2007 = arg0;
        this.field2374.field2003 = 10;
        int var2 = this.field2374.method2627();
        this.field2368 = this.field2374.method2627();
        this.field2373 = 500000;
        this.field2369 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2374.method2467();
            int var5 = this.field2374.method2467();
            if (var4 == 1297379947) {
                this.field2369[var3] = this.field2374.field2003;
                var3++;
            }
            this.field2374.field2003 += var5;
        }
        this.field2367 = 0L;
        this.field2370 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2370[var6] = this.field2369[var6];
        }
        this.field2371 = new int[var2];
        this.field2372 = new int[var2];
    }

    @ObfuscatedName("el.h()V")
    public void method2848() {
        this.field2374.field2007 = null;
        this.field2369 = null;
        this.field2370 = null;
        this.field2371 = null;
        this.field2372 = null;
    }

    @ObfuscatedName("el.c()Z")
    public boolean method2853() {
        return this.field2374.field2007 != null;
    }

    @ObfuscatedName("el.p()I")
    public int method2850() {
        return this.field2370.length;
    }

    @ObfuscatedName("el.i(I)V")
    public void method2878(int arg0) {
        this.field2374.field2003 = this.field2370[arg0];
    }

    @ObfuscatedName("el.v(I)V")
    public void method2852(int arg0) {
        this.field2370[arg0] = this.field2374.field2003;
    }

    @ObfuscatedName("el.l()V")
    public void method2865() {
        this.field2374.field2003 = -1;
    }

    @ObfuscatedName("el.m(I)V")
    public void method2854(int arg0) {
        int var2 = this.field2374.method2469();
        this.field2371[arg0] += var2;
    }

    @ObfuscatedName("el.g(I)I")
    public int method2855(int arg0) {
        return this.method2846(arg0);
    }

    @ObfuscatedName("el.t(I)I")
    public int method2846(int arg0) {
        byte var2 = this.field2374.field2007[this.field2374.field2003];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2372[arg0] = var3;
            this.field2374.field2003++;
        } else {
            var3 = this.field2372[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2856(arg0, var3);
        }
        int var4 = this.field2374.method2469();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2374.field2007[this.field2374.field2003] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2374.field2003++;
                this.field2372[arg0] = var5;
                return this.method2856(arg0, var5);
            }
        }
        this.field2374.field2003 += var4;
        return 0;
    }

    @ObfuscatedName("el.o(II)I")
    public int method2856(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2376[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2374.method2450() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2374.method2450() << 16;
            }
            return var8;
        }
        int var3 = this.field2374.method2450();
        int var4 = this.field2374.method2469();
        if (var3 == 47) {
            this.field2374.field2003 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2374.method2454();
            var4 -= 3;
            int var6 = this.field2371[arg0];
            this.field2367 += (long) (this.field2373 - var5) * (long) var6;
            this.field2373 = var5;
            this.field2374.field2003 += var4;
            return 2;
        } else {
            this.field2374.field2003 += var4;
            return 3;
        }
    }

    @ObfuscatedName("el.b(I)J")
    public long method2857(int arg0) {
        return (long) this.field2373 * (long) arg0 + this.field2367;
    }

    @ObfuscatedName("el.d()I")
    public int method2858() {
        int var1 = this.field2370.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2370[var4] >= 0 && this.field2371[var4] < var3) {
                var2 = var4;
                var3 = this.field2371[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("el.k()Z")
    public boolean method2859() {
        int var1 = this.field2370.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2370[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("el.f(J)V")
    public void method2860(long arg0) {
        this.field2367 = arg0;
        int var3 = this.field2370.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2371[var4] = 0;
            this.field2372[var4] = 0;
            this.field2374.field2003 = this.field2369[var4];
            this.method2854(var4);
            this.field2370[var4] = this.field2374.field2003;
        }
    }
}
