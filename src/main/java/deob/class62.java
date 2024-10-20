package deob;

@ObfuscatedName("by")
public class class62 {

    @ObfuscatedName("by.g")
    public class75[] field1281 = new class75[10];

    @ObfuscatedName("by.r")
    public int field1283;

    @ObfuscatedName("by.e")
    public int field1284;

    @ObfuscatedName("by.l(Lfp;II)Lby;")
    public static class62 method1355(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3210(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2490();
            if (var3 != 0) {
                arg0.field2051--;
                this.field1281[var2] = new class75();
                this.field1281[var2].method1587(arg0);
            }
        }
        this.field1283 = arg0.method2492();
        this.field1284 = arg0.method2492();
    }

    @ObfuscatedName("by.g()Lbz;")
    public class66 method1344() {
        byte[] var1 = this.method1346();
        return new class66(22050, var1, this.field1283 * 22050 / 1000, this.field1284 * 22050 / 1000);
    }

    @ObfuscatedName("by.r()I")
    public final int method1345() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1281[var2] != null && this.field1281[var2].field1409 / 20 < var1) {
                var1 = this.field1281[var2].field1409 / 20;
            }
        }
        if (this.field1283 < this.field1284 && this.field1283 / 20 < var1) {
            var1 = this.field1283 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1281[var3] != null) {
                this.field1281[var3].field1409 -= var1 * 20;
            }
        }
        if (this.field1283 < this.field1284) {
            this.field1283 -= var1 * 20;
            this.field1284 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("by.e()[B")
    public final byte[] method1346() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1281[var2] != null && this.field1281[var2].field1409 + this.field1281[var2].field1408 > var1) {
                var1 = this.field1281[var2].field1409 + this.field1281[var2].field1408;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1281[var5] != null) {
                int var6 = this.field1281[var5].field1408 * 22050 / 1000;
                int var7 = this.field1281[var5].field1409 * 22050 / 1000;
                int[] var8 = this.field1281[var5].method1591(var6, this.field1281[var5].field1408);
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
