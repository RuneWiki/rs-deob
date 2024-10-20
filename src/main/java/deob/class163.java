package deob;

@ObfuscatedName("fa")
public class class163 {

    @ObfuscatedName("fa.d")
    public class130 field2141 = new class130((byte[]) null);

    @ObfuscatedName("fa.c")
    public int field2132;

    @ObfuscatedName("fa.n")
    public int[] field2130;

    @ObfuscatedName("fa.q")
    public int[] field2131;

    @ObfuscatedName("fa.t")
    public int[] field2137;

    @ObfuscatedName("fa.p")
    public int[] field2133;

    @ObfuscatedName("fa.u")
    public int field2128;

    @ObfuscatedName("fa.l")
    public long field2136;

    @ObfuscatedName("fa.v")
    public static final byte[] field2134 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method2874(arg0);
    }

    @ObfuscatedName("fa.d([B)V")
    public void method2874(byte[] arg0) {
        this.field2141.field1955 = arg0;
        this.field2141.field1956 = 10;
        int var2 = this.field2141.method2232();
        this.field2132 = this.field2141.method2232();
        this.field2128 = 500000;
        this.field2130 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2141.method2246();
            int var5 = this.field2141.method2246();
            if (var4 == 1297379947) {
                this.field2130[var3] = this.field2141.field1956;
                var3++;
            }
            this.field2141.field1956 += var5;
        }
        this.field2136 = 0L;
        this.field2131 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2131[var6] = this.field2130[var6];
        }
        this.field2137 = new int[var2];
        this.field2133 = new int[var2];
    }

    @ObfuscatedName("fa.c()V")
    public void method2888() {
        this.field2141.field1955 = null;
        this.field2130 = null;
        this.field2131 = null;
        this.field2137 = null;
        this.field2133 = null;
    }

    @ObfuscatedName("fa.n()Z")
    public boolean method2870() {
        return this.field2141.field1955 != null;
    }

    @ObfuscatedName("fa.q()I")
    public int method2850() {
        return this.field2131.length;
    }

    @ObfuscatedName("fa.t(I)V")
    public void method2852(int arg0) {
        this.field2141.field1956 = this.field2131[arg0];
    }

    @ObfuscatedName("fa.p(I)V")
    public void method2853(int arg0) {
        this.field2131[arg0] = this.field2141.field1956;
    }

    @ObfuscatedName("fa.u()V")
    public void method2854() {
        this.field2141.field1956 = -1;
    }

    @ObfuscatedName("fa.w(I)V")
    public void method2855(int arg0) {
        int var2 = this.field2141.method2441();
        this.field2137[arg0] += var2;
    }

    @ObfuscatedName("fa.r(I)I")
    public int method2856(int arg0) {
        return this.method2857(arg0);
    }

    @ObfuscatedName("fa.s(I)I")
    public int method2857(int arg0) {
        byte var2 = this.field2141.field1955[this.field2141.field1956];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2133[arg0] = var3;
            this.field2141.field1956++;
        } else {
            var3 = this.field2133[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2860(arg0, var3);
        }
        int var4 = this.field2141.method2441();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2141.field1955[this.field2141.field1956] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2141.field1956++;
                this.field2133[arg0] = var5;
                return this.method2860(arg0, var5);
            }
        }
        this.field2141.field1956 += var4;
        return 0;
    }

    @ObfuscatedName("fa.k(II)I")
    public int method2860(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2134[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2141.method2379() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2141.method2379() << 16;
            }
            return var8;
        }
        int var3 = this.field2141.method2379();
        int var4 = this.field2141.method2441();
        if (var3 == 47) {
            this.field2141.field1956 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2141.method2233();
            var4 -= 3;
            int var6 = this.field2137[arg0];
            this.field2136 += (long) (this.field2128 - var5) * (long) var6;
            this.field2128 = var5;
            this.field2141.field1956 += var4;
            return 2;
        } else {
            this.field2141.field1956 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fa.e(I)J")
    public long method2859(int arg0) {
        return (long) this.field2128 * (long) arg0 + this.field2136;
    }

    @ObfuscatedName("fa.j()I")
    public int method2868() {
        int var1 = this.field2131.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2131[var4] >= 0 && this.field2137[var4] < var3) {
                var2 = var4;
                var3 = this.field2137[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fa.i()Z")
    public boolean method2883() {
        int var1 = this.field2131.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2131[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.a(J)V")
    public void method2862(long arg0) {
        this.field2136 = arg0;
        int var3 = this.field2131.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2137[var4] = 0;
            this.field2133[var4] = 0;
            this.field2141.field1956 = this.field2130[var4];
            this.method2855(var4);
            this.field2131[var4] = this.field2141.field1956;
        }
    }
}
