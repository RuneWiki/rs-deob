package deob;

@ObfuscatedName("cn")
public final class class149 extends class106 {

    @ObfuscatedName("cn.d")
    public int field2230;

    @ObfuscatedName("cn.b")
    public int field2231;

    @ObfuscatedName("cn.c")
    public int[] field2225;

    @ObfuscatedName("cn.m")
    public int field2228;

    @ObfuscatedName("cn.i")
    public int field2227;

    @ObfuscatedName("cn.v")
    public byte[] field2226;

    @ObfuscatedName("cn.z")
    public int field2229;

    @ObfuscatedName("cn.x")
    public int field2224;

    @ObfuscatedName("cn.v()V")
    public void method2639() {
        if (this.field2231 == this.field2224 && this.field2230 == this.field2227) {
            return;
        }
        byte[] var1 = new byte[this.field2230 * this.field2224];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2227; var3++) {
            for (int var4 = 0; var4 < this.field2231; var4++) {
                var1[(this.field2229 + var3) * this.field2224 + this.field2228 + var4] = this.field2226[var2++];
            }
        }
        this.field2226 = var1;
        this.field2231 = this.field2224;
        this.field2227 = this.field2230;
        this.field2228 = 0;
        this.field2229 = 0;
    }

    @ObfuscatedName("cn.b(II)V")
    public void method2640(int arg0, int arg1) {
        int var3 = this.field2228 + arg0;
        int var4 = this.field2229 + arg1;
        int var5 = Statics.field1450 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2227;
        int var8 = this.field2231;
        int var9 = Statics.field1450 - var8;
        int var10 = 0;
        if (var4 < field1451) {
            int var11 = field1451 - var4;
            var7 -= var11;
            var4 = field1451;
            var6 += var8 * var11;
            var5 += Statics.field1450 * var11;
        }
        if (var4 + var7 > field1452) {
            var7 -= var4 + var7 - field1452;
        }
        if (var3 < field1453) {
            int var12 = field1453 - var3;
            var8 -= var12;
            var3 = field1453;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field1449) {
            int var13 = var3 + var8 - field1449;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method2641(Statics.field1454, this.field2226, this.field2225, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("cn.i([I[B[IIIIIII)V")
    public static void method2641(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("cn.c(III)V")
    public void method2644(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2225.length; var4++) {
            int var5 = this.field2225[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2225[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2225[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2225[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }
}
