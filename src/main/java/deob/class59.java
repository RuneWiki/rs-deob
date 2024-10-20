package deob;

@ObfuscatedName("bp")
public class class59 {

    @ObfuscatedName("bp.g")
    public class72[] field1181 = new class72[10];

    @ObfuscatedName("bp.j")
    public int field1182;

    @ObfuscatedName("bp.d")
    public int field1184;

    @ObfuscatedName("bp.b(Lfl;II)Lbp;")
    public static class59 method1203(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3037(arg1, arg2);
        return var3 == null ? null : new class59(new class120(var3));
    }

    public class59(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2344();
            if (var3 != 0) {
                arg0.field1977--;
                this.field1181[var2] = new class72();
                this.field1181[var2].method1479(arg0);
            }
        }
        this.field1182 = arg0.method2346();
        this.field1184 = arg0.method2346();
    }

    @ObfuscatedName("bp.g()Lbh;")
    public class63 method1209() {
        byte[] var1 = this.method1201();
        return new class63(22050, var1, this.field1182 * 22050 / 1000, this.field1184 * 22050 / 1000);
    }

    @ObfuscatedName("bp.j()I")
    public final int method1202() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1181[var2] != null && this.field1181[var2].field1311 / 20 < var1) {
                var1 = this.field1181[var2].field1311 / 20;
            }
        }
        if (this.field1182 < this.field1184 && this.field1182 / 20 < var1) {
            var1 = this.field1182 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1181[var3] != null) {
                this.field1181[var3].field1311 -= var1 * 20;
            }
        }
        if (this.field1182 < this.field1184) {
            this.field1182 -= var1 * 20;
            this.field1184 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bp.d()[B")
    public final byte[] method1201() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1181[var2] != null && this.field1181[var2].field1311 + this.field1181[var2].field1308 > var1) {
                var1 = this.field1181[var2].field1311 + this.field1181[var2].field1308;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1181[var5] != null) {
                int var6 = this.field1181[var5].field1308 * 22050 / 1000;
                int var7 = this.field1181[var5].field1311 * 22050 / 1000;
                int[] var8 = this.field1181[var5].method1473(var6, this.field1181[var5].field1308);
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
