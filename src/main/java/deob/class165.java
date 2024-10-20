package deob;

@ObfuscatedName("fd")
public class class165 {

    @ObfuscatedName("fd.a")
    public class110 field2739 = new class110((byte[]) null);

    @ObfuscatedName("fd.v")
    public int field2732;

    @ObfuscatedName("fd.i")
    public int[] field2733;

    @ObfuscatedName("fd.b")
    public int[] field2731;

    @ObfuscatedName("fd.l")
    public int[] field2735;

    @ObfuscatedName("fd.m")
    public int[] field2736;

    @ObfuscatedName("fd.w")
    public int field2737;

    @ObfuscatedName("fd.n")
    public long field2744;

    @ObfuscatedName("fd.s")
    public static final byte[] field2742 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class165() {
    }

    public class165(byte[] arg0) {
        this.method3006(arg0);
    }

    @ObfuscatedName("fd.a([B)V")
    public void method3006(byte[] arg0) {
        this.field2739.field1865 = arg0;
        this.field2739.field1861 = 10;
        int var2 = this.field2739.method2282();
        this.field2732 = this.field2739.method2282();
        this.field2737 = 500000;
        this.field2733 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2739.method2136();
            int var5 = this.field2739.method2136();
            if (var4 == 1297379947) {
                this.field2733[var3] = this.field2739.field1861;
                var3++;
            }
            this.field2739.field1861 += var5;
        }
        this.field2744 = 0L;
        this.field2731 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2731[var6] = this.field2733[var6];
        }
        this.field2735 = new int[var2];
        this.field2736 = new int[var2];
    }

    @ObfuscatedName("fd.v()V")
    public void method3007() {
        this.field2739.field1865 = null;
        this.field2733 = null;
        this.field2731 = null;
        this.field2735 = null;
        this.field2736 = null;
    }

    @ObfuscatedName("fd.i()Z")
    public boolean method2990() {
        return this.field2739.field1865 != null;
    }

    @ObfuscatedName("fd.b()I")
    public int method3012() {
        return this.field2731.length;
    }

    @ObfuscatedName("fd.l(I)V")
    public void method3024(int arg0) {
        this.field2739.field1861 = this.field2731[arg0];
    }

    @ObfuscatedName("fd.m(I)V")
    public void method2993(int arg0) {
        this.field2731[arg0] = this.field2739.field1861;
    }

    @ObfuscatedName("fd.w()V")
    public void method2994() {
        this.field2739.field1861 = -1;
    }

    @ObfuscatedName("fd.e(I)V")
    public void method2995(int arg0) {
        int var2 = this.field2739.method2146();
        this.field2735[arg0] += var2;
    }

    @ObfuscatedName("fd.n(I)I")
    public int method3004(int arg0) {
        return this.method2997(arg0);
    }

    @ObfuscatedName("fd.s(I)I")
    public int method2997(int arg0) {
        byte var2 = this.field2739.field1865[this.field2739.field1861];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2736[arg0] = var3;
            this.field2739.field1861++;
        } else {
            var3 = this.field2736[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2998(arg0, var3);
        }
        int var4 = this.field2739.method2146();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2739.field1865[this.field2739.field1861] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2739.field1861++;
                this.field2736[arg0] = var5;
                return this.method2998(arg0, var5);
            }
        }
        this.field2739.field1861 += var4;
        return 0;
    }

    @ObfuscatedName("fd.k(II)I")
    public int method2998(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2742[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2739.method2199() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2739.method2199() << 16;
            }
            return var8;
        }
        int var3 = this.field2739.method2199();
        int var4 = this.field2739.method2146();
        if (var3 == 47) {
            this.field2739.field1861 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2739.method2208();
            var4 -= 3;
            int var6 = this.field2735[arg0];
            this.field2744 += (long) (this.field2737 - var5) * (long) var6;
            this.field2737 = var5;
            this.field2739.field1861 += var4;
            return 2;
        } else {
            this.field2739.field1861 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fd.f(I)J")
    public long method2999(int arg0) {
        return (long) this.field2737 * (long) arg0 + this.field2744;
    }

    @ObfuscatedName("fd.d()I")
    public int method3000() {
        int var1 = this.field2731.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2731[var4] >= 0 && this.field2735[var4] < var3) {
                var2 = var4;
                var3 = this.field2735[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fd.x()Z")
    public boolean method2992() {
        int var1 = this.field2731.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2731[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.o(J)V")
    public void method3002(long arg0) {
        this.field2744 = arg0;
        int var3 = this.field2731.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2735[var4] = 0;
            this.field2736[var4] = 0;
            this.field2739.field1861 = this.field2733[var4];
            this.method2995(var4);
            this.field2731[var4] = this.field2739.field1861;
        }
    }
}
