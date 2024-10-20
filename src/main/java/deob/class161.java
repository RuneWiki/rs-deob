package deob;

@ObfuscatedName("fo")
public class class161 {

    @ObfuscatedName("fo.k")
    public class107 field2710 = new class107((byte[]) null);

    @ObfuscatedName("fo.y")
    public int field2705;

    @ObfuscatedName("fo.s")
    public int[] field2706;

    @ObfuscatedName("fo.g")
    public int[] field2713;

    @ObfuscatedName("fo.h")
    public int[] field2708;

    @ObfuscatedName("fo.l")
    public int[] field2709;

    @ObfuscatedName("fo.e")
    public int field2714;

    @ObfuscatedName("fo.j")
    public long field2715;

    @ObfuscatedName("fo.c")
    public static final byte[] field2712 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class161() {
    }

    public class161(byte[] arg0) {
        this.method3009(arg0);
    }

    @ObfuscatedName("fo.k([B)V")
    public void method3009(byte[] arg0) {
        this.field2710.field1844 = arg0;
        this.field2710.field1838 = 10;
        int var2 = this.field2710.method2239();
        this.field2705 = this.field2710.method2239();
        this.field2714 = 500000;
        this.field2706 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2710.method2143();
            int var5 = this.field2710.method2143();
            if (var4 == 1297379947) {
                this.field2706[var3] = this.field2710.field1838;
                var3++;
            }
            this.field2710.field1838 += var5;
        }
        this.field2715 = 0L;
        this.field2713 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2713[var6] = this.field2706[var6];
        }
        this.field2708 = new int[var2];
        this.field2709 = new int[var2];
    }

    @ObfuscatedName("fo.y()V")
    public void method3010() {
        this.field2710.field1844 = null;
        this.field2706 = null;
        this.field2713 = null;
        this.field2708 = null;
        this.field2709 = null;
    }

    @ObfuscatedName("fo.s()Z")
    public boolean method3025() {
        return this.field2710.field1844 != null;
    }

    @ObfuscatedName("fo.g()I")
    public int method3012() {
        return this.field2713.length;
    }

    @ObfuscatedName("fo.h(I)V")
    public void method3013(int arg0) {
        this.field2710.field1838 = this.field2713[arg0];
    }

    @ObfuscatedName("fo.l(I)V")
    public void method3014(int arg0) {
        this.field2713[arg0] = this.field2710.field1838;
    }

    @ObfuscatedName("fo.e()V")
    public void method3015() {
        this.field2710.field1838 = -1;
    }

    @ObfuscatedName("fo.u(I)V")
    public void method3016(int arg0) {
        int var2 = this.field2710.method2153();
        this.field2708[arg0] += var2;
    }

    @ObfuscatedName("fo.j(I)I")
    public int method3017(int arg0) {
        return this.method3018(arg0);
    }

    @ObfuscatedName("fo.c(I)I")
    public int method3018(int arg0) {
        byte var2 = this.field2710.field1844[this.field2710.field1838];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2709[arg0] = var3;
            this.field2710.field1838++;
        } else {
            var3 = this.field2709[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3019(arg0, var3);
        }
        int var4 = this.field2710.method2153();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2710.field1844[this.field2710.field1838] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2710.field1838++;
                this.field2709[arg0] = var5;
                return this.method3019(arg0, var5);
            }
        }
        this.field2710.field1838 += var4;
        return 0;
    }

    @ObfuscatedName("fo.d(II)I")
    public int method3019(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2712[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2710.method2138() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2710.method2138() << 16;
            }
            return var8;
        }
        int var3 = this.field2710.method2138();
        int var4 = this.field2710.method2153();
        if (var3 == 47) {
            this.field2710.field1838 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2710.method2142();
            var4 -= 3;
            int var6 = this.field2708[arg0];
            this.field2715 += (long) (this.field2714 - var5) * (long) var6;
            this.field2714 = var5;
            this.field2710.field1838 += var4;
            return 2;
        } else {
            this.field2710.field1838 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fo.v(I)J")
    public long method3020(int arg0) {
        return (long) this.field2714 * (long) arg0 + this.field2715;
    }

    @ObfuscatedName("fo.n()I")
    public int method3021() {
        int var1 = this.field2713.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2713[var4] >= 0 && this.field2708[var4] < var3) {
                var2 = var4;
                var3 = this.field2708[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fo.z()Z")
    public boolean method3056() {
        int var1 = this.field2713.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2713[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fo.a(J)V")
    public void method3023(long arg0) {
        this.field2715 = arg0;
        int var3 = this.field2713.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2708[var4] = 0;
            this.field2709[var4] = 0;
            this.field2710.field1838 = this.field2706[var4];
            this.method3016(var4);
            this.field2713[var4] = this.field2710.field1838;
        }
    }
}
