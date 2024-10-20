package deob;

@ObfuscatedName("cm")
public final class class148 extends class146 {

    @ObfuscatedName("cm.f")
    public int field2240;

    @ObfuscatedName("cm.d")
    public int field2242;

    @ObfuscatedName("cm.b")
    public byte[] field2244;

    @ObfuscatedName("cm.l")
    public int field2243;

    @ObfuscatedName("cm.k")
    public int field2239;

    @ObfuscatedName("cm.h")
    public int[] field2238;

    @ObfuscatedName("cm.w")
    public int field2237;

    @ObfuscatedName("cm.t")
    public int field2241;

    @ObfuscatedName("cm.b()V")
    public void method2461() {
        if (this.field2243 == this.field2239 && this.field2240 == this.field2237) {
            return;
        }
        byte[] var1 = new byte[this.field2243 * this.field2240];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2237; var3++) {
            for (int var4 = 0; var4 < this.field2239; var4++) {
                var1[(this.field2242 + var3) * this.field2243 + this.field2241 + var4] = this.field2244[var2++];
            }
        }
        this.field2244 = var1;
        this.field2239 = this.field2243;
        this.field2237 = this.field2240;
        this.field2241 = 0;
        this.field2242 = 0;
    }

    @ObfuscatedName("cm.h(III)V")
    public void method2462(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2238.length; var4++) {
            int var5 = this.field2238[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2238[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2238[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2238[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("cm.k(II)V")
    public void method2463(int arg0, int arg1) {
        int var3 = this.field2241 + arg0;
        int var4 = this.field2242 + arg1;
        int var5 = Statics.field2209 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2237;
        int var8 = this.field2239;
        int var9 = Statics.field2209 - var8;
        int var10 = 0;
        if (var4 < field2211) {
            int var11 = field2211 - var4;
            var7 -= var11;
            var4 = field2211;
            var6 += var8 * var11;
            var5 += Statics.field2209 * var11;
        }
        if (var4 + var7 > field2212) {
            var7 -= var4 + var7 - field2212;
        }
        if (var3 < field2214) {
            int var12 = field2214 - var3;
            var8 -= var12;
            var3 = field2214;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field2208) {
            int var13 = var3 + var8 - field2208;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method2470(Statics.field2213, this.field2244, this.field2238, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("cm.w([I[B[IIIIIII)V")
    public static void method2470(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var13 & 0xFF];
                }
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }
}
