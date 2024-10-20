package deob;

@ObfuscatedName("fm")
public final class class172 extends class165 {

    @ObfuscatedName("fm.s")
    public byte[] field2514;

    @ObfuscatedName("fm.j")
    public int[] field2518;

    @ObfuscatedName("fm.e")
    public int field2513;

    @ObfuscatedName("fm.t")
    public int field2516;

    @ObfuscatedName("fm.y")
    public int field2517;

    @ObfuscatedName("fm.b")
    public int field2515;

    @ObfuscatedName("fm.w")
    public int field2519;

    @ObfuscatedName("fm.g")
    public int field2520;

    @ObfuscatedName("fm.bd()V")
    public void method2747() {
        if (this.field2519 == this.field2513 && this.field2520 == this.field2516) {
            return;
        }
        byte[] var1 = new byte[this.field2520 * this.field2519];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2516; var3++) {
            for (int var4 = 0; var4 < this.field2513; var4++) {
                var1[(this.field2515 + var3) * this.field2519 + this.field2517 + var4] = this.field2514[var2++];
            }
        }
        this.field2514 = var1;
        this.field2513 = this.field2519;
        this.field2516 = this.field2520;
        this.field2517 = 0;
        this.field2515 = 0;
    }

    @ObfuscatedName("fm.bx(III)V")
    public void method2753(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2518.length; var4++) {
            int var5 = this.field2518[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2518[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2518[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2518[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("fm.bm(II)V")
    public void method2752(int arg0, int arg1) {
        int var3 = this.field2517 + arg0;
        int var4 = this.field2515 + arg1;
        int var5 = Statics.field2483 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2516;
        int var8 = this.field2513;
        int var9 = Statics.field2483 - var8;
        int var10 = 0;
        if (var4 < field2485) {
            int var11 = field2485 - var4;
            var7 -= var11;
            var4 = field2485;
            var6 += var8 * var11;
            var5 += Statics.field2483 * var11;
        }
        if (var4 + var7 > field2487) {
            var7 -= var4 + var7 - field2487;
        }
        if (var3 < field2486) {
            int var12 = field2486 - var3;
            var8 -= var12;
            var3 = field2486;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field2488) {
            int var13 = var3 + var8 - field2488;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method2750(Statics.field2482, this.field2514, this.field2518, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("fm.bv([I[B[IIIIIII)V")
    public static void method2750(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
