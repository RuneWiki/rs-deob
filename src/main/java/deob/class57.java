package deob;

@ObfuscatedName("bk")
public class class57 {

    @ObfuscatedName("bk.r")
    public class54[] field1181 = new class54[10];

    @ObfuscatedName("bk.u")
    public int field1182;

    @ObfuscatedName("bk.t")
    public int field1180;

    @ObfuscatedName("bk.a(Lev;II)Lbk;")
    public static class57 method1190(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2943(arg1, arg2);
        return var3 == null ? null : new class57(new class126(var3));
    }

    public class57(class126 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2481();
            if (var3 != 0) {
                arg0.field2016--;
                this.field1181[var2] = new class54();
                this.field1181[var2].method1161(arg0);
            }
        }
        this.field1182 = arg0.method2373();
        this.field1180 = arg0.method2373();
    }

    @ObfuscatedName("bk.r()Lbq;")
    public class63 method1189() {
        byte[] var1 = this.method1195();
        return new class63(22050, var1, this.field1182 * 22050 / 1000, this.field1180 * 22050 / 1000);
    }

    @ObfuscatedName("bk.u()I")
    public final int method1198() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1181[var2] != null && this.field1181[var2].field1150 / 20 < var1) {
                var1 = this.field1181[var2].field1150 / 20;
            }
        }
        if (this.field1182 < this.field1180 && this.field1182 / 20 < var1) {
            var1 = this.field1182 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1181[var3] != null) {
                this.field1181[var3].field1150 -= var1 * 20;
            }
        }
        if (this.field1182 < this.field1180) {
            this.field1182 -= var1 * 20;
            this.field1180 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bk.t()[B")
    public final byte[] method1195() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1181[var2] != null && this.field1181[var2].field1150 + this.field1181[var2].field1145 > var1) {
                var1 = this.field1181[var2].field1150 + this.field1181[var2].field1145;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1181[var5] != null) {
                int var6 = this.field1181[var5].field1145 * 22050 / 1000;
                int var7 = this.field1181[var5].field1150 * 22050 / 1000;
                int[] var8 = this.field1181[var5].method1159(var6, this.field1181[var5].field1145);
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
