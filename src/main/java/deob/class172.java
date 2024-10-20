package deob;

@ObfuscatedName("fx")
public class class172 {

    @ObfuscatedName("fx.e")
    public class111 field2783 = new class111((byte[]) null);

    @ObfuscatedName("fx.a")
    public int field2786;

    @ObfuscatedName("fx.l")
    public int[] field2790;

    @ObfuscatedName("fx.c")
    public int[] field2785;

    @ObfuscatedName("fx.u")
    public int[] field2784;

    @ObfuscatedName("fx.w")
    public int[] field2787;

    @ObfuscatedName("fx.i")
    public int field2788;

    @ObfuscatedName("fx.f")
    public long field2793;

    @ObfuscatedName("fx.g")
    public static final byte[] field2791 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class172() {
    }

    public class172(byte[] arg0) {
        this.method3124(arg0);
    }

    @ObfuscatedName("fx.e([B)V")
    public void method3124(byte[] arg0) {
        this.field2783.field1835 = arg0;
        this.field2783.field1834 = 10;
        int var2 = this.field2783.method2178();
        this.field2786 = this.field2783.method2178();
        this.field2788 = 500000;
        this.field2790 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2783.method2378();
            int var5 = this.field2783.method2378();
            if (var4 == 1297379947) {
                this.field2790[var3] = this.field2783.field1834;
                var3++;
            }
            this.field2783.field1834 += var5;
        }
        this.field2793 = 0L;
        this.field2785 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2785[var6] = this.field2790[var6];
        }
        this.field2784 = new int[var2];
        this.field2787 = new int[var2];
    }

    @ObfuscatedName("fx.a()V")
    public void method3101() {
        this.field2783.field1835 = null;
        this.field2790 = null;
        this.field2785 = null;
        this.field2784 = null;
        this.field2787 = null;
    }

    @ObfuscatedName("fx.l()Z")
    public boolean method3102() {
        return this.field2783.field1835 != null;
    }

    @ObfuscatedName("fx.c()I")
    public int method3141() {
        return this.field2785.length;
    }

    @ObfuscatedName("fx.u(I)V")
    public void method3117(int arg0) {
        this.field2783.field1834 = this.field2785[arg0];
    }

    @ObfuscatedName("fx.w(I)V")
    public void method3105(int arg0) {
        this.field2785[arg0] = this.field2783.field1834;
    }

    @ObfuscatedName("fx.i()V")
    public void method3106() {
        this.field2783.field1834 = -1;
    }

    @ObfuscatedName("fx.r(I)V")
    public void method3107(int arg0) {
        int var2 = this.field2783.method2248();
        this.field2784[arg0] += var2;
    }

    @ObfuscatedName("fx.f(I)I")
    public int method3143(int arg0) {
        return this.method3112(arg0);
    }

    @ObfuscatedName("fx.g(I)I")
    public int method3112(int arg0) {
        byte var2 = this.field2783.field1835[this.field2783.field1834];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2787[arg0] = var3;
            this.field2783.field1834++;
        } else {
            var3 = this.field2787[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3139(arg0, var3);
        }
        int var4 = this.field2783.method2248();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2783.field1835[this.field2783.field1834] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2783.field1834++;
                this.field2787[arg0] = var5;
                return this.method3139(arg0, var5);
            }
        }
        this.field2783.field1834 += var4;
        return 0;
    }

    @ObfuscatedName("fx.o(II)I")
    public int method3139(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2791[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2783.method2176() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2783.method2176() << 16;
            }
            return var8;
        }
        int var3 = this.field2783.method2176();
        int var4 = this.field2783.method2248();
        if (var3 == 47) {
            this.field2783.field1834 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2783.method2179();
            var4 -= 3;
            int var6 = this.field2784[arg0];
            this.field2793 += (long) (this.field2788 - var5) * (long) var6;
            this.field2788 = var5;
            this.field2783.field1834 += var4;
            return 2;
        } else {
            this.field2783.field1834 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fx.h(I)J")
    public long method3113(int arg0) {
        return (long) this.field2788 * (long) arg0 + this.field2793;
    }

    @ObfuscatedName("fx.s()I")
    public int method3098() {
        int var1 = this.field2785.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2785[var4] >= 0 && this.field2784[var4] < var3) {
                var2 = var4;
                var3 = this.field2784[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fx.j()Z")
    public boolean method3140() {
        int var1 = this.field2785.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2785[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fx.m(J)V")
    public void method3133(long arg0) {
        this.field2793 = arg0;
        int var3 = this.field2785.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2784[var4] = 0;
            this.field2787[var4] = 0;
            this.field2783.field1834 = this.field2790[var4];
            this.method3107(var4);
            this.field2785[var4] = this.field2783.field1834;
        }
    }
}
