package deob;

@ObfuscatedName("bd")
public class class57 {

    @ObfuscatedName("bd.q")
    public class54[] field1214 = new class54[10];

    @ObfuscatedName("bd.y")
    public int field1215;

    @ObfuscatedName("bd.v")
    public int field1216;

    @ObfuscatedName("bd.c(Ley;II)Lbd;")
    public static class57 method1209(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2886(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2383();
            if (var3 != 0) {
                arg0.field2052--;
                this.field1214[var2] = new class54();
                this.field1214[var2].method1168(arg0);
            }
        }
        this.field1215 = arg0.method2327();
        this.field1216 = arg0.method2327();
    }

    @ObfuscatedName("bd.q()Lbo;")
    public class63 method1199() {
        byte[] var1 = this.method1205();
        return new class63(22050, var1, this.field1215 * 22050 / 1000, this.field1216 * 22050 / 1000);
    }

    @ObfuscatedName("bd.y()I")
    public final int method1214() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1214[var2] != null && this.field1214[var2].field1179 / 20 < var1) {
                var1 = this.field1214[var2].field1179 / 20;
            }
        }
        if (this.field1215 < this.field1216 && this.field1215 / 20 < var1) {
            var1 = this.field1215 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1214[var3] != null) {
                this.field1214[var3].field1179 -= var1 * 20;
            }
        }
        if (this.field1215 < this.field1216) {
            this.field1215 -= var1 * 20;
            this.field1216 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.v()[B")
    public final byte[] method1205() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1214[var2] != null && this.field1214[var2].field1179 + this.field1214[var2].field1167 > var1) {
                var1 = this.field1214[var2].field1179 + this.field1214[var2].field1167;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1214[var5] != null) {
                int var6 = this.field1214[var5].field1167 * 22050 / 1000;
                int var7 = this.field1214[var5].field1179 * 22050 / 1000;
                int[] var8 = this.field1214[var5].method1172(var6, this.field1214[var5].field1167);
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
