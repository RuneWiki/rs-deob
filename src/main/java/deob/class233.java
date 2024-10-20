package deob;

@ObfuscatedName("hz")
public class class233 {

    @ObfuscatedName("hz.d")
    public class195 field2749 = new class195((byte[]) null);

    @ObfuscatedName("hz.z")
    public int field2746;

    @ObfuscatedName("hz.n")
    public int[] field2748;

    @ObfuscatedName("hz.r")
    public int[] field2752;

    @ObfuscatedName("hz.e")
    public int[] field2750;

    @ObfuscatedName("hz.y")
    public int[] field2751;

    @ObfuscatedName("hz.k")
    public int field2753;

    @ObfuscatedName("hz.p")
    public long field2754;

    @ObfuscatedName("hz.x")
    public static final byte[] field2755 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class233() {
    }

    public class233(byte[] arg0) {
        this.method4008(arg0);
    }

    @ObfuscatedName("hz.d([B)V")
    public void method4008(byte[] arg0) {
        this.field2749.field2569 = arg0;
        this.field2749.field2568 = 10;
        int var2 = this.field2749.method3269();
        this.field2746 = this.field2749.method3269();
        this.field2753 = 500000;
        this.field2748 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2749.method3264();
            int var5 = this.field2749.method3264();
            if (var4 == 1297379947) {
                this.field2748[var3] = this.field2749.field2568;
                var3++;
            }
            this.field2749.field2568 += var5;
        }
        this.field2754 = 0L;
        this.field2752 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2752[var6] = this.field2748[var6];
        }
        this.field2750 = new int[var2];
        this.field2751 = new int[var2];
    }

    @ObfuscatedName("hz.z()V")
    public void method4009() {
        this.field2749.field2569 = null;
        this.field2748 = null;
        this.field2752 = null;
        this.field2750 = null;
        this.field2751 = null;
    }

    @ObfuscatedName("hz.n()Z")
    public boolean method4010() {
        return this.field2749.field2569 != null;
    }

    @ObfuscatedName("hz.r()I")
    public int method4011() {
        return this.field2752.length;
    }

    @ObfuscatedName("hz.e(I)V")
    public void method4012(int arg0) {
        this.field2749.field2568 = this.field2752[arg0];
    }

    @ObfuscatedName("hz.y(I)V")
    public void method4013(int arg0) {
        this.field2752[arg0] = this.field2749.field2568;
    }

    @ObfuscatedName("hz.k()V")
    public void method4014() {
        this.field2749.field2568 = -1;
    }

    @ObfuscatedName("hz.s(I)V")
    public void method4033(int arg0) {
        int var2 = this.field2749.method3276();
        this.field2750[arg0] += var2;
    }

    @ObfuscatedName("hz.x(I)I")
    public int method4016(int arg0) {
        return this.method4017(arg0);
    }

    @ObfuscatedName("hz.h(I)I")
    public int method4017(int arg0) {
        byte var2 = this.field2749.field2569[this.field2749.field2568];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2751[arg0] = var3;
            this.field2749.field2568++;
        } else {
            var3 = this.field2751[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4056(arg0, var3);
        }
        int var4 = this.field2749.method3276();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2749.field2569[this.field2749.field2568] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2749.field2568++;
                this.field2751[arg0] = var5;
                return this.method4056(arg0, var5);
            }
        }
        this.field2749.field2568 += var4;
        return 0;
    }

    @ObfuscatedName("hz.t(II)I")
    public int method4056(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2755[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2749.method3330() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2749.method3330() << 16;
            }
            return var8;
        }
        int var3 = this.field2749.method3330();
        int var4 = this.field2749.method3276();
        if (var3 == 47) {
            this.field2749.field2568 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2749.method3263();
            var4 -= 3;
            int var6 = this.field2750[arg0];
            this.field2754 += (long) (this.field2753 - var5) * (long) var6;
            this.field2753 = var5;
            this.field2749.field2568 += var4;
            return 2;
        } else {
            this.field2749.field2568 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hz.i(I)J")
    public long method4019(int arg0) {
        return (long) this.field2753 * (long) arg0 + this.field2754;
    }

    @ObfuscatedName("hz.u()I")
    public int method4020() {
        int var1 = this.field2752.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2752[var4] >= 0 && this.field2750[var4] < var3) {
                var2 = var4;
                var3 = this.field2750[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hz.q()Z")
    public boolean method4021() {
        int var1 = this.field2752.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2752[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hz.v(J)V")
    public void method4037(long arg0) {
        this.field2754 = arg0;
        int var3 = this.field2752.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2750[var4] = 0;
            this.field2751[var4] = 0;
            this.field2749.field2568 = this.field2748[var4];
            this.method4033(var4);
            this.field2752[var4] = this.field2749.field2568;
        }
    }
}
