package deob;

@ObfuscatedName("em")
public class class143 {

    @ObfuscatedName("em.p")
    public class126 field2420 = new class126((byte[]) null);

    @ObfuscatedName("em.j")
    public int field2411;

    @ObfuscatedName("em.w")
    public int[] field2412;

    @ObfuscatedName("em.h")
    public int[] field2410;

    @ObfuscatedName("em.v")
    public int[] field2414;

    @ObfuscatedName("em.k")
    public int[] field2415;

    @ObfuscatedName("em.g")
    public int field2413;

    @ObfuscatedName("em.c")
    public long field2416;

    @ObfuscatedName("em.o")
    public static final byte[] field2419 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class143() {
    }

    public class143(byte[] arg0) {
        this.method2784(arg0);
    }

    @ObfuscatedName("em.p([B)V")
    public void method2784(byte[] arg0) {
        this.field2420.field2047 = arg0;
        this.field2420.field2043 = 10;
        int var2 = this.field2420.method2489();
        this.field2411 = this.field2420.method2489();
        this.field2413 = 500000;
        this.field2412 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2420.method2380();
            int var5 = this.field2420.method2380();
            if (var4 == 1297379947) {
                this.field2412[var3] = this.field2420.field2043;
                var3++;
            }
            this.field2420.field2043 += var5;
        }
        this.field2416 = 0L;
        this.field2410 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2410[var6] = this.field2412[var6];
        }
        this.field2414 = new int[var2];
        this.field2415 = new int[var2];
    }

    @ObfuscatedName("em.j()V")
    public void method2822() {
        this.field2420.field2047 = null;
        this.field2412 = null;
        this.field2410 = null;
        this.field2414 = null;
        this.field2415 = null;
    }

    @ObfuscatedName("em.w()Z")
    public boolean method2786() {
        return this.field2420.field2047 != null;
    }

    @ObfuscatedName("em.h()I")
    public int method2787() {
        return this.field2410.length;
    }

    @ObfuscatedName("em.v(I)V")
    public void method2788(int arg0) {
        this.field2420.field2043 = this.field2410[arg0];
    }

    @ObfuscatedName("em.k(I)V")
    public void method2789(int arg0) {
        this.field2410[arg0] = this.field2420.field2043;
    }

    @ObfuscatedName("em.g()V")
    public void method2815() {
        this.field2420.field2043 = -1;
    }

    @ObfuscatedName("em.n(I)V")
    public void method2791(int arg0) {
        int var2 = this.field2420.method2449();
        this.field2414[arg0] += var2;
    }

    @ObfuscatedName("em.c(I)I")
    public int method2797(int arg0) {
        return this.method2808(arg0);
    }

    @ObfuscatedName("em.o(I)I")
    public int method2808(int arg0) {
        byte var2 = this.field2420.field2047[this.field2420.field2043];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2415[arg0] = var3;
            this.field2420.field2043++;
        } else {
            var3 = this.field2415[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2799(arg0, var3);
        }
        int var4 = this.field2420.method2449();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2420.field2047[this.field2420.field2043] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2420.field2043++;
                this.field2415[arg0] = var5;
                return this.method2799(arg0, var5);
            }
        }
        this.field2420.field2043 += var4;
        return 0;
    }

    @ObfuscatedName("em.u(II)I")
    public int method2799(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2419[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2420.method2544() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2420.method2544() << 16;
            }
            return var8;
        }
        int var3 = this.field2420.method2544();
        int var4 = this.field2420.method2449();
        if (var3 == 47) {
            this.field2420.field2043 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2420.method2530();
            var4 -= 3;
            int var6 = this.field2414[arg0];
            this.field2416 += (long) (this.field2413 - var5) * (long) var6;
            this.field2413 = var5;
            this.field2420.field2043 += var4;
            return 2;
        } else {
            this.field2420.field2043 += var4;
            return 3;
        }
    }

    @ObfuscatedName("em.z(I)J")
    public long method2792(int arg0) {
        return (long) this.field2413 * (long) arg0 + this.field2416;
    }

    @ObfuscatedName("em.e()I")
    public int method2795() {
        int var1 = this.field2410.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2410[var4] >= 0 && this.field2414[var4] < var3) {
                var2 = var4;
                var3 = this.field2414[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("em.l()Z")
    public boolean method2796() {
        int var1 = this.field2410.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2410[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("em.m(J)V")
    public void method2829(long arg0) {
        this.field2416 = arg0;
        int var3 = this.field2410.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2414[var4] = 0;
            this.field2415[var4] = 0;
            this.field2420.field2043 = this.field2412[var4];
            this.method2791(var4);
            this.field2410[var4] = this.field2420.field2043;
        }
    }
}
