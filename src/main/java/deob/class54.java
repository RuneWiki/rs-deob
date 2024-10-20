package deob;

@ObfuscatedName("bo")
public class class54 {

    @ObfuscatedName("bo.d")
    public class67[] field1142 = new class67[10];

    @ObfuscatedName("bo.z")
    public int field1144;

    @ObfuscatedName("bo.y")
    public int field1145;

    @ObfuscatedName("bo.n(Lfs;II)Lbo;")
    public static class54 method1103(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2948(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2228();
            if (var3 != 0) {
                arg0.field1889--;
                this.field1142[var2] = new class67();
                this.field1142[var2].method1376(arg0);
            }
        }
        this.field1144 = arg0.method2231();
        this.field1145 = arg0.method2231();
    }

    @ObfuscatedName("bo.d()Lba;")
    public class58 method1104() {
        byte[] var1 = this.method1105();
        return new class58(22050, var1, this.field1144 * 22050 / 1000, this.field1145 * 22050 / 1000);
    }

    @ObfuscatedName("bo.z()I")
    public final int method1107() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1142[var2] != null && this.field1142[var2].field1272 / 20 < var1) {
                var1 = this.field1142[var2].field1272 / 20;
            }
        }
        if (this.field1144 < this.field1145 && this.field1144 / 20 < var1) {
            var1 = this.field1144 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1142[var3] != null) {
                this.field1142[var3].field1272 -= var1 * 20;
            }
        }
        if (this.field1144 < this.field1145) {
            this.field1144 -= var1 * 20;
            this.field1145 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bo.y()[B")
    public final byte[] method1105() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1142[var2] != null && this.field1142[var2].field1272 + this.field1142[var2].field1271 > var1) {
                var1 = this.field1142[var2].field1272 + this.field1142[var2].field1271;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1142[var5] != null) {
                int var6 = this.field1142[var5].field1271 * 22050 / 1000;
                int var7 = this.field1142[var5].field1272 * 22050 / 1000;
                int[] var8 = this.field1142[var5].method1375(var6, this.field1142[var5].field1271);
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
