package deob;

@ObfuscatedName("am")
public class class52 {

    @ObfuscatedName("am.u")
    public class65[] field1096 = new class65[10];

    @ObfuscatedName("am.k")
    public int field1097;

    @ObfuscatedName("am.v")
    public int field1098;

    @ObfuscatedName("am.y(Lev;II)Lam;")
    public static class52 method1033(class145 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2704(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2109();
            if (var3 != 0) {
                arg0.field1854--;
                this.field1096[var2] = new class65();
                this.field1096[var2].method1291(arg0);
            }
        }
        this.field1097 = arg0.method2111();
        this.field1098 = arg0.method2111();
    }

    @ObfuscatedName("am.u()Lbh;")
    public class56 method1026() {
        byte[] var1 = this.method1028();
        return new class56(22050, var1, this.field1097 * 22050 / 1000, this.field1098 * 22050 / 1000);
    }

    @ObfuscatedName("am.k()I")
    public final int method1025() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1096[var2] != null && this.field1096[var2].field1222 / 20 < var1) {
                var1 = this.field1096[var2].field1222 / 20;
            }
        }
        if (this.field1097 < this.field1098 && this.field1097 / 20 < var1) {
            var1 = this.field1097 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1096[var3] != null) {
                this.field1096[var3].field1222 -= var1 * 20;
            }
        }
        if (this.field1097 < this.field1098) {
            this.field1097 -= var1 * 20;
            this.field1098 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("am.v()[B")
    public final byte[] method1028() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1096[var2] != null && this.field1096[var2].field1222 + this.field1096[var2].field1216 > var1) {
                var1 = this.field1096[var2].field1222 + this.field1096[var2].field1216;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1096[var5] != null) {
                int var6 = this.field1096[var5].field1216 * 22050 / 1000;
                int var7 = this.field1096[var5].field1222 * 22050 / 1000;
                int[] var8 = this.field1096[var5].method1289(var6, this.field1096[var5].field1216);
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
