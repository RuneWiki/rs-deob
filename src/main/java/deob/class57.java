package deob;

@ObfuscatedName("bp")
public class class57 {

    @ObfuscatedName("bp.b")
    public class54[] field1188 = new class54[10];

    @ObfuscatedName("bp.o")
    public int field1189;

    @ObfuscatedName("bp.w")
    public int field1191;

    @ObfuscatedName("bp.l(Lem;II)Lbp;")
    public static class57 method1260(class154 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3029(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2440();
            if (var3 != 0) {
                arg0.field2022--;
                this.field1188[var2] = new class54();
                this.field1188[var2].method1231(arg0);
            }
        }
        this.field1189 = arg0.method2442();
        this.field1191 = arg0.method2442();
    }

    @ObfuscatedName("bp.b()Lbl;")
    public class63 method1261() {
        byte[] var1 = this.method1262();
        return new class63(22050, var1, this.field1189 * 22050 / 1000, this.field1191 * 22050 / 1000);
    }

    @ObfuscatedName("bp.o()I")
    public final int method1263() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1188[var2] != null && this.field1188[var2].field1150 / 20 < var1) {
                var1 = this.field1188[var2].field1150 / 20;
            }
        }
        if (this.field1189 < this.field1191 && this.field1189 / 20 < var1) {
            var1 = this.field1189 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1188[var3] != null) {
                this.field1188[var3].field1150 -= var1 * 20;
            }
        }
        if (this.field1189 < this.field1191) {
            this.field1189 -= var1 * 20;
            this.field1191 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bp.w()[B")
    public final byte[] method1262() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1188[var2] != null && this.field1188[var2].field1150 + this.field1188[var2].field1142 > var1) {
                var1 = this.field1188[var2].field1150 + this.field1188[var2].field1142;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1188[var5] != null) {
                int var6 = this.field1188[var5].field1142 * 22050 / 1000;
                int var7 = this.field1188[var5].field1150 * 22050 / 1000;
                int[] var8 = this.field1188[var5].method1229(var6, this.field1188[var5].field1142);
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
