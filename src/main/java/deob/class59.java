package deob;

@ObfuscatedName("bs")
public class class59 {

    @ObfuscatedName("bs.d")
    public class72[] field1199 = new class72[10];

    @ObfuscatedName("bs.s")
    public int field1197;

    @ObfuscatedName("bs.q")
    public int field1196;

    @ObfuscatedName("bs.n(Lfm;II)Lbs;")
    public static class59 method1178(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3010(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2338();
            if (var3 != 0) {
                arg0.field1977--;
                this.field1199[var2] = new class72();
                this.field1199[var2].method1440(arg0);
            }
        }
        this.field1197 = arg0.method2377();
        this.field1196 = arg0.method2377();
    }

    @ObfuscatedName("bs.d()Lbe;")
    public class63 method1180() {
        byte[] var1 = this.method1181();
        return new class63(22050, var1, this.field1197 * 22050 / 1000, this.field1196 * 22050 / 1000);
    }

    @ObfuscatedName("bs.s()I")
    public final int method1183() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1199[var2] != null && this.field1199[var2].field1324 / 20 < var1) {
                var1 = this.field1199[var2].field1324 / 20;
            }
        }
        if (this.field1197 < this.field1196 && this.field1197 / 20 < var1) {
            var1 = this.field1197 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1199[var3] != null) {
                this.field1199[var3].field1324 -= var1 * 20;
            }
        }
        if (this.field1197 < this.field1196) {
            this.field1197 -= var1 * 20;
            this.field1196 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bs.q()[B")
    public final byte[] method1181() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1199[var2] != null && this.field1199[var2].field1324 + this.field1199[var2].field1320 > var1) {
                var1 = this.field1199[var2].field1324 + this.field1199[var2].field1320;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1199[var5] != null) {
                int var6 = this.field1199[var5].field1320 * 22050 / 1000;
                int var7 = this.field1199[var5].field1324 * 22050 / 1000;
                int[] var8 = this.field1199[var5].method1437(var6, this.field1199[var5].field1320);
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
