package deob;

@ObfuscatedName("fz")
public class class182 {

    @ObfuscatedName("fz.c")
    public class119 field2932 = new class119((byte[]) null);

    @ObfuscatedName("fz.h")
    public int field2923;

    @ObfuscatedName("fz.k")
    public int[] field2931;

    @ObfuscatedName("fz.t")
    public int[] field2922;

    @ObfuscatedName("fz.g")
    public int[] field2926;

    @ObfuscatedName("fz.o")
    public int[] field2927;

    @ObfuscatedName("fz.i")
    public int field2925;

    @ObfuscatedName("fz.m")
    public long field2930;

    @ObfuscatedName("fz.r")
    public static final byte[] field2928 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3294(arg0);
    }

    @ObfuscatedName("fz.c([B)V")
    public void method3294(byte[] arg0) {
        this.field2932.field1956 = arg0;
        this.field2932.field1955 = 10;
        int var2 = this.field2932.method2293();
        this.field2923 = this.field2932.method2293();
        this.field2925 = 500000;
        this.field2931 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2932.method2296();
            int var5 = this.field2932.method2296();
            if (var4 == 1297379947) {
                this.field2931[var3] = this.field2932.field1955;
                var3++;
            }
            this.field2932.field1955 += var5;
        }
        this.field2930 = 0L;
        this.field2922 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2922[var6] = this.field2931[var6];
        }
        this.field2926 = new int[var2];
        this.field2927 = new int[var2];
    }

    @ObfuscatedName("fz.h()V")
    public void method3295() {
        this.field2932.field1956 = null;
        this.field2931 = null;
        this.field2922 = null;
        this.field2926 = null;
        this.field2927 = null;
    }

    @ObfuscatedName("fz.k()Z")
    public boolean method3296() {
        return this.field2932.field1956 != null;
    }

    @ObfuscatedName("fz.t()I")
    public int method3297() {
        return this.field2922.length;
    }

    @ObfuscatedName("fz.g(I)V")
    public void method3305(int arg0) {
        this.field2932.field1955 = this.field2922[arg0];
    }

    @ObfuscatedName("fz.o(I)V")
    public void method3299(int arg0) {
        this.field2922[arg0] = this.field2932.field1955;
    }

    @ObfuscatedName("fz.i()V")
    public void method3300() {
        this.field2932.field1955 = -1;
    }

    @ObfuscatedName("fz.w(I)V")
    public void method3301(int arg0) {
        int var2 = this.field2932.method2479();
        this.field2926[arg0] += var2;
    }

    @ObfuscatedName("fz.m(I)I")
    public int method3302(int arg0) {
        return this.method3323(arg0);
    }

    @ObfuscatedName("fz.r(I)I")
    public int method3323(int arg0) {
        byte var2 = this.field2932.field1956[this.field2932.field1955];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2927[arg0] = var3;
            this.field2932.field1955++;
        } else {
            var3 = this.field2927[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3304(arg0, var3);
        }
        int var4 = this.field2932.method2479();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2932.field1956[this.field2932.field1955] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2932.field1955++;
                this.field2927[arg0] = var5;
                return this.method3304(arg0, var5);
            }
        }
        this.field2932.field1955 += var4;
        return 0;
    }

    @ObfuscatedName("fz.y(II)I")
    public int method3304(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2928[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2932.method2291() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2932.method2291() << 16;
            }
            return var8;
        }
        int var3 = this.field2932.method2291();
        int var4 = this.field2932.method2479();
        if (var3 == 47) {
            this.field2932.field1955 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2932.method2402();
            var4 -= 3;
            int var6 = this.field2926[arg0];
            this.field2930 += (long) (this.field2925 - var5) * (long) var6;
            this.field2925 = var5;
            this.field2932.field1955 += var4;
            return 2;
        } else {
            this.field2932.field1955 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fz.q(I)J")
    public long method3319(int arg0) {
        return (long) this.field2925 * (long) arg0 + this.field2930;
    }

    @ObfuscatedName("fz.f()I")
    public int method3306() {
        int var1 = this.field2922.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2922[var4] >= 0 && this.field2926[var4] < var3) {
                var2 = var4;
                var3 = this.field2926[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fz.x()Z")
    public boolean method3311() {
        int var1 = this.field2922.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2922[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fz.d(J)V")
    public void method3337(long arg0) {
        this.field2930 = arg0;
        int var3 = this.field2922.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2926[var4] = 0;
            this.field2927[var4] = 0;
            this.field2932.field1955 = this.field2931[var4];
            this.method3301(var4);
            this.field2922[var4] = this.field2932.field1955;
        }
    }
}
