package deob;

@ObfuscatedName("fy")
public class class182 {

    @ObfuscatedName("fy.l")
    public class119 field2932 = new class119((byte[]) null);

    @ObfuscatedName("fy.e")
    public int field2928;

    @ObfuscatedName("fy.q")
    public int[] field2929;

    @ObfuscatedName("fy.o")
    public int[] field2930;

    @ObfuscatedName("fy.g")
    public int[] field2935;

    @ObfuscatedName("fy.m")
    public int[] field2940;

    @ObfuscatedName("fy.b")
    public int field2934;

    @ObfuscatedName("fy.t")
    public long field2927;

    @ObfuscatedName("fy.w")
    public static final byte[] field2936 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3337(arg0);
    }

    @ObfuscatedName("fy.l([B)V")
    public void method3337(byte[] arg0) {
        this.field2932.field1986 = arg0;
        this.field2932.field1988 = 10;
        int var2 = this.field2932.method2440();
        this.field2928 = this.field2932.method2440();
        this.field2934 = 500000;
        this.field2929 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2932.method2393();
            int var5 = this.field2932.method2393();
            if (var4 == 1297379947) {
                this.field2929[var3] = this.field2932.field1988;
                var3++;
            }
            this.field2932.field1988 += var5;
        }
        this.field2927 = 0L;
        this.field2930 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2930[var6] = this.field2929[var6];
        }
        this.field2935 = new int[var2];
        this.field2940 = new int[var2];
    }

    @ObfuscatedName("fy.e()V")
    public void method3300() {
        this.field2932.field1986 = null;
        this.field2929 = null;
        this.field2930 = null;
        this.field2935 = null;
        this.field2940 = null;
    }

    @ObfuscatedName("fy.q()Z")
    public boolean method3301() {
        return this.field2932.field1986 != null;
    }

    @ObfuscatedName("fy.o()I")
    public int method3302() {
        return this.field2930.length;
    }

    @ObfuscatedName("fy.g(I)V")
    public void method3312(int arg0) {
        this.field2932.field1988 = this.field2930[arg0];
    }

    @ObfuscatedName("fy.m(I)V")
    public void method3304(int arg0) {
        this.field2930[arg0] = this.field2932.field1988;
    }

    @ObfuscatedName("fy.b()V")
    public void method3305() {
        this.field2932.field1988 = -1;
    }

    @ObfuscatedName("fy.p(I)V")
    public void method3306(int arg0) {
        int var2 = this.field2932.method2403();
        this.field2935[arg0] += var2;
    }

    @ObfuscatedName("fy.t(I)I")
    public int method3307(int arg0) {
        return this.method3299(arg0);
    }

    @ObfuscatedName("fy.w(I)I")
    public int method3299(int arg0) {
        byte var2 = this.field2932.field1986[this.field2932.field1988];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2940[arg0] = var3;
            this.field2932.field1988++;
        } else {
            var3 = this.field2940[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3309(arg0, var3);
        }
        int var4 = this.field2932.method2403();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2932.field1986[this.field2932.field1988] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2932.field1988++;
                this.field2940[arg0] = var5;
                return this.method3309(arg0, var5);
            }
        }
        this.field2932.field1988 += var4;
        return 0;
    }

    @ObfuscatedName("fy.x(II)I")
    public int method3309(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2936[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2932.method2388() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2932.method2388() << 16;
            }
            return var8;
        }
        int var3 = this.field2932.method2388();
        int var4 = this.field2932.method2403();
        if (var3 == 47) {
            this.field2932.field1988 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2932.method2460();
            var4 -= 3;
            int var6 = this.field2935[arg0];
            this.field2927 += (long) (this.field2934 - var5) * (long) var6;
            this.field2934 = var5;
            this.field2932.field1988 += var4;
            return 2;
        } else {
            this.field2932.field1988 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fy.k(I)J")
    public long method3310(int arg0) {
        return (long) this.field2934 * (long) arg0 + this.field2927;
    }

    @ObfuscatedName("fy.z()I")
    public int method3311() {
        int var1 = this.field2930.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2930[var4] >= 0 && this.field2935[var4] < var3) {
                var2 = var4;
                var3 = this.field2935[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fy.v()Z")
    public boolean method3334() {
        int var1 = this.field2930.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2930[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fy.j(J)V")
    public void method3338(long arg0) {
        this.field2927 = arg0;
        int var3 = this.field2930.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2935[var4] = 0;
            this.field2940[var4] = 0;
            this.field2932.field1988 = this.field2929[var4];
            this.method3306(var4);
            this.field2930[var4] = this.field2932.field1988;
        }
    }
}
