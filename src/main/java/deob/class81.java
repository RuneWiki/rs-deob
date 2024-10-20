package deob;

@ObfuscatedName("cg")
public final class class81 extends class80 {

    @ObfuscatedName("cg.a")
    public byte[] field1423;

    @ObfuscatedName("cg.w")
    public int[] field1424;

    @ObfuscatedName("cg.d")
    public int field1420;

    @ObfuscatedName("cg.c")
    public int field1421;

    @ObfuscatedName("cg.y")
    public int field1422;

    @ObfuscatedName("cg.k")
    public int field1425;

    @ObfuscatedName("cg.r")
    public int field1426;

    @ObfuscatedName("cg.p")
    public int field1427;

    @ObfuscatedName("cg.a()V")
    public void method1855() {
        if (this.field1426 == this.field1420 && this.field1427 == this.field1421) {
            return;
        }
        byte[] var1 = new byte[this.field1427 * this.field1426];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1421; var3++) {
            for (int var4 = 0; var4 < this.field1420; var4++) {
                var1[(this.field1425 + var3) * this.field1426 + this.field1422 + var4] = this.field1423[var2++];
            }
        }
        this.field1423 = var1;
        this.field1420 = this.field1426;
        this.field1421 = this.field1427;
        this.field1422 = 0;
        this.field1425 = 0;
    }

    @ObfuscatedName("cg.w(III)V")
    public void method1849(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1424.length; var4++) {
            int var5 = this.field1424[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1424[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1424[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1424[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("cg.d(II)V")
    public void method1850(int arg0, int arg1) {
        int var3 = this.field1422 + arg0;
        int var4 = this.field1425 + arg1;
        int var5 = Statics.field1418 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1421;
        int var8 = this.field1420;
        int var9 = Statics.field1418 - var8;
        int var10 = 0;
        if (var4 < field1416) {
            int var11 = field1416 - var4;
            var7 -= var11;
            var4 = field1416;
            var6 += var8 * var11;
            var5 += Statics.field1418 * var11;
        }
        if (var4 + var7 > field1417) {
            var7 -= var4 + var7 - field1417;
        }
        if (var3 < field1413) {
            int var12 = field1413 - var3;
            var8 -= var12;
            var3 = field1413;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field1419) {
            int var13 = var3 + var8 - field1419;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1848(Statics.field1414, this.field1423, this.field1424, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("cg.c([I[B[IIIIIII)V")
    public static void method1848(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
