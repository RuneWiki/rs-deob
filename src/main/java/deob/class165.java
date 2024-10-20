package deob;

@ObfuscatedName("fo")
public class class165 {

    @ObfuscatedName("fo.v")
    public class110 field2726 = new class110((byte[]) null);

    @ObfuscatedName("fo.t")
    public int field2720;

    @ObfuscatedName("fo.f")
    public int[] field2721;

    @ObfuscatedName("fo.j")
    public int[] field2719;

    @ObfuscatedName("fo.l")
    public int[] field2723;

    @ObfuscatedName("fo.g")
    public int[] field2725;

    @ObfuscatedName("fo.k")
    public int field2724;

    @ObfuscatedName("fo.y")
    public long field2727;

    @ObfuscatedName("fo.m")
    public static final byte[] field2728 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class165() {
    }

    public class165(byte[] arg0) {
        this.method3038(arg0);
    }

    @ObfuscatedName("fo.v([B)V")
    public void method3038(byte[] arg0) {
        this.field2726.field1853 = arg0;
        this.field2726.field1847 = 10;
        int var2 = this.field2726.method2194();
        this.field2720 = this.field2726.method2194();
        this.field2724 = 500000;
        this.field2721 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2726.method2297();
            int var5 = this.field2726.method2297();
            if (var4 == 1297379947) {
                this.field2721[var3] = this.field2726.field1847;
                var3++;
            }
            this.field2726.field1847 += var5;
        }
        this.field2727 = 0L;
        this.field2719 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2719[var6] = this.field2721[var6];
        }
        this.field2723 = new int[var2];
        this.field2725 = new int[var2];
    }

    @ObfuscatedName("fo.t()V")
    public void method3039() {
        this.field2726.field1853 = null;
        this.field2721 = null;
        this.field2719 = null;
        this.field2723 = null;
        this.field2725 = null;
    }

    @ObfuscatedName("fo.f()Z")
    public boolean method3046() {
        return this.field2726.field1853 != null;
    }

    @ObfuscatedName("fo.j()I")
    public int method3041() {
        return this.field2719.length;
    }

    @ObfuscatedName("fo.l(I)V")
    public void method3042(int arg0) {
        this.field2726.field1847 = this.field2719[arg0];
    }

    @ObfuscatedName("fo.g(I)V")
    public void method3043(int arg0) {
        this.field2719[arg0] = this.field2726.field1847;
    }

    @ObfuscatedName("fo.k()V")
    public void method3044() {
        this.field2726.field1847 = -1;
    }

    @ObfuscatedName("fo.p(I)V")
    public void method3045(int arg0) {
        int var2 = this.field2726.method2333();
        this.field2723[arg0] += var2;
    }

    @ObfuscatedName("fo.y(I)I")
    public int method3067(int arg0) {
        return this.method3047(arg0);
    }

    @ObfuscatedName("fo.m(I)I")
    public int method3047(int arg0) {
        byte var2 = this.field2726.field1853[this.field2726.field1847];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2725[arg0] = var3;
            this.field2726.field1847++;
        } else {
            var3 = this.field2725[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3048(arg0, var3);
        }
        int var4 = this.field2726.method2333();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2726.field1853[this.field2726.field1847] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2726.field1847++;
                this.field2725[arg0] = var5;
                return this.method3048(arg0, var5);
            }
        }
        this.field2726.field1847 += var4;
        return 0;
    }

    @ObfuscatedName("fo.o(II)I")
    public int method3048(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2728[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2726.method2257() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2726.method2257() << 16;
            }
            return var8;
        }
        int var3 = this.field2726.method2257();
        int var4 = this.field2726.method2333();
        if (var3 == 47) {
            this.field2726.field1847 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2726.method2267();
            var4 -= 3;
            int var6 = this.field2723[arg0];
            this.field2727 += (long) (this.field2724 - var5) * (long) var6;
            this.field2724 = var5;
            this.field2726.field1847 += var4;
            return 2;
        } else {
            this.field2726.field1847 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fo.c(I)J")
    public long method3049(int arg0) {
        return (long) this.field2724 * (long) arg0 + this.field2727;
    }

    @ObfuscatedName("fo.r()I")
    public int method3050() {
        int var1 = this.field2719.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2719[var4] >= 0 && this.field2723[var4] < var3) {
                var2 = var4;
                var3 = this.field2723[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fo.s()Z")
    public boolean method3051() {
        int var1 = this.field2719.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2719[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fo.n(J)V")
    public void method3056(long arg0) {
        this.field2727 = arg0;
        int var3 = this.field2719.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2723[var4] = 0;
            this.field2725[var4] = 0;
            this.field2726.field1847 = this.field2721[var4];
            this.method3045(var4);
            this.field2719[var4] = this.field2726.field1847;
        }
    }
}
