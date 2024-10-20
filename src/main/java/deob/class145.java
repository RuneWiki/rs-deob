package deob;

@ObfuscatedName("ex")
public class class145 {

    @ObfuscatedName("ex.f")
    public class127 field2423 = new class127((byte[]) null);

    @ObfuscatedName("ex.t")
    public int field2412;

    @ObfuscatedName("ex.n")
    public int[] field2414;

    @ObfuscatedName("ex.e")
    public int[] field2415;

    @ObfuscatedName("ex.l")
    public int[] field2416;

    @ObfuscatedName("ex.d")
    public int[] field2425;

    @ObfuscatedName("ex.r")
    public int field2418;

    @ObfuscatedName("ex.u")
    public long field2420;

    @ObfuscatedName("ex.o")
    public static final byte[] field2413 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class145() {
    }

    public class145(byte[] arg0) {
        this.method2903(arg0);
    }

    @ObfuscatedName("ex.f([B)V")
    public void method2903(byte[] arg0) {
        this.field2423.field2030 = arg0;
        this.field2423.field2033 = 10;
        int var2 = this.field2423.method2460();
        this.field2412 = this.field2423.method2460();
        this.field2418 = 500000;
        this.field2414 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2423.method2463();
            int var5 = this.field2423.method2463();
            if (var4 == 1297379947) {
                this.field2414[var3] = this.field2423.field2033;
                var3++;
            }
            this.field2423.field2033 += var5;
        }
        this.field2420 = 0L;
        this.field2415 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2415[var6] = this.field2414[var6];
        }
        this.field2416 = new int[var2];
        this.field2425 = new int[var2];
    }

    @ObfuscatedName("ex.t()V")
    public void method2925() {
        this.field2423.field2030 = null;
        this.field2414 = null;
        this.field2415 = null;
        this.field2416 = null;
        this.field2425 = null;
    }

    @ObfuscatedName("ex.n()Z")
    public boolean method2939() {
        return this.field2423.field2030 != null;
    }

    @ObfuscatedName("ex.e()I")
    public int method2905() {
        return this.field2415.length;
    }

    @ObfuscatedName("ex.l(I)V")
    public void method2906(int arg0) {
        this.field2423.field2033 = this.field2415[arg0];
    }

    @ObfuscatedName("ex.d(I)V")
    public void method2907(int arg0) {
        this.field2415[arg0] = this.field2423.field2033;
    }

    @ObfuscatedName("ex.r()V")
    public void method2931() {
        this.field2423.field2033 = -1;
    }

    @ObfuscatedName("ex.k(I)V")
    public void method2909(int arg0) {
        int var2 = this.field2423.method2577();
        this.field2416[arg0] += var2;
    }

    @ObfuscatedName("ex.u(I)I")
    public int method2910(int arg0) {
        return this.method2946(arg0);
    }

    @ObfuscatedName("ex.o(I)I")
    public int method2946(int arg0) {
        byte var2 = this.field2423.field2030[this.field2423.field2033];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2425[arg0] = var3;
            this.field2423.field2033++;
        } else {
            var3 = this.field2425[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2912(arg0, var3);
        }
        int var4 = this.field2423.method2577();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2423.field2030[this.field2423.field2033] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2423.field2033++;
                this.field2425[arg0] = var5;
                return this.method2912(arg0, var5);
            }
        }
        this.field2423.field2033 += var4;
        return 0;
    }

    @ObfuscatedName("ex.g(II)I")
    public int method2912(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2413[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2423.method2458() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2423.method2458() << 16;
            }
            return var8;
        }
        int var3 = this.field2423.method2458();
        int var4 = this.field2423.method2577();
        if (var3 == 47) {
            this.field2423.field2033 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2423.method2554();
            var4 -= 3;
            int var6 = this.field2416[arg0];
            this.field2420 += (long) (this.field2418 - var5) * (long) var6;
            this.field2418 = var5;
            this.field2423.field2033 += var4;
            return 2;
        } else {
            this.field2423.field2033 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ex.s(I)J")
    public long method2913(int arg0) {
        return (long) this.field2418 * (long) arg0 + this.field2420;
    }

    @ObfuscatedName("ex.b()I")
    public int method2914() {
        int var1 = this.field2415.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2415[var4] >= 0 && this.field2416[var4] < var3) {
                var2 = var4;
                var3 = this.field2416[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ex.v()Z")
    public boolean method2911() {
        int var1 = this.field2415.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2415[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ex.j(J)V")
    public void method2916(long arg0) {
        this.field2420 = arg0;
        int var3 = this.field2415.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2416[var4] = 0;
            this.field2425[var4] = 0;
            this.field2423.field2033 = this.field2414[var4];
            this.method2909(var4);
            this.field2415[var4] = this.field2423.field2033;
        }
    }
}
