package deob;

@ObfuscatedName("ff")
public class class161 {

    @ObfuscatedName("ff.g")
    public class107 field2726 = new class107((byte[]) null);

    @ObfuscatedName("ff.s")
    public int field2717;

    @ObfuscatedName("ff.v")
    public int[] field2721;

    @ObfuscatedName("ff.o")
    public int[] field2718;

    @ObfuscatedName("ff.k")
    public int[] field2719;

    @ObfuscatedName("ff.m")
    public int[] field2715;

    @ObfuscatedName("ff.i")
    public int field2728;

    @ObfuscatedName("ff.l")
    public long field2723;

    @ObfuscatedName("ff.p")
    public static final byte[] field2720 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class161() {
    }

    public class161(byte[] arg0) {
        this.method2954(arg0);
    }

    @ObfuscatedName("ff.g([B)V")
    public void method2954(byte[] arg0) {
        this.field2726.field1854 = arg0;
        this.field2726.field1851 = 10;
        int var2 = this.field2726.method2094();
        this.field2717 = this.field2726.method2094();
        this.field2728 = 500000;
        this.field2721 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2726.method2097();
            int var5 = this.field2726.method2097();
            if (var4 == 1297379947) {
                this.field2721[var3] = this.field2726.field1851;
                var3++;
            }
            this.field2726.field1851 += var5;
        }
        this.field2723 = 0L;
        this.field2718 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2718[var6] = this.field2721[var6];
        }
        this.field2719 = new int[var2];
        this.field2715 = new int[var2];
    }

    @ObfuscatedName("ff.s()V")
    public void method2911() {
        this.field2726.field1854 = null;
        this.field2721 = null;
        this.field2718 = null;
        this.field2719 = null;
        this.field2715 = null;
    }

    @ObfuscatedName("ff.v()Z")
    public boolean method2912() {
        return this.field2726.field1854 != null;
    }

    @ObfuscatedName("ff.o()I")
    public int method2913() {
        return this.field2718.length;
    }

    @ObfuscatedName("ff.k(I)V")
    public void method2914(int arg0) {
        this.field2726.field1851 = this.field2718[arg0];
    }

    @ObfuscatedName("ff.m(I)V")
    public void method2915(int arg0) {
        this.field2718[arg0] = this.field2726.field1851;
    }

    @ObfuscatedName("ff.i()V")
    public void method2939() {
        this.field2726.field1851 = -1;
    }

    @ObfuscatedName("ff.t(I)V")
    public void method2917(int arg0) {
        int var2 = this.field2726.method2107();
        this.field2719[arg0] += var2;
    }

    @ObfuscatedName("ff.l(I)I")
    public int method2918(int arg0) {
        return this.method2919(arg0);
    }

    @ObfuscatedName("ff.p(I)I")
    public int method2919(int arg0) {
        byte var2 = this.field2726.field1854[this.field2726.field1851];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2715[arg0] = var3;
            this.field2726.field1851++;
        } else {
            var3 = this.field2715[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2959(arg0, var3);
        }
        int var4 = this.field2726.method2107();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2726.field1854[this.field2726.field1851] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2726.field1851++;
                this.field2715[arg0] = var5;
                return this.method2959(arg0, var5);
            }
        }
        this.field2726.field1851 += var4;
        return 0;
    }

    @ObfuscatedName("ff.r(II)I")
    public int method2959(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2720[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2726.method2116() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2726.method2116() << 16;
            }
            return var8;
        }
        int var3 = this.field2726.method2116();
        int var4 = this.field2726.method2107();
        if (var3 == 47) {
            this.field2726.field1851 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2726.method2096();
            var4 -= 3;
            int var6 = this.field2719[arg0];
            this.field2723 += (long) (this.field2728 - var5) * (long) var6;
            this.field2728 = var5;
            this.field2726.field1851 += var4;
            return 2;
        } else {
            this.field2726.field1851 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ff.j(I)J")
    public long method2921(int arg0) {
        return (long) this.field2728 * (long) arg0 + this.field2723;
    }

    @ObfuscatedName("ff.c()I")
    public int method2922() {
        int var1 = this.field2718.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2718[var4] >= 0 && this.field2719[var4] < var3) {
                var2 = var4;
                var3 = this.field2719[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ff.q()Z")
    public boolean method2923() {
        int var1 = this.field2718.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2718[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ff.n(J)V")
    public void method2924(long arg0) {
        this.field2723 = arg0;
        int var3 = this.field2718.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2719[var4] = 0;
            this.field2715[var4] = 0;
            this.field2726.field1851 = this.field2721[var4];
            this.method2917(var4);
            this.field2718[var4] = this.field2726.field1851;
        }
    }
}
