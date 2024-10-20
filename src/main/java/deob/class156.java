package deob;

@ObfuscatedName("ef")
public class class156 {

    @ObfuscatedName("ef.m")
    public class104 field2649 = new class104((byte[]) null);

    @ObfuscatedName("ef.k")
    public int field2646;

    @ObfuscatedName("ef.y")
    public int[] field2655;

    @ObfuscatedName("ef.g")
    public int[] field2644;

    @ObfuscatedName("ef.r")
    public int[] field2647;

    @ObfuscatedName("ef.i")
    public int[] field2648;

    @ObfuscatedName("ef.f")
    public int field2656;

    @ObfuscatedName("ef.w")
    public long field2651;

    @ObfuscatedName("ef.u")
    public static final byte[] field2652 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class156() {
    }

    public class156(byte[] arg0) {
        this.method2951(arg0);
    }

    @ObfuscatedName("ef.m([B)V")
    public void method2951(byte[] arg0) {
        this.field2649.field1808 = arg0;
        this.field2649.field1806 = 10;
        int var2 = this.field2649.method2132();
        this.field2646 = this.field2649.method2132();
        this.field2656 = 500000;
        this.field2655 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2649.method2135();
            int var5 = this.field2649.method2135();
            if (var4 == 1297379947) {
                this.field2655[var3] = this.field2649.field1806;
                var3++;
            }
            this.field2649.field1806 += var5;
        }
        this.field2651 = 0L;
        this.field2644 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2644[var6] = this.field2655[var6];
        }
        this.field2647 = new int[var2];
        this.field2648 = new int[var2];
    }

    @ObfuscatedName("ef.k()V")
    public void method2996() {
        this.field2649.field1808 = null;
        this.field2655 = null;
        this.field2644 = null;
        this.field2647 = null;
        this.field2648 = null;
    }

    @ObfuscatedName("ef.y()Z")
    public boolean method2953() {
        return this.field2649.field1808 != null;
    }

    @ObfuscatedName("ef.g()I")
    public int method2954() {
        return this.field2644.length;
    }

    @ObfuscatedName("ef.r(I)V")
    public void method2955(int arg0) {
        this.field2649.field1806 = this.field2644[arg0];
    }

    @ObfuscatedName("ef.i(I)V")
    public void method2956(int arg0) {
        this.field2644[arg0] = this.field2649.field1806;
    }

    @ObfuscatedName("ef.f()V")
    public void method2957() {
        this.field2649.field1806 = -1;
    }

    @ObfuscatedName("ef.a(I)V")
    public void method2958(int arg0) {
        int var2 = this.field2649.method2229();
        this.field2647[arg0] += var2;
    }

    @ObfuscatedName("ef.w(I)I")
    public int method2959(int arg0) {
        return this.method2968(arg0);
    }

    @ObfuscatedName("ef.u(I)I")
    public int method2968(int arg0) {
        byte var2 = this.field2649.field1808[this.field2649.field1806];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2648[arg0] = var3;
            this.field2649.field1806++;
        } else {
            var3 = this.field2648[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2961(arg0, var3);
        }
        int var4 = this.field2649.method2229();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2649.field1808[this.field2649.field1806] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2649.field1806++;
                this.field2648[arg0] = var5;
                return this.method2961(arg0, var5);
            }
        }
        this.field2649.field1806 += var4;
        return 0;
    }

    @ObfuscatedName("ef.d(II)I")
    public int method2961(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2652[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2649.method2190() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2649.method2190() << 16;
            }
            return var8;
        }
        int var3 = this.field2649.method2190();
        int var4 = this.field2649.method2229();
        if (var3 == 47) {
            this.field2649.field1806 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2649.method2134();
            var4 -= 3;
            int var6 = this.field2647[arg0];
            this.field2651 += (long) (this.field2656 - var5) * (long) var6;
            this.field2656 = var5;
            this.field2649.field1806 += var4;
            return 2;
        } else {
            this.field2649.field1806 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ef.t(I)J")
    public long method2962(int arg0) {
        return (long) this.field2656 * (long) arg0 + this.field2651;
    }

    @ObfuscatedName("ef.j()I")
    public int method2963() {
        int var1 = this.field2644.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2644[var4] >= 0 && this.field2647[var4] < var3) {
                var2 = var4;
                var3 = this.field2647[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ef.q()Z")
    public boolean method2964() {
        int var1 = this.field2644.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2644[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ef.p(J)V")
    public void method3001(long arg0) {
        this.field2651 = arg0;
        int var3 = this.field2644.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2647[var4] = 0;
            this.field2648[var4] = 0;
            this.field2649.field1806 = this.field2655[var4];
            this.method2958(var4);
            this.field2644[var4] = this.field2649.field1806;
        }
    }
}
