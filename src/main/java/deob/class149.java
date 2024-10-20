package deob;

@ObfuscatedName("cn")
public class class149 extends class4 {

    @ObfuscatedName("cn.f")
    public int[] field2242;

    @ObfuscatedName("cn.g")
    public int[] field2234;

    @ObfuscatedName("cn.e")
    public int[] field2243;

    @ObfuscatedName("cn.n")
    public int[] field2239;

    @ObfuscatedName("cn.l")
    public int[] field2245;

    @ObfuscatedName("cn.h")
    public int field2237;

    @ObfuscatedName("cn.w")
    public boolean field2246 = false;

    @ObfuscatedName("cn.r")
    public boolean field2238;

    @ObfuscatedName("cn.z")
    public int field2244;

    @ObfuscatedName("cn.x")
    public int field2240;

    @ObfuscatedName("cn.o(I)V")
    public void method2755(int arg0) {
        if (this.field2245 == null) {
            return;
        }
        if (this.field2240 == 1 || this.field2240 == 3) {
            if (Statics.field2247 == null || Statics.field2247.length < this.field2245.length) {
                Statics.field2247 = new int[this.field2245.length];
            }
            short var2;
            if (this.field2245.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2245.length;
            int var4 = arg0 * var2 * this.field2244;
            int var5 = var3 - 1;
            if (this.field2240 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2247[var6] = this.field2245[var7];
            }
            int[] var8 = this.field2245;
            this.field2245 = Statics.field2247;
            Statics.field2247 = var8;
        }
        if (this.field2240 != 2 && this.field2240 != 4) {
            return;
        }
        if (Statics.field2247 == null || Statics.field2247.length < this.field2245.length) {
            Statics.field2247 = new int[this.field2245.length];
        }
        short var9;
        if (this.field2245.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2245.length;
        int var11 = this.field2244 * arg0;
        int var12 = var9 - 1;
        if (this.field2240 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2247[var15] = this.field2245[var16];
            }
        }
        int[] var17 = this.field2245;
        this.field2245 = Statics.field2247;
        Statics.field2247 = var17;
    }

    @ObfuscatedName("cn.p()V")
    public void method2757() {
        this.field2245 = null;
    }

    public class149(class31 arg0) {
        this.field2237 = arg0.method373();
        this.field2238 = arg0.method512() == 1;
        int var2 = arg0.method512();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2239 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2239[var3] = arg0.method373();
        }
        if (var2 > 1) {
            this.field2234 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2234[var4] = arg0.method512();
            }
        }
        if (var2 > 1) {
            this.field2243 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2243[var5] = arg0.method512();
            }
        }
        this.field2242 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2242[var6] = arg0.method376();
        }
        this.field2240 = arg0.method512();
        this.field2244 = arg0.method512();
        this.field2245 = null;
    }

    @ObfuscatedName("cn.j(DILeg;)Z")
    public boolean method2760(double arg0, int arg1, class81 arg2) {
        for (int var5 = 0; var5 < this.field2239.length; var5++) {
            if (arg2.method1115(this.field2239[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2245 = new int[var6];
        for (int var7 = 0; var7 < this.field2239.length; var7++) {
            int var8 = this.field2239[var7];
            class145 var9;
            if (class146.method3473(arg2, var8)) {
                var9 = class146.method2210();
            } else {
                var9 = null;
            }
            var9.method2713();
            byte[] var11 = var9.field2182;
            int[] var12 = var9.field2176;
            int var13 = this.field2242[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class151.method2793(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2234[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field2180 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2245[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field2180 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2245[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field2180 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2245[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }
}
