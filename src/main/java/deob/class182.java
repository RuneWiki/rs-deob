package deob;

@ObfuscatedName("fb")
public class class182 {

    @ObfuscatedName("fb.g")
    public class119 field2937 = new class119((byte[]) null);

    @ObfuscatedName("fb.b")
    public int field2926;

    @ObfuscatedName("fb.w")
    public int[] field2927;

    @ObfuscatedName("fb.d")
    public int[] field2928;

    @ObfuscatedName("fb.z")
    public int[] field2935;

    @ObfuscatedName("fb.l")
    public int[] field2930;

    @ObfuscatedName("fb.m")
    public int field2929;

    @ObfuscatedName("fb.u")
    public long field2933;

    @ObfuscatedName("fb.c")
    public static final byte[] field2934 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3378(arg0);
    }

    @ObfuscatedName("fb.g([B)V")
    public void method3378(byte[] arg0) {
        this.field2937.field1986 = arg0;
        this.field2937.field1977 = 10;
        int var2 = this.field2937.method2376();
        this.field2926 = this.field2937.method2376();
        this.field2929 = 500000;
        this.field2927 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2937.method2367();
            int var5 = this.field2937.method2367();
            if (var4 == 1297379947) {
                this.field2927[var3] = this.field2937.field1977;
                var3++;
            }
            this.field2937.field1977 += var5;
        }
        this.field2933 = 0L;
        this.field2928 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2928[var6] = this.field2927[var6];
        }
        this.field2935 = new int[var2];
        this.field2930 = new int[var2];
    }

    @ObfuscatedName("fb.b()V")
    public void method3376() {
        this.field2937.field1986 = null;
        this.field2927 = null;
        this.field2928 = null;
        this.field2935 = null;
        this.field2930 = null;
    }

    @ObfuscatedName("fb.w()Z")
    public boolean method3356() {
        return this.field2937.field1986 != null;
    }

    @ObfuscatedName("fb.d()I")
    public int method3364() {
        return this.field2928.length;
    }

    @ObfuscatedName("fb.z(I)V")
    public void method3372(int arg0) {
        this.field2937.field1977 = this.field2928[arg0];
    }

    @ObfuscatedName("fb.l(I)V")
    public void method3344(int arg0) {
        this.field2928[arg0] = this.field2937.field1977;
    }

    @ObfuscatedName("fb.m()V")
    public void method3345() {
        this.field2937.field1977 = -1;
    }

    @ObfuscatedName("fb.p(I)V")
    public void method3346(int arg0) {
        int var2 = this.field2937.method2443();
        this.field2935[arg0] += var2;
    }

    @ObfuscatedName("fb.u(I)I")
    public int method3368(int arg0) {
        return this.method3347(arg0);
    }

    @ObfuscatedName("fb.c(I)I")
    public int method3347(int arg0) {
        byte var2 = this.field2937.field1986[this.field2937.field1977];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2930[arg0] = var3;
            this.field2937.field1977++;
        } else {
            var3 = this.field2930[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3348(arg0, var3);
        }
        int var4 = this.field2937.method2443();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2937.field1986[this.field2937.field1977] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2937.field1977++;
                this.field2930[arg0] = var5;
                return this.method3348(arg0, var5);
            }
        }
        this.field2937.field1977 += var4;
        return 0;
    }

    @ObfuscatedName("fb.v(II)I")
    public int method3348(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2934[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2937.method2362() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2937.method2362() << 16;
            }
            return var8;
        }
        int var3 = this.field2937.method2362();
        int var4 = this.field2937.method2443();
        if (var3 == 47) {
            this.field2937.field1977 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2937.method2366();
            var4 -= 3;
            int var6 = this.field2935[arg0];
            this.field2933 += (long) (this.field2929 - var5) * (long) var6;
            this.field2929 = var5;
            this.field2937.field1977 += var4;
            return 2;
        } else {
            this.field2937.field1977 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fb.o(I)J")
    public long method3349(int arg0) {
        return (long) this.field2929 * (long) arg0 + this.field2933;
    }

    @ObfuscatedName("fb.n()I")
    public int method3350() {
        int var1 = this.field2928.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2928[var4] >= 0 && this.field2935[var4] < var3) {
                var2 = var4;
                var3 = this.field2935[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fb.k()Z")
    public boolean method3351() {
        int var1 = this.field2928.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2928[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.f(J)V")
    public void method3352(long arg0) {
        this.field2933 = arg0;
        int var3 = this.field2928.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2935[var4] = 0;
            this.field2930[var4] = 0;
            this.field2937.field1977 = this.field2927[var4];
            this.method3346(var4);
            this.field2928[var4] = this.field2937.field1977;
        }
    }
}
