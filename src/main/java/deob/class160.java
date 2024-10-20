package deob;

@ObfuscatedName("fd")
public class class160 {

    @ObfuscatedName("fd.i")
    public class107 field2696 = new class107((byte[]) null);

    @ObfuscatedName("fd.c")
    public int field2697;

    @ObfuscatedName("fd.h")
    public int[] field2698;

    @ObfuscatedName("fd.v")
    public int[] field2699;

    @ObfuscatedName("fd.q")
    public int[] field2706;

    @ObfuscatedName("fd.s")
    public int[] field2705;

    @ObfuscatedName("fd.g")
    public int field2702;

    @ObfuscatedName("fd.d")
    public long field2704;

    @ObfuscatedName("fd.y")
    public static final byte[] field2701 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method3000(arg0);
    }

    @ObfuscatedName("fd.i([B)V")
    public void method3000(byte[] arg0) {
        this.field2696.field1841 = arg0;
        this.field2696.field1837 = 10;
        int var2 = this.field2696.method2313();
        this.field2697 = this.field2696.method2313();
        this.field2702 = 500000;
        this.field2698 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2696.method2156();
            int var5 = this.field2696.method2156();
            if (var4 == 1297379947) {
                this.field2698[var3] = this.field2696.field1837;
                var3++;
            }
            this.field2696.field1837 += var5;
        }
        this.field2704 = 0L;
        this.field2699 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2699[var6] = this.field2698[var6];
        }
        this.field2706 = new int[var2];
        this.field2705 = new int[var2];
    }

    @ObfuscatedName("fd.c()V")
    public void method3001() {
        this.field2696.field1841 = null;
        this.field2698 = null;
        this.field2699 = null;
        this.field2706 = null;
        this.field2705 = null;
    }

    @ObfuscatedName("fd.h()Z")
    public boolean method3018() {
        return this.field2696.field1841 != null;
    }

    @ObfuscatedName("fd.v()I")
    public int method3020() {
        return this.field2699.length;
    }

    @ObfuscatedName("fd.q(I)V")
    public void method3004(int arg0) {
        this.field2696.field1837 = this.field2699[arg0];
    }

    @ObfuscatedName("fd.s(I)V")
    public void method3005(int arg0) {
        this.field2699[arg0] = this.field2696.field1837;
    }

    @ObfuscatedName("fd.g()V")
    public void method3006() {
        this.field2696.field1837 = -1;
    }

    @ObfuscatedName("fd.u(I)V")
    public void method3022(int arg0) {
        int var2 = this.field2696.method2217();
        this.field2706[arg0] += var2;
    }

    @ObfuscatedName("fd.d(I)I")
    public int method3008(int arg0) {
        return this.method3009(arg0);
    }

    @ObfuscatedName("fd.y(I)I")
    public int method3009(int arg0) {
        byte var2 = this.field2696.field1841[this.field2696.field1837];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2705[arg0] = var3;
            this.field2696.field1837++;
        } else {
            var3 = this.field2705[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3045(arg0, var3);
        }
        int var4 = this.field2696.method2217();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2696.field1841[this.field2696.field1837] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2696.field1837++;
                this.field2705[arg0] = var5;
                return this.method3045(arg0, var5);
            }
        }
        this.field2696.field1837 += var4;
        return 0;
    }

    @ObfuscatedName("fd.e(II)I")
    public int method3045(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2701[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2696.method2151() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2696.method2151() << 16;
            }
            return var8;
        }
        int var3 = this.field2696.method2151();
        int var4 = this.field2696.method2217();
        if (var3 == 47) {
            this.field2696.field1837 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2696.method2336();
            var4 -= 3;
            int var6 = this.field2706[arg0];
            this.field2704 += (long) (this.field2702 - var5) * (long) var6;
            this.field2702 = var5;
            this.field2696.field1837 += var4;
            return 2;
        } else {
            this.field2696.field1837 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fd.l(I)J")
    public long method3043(int arg0) {
        return (long) this.field2702 * (long) arg0 + this.field2704;
    }

    @ObfuscatedName("fd.o()I")
    public int method3011() {
        int var1 = this.field2699.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2699[var4] >= 0 && this.field2706[var4] < var3) {
                var2 = var4;
                var3 = this.field2706[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fd.w()Z")
    public boolean method3041() {
        int var1 = this.field2699.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2699[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.t(J)V")
    public void method3013(long arg0) {
        this.field2704 = arg0;
        int var3 = this.field2699.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2706[var4] = 0;
            this.field2705[var4] = 0;
            this.field2696.field1837 = this.field2698[var4];
            this.method3022(var4);
            this.field2699[var4] = this.field2696.field1837;
        }
    }
}
