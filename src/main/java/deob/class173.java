package deob;

@ObfuscatedName("fw")
public class class173 {

    @ObfuscatedName("fw.n")
    public class111 field2842 = new class111((byte[]) null);

    @ObfuscatedName("fw.g")
    public int field2830;

    @ObfuscatedName("fw.a")
    public int[] field2831;

    @ObfuscatedName("fw.m")
    public int[] field2832;

    @ObfuscatedName("fw.s")
    public int[] field2840;

    @ObfuscatedName("fw.j")
    public int[] field2833;

    @ObfuscatedName("fw.f")
    public int field2841;

    @ObfuscatedName("fw.t")
    public long field2837;

    @ObfuscatedName("fw.i")
    public static final byte[] field2838 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3172(arg0);
    }

    @ObfuscatedName("fw.n([B)V")
    public void method3172(byte[] arg0) {
        this.field2842.field1904 = arg0;
        this.field2842.field1896 = 10;
        int var2 = this.field2842.method2395();
        this.field2830 = this.field2842.method2395();
        this.field2841 = 500000;
        this.field2831 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2842.method2366();
            int var5 = this.field2842.method2366();
            if (var4 == 1297379947) {
                this.field2831[var3] = this.field2842.field1896;
                var3++;
            }
            this.field2842.field1896 += var5;
        }
        this.field2837 = 0L;
        this.field2832 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2832[var6] = this.field2831[var6];
        }
        this.field2840 = new int[var2];
        this.field2833 = new int[var2];
    }

    @ObfuscatedName("fw.g()V")
    public void method3213() {
        this.field2842.field1904 = null;
        this.field2831 = null;
        this.field2832 = null;
        this.field2840 = null;
        this.field2833 = null;
    }

    @ObfuscatedName("fw.a()Z")
    public boolean method3181() {
        return this.field2842.field1904 != null;
    }

    @ObfuscatedName("fw.m()I")
    public int method3200() {
        return this.field2832.length;
    }

    @ObfuscatedName("fw.s(I)V")
    public void method3176(int arg0) {
        this.field2842.field1896 = this.field2832[arg0];
    }

    @ObfuscatedName("fw.j(I)V")
    public void method3177(int arg0) {
        this.field2832[arg0] = this.field2842.field1896;
    }

    @ObfuscatedName("fw.f()V")
    public void method3205() {
        this.field2842.field1896 = -1;
    }

    @ObfuscatedName("fw.b(I)V")
    public void method3204(int arg0) {
        int var2 = this.field2842.method2245();
        this.field2840[arg0] += var2;
    }

    @ObfuscatedName("fw.t(I)I")
    public int method3210(int arg0) {
        return this.method3209(arg0);
    }

    @ObfuscatedName("fw.i(I)I")
    public int method3209(int arg0) {
        byte var2 = this.field2842.field1904[this.field2842.field1896];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2833[arg0] = var3;
            this.field2842.field1896++;
        } else {
            var3 = this.field2833[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3182(arg0, var3);
        }
        int var4 = this.field2842.method2245();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2842.field1904[this.field2842.field1896] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2842.field1896++;
                this.field2833[arg0] = var5;
                return this.method3182(arg0, var5);
            }
        }
        this.field2842.field1896 += var4;
        return 0;
    }

    @ObfuscatedName("fw.c(II)I")
    public int method3182(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2838[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2842.method2211() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2842.method2211() << 16;
            }
            return var8;
        }
        int var3 = this.field2842.method2211();
        int var4 = this.field2842.method2245();
        if (var3 == 47) {
            this.field2842.field1896 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2842.method2228();
            var4 -= 3;
            int var6 = this.field2840[arg0];
            this.field2837 += (long) (this.field2841 - var5) * (long) var6;
            this.field2841 = var5;
            this.field2842.field1896 += var4;
            return 2;
        } else {
            this.field2842.field1896 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fw.k(I)J")
    public long method3183(int arg0) {
        return (long) this.field2841 * (long) arg0 + this.field2837;
    }

    @ObfuscatedName("fw.x()I")
    public int method3184() {
        int var1 = this.field2832.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2832[var4] >= 0 && this.field2840[var4] < var3) {
                var2 = var4;
                var3 = this.field2840[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fw.e()Z")
    public boolean method3185() {
        int var1 = this.field2832.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2832[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fw.q(J)V")
    public void method3186(long arg0) {
        this.field2837 = arg0;
        int var3 = this.field2832.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2840[var4] = 0;
            this.field2833[var4] = 0;
            this.field2842.field1896 = this.field2831[var4];
            this.method3204(var4);
            this.field2832[var4] = this.field2842.field1896;
        }
    }
}
