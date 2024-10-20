package deob;

@ObfuscatedName("fb")
public class class165 {

    @ObfuscatedName("fb.b")
    public class110 field2738 = new class110((byte[]) null);

    @ObfuscatedName("fb.e")
    public int field2745;

    @ObfuscatedName("fb.i")
    public int[] field2733;

    @ObfuscatedName("fb.k")
    public int[] field2743;

    @ObfuscatedName("fb.h")
    public int[] field2736;

    @ObfuscatedName("fb.p")
    public int[] field2737;

    @ObfuscatedName("fb.n")
    public int field2732;

    @ObfuscatedName("fb.g")
    public long field2740;

    @ObfuscatedName("fb.z")
    public static final byte[] field2741 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class165() {
    }

    public class165(byte[] arg0) {
        this.method3019(arg0);
    }

    @ObfuscatedName("fb.b([B)V")
    public void method3019(byte[] arg0) {
        this.field2738.field1862 = arg0;
        this.field2738.field1855 = 10;
        int var2 = this.field2738.method2292();
        this.field2745 = this.field2738.method2292();
        this.field2732 = 500000;
        this.field2733 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2738.method2195();
            int var5 = this.field2738.method2195();
            if (var4 == 1297379947) {
                this.field2733[var3] = this.field2738.field1855;
                var3++;
            }
            this.field2738.field1855 += var5;
        }
        this.field2740 = 0L;
        this.field2743 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2743[var6] = this.field2733[var6];
        }
        this.field2736 = new int[var2];
        this.field2737 = new int[var2];
    }

    @ObfuscatedName("fb.e()V")
    public void method3020() {
        this.field2738.field1862 = null;
        this.field2733 = null;
        this.field2743 = null;
        this.field2736 = null;
        this.field2737 = null;
    }

    @ObfuscatedName("fb.i()Z")
    public boolean method3021() {
        return this.field2738.field1862 != null;
    }

    @ObfuscatedName("fb.k()I")
    public int method3042() {
        return this.field2743.length;
    }

    @ObfuscatedName("fb.h(I)V")
    public void method3023(int arg0) {
        this.field2738.field1855 = this.field2743[arg0];
    }

    @ObfuscatedName("fb.p(I)V")
    public void method3059(int arg0) {
        this.field2743[arg0] = this.field2738.field1855;
    }

    @ObfuscatedName("fb.n()V")
    public void method3025() {
        this.field2738.field1855 = -1;
    }

    @ObfuscatedName("fb.o(I)V")
    public void method3031(int arg0) {
        int var2 = this.field2738.method2318();
        this.field2736[arg0] += var2;
    }

    @ObfuscatedName("fb.g(I)I")
    public int method3027(int arg0) {
        return this.method3028(arg0);
    }

    @ObfuscatedName("fb.z(I)I")
    public int method3028(int arg0) {
        byte var2 = this.field2738.field1862[this.field2738.field1855];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2737[arg0] = var3;
            this.field2738.field1855++;
        } else {
            var3 = this.field2737[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3029(arg0, var3);
        }
        int var4 = this.field2738.method2318();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2738.field1862[this.field2738.field1855] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2738.field1855++;
                this.field2737[arg0] = var5;
                return this.method3029(arg0, var5);
            }
        }
        this.field2738.field1855 += var4;
        return 0;
    }

    @ObfuscatedName("fb.t(II)I")
    public int method3029(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2741[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2738.method2142() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2738.method2142() << 16;
            }
            return var8;
        }
        int var3 = this.field2738.method2142();
        int var4 = this.field2738.method2318();
        if (var3 == 47) {
            this.field2738.field1855 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2738.method2146();
            var4 -= 3;
            int var6 = this.field2736[arg0];
            this.field2740 += (long) (this.field2732 - var5) * (long) var6;
            this.field2732 = var5;
            this.field2738.field1855 += var4;
            return 2;
        } else {
            this.field2738.field1855 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fb.y(I)J")
    public long method3030(int arg0) {
        return (long) this.field2732 * (long) arg0 + this.field2740;
    }

    @ObfuscatedName("fb.w()I")
    public int method3055() {
        int var1 = this.field2743.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2743[var4] >= 0 && this.field2736[var4] < var3) {
                var2 = var4;
                var3 = this.field2736[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fb.x()Z")
    public boolean method3032() {
        int var1 = this.field2743.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2743[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.v(J)V")
    public void method3033(long arg0) {
        this.field2740 = arg0;
        int var3 = this.field2743.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2736[var4] = 0;
            this.field2737[var4] = 0;
            this.field2738.field1855 = this.field2733[var4];
            this.method3031(var4);
            this.field2743[var4] = this.field2738.field1855;
        }
    }
}
