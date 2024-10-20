package deob;

@ObfuscatedName("fh")
public class class182 {

    @ObfuscatedName("fh.f")
    public class119 field2938 = new class119((byte[]) null);

    @ObfuscatedName("fh.s")
    public int field2939;

    @ObfuscatedName("fh.q")
    public int[] field2930;

    @ObfuscatedName("fh.g")
    public int[] field2933;

    @ObfuscatedName("fh.m")
    public int[] field2934;

    @ObfuscatedName("fh.t")
    public int[] field2935;

    @ObfuscatedName("fh.j")
    public int field2936;

    @ObfuscatedName("fh.l")
    public long field2942;

    @ObfuscatedName("fh.i")
    public static final byte[] field2932 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3344(arg0);
    }

    @ObfuscatedName("fh.f([B)V")
    public void method3344(byte[] arg0) {
        this.field2938.field2000 = arg0;
        this.field2938.field1994 = 10;
        int var2 = this.field2938.method2353();
        this.field2939 = this.field2938.method2353();
        this.field2936 = 500000;
        this.field2930 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2938.method2368();
            int var5 = this.field2938.method2368();
            if (var4 == 1297379947) {
                this.field2930[var3] = this.field2938.field1994;
                var3++;
            }
            this.field2938.field1994 += var5;
        }
        this.field2942 = 0L;
        this.field2933 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2933[var6] = this.field2930[var6];
        }
        this.field2934 = new int[var2];
        this.field2935 = new int[var2];
    }

    @ObfuscatedName("fh.s()V")
    public void method3311() {
        this.field2938.field2000 = null;
        this.field2930 = null;
        this.field2933 = null;
        this.field2934 = null;
        this.field2935 = null;
    }

    @ObfuscatedName("fh.q()Z")
    public boolean method3312() {
        return this.field2938.field2000 != null;
    }

    @ObfuscatedName("fh.g()I")
    public int method3348() {
        return this.field2933.length;
    }

    @ObfuscatedName("fh.m(I)V")
    public void method3346(int arg0) {
        this.field2938.field1994 = this.field2933[arg0];
    }

    @ObfuscatedName("fh.t(I)V")
    public void method3326(int arg0) {
        this.field2933[arg0] = this.field2938.field1994;
    }

    @ObfuscatedName("fh.j()V")
    public void method3316() {
        this.field2938.field1994 = -1;
    }

    @ObfuscatedName("fh.n(I)V")
    public void method3317(int arg0) {
        int var2 = this.field2938.method2378();
        this.field2934[arg0] += var2;
    }

    @ObfuscatedName("fh.l(I)I")
    public int method3318(int arg0) {
        return this.method3361(arg0);
    }

    @ObfuscatedName("fh.i(I)I")
    public int method3361(int arg0) {
        byte var2 = this.field2938.field2000[this.field2938.field1994];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2935[arg0] = var3;
            this.field2938.field1994++;
        } else {
            var3 = this.field2935[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3366(arg0, var3);
        }
        int var4 = this.field2938.method2378();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2938.field2000[this.field2938.field1994] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2938.field1994++;
                this.field2935[arg0] = var5;
                return this.method3366(arg0, var5);
            }
        }
        this.field2938.field1994 += var4;
        return 0;
    }

    @ObfuscatedName("fh.w(II)I")
    public int method3366(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2932[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2938.method2363() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2938.method2363() << 16;
            }
            return var8;
        }
        int var3 = this.field2938.method2363();
        int var4 = this.field2938.method2378();
        if (var3 == 47) {
            this.field2938.field1994 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2938.method2414();
            var4 -= 3;
            int var6 = this.field2934[arg0];
            this.field2942 += (long) (this.field2936 - var5) * (long) var6;
            this.field2936 = var5;
            this.field2938.field1994 += var4;
            return 2;
        } else {
            this.field2938.field1994 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fh.v(I)J")
    public long method3321(int arg0) {
        return (long) this.field2936 * (long) arg0 + this.field2942;
    }

    @ObfuscatedName("fh.o()I")
    public int method3322() {
        int var1 = this.field2933.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2933[var4] >= 0 && this.field2934[var4] < var3) {
                var2 = var4;
                var3 = this.field2934[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fh.p()Z")
    public boolean method3323() {
        int var1 = this.field2933.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2933[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fh.b(J)V")
    public void method3324(long arg0) {
        this.field2942 = arg0;
        int var3 = this.field2933.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2934[var4] = 0;
            this.field2935[var4] = 0;
            this.field2938.field1994 = this.field2930[var4];
            this.method3317(var4);
            this.field2933[var4] = this.field2938.field1994;
        }
    }
}
