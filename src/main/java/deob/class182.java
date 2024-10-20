package deob;

@ObfuscatedName("fc")
public class class182 {

    @ObfuscatedName("fc.d")
    public class119 field2937 = new class119((byte[]) null);

    @ObfuscatedName("fc.p")
    public int field2930;

    @ObfuscatedName("fc.v")
    public int[] field2934;

    @ObfuscatedName("fc.l")
    public int[] field2932;

    @ObfuscatedName("fc.y")
    public int[] field2933;

    @ObfuscatedName("fc.w")
    public int[] field2939;

    @ObfuscatedName("fc.u")
    public int field2935;

    @ObfuscatedName("fc.e")
    public long field2940;

    @ObfuscatedName("fc.b")
    public static final byte[] field2938 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3362(arg0);
    }

    @ObfuscatedName("fc.d([B)V")
    public void method3362(byte[] arg0) {
        this.field2937.field1973 = arg0;
        this.field2937.field1966 = 10;
        int var2 = this.field2937.method2359();
        this.field2930 = this.field2937.method2359();
        this.field2935 = 500000;
        this.field2934 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2937.method2362();
            int var5 = this.field2937.method2362();
            if (var4 == 1297379947) {
                this.field2934[var3] = this.field2937.field1966;
                var3++;
            }
            this.field2937.field1966 += var5;
        }
        this.field2940 = 0L;
        this.field2932 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2932[var6] = this.field2934[var6];
        }
        this.field2933 = new int[var2];
        this.field2939 = new int[var2];
    }

    @ObfuscatedName("fc.p()V")
    public void method3363() {
        this.field2937.field1973 = null;
        this.field2934 = null;
        this.field2932 = null;
        this.field2933 = null;
        this.field2939 = null;
    }

    @ObfuscatedName("fc.v()Z")
    public boolean method3388() {
        return this.field2937.field1973 != null;
    }

    @ObfuscatedName("fc.l()I")
    public int method3365() {
        return this.field2932.length;
    }

    @ObfuscatedName("fc.y(I)V")
    public void method3366(int arg0) {
        this.field2937.field1966 = this.field2932[arg0];
    }

    @ObfuscatedName("fc.w(I)V")
    public void method3367(int arg0) {
        this.field2932[arg0] = this.field2937.field1966;
    }

    @ObfuscatedName("fc.u()V")
    public void method3412() {
        this.field2937.field1966 = -1;
    }

    @ObfuscatedName("fc.a(I)V")
    public void method3415(int arg0) {
        int var2 = this.field2937.method2469();
        this.field2933[arg0] += var2;
    }

    @ObfuscatedName("fc.e(I)I")
    public int method3383(int arg0) {
        return this.method3370(arg0);
    }

    @ObfuscatedName("fc.b(I)I")
    public int method3370(int arg0) {
        byte var2 = this.field2937.field1973[this.field2937.field1966];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2939[arg0] = var3;
            this.field2937.field1966++;
        } else {
            var3 = this.field2939[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3395(arg0, var3);
        }
        int var4 = this.field2937.method2469();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2937.field1973[this.field2937.field1966] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2937.field1966++;
                this.field2939[arg0] = var5;
                return this.method3395(arg0, var5);
            }
        }
        this.field2937.field1966 += var4;
        return 0;
    }

    @ObfuscatedName("fc.o(II)I")
    public int method3395(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2938[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2937.method2357() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2937.method2357() << 16;
            }
            return var8;
        }
        int var3 = this.field2937.method2357();
        int var4 = this.field2937.method2469();
        if (var3 == 47) {
            this.field2937.field1966 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2937.method2361();
            var4 -= 3;
            int var6 = this.field2933[arg0];
            this.field2940 += (long) (this.field2935 - var5) * (long) var6;
            this.field2935 = var5;
            this.field2937.field1966 += var4;
            return 2;
        } else {
            this.field2937.field1966 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fc.m(I)J")
    public long method3372(int arg0) {
        return (long) this.field2935 * (long) arg0 + this.field2940;
    }

    @ObfuscatedName("fc.x()I")
    public int method3373() {
        int var1 = this.field2932.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2932[var4] >= 0 && this.field2933[var4] < var3) {
                var2 = var4;
                var3 = this.field2933[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fc.k()Z")
    public boolean method3376() {
        int var1 = this.field2932.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2932[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fc.n(J)V")
    public void method3375(long arg0) {
        this.field2940 = arg0;
        int var3 = this.field2932.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2933[var4] = 0;
            this.field2939[var4] = 0;
            this.field2937.field1966 = this.field2934[var4];
            this.method3415(var4);
            this.field2932[var4] = this.field2937.field1966;
        }
    }
}
