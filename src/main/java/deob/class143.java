package deob;

@ObfuscatedName("el")
public class class143 {

    @ObfuscatedName("el.c")
    public class125 field2393 = new class125((byte[]) null);

    @ObfuscatedName("el.j")
    public int field2387;

    @ObfuscatedName("el.f")
    public int[] field2388;

    @ObfuscatedName("el.y")
    public int[] field2389;

    @ObfuscatedName("el.x")
    public int[] field2390;

    @ObfuscatedName("el.e")
    public int[] field2396;

    @ObfuscatedName("el.m")
    public int field2392;

    @ObfuscatedName("el.p")
    public long field2394;

    @ObfuscatedName("el.w")
    public static final byte[] field2399 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2729(arg0);
    }

    @ObfuscatedName("el.c([B)V")
    public void method2729(byte[] arg0) {
        this.field2393.field2002 = arg0;
        this.field2393.field2003 = 10;
        int var2 = this.field2393.method2328();
        this.field2387 = this.field2393.method2328();
        this.field2392 = 500000;
        this.field2388 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2393.method2489();
            int var5 = this.field2393.method2489();
            if (var4 == 1297379947) {
                this.field2388[var3] = this.field2393.field2003;
                var3++;
            }
            this.field2393.field2003 += var5;
        }
        this.field2394 = 0L;
        this.field2389 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2389[var6] = this.field2388[var6];
        }
        this.field2390 = new int[var2];
        this.field2396 = new int[var2];
    }

    @ObfuscatedName("el.j()V")
    public void method2710() {
        this.field2393.field2002 = null;
        this.field2388 = null;
        this.field2389 = null;
        this.field2390 = null;
        this.field2396 = null;
    }

    @ObfuscatedName("el.f()Z")
    public boolean method2711() {
        return this.field2393.field2002 != null;
    }

    @ObfuscatedName("el.y()I")
    public int method2712() {
        return this.field2389.length;
    }

    @ObfuscatedName("el.x(I)V")
    public void method2713(int arg0) {
        this.field2393.field2003 = this.field2389[arg0];
    }

    @ObfuscatedName("el.e(I)V")
    public void method2744(int arg0) {
        this.field2389[arg0] = this.field2393.field2003;
    }

    @ObfuscatedName("el.m()V")
    public void method2717() {
        this.field2393.field2003 = -1;
    }

    @ObfuscatedName("el.s(I)V")
    public void method2714(int arg0) {
        int var2 = this.field2393.method2421();
        this.field2390[arg0] += var2;
    }

    @ObfuscatedName("el.p(I)I")
    public int method2709(int arg0) {
        return this.method2718(arg0);
    }

    @ObfuscatedName("el.w(I)I")
    public int method2718(int arg0) {
        byte var2 = this.field2393.field2002[this.field2393.field2003];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2396[arg0] = var3;
            this.field2393.field2003++;
        } else {
            var3 = this.field2396[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2752(arg0, var3);
        }
        int var4 = this.field2393.method2421();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2393.field2002[this.field2393.field2003] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2393.field2003++;
                this.field2396[arg0] = var5;
                return this.method2752(arg0, var5);
            }
        }
        this.field2393.field2003 += var4;
        return 0;
    }

    @ObfuscatedName("el.r(II)I")
    public int method2752(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2399[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2393.method2326() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2393.method2326() << 16;
            }
            return var8;
        }
        int var3 = this.field2393.method2326();
        int var4 = this.field2393.method2421();
        if (var3 == 47) {
            this.field2393.field2003 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2393.method2330();
            var4 -= 3;
            int var6 = this.field2390[arg0];
            this.field2394 += (long) (this.field2392 - var5) * (long) var6;
            this.field2392 = var5;
            this.field2393.field2003 += var4;
            return 2;
        } else {
            this.field2393.field2003 += var4;
            return 3;
        }
    }

    @ObfuscatedName("el.n(I)J")
    public long method2720(int arg0) {
        return (long) this.field2392 * (long) arg0 + this.field2394;
    }

    @ObfuscatedName("el.b()I")
    public int method2715() {
        int var1 = this.field2389.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2389[var4] >= 0 && this.field2390[var4] < var3) {
                var2 = var4;
                var3 = this.field2390[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("el.z()Z")
    public boolean method2722() {
        int var1 = this.field2389.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2389[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("el.h(J)V")
    public void method2726(long arg0) {
        this.field2394 = arg0;
        int var3 = this.field2389.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2390[var4] = 0;
            this.field2396[var4] = 0;
            this.field2393.field2003 = this.field2388[var4];
            this.method2714(var4);
            this.field2389[var4] = this.field2393.field2003;
        }
    }
}
