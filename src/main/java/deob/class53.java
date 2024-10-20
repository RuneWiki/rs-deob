package deob;

@ObfuscatedName("bq")
public class class53 {

    @ObfuscatedName("bq.e")
    public class66[] field1115 = new class66[10];

    @ObfuscatedName("bq.i")
    public int field1114;

    @ObfuscatedName("bq.k")
    public int field1117;

    @ObfuscatedName("bq.b(Lex;II)Lbq;")
    public static class53 method1033(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2761(arg1, arg2);
        return var3 == null ? null : new class53(new class110(var3));
    }

    public class53(class110 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2142();
            if (var3 != 0) {
                arg0.field1855--;
                this.field1115[var2] = new class66();
                this.field1115[var2].method1295(arg0);
            }
        }
        this.field1114 = arg0.method2292();
        this.field1117 = arg0.method2292();
    }

    @ObfuscatedName("bq.e()Lbx;")
    public class57 method1024() {
        byte[] var1 = this.method1026();
        return new class57(22050, var1, this.field1114 * 22050 / 1000, this.field1117 * 22050 / 1000);
    }

    @ObfuscatedName("bq.i()I")
    public final int method1023() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1115[var2] != null && this.field1115[var2].field1240 / 20 < var1) {
                var1 = this.field1115[var2].field1240 / 20;
            }
        }
        if (this.field1114 < this.field1117 && this.field1114 / 20 < var1) {
            var1 = this.field1114 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1115[var3] != null) {
                this.field1115[var3].field1240 -= var1 * 20;
            }
        }
        if (this.field1114 < this.field1117) {
            this.field1114 -= var1 * 20;
            this.field1117 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bq.k()[B")
    public final byte[] method1026() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1115[var2] != null && this.field1115[var2].field1240 + this.field1115[var2].field1227 > var1) {
                var1 = this.field1115[var2].field1240 + this.field1115[var2].field1227;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1115[var5] != null) {
                int var6 = this.field1115[var5].field1227 * 22050 / 1000;
                int var7 = this.field1115[var5].field1240 * 22050 / 1000;
                int[] var8 = this.field1115[var5].method1288(var6, this.field1115[var5].field1227);
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
