package deob;

@ObfuscatedName("fb")
public class class173 {

    @ObfuscatedName("fb.n")
    public class111 field2845 = new class111((byte[]) null);

    @ObfuscatedName("fb.w")
    public int field2854;

    @ObfuscatedName("fb.i")
    public int[] field2843;

    @ObfuscatedName("fb.e")
    public int[] field2844;

    @ObfuscatedName("fb.h")
    public int[] field2850;

    @ObfuscatedName("fb.q")
    public int[] field2846;

    @ObfuscatedName("fb.l")
    public int field2847;

    @ObfuscatedName("fb.f")
    public long field2842;

    @ObfuscatedName("fb.s")
    public static final byte[] field2849 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3154(arg0);
    }

    @ObfuscatedName("fb.n([B)V")
    public void method3154(byte[] arg0) {
        this.field2845.field1886 = arg0;
        this.field2845.field1888 = 10;
        int var2 = this.field2845.method2157();
        this.field2854 = this.field2845.method2157();
        this.field2847 = 500000;
        this.field2843 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2845.method2160();
            int var5 = this.field2845.method2160();
            if (var4 == 1297379947) {
                this.field2843[var3] = this.field2845.field1888;
                var3++;
            }
            this.field2845.field1888 += var5;
        }
        this.field2842 = 0L;
        this.field2844 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2844[var6] = this.field2843[var6];
        }
        this.field2850 = new int[var2];
        this.field2846 = new int[var2];
    }

    @ObfuscatedName("fb.w()V")
    public void method3110() {
        this.field2845.field1886 = null;
        this.field2843 = null;
        this.field2844 = null;
        this.field2850 = null;
        this.field2846 = null;
    }

    @ObfuscatedName("fb.i()Z")
    public boolean method3112() {
        return this.field2845.field1886 != null;
    }

    @ObfuscatedName("fb.e()I")
    public int method3109() {
        return this.field2844.length;
    }

    @ObfuscatedName("fb.h(I)V")
    public void method3113(int arg0) {
        this.field2845.field1888 = this.field2844[arg0];
    }

    @ObfuscatedName("fb.q(I)V")
    public void method3156(int arg0) {
        this.field2844[arg0] = this.field2845.field1888;
    }

    @ObfuscatedName("fb.l()V")
    public void method3120() {
        this.field2845.field1888 = -1;
    }

    @ObfuscatedName("fb.c(I)V")
    public void method3116(int arg0) {
        int var2 = this.field2845.method2170();
        this.field2850[arg0] += var2;
    }

    @ObfuscatedName("fb.f(I)I")
    public int method3111(int arg0) {
        return this.method3124(arg0);
    }

    @ObfuscatedName("fb.s(I)I")
    public int method3124(int arg0) {
        byte var2 = this.field2845.field1886[this.field2845.field1888];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2846[arg0] = var3;
            this.field2845.field1888++;
        } else {
            var3 = this.field2846[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3119(arg0, var3);
        }
        int var4 = this.field2845.method2170();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2845.field1886[this.field2845.field1888] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2845.field1888++;
                this.field2846[arg0] = var5;
                return this.method3119(arg0, var5);
            }
        }
        this.field2845.field1888 += var4;
        return 0;
    }

    @ObfuscatedName("fb.m(II)I")
    public int method3119(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2849[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2845.method2155() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2845.method2155() << 16;
            }
            return var8;
        }
        int var3 = this.field2845.method2155();
        int var4 = this.field2845.method2170();
        if (var3 == 47) {
            this.field2845.field1888 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2845.method2315();
            var4 -= 3;
            int var6 = this.field2850[arg0];
            this.field2842 += (long) (this.field2847 - var5) * (long) var6;
            this.field2847 = var5;
            this.field2845.field1888 += var4;
            return 2;
        } else {
            this.field2845.field1888 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fb.y(I)J")
    public long method3132(int arg0) {
        return (long) this.field2847 * (long) arg0 + this.field2842;
    }

    @ObfuscatedName("fb.b()I")
    public int method3140() {
        int var1 = this.field2844.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2844[var4] >= 0 && this.field2850[var4] < var3) {
                var2 = var4;
                var3 = this.field2850[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fb.v()Z")
    public boolean method3122() {
        int var1 = this.field2844.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2844[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.z(J)V")
    public void method3123(long arg0) {
        this.field2842 = arg0;
        int var3 = this.field2844.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2850[var4] = 0;
            this.field2846[var4] = 0;
            this.field2845.field1888 = this.field2843[var4];
            this.method3116(var4);
            this.field2844[var4] = this.field2845.field1888;
        }
    }
}
