package deob;

@ObfuscatedName("aw")
public class class49 {

    @ObfuscatedName("aw.k")
    public class62[] field1079 = new class62[10];

    @ObfuscatedName("aw.y")
    public int field1082;

    @ObfuscatedName("aw.g")
    public int field1080;

    @ObfuscatedName("aw.m(Lek;II)Law;")
    public static class49 method1027(class142 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2725(arg1, arg2);
        return var3 == null ? null : new class49(new class104(var3));
    }

    public class49(class104 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2190();
            if (var3 != 0) {
                arg0.field1806--;
                this.field1079[var2] = new class62();
                this.field1079[var2].method1280(arg0);
            }
        }
        this.field1082 = arg0.method2132();
        this.field1080 = arg0.method2132();
    }

    @ObfuscatedName("aw.k()Lbw;")
    public class53 method1021() {
        byte[] var1 = this.method1020();
        return new class53(22050, var1, this.field1082 * 22050 / 1000, this.field1080 * 22050 / 1000);
    }

    @ObfuscatedName("aw.y()I")
    public final int method1022() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1079[var2] != null && this.field1079[var2].field1210 / 20 < var1) {
                var1 = this.field1079[var2].field1210 / 20;
            }
        }
        if (this.field1082 < this.field1080 && this.field1082 / 20 < var1) {
            var1 = this.field1082 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1079[var3] != null) {
                this.field1079[var3].field1210 -= var1 * 20;
            }
        }
        if (this.field1082 < this.field1080) {
            this.field1082 -= var1 * 20;
            this.field1080 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("aw.g()[B")
    public final byte[] method1020() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1079[var2] != null && this.field1079[var2].field1210 + this.field1079[var2].field1207 > var1) {
                var1 = this.field1079[var2].field1210 + this.field1079[var2].field1207;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1079[var5] != null) {
                int var6 = this.field1079[var5].field1207 * 22050 / 1000;
                int var7 = this.field1079[var5].field1210 * 22050 / 1000;
                int[] var8 = this.field1079[var5].method1286(var6, this.field1079[var5].field1207);
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
