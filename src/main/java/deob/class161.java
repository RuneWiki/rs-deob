package deob;

@ObfuscatedName("fi")
public class class161 {

    @ObfuscatedName("fi.g")
    public class107 field2715 = new class107((byte[]) null);

    @ObfuscatedName("fi.i")
    public int field2713;

    @ObfuscatedName("fi.k")
    public int[] field2721;

    @ObfuscatedName("fi.e")
    public int[] field2724;

    @ObfuscatedName("fi.w")
    public int[] field2716;

    @ObfuscatedName("fi.m")
    public int[] field2718;

    @ObfuscatedName("fi.u")
    public int field2725;

    @ObfuscatedName("fi.o")
    public long field2720;

    @ObfuscatedName("fi.h")
    public static final byte[] field2717 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class161() {
    }

    public class161(byte[] arg0) {
        this.method2949(arg0);
    }

    @ObfuscatedName("fi.g([B)V")
    public void method2949(byte[] arg0) {
        this.field2715.field1843 = arg0;
        this.field2715.field1844 = 10;
        int var2 = this.field2715.method2094();
        this.field2713 = this.field2715.method2094();
        this.field2725 = 500000;
        this.field2721 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2715.method2112();
            int var5 = this.field2715.method2112();
            if (var4 == 1297379947) {
                this.field2721[var3] = this.field2715.field1844;
                var3++;
            }
            this.field2715.field1844 += var5;
        }
        this.field2720 = 0L;
        this.field2724 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2724[var6] = this.field2721[var6];
        }
        this.field2716 = new int[var2];
        this.field2718 = new int[var2];
    }

    @ObfuscatedName("fi.i()V")
    public void method2954() {
        this.field2715.field1843 = null;
        this.field2721 = null;
        this.field2724 = null;
        this.field2716 = null;
        this.field2718 = null;
    }

    @ObfuscatedName("fi.k()Z")
    public boolean method2951() {
        return this.field2715.field1843 != null;
    }

    @ObfuscatedName("fi.e()I")
    public int method2997() {
        return this.field2724.length;
    }

    @ObfuscatedName("fi.w(I)V")
    public void method2973(int arg0) {
        this.field2715.field1844 = this.field2724[arg0];
    }

    @ObfuscatedName("fi.m(I)V")
    public void method2991(int arg0) {
        this.field2724[arg0] = this.field2715.field1844;
    }

    @ObfuscatedName("fi.u()V")
    public void method2955() {
        this.field2715.field1844 = -1;
    }

    @ObfuscatedName("fi.j(I)V")
    public void method2956(int arg0) {
        int var2 = this.field2715.method2107();
        this.field2716[arg0] += var2;
    }

    @ObfuscatedName("fi.o(I)I")
    public int method3000(int arg0) {
        return this.method2958(arg0);
    }

    @ObfuscatedName("fi.h(I)I")
    public int method2958(int arg0) {
        byte var2 = this.field2715.field1843[this.field2715.field1844];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2718[arg0] = var3;
            this.field2715.field1844++;
        } else {
            var3 = this.field2718[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2959(arg0, var3);
        }
        int var4 = this.field2715.method2107();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2715.field1843[this.field2715.field1844] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2715.field1844++;
                this.field2718[arg0] = var5;
                return this.method2959(arg0, var5);
            }
        }
        this.field2715.field1844 += var4;
        return 0;
    }

    @ObfuscatedName("fi.b(II)I")
    public int method2959(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2717[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2715.method2092() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2715.method2092() << 16;
            }
            return var8;
        }
        int var3 = this.field2715.method2092();
        int var4 = this.field2715.method2107();
        if (var3 == 47) {
            this.field2715.field1844 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2715.method2096();
            var4 -= 3;
            int var6 = this.field2716[arg0];
            this.field2720 += (long) (this.field2725 - var5) * (long) var6;
            this.field2725 = var5;
            this.field2715.field1844 += var4;
            return 2;
        } else {
            this.field2715.field1844 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fi.r(I)J")
    public long method2960(int arg0) {
        return (long) this.field2725 * (long) arg0 + this.field2720;
    }

    @ObfuscatedName("fi.l()I")
    public int method2961() {
        int var1 = this.field2724.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2724[var4] >= 0 && this.field2716[var4] < var3) {
                var2 = var4;
                var3 = this.field2716[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fi.x()Z")
    public boolean method2962() {
        int var1 = this.field2724.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2724[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fi.q(J)V")
    public void method2963(long arg0) {
        this.field2720 = arg0;
        int var3 = this.field2724.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2716[var4] = 0;
            this.field2718[var4] = 0;
            this.field2715.field1844 = this.field2721[var4];
            this.method2956(var4);
            this.field2724[var4] = this.field2715.field1844;
        }
    }
}
