package deob;

@ObfuscatedName("br")
public class class59 {

    @ObfuscatedName("br.b")
    public class72[] field1204 = new class72[10];

    @ObfuscatedName("br.w")
    public int field1206;

    @ObfuscatedName("br.d")
    public int field1207;

    @ObfuscatedName("br.g(Lfc;II)Lbr;")
    public static class59 method1253(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3112(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2362();
            if (var3 != 0) {
                arg0.field1977--;
                this.field1204[var2] = new class72();
                this.field1204[var2].method1504(arg0);
            }
        }
        this.field1206 = arg0.method2376();
        this.field1207 = arg0.method2376();
    }

    @ObfuscatedName("br.b()Lbd;")
    public class63 method1257() {
        byte[] var1 = this.method1248();
        return new class63(22050, var1, this.field1206 * 22050 / 1000, this.field1207 * 22050 / 1000);
    }

    @ObfuscatedName("br.w()I")
    public final int method1247() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field1331 / 20 < var1) {
                var1 = this.field1204[var2].field1331 / 20;
            }
        }
        if (this.field1206 < this.field1207 && this.field1206 / 20 < var1) {
            var1 = this.field1206 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1204[var3] != null) {
                this.field1204[var3].field1331 -= var1 * 20;
            }
        }
        if (this.field1206 < this.field1207) {
            this.field1206 -= var1 * 20;
            this.field1207 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.d()[B")
    public final byte[] method1248() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field1331 + this.field1204[var2].field1330 > var1) {
                var1 = this.field1204[var2].field1331 + this.field1204[var2].field1330;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1204[var5] != null) {
                int var6 = this.field1204[var5].field1330 * 22050 / 1000;
                int var7 = this.field1204[var5].field1331 * 22050 / 1000;
                int[] var8 = this.field1204[var5].method1506(var6, this.field1204[var5].field1330);
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
