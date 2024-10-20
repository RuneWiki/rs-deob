package deob;

@ObfuscatedName("fb")
public class class182 {

    @ObfuscatedName("fb.o")
    public class119 field2937 = new class119((byte[]) null);

    @ObfuscatedName("fb.e")
    public int field2935;

    @ObfuscatedName("fb.u")
    public int[] field2936;

    @ObfuscatedName("fb.b")
    public int[] field2944;

    @ObfuscatedName("fb.p")
    public int[] field2938;

    @ObfuscatedName("fb.s")
    public int[] field2939;

    @ObfuscatedName("fb.y")
    public int field2941;

    @ObfuscatedName("fb.w")
    public long field2942;

    @ObfuscatedName("fb.h")
    public static final byte[] field2943 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3308(arg0);
    }

    @ObfuscatedName("fb.o([B)V")
    public void method3308(byte[] arg0) {
        this.field2937.field1977 = arg0;
        this.field2937.field1974 = 10;
        int var2 = this.field2937.method2339();
        this.field2935 = this.field2937.method2339();
        this.field2941 = 500000;
        this.field2936 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2937.method2342();
            int var5 = this.field2937.method2342();
            if (var4 == 1297379947) {
                this.field2936[var3] = this.field2937.field1974;
                var3++;
            }
            this.field2937.field1974 += var5;
        }
        this.field2942 = 0L;
        this.field2944 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2944[var6] = this.field2936[var6];
        }
        this.field2938 = new int[var2];
        this.field2939 = new int[var2];
    }

    @ObfuscatedName("fb.e()V")
    public void method3329() {
        this.field2937.field1977 = null;
        this.field2936 = null;
        this.field2944 = null;
        this.field2938 = null;
        this.field2939 = null;
    }

    @ObfuscatedName("fb.u()Z")
    public boolean method3349() {
        return this.field2937.field1977 != null;
    }

    @ObfuscatedName("fb.b()I")
    public int method3316() {
        return this.field2944.length;
    }

    @ObfuscatedName("fb.p(I)V")
    public void method3356(int arg0) {
        this.field2937.field1974 = this.field2944[arg0];
    }

    @ObfuscatedName("fb.s(I)V")
    public void method3312(int arg0) {
        this.field2944[arg0] = this.field2937.field1974;
    }

    @ObfuscatedName("fb.y()V")
    public void method3313() {
        this.field2937.field1974 = -1;
    }

    @ObfuscatedName("fb.t(I)V")
    public void method3314(int arg0) {
        int var2 = this.field2937.method2394();
        this.field2938[arg0] += var2;
    }

    @ObfuscatedName("fb.w(I)I")
    public int method3342(int arg0) {
        return this.method3309(arg0);
    }

    @ObfuscatedName("fb.h(I)I")
    public int method3309(int arg0) {
        byte var2 = this.field2937.field1977[this.field2937.field1974];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2939[arg0] = var3;
            this.field2937.field1974++;
        } else {
            var3 = this.field2939[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3330(arg0, var3);
        }
        int var4 = this.field2937.method2394();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2937.field1977[this.field2937.field1974] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2937.field1974++;
                this.field2939[arg0] = var5;
                return this.method3330(arg0, var5);
            }
        }
        this.field2937.field1974 += var4;
        return 0;
    }

    @ObfuscatedName("fb.d(II)I")
    public int method3330(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2943[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2937.method2427() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2937.method2427() << 16;
            }
            return var8;
        }
        int var3 = this.field2937.method2427();
        int var4 = this.field2937.method2394();
        if (var3 == 47) {
            this.field2937.field1974 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2937.method2341();
            var4 -= 3;
            int var6 = this.field2938[arg0];
            this.field2942 += (long) (this.field2941 - var5) * (long) var6;
            this.field2941 = var5;
            this.field2937.field1974 += var4;
            return 2;
        } else {
            this.field2937.field1974 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fb.l(I)J")
    public long method3318(int arg0) {
        return (long) this.field2941 * (long) arg0 + this.field2942;
    }

    @ObfuscatedName("fb.n()I")
    public int method3319() {
        int var1 = this.field2944.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2944[var4] >= 0 && this.field2938[var4] < var3) {
                var2 = var4;
                var3 = this.field2938[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fb.q()Z")
    public boolean method3320() {
        int var1 = this.field2944.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2944[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.f(J)V")
    public void method3321(long arg0) {
        this.field2942 = arg0;
        int var3 = this.field2944.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2938[var4] = 0;
            this.field2939[var4] = 0;
            this.field2937.field1974 = this.field2936[var4];
            this.method3314(var4);
            this.field2944[var4] = this.field2937.field1974;
        }
    }
}
