package deob;

@ObfuscatedName("hi")
public class class223 {

    @ObfuscatedName("hi.c")
    public class185 field2560 = new class185((byte[]) null);

    @ObfuscatedName("hi.q")
    public int field2559;

    @ObfuscatedName("hi.m")
    public int[] field2567;

    @ObfuscatedName("hi.j")
    public int[] field2561;

    @ObfuscatedName("hi.g")
    public int[] field2562;

    @ObfuscatedName("hi.i")
    public int[] field2563;

    @ObfuscatedName("hi.h")
    public int field2570;

    @ObfuscatedName("hi.d")
    public long field2566;

    @ObfuscatedName("hi.o")
    public static final byte[] field2568 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class223() {
    }

    public class223(byte[] arg0) {
        this.method3961(arg0);
    }

    @ObfuscatedName("hi.c([B)V")
    public void method3961(byte[] arg0) {
        this.field2560.field2388 = arg0;
        this.field2560.field2386 = 10;
        int var2 = this.field2560.method3245();
        this.field2559 = this.field2560.method3245();
        this.field2570 = 500000;
        this.field2567 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2560.method3323();
            int var5 = this.field2560.method3323();
            if (var4 == 1297379947) {
                this.field2567[var3] = this.field2560.field2386;
                var3++;
            }
            this.field2560.field2386 += var5;
        }
        this.field2566 = 0L;
        this.field2561 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2561[var6] = this.field2567[var6];
        }
        this.field2562 = new int[var2];
        this.field2563 = new int[var2];
    }

    @ObfuscatedName("hi.q()V")
    public void method3985() {
        this.field2560.field2388 = null;
        this.field2567 = null;
        this.field2561 = null;
        this.field2562 = null;
        this.field2563 = null;
    }

    @ObfuscatedName("hi.m()Z")
    public boolean method3986() {
        return this.field2560.field2388 != null;
    }

    @ObfuscatedName("hi.j()I")
    public int method3964() {
        return this.field2561.length;
    }

    @ObfuscatedName("hi.g(I)V")
    public void method3965(int arg0) {
        this.field2560.field2386 = this.field2561[arg0];
    }

    @ObfuscatedName("hi.i(I)V")
    public void method3966(int arg0) {
        this.field2561[arg0] = this.field2560.field2386;
    }

    @ObfuscatedName("hi.h()V")
    public void method3967() {
        this.field2560.field2386 = -1;
    }

    @ObfuscatedName("hi.l(I)V")
    public void method3968(int arg0) {
        int var2 = this.field2560.method3444();
        this.field2562[arg0] += var2;
    }

    @ObfuscatedName("hi.o(I)I")
    public int method4002(int arg0) {
        return this.method3976(arg0);
    }

    @ObfuscatedName("hi.k(I)I")
    public int method3976(int arg0) {
        byte var2 = this.field2560.field2388[this.field2560.field2386];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2563[arg0] = var3;
            this.field2560.field2386++;
        } else {
            var3 = this.field2563[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3971(arg0, var3);
        }
        int var4 = this.field2560.method3444();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2560.field2388[this.field2560.field2386] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2560.field2386++;
                this.field2563[arg0] = var5;
                return this.method3971(arg0, var5);
            }
        }
        this.field2560.field2386 += var4;
        return 0;
    }

    @ObfuscatedName("hi.v(II)I")
    public int method3971(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2568[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2560.method3243() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2560.method3243() << 16;
            }
            return var8;
        }
        int var3 = this.field2560.method3243();
        int var4 = this.field2560.method3444();
        if (var3 == 47) {
            this.field2560.field2386 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2560.method3247();
            var4 -= 3;
            int var6 = this.field2562[arg0];
            this.field2566 += (long) (this.field2570 - var5) * (long) var6;
            this.field2570 = var5;
            this.field2560.field2386 += var4;
            return 2;
        } else {
            this.field2560.field2386 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hi.p(I)J")
    public long method3972(int arg0) {
        return (long) this.field2570 * (long) arg0 + this.field2566;
    }

    @ObfuscatedName("hi.n()I")
    public int method3990() {
        int var1 = this.field2561.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2561[var4] >= 0 && this.field2562[var4] < var3) {
                var2 = var4;
                var3 = this.field2562[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hi.t()Z")
    public boolean method3973() {
        int var1 = this.field2561.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2561[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hi.r(J)V")
    public void method3974(long arg0) {
        this.field2566 = arg0;
        int var3 = this.field2561.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2562[var4] = 0;
            this.field2563[var4] = 0;
            this.field2560.field2386 = this.field2567[var4];
            this.method3968(var4);
            this.field2561[var4] = this.field2560.field2386;
        }
    }
}
