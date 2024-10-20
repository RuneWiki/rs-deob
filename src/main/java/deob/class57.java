package deob;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.t")
    public int field1232;

    @ObfuscatedName("bl.c")
    public class54[] field1231 = new class54[10];

    @ObfuscatedName("bl.d")
    public int field1230;

    @ObfuscatedName("bl.t(Lev;II)Lbl;")
    public static class57 method1276(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2987(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2438();
            if (var3 != 0) {
                arg0.field2059--;
                this.field1231[var2] = new class54();
                this.field1231[var2].method1238(arg0);
            }
        }
        this.field1232 = arg0.method2440();
        this.field1230 = arg0.method2440();
    }

    @ObfuscatedName("bl.l()Lbc;")
    public class63 method1267() {
        byte[] var1 = this.method1269();
        return new class63(22050, var1, this.field1232 * 22050 / 1000, this.field1230 * 22050 / 1000);
    }

    @ObfuscatedName("bl.c()I")
    public final int method1270() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1231[var2] != null && this.field1231[var2].field1198 / 20 < var1) {
                var1 = this.field1231[var2].field1198 / 20;
            }
        }
        if (this.field1232 < this.field1230 && this.field1232 / 20 < var1) {
            var1 = this.field1232 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1231[var3] != null) {
                this.field1231[var3].field1198 -= var1 * 20;
            }
        }
        if (this.field1232 < this.field1230) {
            this.field1232 -= var1 * 20;
            this.field1230 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bl.d()[B")
    public final byte[] method1269() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1231[var2] != null && this.field1231[var2].field1198 + this.field1231[var2].field1185 > var1) {
                var1 = this.field1231[var2].field1198 + this.field1231[var2].field1185;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1231[var5] != null) {
                int var6 = this.field1231[var5].field1185 * 22050 / 1000;
                int var7 = this.field1231[var5].field1198 * 22050 / 1000;
                int[] var8 = this.field1231[var5].method1239(var6, this.field1231[var5].field1185);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
