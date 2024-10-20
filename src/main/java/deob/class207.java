package deob;

@ObfuscatedName("gf")
public class class207 {

    @ObfuscatedName("gf.i")
    public class174 field2558 = new class174((byte[]) null);

    @ObfuscatedName("gf.h")
    public int field2557;

    @ObfuscatedName("gf.u")
    public int[] field2565;

    @ObfuscatedName("gf.q")
    public int[] field2568;

    @ObfuscatedName("gf.g")
    public int[] field2560;

    @ObfuscatedName("gf.v")
    public int[] field2561;

    @ObfuscatedName("gf.t")
    public int field2562;

    @ObfuscatedName("gf.l")
    public long field2564;

    @ObfuscatedName("gf.a")
    public static final byte[] field2556 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3595(arg0);
    }

    @ObfuscatedName("gf.i([B)V")
    public void method3595(byte[] arg0) {
        this.field2558.field2387 = arg0;
        this.field2558.field2384 = 10;
        int var2 = this.field2558.method2932();
        this.field2557 = this.field2558.method2932();
        this.field2562 = 500000;
        this.field2565 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2558.method2927();
            int var5 = this.field2558.method2927();
            if (var4 == 1297379947) {
                this.field2565[var3] = this.field2558.field2384;
                var3++;
            }
            this.field2558.field2384 += var5;
        }
        this.field2564 = 0L;
        this.field2568 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2568[var6] = this.field2565[var6];
        }
        this.field2560 = new int[var2];
        this.field2561 = new int[var2];
    }

    @ObfuscatedName("gf.h()V")
    public void method3629() {
        this.field2558.field2387 = null;
        this.field2565 = null;
        this.field2568 = null;
        this.field2560 = null;
        this.field2561 = null;
    }

    @ObfuscatedName("gf.u()Z")
    public boolean method3589() {
        return this.field2558.field2387 != null;
    }

    @ObfuscatedName("gf.q()I")
    public int method3593() {
        return this.field2568.length;
    }

    @ObfuscatedName("gf.g(I)V")
    public void method3605(int arg0) {
        this.field2558.field2384 = this.field2568[arg0];
    }

    @ObfuscatedName("gf.v(I)V")
    public void method3590(int arg0) {
        this.field2568[arg0] = this.field2558.field2384;
    }

    @ObfuscatedName("gf.t()V")
    public void method3596() {
        this.field2558.field2384 = -1;
    }

    @ObfuscatedName("gf.p(I)V")
    public void method3597(int arg0) {
        int var2 = this.field2558.method3028();
        this.field2560[arg0] += var2;
    }

    @ObfuscatedName("gf.l(I)I")
    public int method3598(int arg0) {
        return this.method3599(arg0);
    }

    @ObfuscatedName("gf.a(I)I")
    public int method3599(int arg0) {
        byte var2 = this.field2558.field2387[this.field2558.field2384];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2561[arg0] = var3;
            this.field2558.field2384++;
        } else {
            var3 = this.field2561[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3600(arg0, var3);
        }
        int var4 = this.field2558.method3028();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2558.field2387[this.field2558.field2384] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2558.field2384++;
                this.field2561[arg0] = var5;
                return this.method3600(arg0, var5);
            }
        }
        this.field2558.field2384 += var4;
        return 0;
    }

    @ObfuscatedName("gf.k(II)I")
    public int method3600(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2556[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2558.method2930() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2558.method2930() << 16;
            }
            return var8;
        }
        int var3 = this.field2558.method2930();
        int var4 = this.field2558.method3028();
        if (var3 == 47) {
            this.field2558.field2384 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2558.method3033();
            var4 -= 3;
            int var6 = this.field2560[arg0];
            this.field2564 += (long) (this.field2562 - var5) * (long) var6;
            this.field2562 = var5;
            this.field2558.field2384 += var4;
            return 2;
        } else {
            this.field2558.field2384 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gf.b(I)J")
    public long method3601(int arg0) {
        return (long) this.field2562 * (long) arg0 + this.field2564;
    }

    @ObfuscatedName("gf.x()I")
    public int method3610() {
        int var1 = this.field2568.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2568[var4] >= 0 && this.field2560[var4] < var3) {
                var2 = var4;
                var3 = this.field2560[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gf.o()Z")
    public boolean method3603() {
        int var1 = this.field2568.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2568[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gf.j(J)V")
    public void method3604(long arg0) {
        this.field2564 = arg0;
        int var3 = this.field2568.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2560[var4] = 0;
            this.field2561[var4] = 0;
            this.field2558.field2384 = this.field2565[var4];
            this.method3597(var4);
            this.field2568[var4] = this.field2558.field2384;
        }
    }
}
