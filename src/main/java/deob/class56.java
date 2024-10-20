package deob;

@ObfuscatedName("bo")
public class class56 {

    @ObfuscatedName("bo.e")
    public class53[] field1182 = new class53[10];

    @ObfuscatedName("bo.n")
    public int field1181;

    @ObfuscatedName("bo.j")
    public int field1184;

    @ObfuscatedName("bo.g(Lez;II)Lbo;")
    public static class56 method1253(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3012(arg1, arg2);
        return var3 == null ? null : new class56(new class126(var3));
    }

    public class56(class126 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2485();
            if (var3 != 0) {
                arg0.field2016--;
                this.field1182[var2] = new class53();
                this.field1182[var2].method1208(arg0);
            }
        }
        this.field1181 = arg0.method2487();
        this.field1184 = arg0.method2487();
    }

    @ObfuscatedName("bo.e()Lbf;")
    public class62 method1243() {
        byte[] var1 = this.method1245();
        return new class62(22050, var1, this.field1181 * 22050 / 1000, this.field1184 * 22050 / 1000);
    }

    @ObfuscatedName("bo.n()I")
    public final int method1244() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1182[var2] != null && this.field1182[var2].field1163 / 20 < var1) {
                var1 = this.field1182[var2].field1163 / 20;
            }
        }
        if (this.field1181 < this.field1184 && this.field1181 / 20 < var1) {
            var1 = this.field1181 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1182[var3] != null) {
                this.field1182[var3].field1163 -= var1 * 20;
            }
        }
        if (this.field1181 < this.field1184) {
            this.field1181 -= var1 * 20;
            this.field1184 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bo.j()[B")
    public final byte[] method1245() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1182[var2] != null && this.field1182[var2].field1163 + this.field1182[var2].field1161 > var1) {
                var1 = this.field1182[var2].field1163 + this.field1182[var2].field1161;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1182[var5] != null) {
                int var6 = this.field1182[var5].field1161 * 22050 / 1000;
                int var7 = this.field1182[var5].field1163 * 22050 / 1000;
                int[] var8 = this.field1182[var5].method1216(var6, this.field1182[var5].field1161);
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
