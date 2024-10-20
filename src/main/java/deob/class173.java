package deob;

@ObfuscatedName("fa")
public class class173 {

    @ObfuscatedName("fa.t")
    public class111 field2840 = new class111((byte[]) null);

    @ObfuscatedName("fa.b")
    public int field2832;

    @ObfuscatedName("fa.p")
    public int[] field2838;

    @ObfuscatedName("fa.e")
    public int[] field2834;

    @ObfuscatedName("fa.i")
    public int[] field2831;

    @ObfuscatedName("fa.o")
    public int[] field2836;

    @ObfuscatedName("fa.f")
    public int field2837;

    @ObfuscatedName("fa.j")
    public long field2833;

    @ObfuscatedName("fa.x")
    public static final byte[] field2839 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3152(arg0);
    }

    @ObfuscatedName("fa.t([B)V")
    public void method3152(byte[] arg0) {
        this.field2840.field1869 = arg0;
        this.field2840.field1867 = 10;
        int var2 = this.field2840.method2255();
        this.field2832 = this.field2840.method2255();
        this.field2837 = 500000;
        this.field2838 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2840.method2177();
            int var5 = this.field2840.method2177();
            if (var4 == 1297379947) {
                this.field2838[var3] = this.field2840.field1867;
                var3++;
            }
            this.field2840.field1867 += var5;
        }
        this.field2833 = 0L;
        this.field2834 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2834[var6] = this.field2838[var6];
        }
        this.field2831 = new int[var2];
        this.field2836 = new int[var2];
    }

    @ObfuscatedName("fa.b()V")
    public void method3169() {
        this.field2840.field1869 = null;
        this.field2838 = null;
        this.field2834 = null;
        this.field2831 = null;
        this.field2836 = null;
    }

    @ObfuscatedName("fa.p()Z")
    public boolean method3145() {
        return this.field2840.field1869 != null;
    }

    @ObfuscatedName("fa.e()I")
    public int method3146() {
        return this.field2834.length;
    }

    @ObfuscatedName("fa.i(I)V")
    public void method3161(int arg0) {
        this.field2840.field1867 = this.field2834[arg0];
    }

    @ObfuscatedName("fa.o(I)V")
    public void method3148(int arg0) {
        this.field2834[arg0] = this.field2840.field1867;
    }

    @ObfuscatedName("fa.f()V")
    public void method3174() {
        this.field2840.field1867 = -1;
    }

    @ObfuscatedName("fa.d(I)V")
    public void method3178(int arg0) {
        int var2 = this.field2840.method2187();
        this.field2831[arg0] += var2;
    }

    @ObfuscatedName("fa.j(I)I")
    public int method3151(int arg0) {
        return this.method3149(arg0);
    }

    @ObfuscatedName("fa.x(I)I")
    public int method3149(int arg0) {
        byte var2 = this.field2840.field1869[this.field2840.field1867];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2836[arg0] = var3;
            this.field2840.field1867++;
        } else {
            var3 = this.field2836[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3153(arg0, var3);
        }
        int var4 = this.field2840.method2187();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2840.field1869[this.field2840.field1867] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2840.field1867++;
                this.field2836[arg0] = var5;
                return this.method3153(arg0, var5);
            }
        }
        this.field2840.field1867 += var4;
        return 0;
    }

    @ObfuscatedName("fa.v(II)I")
    public int method3153(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2839[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2840.method2172() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2840.method2172() << 16;
            }
            return var8;
        }
        int var3 = this.field2840.method2172();
        int var4 = this.field2840.method2187();
        if (var3 == 47) {
            this.field2840.field1867 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2840.method2307();
            var4 -= 3;
            int var6 = this.field2831[arg0];
            this.field2833 += (long) (this.field2837 - var5) * (long) var6;
            this.field2837 = var5;
            this.field2840.field1867 += var4;
            return 2;
        } else {
            this.field2840.field1867 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fa.a(I)J")
    public long method3154(int arg0) {
        return (long) this.field2837 * (long) arg0 + this.field2833;
    }

    @ObfuscatedName("fa.l()I")
    public int method3155() {
        int var1 = this.field2834.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2834[var4] >= 0 && this.field2831[var4] < var3) {
                var2 = var4;
                var3 = this.field2831[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fa.h()Z")
    public boolean method3156() {
        int var1 = this.field2834.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2834[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.c(J)V")
    public void method3157(long arg0) {
        this.field2833 = arg0;
        int var3 = this.field2834.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2831[var4] = 0;
            this.field2836[var4] = 0;
            this.field2840.field1867 = this.field2838[var4];
            this.method3178(var4);
            this.field2834[var4] = this.field2840.field1867;
        }
    }
}
