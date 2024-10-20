package deob;

@ObfuscatedName("bz")
public final class class74 extends class73 {

    @ObfuscatedName("bz.k")
    public byte[] field1300;

    @ObfuscatedName("bz.y")
    public int[] field1307;

    @ObfuscatedName("bz.s")
    public int field1302;

    @ObfuscatedName("bz.g")
    public int field1303;

    @ObfuscatedName("bz.h")
    public int field1304;

    @ObfuscatedName("bz.l")
    public int field1305;

    @ObfuscatedName("bz.e")
    public int field1306;

    @ObfuscatedName("bz.u")
    public int field1301;

    @ObfuscatedName("bz.k()V")
    public void method1576() {
        if (this.field1306 == this.field1302 && this.field1303 == this.field1301) {
            return;
        }
        byte[] var1 = new byte[this.field1306 * this.field1301];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1303; var3++) {
            for (int var4 = 0; var4 < this.field1302; var4++) {
                var1[(this.field1305 + var3) * this.field1306 + this.field1304 + var4] = this.field1300[var2++];
            }
        }
        this.field1300 = var1;
        this.field1302 = this.field1306;
        this.field1303 = this.field1301;
        this.field1304 = 0;
        this.field1305 = 0;
    }

    @ObfuscatedName("bz.y(III)V")
    public void method1583(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1307.length; var4++) {
            int var5 = this.field1307[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1307[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1307[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1307[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("bz.s(II)V")
    public void method1584(int arg0, int arg1) {
        int var3 = this.field1304 + arg0;
        int var4 = this.field1305 + arg1;
        int var5 = Statics.field1294 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1303;
        int var8 = this.field1302;
        int var9 = Statics.field1294 - var8;
        int var10 = 0;
        if (var4 < field1296) {
            int var11 = field1296 - var4;
            var7 -= var11;
            var4 = field1296;
            var6 += var8 * var11;
            var5 += Statics.field1294 * var11;
        }
        if (var4 + var7 > field1297) {
            var7 -= var4 + var7 - field1297;
        }
        if (var3 < field1293) {
            int var12 = field1293 - var3;
            var8 -= var12;
            var3 = field1293;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field1299) {
            int var13 = var3 + var8 - field1299;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1579(Statics.field1298, this.field1300, this.field1307, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("bz.g([I[B[IIIIIII)V")
    public static void method1579(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
