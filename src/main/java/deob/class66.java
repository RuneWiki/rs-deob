package deob;

@ObfuscatedName("bk")
public class class66 {

    @ObfuscatedName("bk.p")
    public int field1122;

    @ObfuscatedName("bk.j")
    public int field1123;

    @ObfuscatedName("bk.n")
    public int[][] field1125;

    public class66(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = arg0;
            int var4 = arg1;
            if (arg1 > arg0) {
                var3 = arg1;
                var4 = arg0;
            }
            while (var4 != 0) {
                int var6 = var3 % var4;
                var3 = var4;
                var4 = var6;
            }
            int var9 = arg0 / var3;
            int var10 = arg1 / var3;
            this.field1122 = var9;
            this.field1123 = var10;
            this.field1125 = new int[var9][14];
            for (int var11 = 0; var11 < var9; var11++) {
                int[] var12 = this.field1125[var11];
                double var13 = (double) var11 / (double) var9 + 6.0D;
                int var15 = (int) Math.floor(var13 - 7.0D + 1.0D);
                if (var15 < 0) {
                    var15 = 0;
                }
                int var16 = (int) Math.ceil(var13 + 7.0D);
                if (var16 > 14) {
                    var16 = 14;
                }
                double var17 = (double) var10 / (double) var9;
                while (var15 < var16) {
                    double var19 = ((double) var15 - var13) * 3.141592653589793D;
                    double var21 = var17;
                    if (var19 < -1.0E-4D || var19 > 1.0E-4D) {
                        var21 = var17 * (Math.sin(var19) / var19);
                    }
                    double var23 = var21 * (0.54D + 0.46D * Math.cos(((double) var15 - var13) * 0.2243994752564138D));
                    var12[var15] = (int) Math.floor(var23 * 65536.0D + 0.5D);
                    var15++;
                }
            }
        }
    }

    @ObfuscatedName("bk.q([BB)[B")
    public byte[] method1185(byte[] arg0) {
        if (this.field1125 != null) {
            int var2 = (int) ((long) this.field1123 * (long) arg0.length / (long) this.field1122) + 14;
            int[] var3 = new int[var2];
            int var4 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.length; var6++) {
                byte var7 = arg0[var6];
                int[] var8 = this.field1125[var5];
                for (int var9 = 0; var9 < 14; var9++) {
                    var3[var4 + var9] += var8[var9] * var7;
                }
                int var10 = this.field1123 + var5;
                int var11 = var10 / this.field1122;
                var4 += var11;
                var5 = var10 - this.field1122 * var11;
            }
            arg0 = new byte[var2];
            for (int var12 = 0; var12 < var2; var12++) {
                int var13 = var3[var12] + 32768 >> 16;
                if (var13 < -128) {
                    arg0[var12] = -128;
                } else if (var13 > 127) {
                    arg0[var12] = 127;
                } else {
                    arg0[var12] = (byte) var13;
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("bk.d(II)I")
    public int method1193(int arg0) {
        if (this.field1125 != null) {
            arg0 = (int) ((long) this.field1123 * (long) arg0 / (long) this.field1122);
        }
        return arg0;
    }

    @ObfuscatedName("bk.h(II)I")
    public int method1184(int arg0) {
        if (this.field1125 != null) {
            arg0 = (int) ((long) this.field1123 * (long) arg0 / (long) this.field1122) + 6;
        }
        return arg0;
    }
}
