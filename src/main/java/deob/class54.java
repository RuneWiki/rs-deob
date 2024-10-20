package deob;

@ObfuscatedName("bw")
public class class54 {

    @ObfuscatedName("bw.k")
    public class67[] field1154 = new class67[10];

    @ObfuscatedName("bw.e")
    public int field1155;

    @ObfuscatedName("bw.f")
    public int field1153;

    @ObfuscatedName("bw.p(Lff;II)Lbw;")
    public static class54 method1082(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2896(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2314();
            if (var3 != 0) {
                arg0.field1885--;
                this.field1154[var2] = new class67();
                this.field1154[var2].method1340(arg0);
            }
        }
        this.field1155 = arg0.method2177();
        this.field1153 = arg0.method2177();
    }

    @ObfuscatedName("bw.k()Lbp;")
    public class58 method1075() {
        byte[] var1 = this.method1072();
        return new class58(22050, var1, this.field1155 * 22050 / 1000, this.field1153 * 22050 / 1000);
    }

    @ObfuscatedName("bw.e()I")
    public final int method1076() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1154[var2] != null && this.field1154[var2].field1277 / 20 < var1) {
                var1 = this.field1154[var2].field1277 / 20;
            }
        }
        if (this.field1155 < this.field1153 && this.field1155 / 20 < var1) {
            var1 = this.field1155 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1154[var3] != null) {
                this.field1154[var3].field1277 -= var1 * 20;
            }
        }
        if (this.field1155 < this.field1153) {
            this.field1155 -= var1 * 20;
            this.field1153 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.f()[B")
    public final byte[] method1072() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1154[var2] != null && this.field1154[var2].field1277 + this.field1154[var2].field1276 > var1) {
                var1 = this.field1154[var2].field1277 + this.field1154[var2].field1276;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1154[var5] != null) {
                int var6 = this.field1154[var5].field1276 * 22050 / 1000;
                int var7 = this.field1154[var5].field1277 * 22050 / 1000;
                int[] var8 = this.field1154[var5].method1339(var6, this.field1154[var5].field1276);
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
