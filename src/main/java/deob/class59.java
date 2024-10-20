package deob;

@ObfuscatedName("bj")
public class class59 {

    @ObfuscatedName("bj.h")
    public class72[] field1205 = new class72[10];

    @ObfuscatedName("bj.k")
    public int field1206;

    @ObfuscatedName("bj.t")
    public int field1204;

    @ObfuscatedName("bj.c(Lfj;II)Lbj;")
    public static class59 method1199(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2994(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2291();
            if (var3 != 0) {
                arg0.field1955--;
                this.field1205[var2] = new class72();
                this.field1205[var2].method1452(arg0);
            }
        }
        this.field1206 = arg0.method2293();
        this.field1204 = arg0.method2293();
    }

    @ObfuscatedName("bj.h()Lbn;")
    public class63 method1194() {
        byte[] var1 = this.method1201();
        return new class63(22050, var1, this.field1206 * 22050 / 1000, this.field1204 * 22050 / 1000);
    }

    @ObfuscatedName("bj.k()I")
    public final int method1195() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1205[var2] != null && this.field1205[var2].field1329 / 20 < var1) {
                var1 = this.field1205[var2].field1329 / 20;
            }
        }
        if (this.field1206 < this.field1204 && this.field1206 / 20 < var1) {
            var1 = this.field1206 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1205[var3] != null) {
                this.field1205[var3].field1329 -= var1 * 20;
            }
        }
        if (this.field1206 < this.field1204) {
            this.field1206 -= var1 * 20;
            this.field1204 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bj.t()[B")
    public final byte[] method1201() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1205[var2] != null && this.field1205[var2].field1329 + this.field1205[var2].field1315 > var1) {
                var1 = this.field1205[var2].field1329 + this.field1205[var2].field1315;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1205[var5] != null) {
                int var6 = this.field1205[var5].field1315 * 22050 / 1000;
                int var7 = this.field1205[var5].field1329 * 22050 / 1000;
                int[] var8 = this.field1205[var5].method1450(var6, this.field1205[var5].field1315);
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
