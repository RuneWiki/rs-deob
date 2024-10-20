package deob;

@ObfuscatedName("fn")
public class class161 {

    @ObfuscatedName("fn.p")
    public class107 field2717 = new class107((byte[]) null);

    @ObfuscatedName("fn.g")
    public int field2716;

    @ObfuscatedName("fn.x")
    public int[] field2704;

    @ObfuscatedName("fn.c")
    public int[] field2707;

    @ObfuscatedName("fn.n")
    public int[] field2708;

    @ObfuscatedName("fn.s")
    public int[] field2709;

    @ObfuscatedName("fn.r")
    public int field2705;

    @ObfuscatedName("fn.u")
    public long field2712;

    @ObfuscatedName("fn.d")
    public static final byte[] field2713 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class161() {
    }

    public class161(byte[] arg0) {
        this.method3028(arg0);
    }

    @ObfuscatedName("fn.p([B)V")
    public void method3028(byte[] arg0) {
        this.field2717.field1838 = arg0;
        this.field2717.field1837 = 10;
        int var2 = this.field2717.method2175();
        this.field2716 = this.field2717.method2175();
        this.field2705 = 500000;
        this.field2704 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2717.method2305();
            int var5 = this.field2717.method2305();
            if (var4 == 1297379947) {
                this.field2704[var3] = this.field2717.field1837;
                var3++;
            }
            this.field2717.field1837 += var5;
        }
        this.field2712 = 0L;
        this.field2707 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2707[var6] = this.field2704[var6];
        }
        this.field2708 = new int[var2];
        this.field2709 = new int[var2];
    }

    @ObfuscatedName("fn.g()V")
    public void method3074() {
        this.field2717.field1838 = null;
        this.field2704 = null;
        this.field2707 = null;
        this.field2708 = null;
        this.field2709 = null;
    }

    @ObfuscatedName("fn.x()Z")
    public boolean method3081() {
        return this.field2717.field1838 != null;
    }

    @ObfuscatedName("fn.c()I")
    public int method3031() {
        return this.field2707.length;
    }

    @ObfuscatedName("fn.n(I)V")
    public void method3047(int arg0) {
        this.field2717.field1837 = this.field2707[arg0];
    }

    @ObfuscatedName("fn.s(I)V")
    public void method3033(int arg0) {
        this.field2707[arg0] = this.field2717.field1837;
    }

    @ObfuscatedName("fn.r()V")
    public void method3034() {
        this.field2717.field1837 = -1;
    }

    @ObfuscatedName("fn.w(I)V")
    public void method3035(int arg0) {
        int var2 = this.field2717.method2188();
        this.field2708[arg0] += var2;
    }

    @ObfuscatedName("fn.u(I)I")
    public int method3036(int arg0) {
        return this.method3037(arg0);
    }

    @ObfuscatedName("fn.d(I)I")
    public int method3037(int arg0) {
        byte var2 = this.field2717.field1838[this.field2717.field1837];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2709[arg0] = var3;
            this.field2717.field1837++;
        } else {
            var3 = this.field2709[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3038(arg0, var3);
        }
        int var4 = this.field2717.method2188();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2717.field1838[this.field2717.field1837] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2717.field1837++;
                this.field2709[arg0] = var5;
                return this.method3038(arg0, var5);
            }
        }
        this.field2717.field1837 += var4;
        return 0;
    }

    @ObfuscatedName("fn.h(II)I")
    public int method3038(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2713[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2717.method2173() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2717.method2173() << 16;
            }
            return var8;
        }
        int var3 = this.field2717.method2173();
        int var4 = this.field2717.method2188();
        if (var3 == 47) {
            this.field2717.field1837 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2717.method2329();
            var4 -= 3;
            int var6 = this.field2708[arg0];
            this.field2712 += (long) (this.field2705 - var5) * (long) var6;
            this.field2705 = var5;
            this.field2717.field1837 += var4;
            return 2;
        } else {
            this.field2717.field1837 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fn.a(I)J")
    public long method3039(int arg0) {
        return (long) this.field2705 * (long) arg0 + this.field2712;
    }

    @ObfuscatedName("fn.y()I")
    public int method3040() {
        int var1 = this.field2707.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2707[var4] >= 0 && this.field2708[var4] < var3) {
                var2 = var4;
                var3 = this.field2708[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fn.v()Z")
    public boolean method3030() {
        int var1 = this.field2707.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2707[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fn.e(J)V")
    public void method3067(long arg0) {
        this.field2712 = arg0;
        int var3 = this.field2707.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2708[var4] = 0;
            this.field2709[var4] = 0;
            this.field2717.field1837 = this.field2704[var4];
            this.method3035(var4);
            this.field2707[var4] = this.field2717.field1837;
        }
    }
}
