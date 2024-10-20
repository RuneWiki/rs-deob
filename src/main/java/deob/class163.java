package deob;

@ObfuscatedName("fk")
public class class163 {

    @ObfuscatedName("fk.c")
    public class108 field2716 = new class108((byte[]) null);

    @ObfuscatedName("fk.j")
    public int field2710;

    @ObfuscatedName("fk.y")
    public int[] field2712;

    @ObfuscatedName("fk.r")
    public int[] field2713;

    @ObfuscatedName("fk.f")
    public int[] field2723;

    @ObfuscatedName("fk.l")
    public int[] field2718;

    @ObfuscatedName("fk.b")
    public int field2715;

    @ObfuscatedName("fk.g")
    public long field2720;

    @ObfuscatedName("fk.v")
    public static final byte[] field2719 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class163() {
    }

    public class163(byte[] arg0) {
        this.method2993(arg0);
    }

    @ObfuscatedName("fk.c([B)V")
    public void method2993(byte[] arg0) {
        this.field2716.field1830 = arg0;
        this.field2716.field1826 = 10;
        int var2 = this.field2716.method2136();
        this.field2710 = this.field2716.method2136();
        this.field2715 = 500000;
        this.field2712 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2716.method2144();
            int var5 = this.field2716.method2144();
            if (var4 == 1297379947) {
                this.field2712[var3] = this.field2716.field1826;
                var3++;
            }
            this.field2716.field1826 += var5;
        }
        this.field2720 = 0L;
        this.field2713 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2713[var6] = this.field2712[var6];
        }
        this.field2723 = new int[var2];
        this.field2718 = new int[var2];
    }

    @ObfuscatedName("fk.j()V")
    public void method2994() {
        this.field2716.field1830 = null;
        this.field2712 = null;
        this.field2713 = null;
        this.field2723 = null;
        this.field2718 = null;
    }

    @ObfuscatedName("fk.y()Z")
    public boolean method2995() {
        return this.field2716.field1830 != null;
    }

    @ObfuscatedName("fk.r()I")
    public int method2997() {
        return this.field2713.length;
    }

    @ObfuscatedName("fk.f(I)V")
    public void method3042(int arg0) {
        this.field2716.field1826 = this.field2713[arg0];
    }

    @ObfuscatedName("fk.l(I)V")
    public void method2998(int arg0) {
        this.field2713[arg0] = this.field2716.field1826;
    }

    @ObfuscatedName("fk.b()V")
    public void method2999() {
        this.field2716.field1826 = -1;
    }

    @ObfuscatedName("fk.k(I)V")
    public void method3000(int arg0) {
        int var2 = this.field2716.method2182();
        this.field2723[arg0] += var2;
    }

    @ObfuscatedName("fk.g(I)I")
    public int method3001(int arg0) {
        return this.method3002(arg0);
    }

    @ObfuscatedName("fk.v(I)I")
    public int method3002(int arg0) {
        byte var2 = this.field2716.field1830[this.field2716.field1826];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2718[arg0] = var3;
            this.field2716.field1826++;
        } else {
            var3 = this.field2718[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3003(arg0, var3);
        }
        int var4 = this.field2716.method2182();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2716.field1830[this.field2716.field1826] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2716.field1826++;
                this.field2718[arg0] = var5;
                return this.method3003(arg0, var5);
            }
        }
        this.field2716.field1826 += var4;
        return 0;
    }

    @ObfuscatedName("fk.i(II)I")
    public int method3003(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2719[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2716.method2134() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2716.method2134() << 16;
            }
            return var8;
        }
        int var3 = this.field2716.method2134();
        int var4 = this.field2716.method2182();
        if (var3 == 47) {
            this.field2716.field1826 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2716.method2138();
            var4 -= 3;
            int var6 = this.field2723[arg0];
            this.field2720 += (long) (this.field2715 - var5) * (long) var6;
            this.field2715 = var5;
            this.field2716.field1826 += var4;
            return 2;
        } else {
            this.field2716.field1826 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fk.x(I)J")
    public long method3004(int arg0) {
        return (long) this.field2715 * (long) arg0 + this.field2720;
    }

    @ObfuscatedName("fk.h()I")
    public int method3006() {
        int var1 = this.field2713.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2713[var4] >= 0 && this.field2723[var4] < var3) {
                var2 = var4;
                var3 = this.field2723[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fk.w()Z")
    public boolean method3030() {
        int var1 = this.field2713.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2713[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fk.s(J)V")
    public void method3039(long arg0) {
        this.field2720 = arg0;
        int var3 = this.field2713.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2723[var4] = 0;
            this.field2718[var4] = 0;
            this.field2716.field1826 = this.field2712[var4];
            this.method3000(var4);
            this.field2713[var4] = this.field2716.field1826;
        }
    }
}
