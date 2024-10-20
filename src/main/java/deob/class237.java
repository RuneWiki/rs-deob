package deob;

@ObfuscatedName("ic")
public class class237 {

    @ObfuscatedName("ic.s")
    public class385 field2866 = new class385((byte[]) null);

    @ObfuscatedName("ic.t")
    public int field2854;

    @ObfuscatedName("ic.v")
    public int[] field2855;

    @ObfuscatedName("ic.j")
    public int[] field2856;

    @ObfuscatedName("ic.l")
    public int[] field2857;

    @ObfuscatedName("ic.n")
    public int[] field2858;

    @ObfuscatedName("ic.w")
    public int field2853;

    @ObfuscatedName("ic.o")
    public long field2862;

    @ObfuscatedName("ic.x")
    public static final byte[] field2859 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class237() {
    }

    public class237(byte[] arg0) {
        this.method4096(arg0);
    }

    @ObfuscatedName("ic.s([B)V")
    public void method4096(byte[] arg0) {
        this.field2866.field4184 = arg0;
        this.field2866.field4182 = 10;
        int var2 = this.field2866.method6053();
        this.field2854 = this.field2866.method6053();
        this.field2853 = 500000;
        this.field2855 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2866.method6182();
            int var5 = this.field2866.method6182();
            if (var4 == 1297379947) {
                this.field2855[var3] = this.field2866.field4182;
                var3++;
            }
            this.field2866.field4182 += var5;
        }
        this.field2862 = 0L;
        this.field2856 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2856[var6] = this.field2855[var6];
        }
        this.field2857 = new int[var2];
        this.field2858 = new int[var2];
    }

    @ObfuscatedName("ic.t()V")
    public void method4097() {
        this.field2866.field4184 = null;
        this.field2855 = null;
        this.field2856 = null;
        this.field2857 = null;
        this.field2858 = null;
    }

    @ObfuscatedName("ic.v()Z")
    public boolean method4146() {
        return this.field2866.field4184 != null;
    }

    @ObfuscatedName("ic.j()I")
    public int method4099() {
        return this.field2856.length;
    }

    @ObfuscatedName("ic.l(I)V")
    public void method4108(int arg0) {
        this.field2866.field4182 = this.field2856[arg0];
    }

    @ObfuscatedName("ic.n(I)V")
    public void method4101(int arg0) {
        this.field2856[arg0] = this.field2866.field4182;
    }

    @ObfuscatedName("ic.w()V")
    public void method4121() {
        this.field2866.field4182 = -1;
    }

    @ObfuscatedName("ic.f(I)V")
    public void method4103(int arg0) {
        int var2 = this.field2866.method5976();
        this.field2857[arg0] += var2;
    }

    @ObfuscatedName("ic.o(I)I")
    public int method4104(int arg0) {
        return this.method4102(arg0);
    }

    @ObfuscatedName("ic.x(I)I")
    public int method4102(int arg0) {
        byte var2 = this.field2866.field4184[this.field2866.field4182];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2858[arg0] = var3;
            this.field2866.field4182++;
        } else {
            var3 = this.field2858[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4106(arg0, var3);
        }
        int var4 = this.field2866.method5976();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2866.field4184[this.field2866.field4182] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2866.field4182++;
                this.field2858[arg0] = var5;
                return this.method4106(arg0, var5);
            }
        }
        this.field2866.field4182 += var4;
        return 0;
    }

    @ObfuscatedName("ic.r(II)I")
    public int method4106(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2859[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2866.method5958() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2866.method5958() << 16;
            }
            return var8;
        }
        int var3 = this.field2866.method5958();
        int var4 = this.field2866.method5976();
        if (var3 == 47) {
            this.field2866.field4182 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2866.method5962();
            var4 -= 3;
            int var6 = this.field2857[arg0];
            this.field2862 += (long) (this.field2853 - var5) * (long) var6;
            this.field2853 = var5;
            this.field2866.field4182 += var4;
            return 2;
        } else {
            this.field2866.field4182 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ic.p(I)J")
    public long method4105(int arg0) {
        return (long) this.field2853 * (long) arg0 + this.field2862;
    }

    @ObfuscatedName("ic.h()I")
    public int method4118() {
        int var1 = this.field2856.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2856[var4] >= 0 && this.field2857[var4] < var3) {
                var2 = var4;
                var3 = this.field2857[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ic.k()Z")
    public boolean method4145() {
        int var1 = this.field2856.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2856[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ic.a(J)V")
    public void method4110(long arg0) {
        this.field2862 = arg0;
        int var3 = this.field2856.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2857[var4] = 0;
            this.field2858[var4] = 0;
            this.field2866.field4182 = this.field2855[var4];
            this.method4103(var4);
            this.field2856[var4] = this.field2866.field4182;
        }
    }
}
