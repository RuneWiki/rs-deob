package deob;

@ObfuscatedName("cj")
public final class class84 extends class83 {

    @ObfuscatedName("cj.x")
    public byte[] field1455;

    @ObfuscatedName("cj.r")
    public int[] field1457;

    @ObfuscatedName("cj.j")
    public int field1459;

    @ObfuscatedName("cj.z")
    public int field1458;

    @ObfuscatedName("cj.i")
    public int field1462;

    @ObfuscatedName("cj.b")
    public int field1460;

    @ObfuscatedName("cj.l")
    public int field1461;

    @ObfuscatedName("cj.m")
    public int field1456;

    @ObfuscatedName("cj.x()V")
    public void method1792() {
        if (this.field1461 == this.field1459 && this.field1458 == this.field1456) {
            return;
        }
        byte[] var1 = new byte[this.field1461 * this.field1456];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1458; var3++) {
            for (int var4 = 0; var4 < this.field1459; var4++) {
                var1[(this.field1460 + var3) * this.field1461 + this.field1462 + var4] = this.field1455[var2++];
            }
        }
        this.field1455 = var1;
        this.field1459 = this.field1461;
        this.field1458 = this.field1456;
        this.field1462 = 0;
        this.field1460 = 0;
    }

    @ObfuscatedName("cj.r(III)V")
    public void method1797(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1457.length; var4++) {
            int var5 = this.field1457[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1457[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1457[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1457[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("cj.j(II)V")
    public void method1793(int arg0, int arg1) {
        int var3 = this.field1462 + arg0;
        int var4 = this.field1460 + arg1;
        int var5 = Statics.field1448 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1458;
        int var8 = this.field1459;
        int var9 = Statics.field1448 - var8;
        int var10 = 0;
        if (var4 < field1451) {
            int var11 = field1451 - var4;
            var7 -= var11;
            var4 = field1451;
            var6 += var8 * var11;
            var5 += Statics.field1448 * var11;
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
        if (var3 + var8 > field1454) {
            int var13 = var3 + var8 - field1454;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1794(Statics.field1450, this.field1455, this.field1457, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("cj.z([I[B[IIIIIII)V")
    public static void method1794(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
