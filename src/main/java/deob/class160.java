package deob;

@ObfuscatedName("fo")
public class class160 {

    @ObfuscatedName("fo.t")
    public class107 field2690 = new class107((byte[]) null);

    @ObfuscatedName("fo.s")
    public int field2694;

    @ObfuscatedName("fo.f")
    public int[] field2701;

    @ObfuscatedName("fo.e")
    public int[] field2693;

    @ObfuscatedName("fo.d")
    public int[] field2697;

    @ObfuscatedName("fo.n")
    public int[] field2695;

    @ObfuscatedName("fo.v")
    public int field2696;

    @ObfuscatedName("fo.j")
    public long field2698;

    @ObfuscatedName("fo.u")
    public static final byte[] field2699 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2973(arg0);
    }

    @ObfuscatedName("fo.t([B)V")
    public void method2973(byte[] arg0) {
        this.field2690.field1831 = arg0;
        this.field2690.field1830 = 10;
        int var2 = this.field2690.method2103();
        this.field2694 = this.field2690.method2103();
        this.field2696 = 500000;
        this.field2701 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2690.method2106();
            int var5 = this.field2690.method2106();
            if (var4 == 1297379947) {
                this.field2701[var3] = this.field2690.field1830;
                var3++;
            }
            this.field2690.field1830 += var5;
        }
        this.field2698 = 0L;
        this.field2693 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2693[var6] = this.field2701[var6];
        }
        this.field2697 = new int[var2];
        this.field2695 = new int[var2];
    }

    @ObfuscatedName("fo.s()V")
    public void method2994() {
        this.field2690.field1831 = null;
        this.field2701 = null;
        this.field2693 = null;
        this.field2697 = null;
        this.field2695 = null;
    }

    @ObfuscatedName("fo.f()Z")
    public boolean method2974() {
        return this.field2690.field1831 != null;
    }

    @ObfuscatedName("fo.e()I")
    public int method2997() {
        return this.field2693.length;
    }

    @ObfuscatedName("fo.d(I)V")
    public void method2976(int arg0) {
        this.field2690.field1830 = this.field2693[arg0];
    }

    @ObfuscatedName("fo.n(I)V")
    public void method2977(int arg0) {
        this.field2693[arg0] = this.field2690.field1830;
    }

    @ObfuscatedName("fo.v()V")
    public void method2978() {
        this.field2690.field1830 = -1;
    }

    @ObfuscatedName("fo.z(I)V")
    public void method2979(int arg0) {
        int var2 = this.field2690.method2116();
        this.field2697[arg0] += var2;
    }

    @ObfuscatedName("fo.j(I)I")
    public int method2980(int arg0) {
        return this.method2981(arg0);
    }

    @ObfuscatedName("fo.u(I)I")
    public int method2981(int arg0) {
        byte var2 = this.field2690.field1831[this.field2690.field1830];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2695[arg0] = var3;
            this.field2690.field1830++;
        } else {
            var3 = this.field2695[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2982(arg0, var3);
        }
        int var4 = this.field2690.method2116();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2690.field1831[this.field2690.field1830] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2690.field1830++;
                this.field2695[arg0] = var5;
                return this.method2982(arg0, var5);
            }
        }
        this.field2690.field1830 += var4;
        return 0;
    }

    @ObfuscatedName("fo.g(II)I")
    public int method2982(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2699[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2690.method2101() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2690.method2101() << 16;
            }
            return var8;
        }
        int var3 = this.field2690.method2101();
        int var4 = this.field2690.method2116();
        if (var3 == 47) {
            this.field2690.field1830 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2690.method2304();
            var4 -= 3;
            int var6 = this.field2697[arg0];
            this.field2698 += (long) (this.field2696 - var5) * (long) var6;
            this.field2696 = var5;
            this.field2690.field1830 += var4;
            return 2;
        } else {
            this.field2690.field1830 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fo.a(I)J")
    public long method3010(int arg0) {
        return (long) this.field2696 * (long) arg0 + this.field2698;
    }

    @ObfuscatedName("fo.c()I")
    public int method3009() {
        int var1 = this.field2693.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2693[var4] >= 0 && this.field2697[var4] < var3) {
                var2 = var4;
                var3 = this.field2697[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fo.w()Z")
    public boolean method2985() {
        int var1 = this.field2693.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2693[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fo.l(J)V")
    public void method3008(long arg0) {
        this.field2698 = arg0;
        int var3 = this.field2693.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2697[var4] = 0;
            this.field2695[var4] = 0;
            this.field2690.field1830 = this.field2701[var4];
            this.method2979(var4);
            this.field2693[var4] = this.field2690.field1830;
        }
    }
}
