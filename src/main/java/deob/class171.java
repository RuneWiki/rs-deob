package deob;

@ObfuscatedName("fc")
public class class171 extends class351 {

    @ObfuscatedName("fc.b")
    public int field1849;

    @ObfuscatedName("fc.e")
    public boolean field1850;

    @ObfuscatedName("fc.k")
    public int[] field1855;

    @ObfuscatedName("fc.g")
    public int[] field1852;

    @ObfuscatedName("fc.h")
    public int[] field1853;

    @ObfuscatedName("fc.n")
    public int[] field1845;

    @ObfuscatedName("fc.l")
    public int field1851;

    @ObfuscatedName("fc.m")
    public int field1856;

    @ObfuscatedName("fc.d")
    public int[] field1857;

    @ObfuscatedName("fc.c")
    public boolean field1858 = false;

    public class171(class382 arg0) {
        this.field1849 = arg0.method5858();
        this.field1850 = arg0.method5856() == 1;
        int var2 = arg0.method5856();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1855 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1855[var3] = arg0.method5858();
        }
        if (var2 > 1) {
            this.field1852 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1852[var4] = arg0.method5856();
            }
        }
        if (var2 > 1) {
            this.field1853 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1853[var5] = arg0.method5856();
            }
        }
        this.field1845 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1845[var6] = arg0.method5861();
        }
        this.field1851 = arg0.method5856();
        this.field1856 = arg0.method5856();
        this.field1857 = null;
    }

    @ObfuscatedName("fc.f(DILir;)Z")
    public boolean method2910(double arg0, int arg1, class253 arg2) {
        for (int var5 = 0; var5 < this.field1855.length; var5++) {
            if (arg2.method3976(this.field1855[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1857 = new int[var6];
        for (int var7 = 0; var7 < this.field1855.length; var7++) {
            class394 var8 = class396.method3339(arg2, this.field1855[var7]);
            var8.method6208();
            byte[] var9 = var8.field4241;
            int[] var10 = var8.field4238;
            int var11 = this.field1845[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class174.method2929(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1852[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4236 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1857[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4236 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1857[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4236 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1857[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("fc.o()V")
    public void method2911() {
        this.field1857 = null;
    }

    @ObfuscatedName("fc.u(I)V")
    public void method2912(int arg0) {
        if (this.field1857 == null) {
            return;
        }
        if (this.field1851 == 1 || this.field1851 == 3) {
            if (Statics.field1859 == null || Statics.field1859.length < this.field1857.length) {
                Statics.field1859 = new int[this.field1857.length];
            }
            short var2;
            if (this.field1857.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1857.length;
            int var4 = arg0 * var2 * this.field1856;
            int var5 = var3 - 1;
            if (this.field1851 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1859[var6] = this.field1857[var7];
            }
            int[] var8 = this.field1857;
            this.field1857 = Statics.field1859;
            Statics.field1859 = var8;
        }
        if (this.field1851 != 2 && this.field1851 != 4) {
            return;
        }
        if (Statics.field1859 == null || Statics.field1859.length < this.field1857.length) {
            Statics.field1859 = new int[this.field1857.length];
        }
        short var9;
        if (this.field1857.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1857.length;
        int var11 = this.field1856 * arg0;
        int var12 = var9 - 1;
        if (this.field1851 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1859[var15] = this.field1857[var16];
            }
        }
        int[] var17 = this.field1857;
        this.field1857 = Statics.field1859;
        Statics.field1859 = var17;
    }
}
