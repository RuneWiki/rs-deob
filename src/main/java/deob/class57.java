package deob;

@ObfuscatedName("bh")
public class class57 {

    @ObfuscatedName("bh.c")
    public class54[] field1206 = new class54[10];

    @ObfuscatedName("bh.j")
    public int field1205;

    @ObfuscatedName("bh.i")
    public int field1207;

    @ObfuscatedName("bh.b(Leo;II)Lbh;")
    public static class57 method1249(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2964(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2416();
            if (var3 != 0) {
                arg0.field2051--;
                this.field1206[var2] = new class54();
                this.field1206[var2].method1208(arg0);
            }
        }
        this.field1205 = arg0.method2394();
        this.field1207 = arg0.method2394();
    }

    @ObfuscatedName("bh.c()Lbl;")
    public class63 method1239() {
        byte[] var1 = this.method1241();
        return new class63(22050, var1, this.field1205 * 22050 / 1000, this.field1207 * 22050 / 1000);
    }

    @ObfuscatedName("bh.j()I")
    public final int method1252() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1206[var2] != null && this.field1206[var2].field1174 / 20 < var1) {
                var1 = this.field1206[var2].field1174 / 20;
            }
        }
        if (this.field1205 < this.field1207 && this.field1205 / 20 < var1) {
            var1 = this.field1205 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1206[var3] != null) {
                this.field1206[var3].field1174 -= var1 * 20;
            }
        }
        if (this.field1205 < this.field1207) {
            this.field1205 -= var1 * 20;
            this.field1207 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.i()[B")
    public final byte[] method1241() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1206[var2] != null && this.field1206[var2].field1174 + this.field1206[var2].field1159 > var1) {
                var1 = this.field1206[var2].field1174 + this.field1206[var2].field1159;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1206[var5] != null) {
                int var6 = this.field1206[var5].field1159 * 22050 / 1000;
                int var7 = this.field1206[var5].field1174 * 22050 / 1000;
                int[] var8 = this.field1206[var5].method1213(var6, this.field1206[var5].field1159);
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
