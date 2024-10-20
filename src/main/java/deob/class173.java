package deob;

@ObfuscatedName("fr")
public class class173 {

    @ObfuscatedName("fr.o")
    public class111 field2835 = new class111((byte[]) null);

    @ObfuscatedName("fr.l")
    public int field2826;

    @ObfuscatedName("fr.g")
    public int[] field2838;

    @ObfuscatedName("fr.u")
    public int[] field2833;

    @ObfuscatedName("fr.q")
    public int[] field2829;

    @ObfuscatedName("fr.r")
    public int[] field2825;

    @ObfuscatedName("fr.v")
    public int field2831;

    @ObfuscatedName("fr.k")
    public long field2836;

    @ObfuscatedName("fr.c")
    public static final byte[] field2834 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3202(arg0);
    }

    @ObfuscatedName("fr.o([B)V")
    public void method3202(byte[] arg0) {
        this.field2835.field1860 = arg0;
        this.field2835.field1861 = 10;
        int var2 = this.field2835.method2397();
        this.field2826 = this.field2835.method2397();
        this.field2831 = 500000;
        this.field2838 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2835.method2273();
            int var5 = this.field2835.method2273();
            if (var4 == 1297379947) {
                this.field2838[var3] = this.field2835.field1861;
                var3++;
            }
            this.field2835.field1861 += var5;
        }
        this.field2836 = 0L;
        this.field2833 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2833[var6] = this.field2838[var6];
        }
        this.field2829 = new int[var2];
        this.field2825 = new int[var2];
    }

    @ObfuscatedName("fr.l()V")
    public void method3201() {
        this.field2835.field1860 = null;
        this.field2838 = null;
        this.field2833 = null;
        this.field2829 = null;
        this.field2825 = null;
    }

    @ObfuscatedName("fr.g()Z")
    public boolean method3221() {
        return this.field2835.field1860 != null;
    }

    @ObfuscatedName("fr.u()I")
    public int method3219() {
        return this.field2833.length;
    }

    @ObfuscatedName("fr.q(I)V")
    public void method3204(int arg0) {
        this.field2835.field1861 = this.field2833[arg0];
    }

    @ObfuscatedName("fr.r(I)V")
    public void method3200(int arg0) {
        this.field2833[arg0] = this.field2835.field1861;
    }

    @ObfuscatedName("fr.v()V")
    public void method3206() {
        this.field2835.field1861 = -1;
    }

    @ObfuscatedName("fr.y(I)V")
    public void method3207(int arg0) {
        int var2 = this.field2835.method2234();
        this.field2829[arg0] += var2;
    }

    @ObfuscatedName("fr.k(I)I")
    public int method3208(int arg0) {
        return this.method3209(arg0);
    }

    @ObfuscatedName("fr.c(I)I")
    public int method3209(int arg0) {
        byte var2 = this.field2835.field1860[this.field2835.field1861];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2825[arg0] = var3;
            this.field2835.field1861++;
        } else {
            var3 = this.field2825[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3210(arg0, var3);
        }
        int var4 = this.field2835.method2234();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2835.field1860[this.field2835.field1861] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2835.field1861++;
                this.field2825[arg0] = var5;
                return this.method3210(arg0, var5);
            }
        }
        this.field2835.field1861 += var4;
        return 0;
    }

    @ObfuscatedName("fr.j(II)I")
    public int method3210(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2834[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2835.method2219() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2835.method2219() << 16;
            }
            return var8;
        }
        int var3 = this.field2835.method2219();
        int var4 = this.field2835.method2234();
        if (var3 == 47) {
            this.field2835.field1861 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2835.method2258();
            var4 -= 3;
            int var6 = this.field2829[arg0];
            this.field2836 += (long) (this.field2831 - var5) * (long) var6;
            this.field2831 = var5;
            this.field2835.field1861 += var4;
            return 2;
        } else {
            this.field2835.field1861 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fr.m(I)J")
    public long method3211(int arg0) {
        return (long) this.field2831 * (long) arg0 + this.field2836;
    }

    @ObfuscatedName("fr.a()I")
    public int method3229() {
        int var1 = this.field2833.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2833[var4] >= 0 && this.field2829[var4] < var3) {
                var2 = var4;
                var3 = this.field2829[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fr.f()Z")
    public boolean method3213() {
        int var1 = this.field2833.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2833[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.i(J)V")
    public void method3214(long arg0) {
        this.field2836 = arg0;
        int var3 = this.field2833.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2829[var4] = 0;
            this.field2825[var4] = 0;
            this.field2835.field1861 = this.field2838[var4];
            this.method3207(var4);
            this.field2833[var4] = this.field2835.field1861;
        }
    }
}
