package deob;

@ObfuscatedName("bq")
public class class53 {

    @ObfuscatedName("bq.j")
    public class66[] field1115 = new class66[10];

    @ObfuscatedName("bq.z")
    public int field1117;

    @ObfuscatedName("bq.b")
    public int field1116;

    @ObfuscatedName("bq.g(Lei;II)Lbq;")
    public static class53 method1019(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2660(arg1, arg2);
        return var3 == null ? null : new class53(new class108(var3));
    }

    public class53(class108 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2083();
            if (var3 != 0) {
                arg0.field1824--;
                this.field1115[var2] = new class66();
                this.field1115[var2].method1252(arg0);
            }
        }
        this.field1117 = arg0.method2263();
        this.field1116 = arg0.method2263();
    }

    @ObfuscatedName("bq.j()Lbg;")
    public class57 method1011() {
        byte[] var1 = this.method1013();
        return new class57(22050, var1, this.field1117 * 22050 / 1000, this.field1116 * 22050 / 1000);
    }

    @ObfuscatedName("bq.z()I")
    public final int method1012() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1115[var2] != null && this.field1115[var2].field1248 / 20 < var1) {
                var1 = this.field1115[var2].field1248 / 20;
            }
        }
        if (this.field1117 < this.field1116 && this.field1117 / 20 < var1) {
            var1 = this.field1117 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1115[var3] != null) {
                this.field1115[var3].field1248 -= var1 * 20;
            }
        }
        if (this.field1117 < this.field1116) {
            this.field1117 -= var1 * 20;
            this.field1116 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bq.b()[B")
    public final byte[] method1013() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1115[var2] != null && this.field1115[var2].field1248 + this.field1115[var2].field1243 > var1) {
                var1 = this.field1115[var2].field1248 + this.field1115[var2].field1243;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1115[var5] != null) {
                int var6 = this.field1115[var5].field1243 * 22050 / 1000;
                int var7 = this.field1115[var5].field1248 * 22050 / 1000;
                int[] var8 = this.field1115[var5].method1250(var6, this.field1115[var5].field1243);
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
