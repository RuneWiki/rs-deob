package deob;

@ObfuscatedName("bu")
public class class53 {

    @ObfuscatedName("bu.v")
    public class66[] field1118 = new class66[10];

    @ObfuscatedName("bu.i")
    public int field1120;

    @ObfuscatedName("bu.b")
    public int field1121;

    @ObfuscatedName("bu.a(Lek;II)Lbu;")
    public static class53 method1054(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2731(arg1, arg2);
        return var3 == null ? null : new class53(new class110(var3));
    }

    public class53(class110 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2199();
            if (var3 != 0) {
                arg0.field1861--;
                this.field1118[var2] = new class66();
                this.field1118[var2].method1304(arg0);
            }
        }
        this.field1120 = arg0.method2282();
        this.field1121 = arg0.method2282();
    }

    @ObfuscatedName("bu.v()Lbl;")
    public class57 method1055() {
        byte[] var1 = this.method1057();
        return new class57(22050, var1, this.field1120 * 22050 / 1000, this.field1121 * 22050 / 1000);
    }

    @ObfuscatedName("bu.i()I")
    public final int method1053() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1118[var2] != null && this.field1118[var2].field1243 / 20 < var1) {
                var1 = this.field1118[var2].field1243 / 20;
            }
        }
        if (this.field1120 < this.field1121 && this.field1120 / 20 < var1) {
            var1 = this.field1120 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1118[var3] != null) {
                this.field1118[var3].field1243 -= var1 * 20;
            }
        }
        if (this.field1120 < this.field1121) {
            this.field1120 -= var1 * 20;
            this.field1121 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.b()[B")
    public final byte[] method1057() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1118[var2] != null && this.field1118[var2].field1245 + this.field1118[var2].field1243 > var1) {
                var1 = this.field1118[var2].field1245 + this.field1118[var2].field1243;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1118[var5] != null) {
                int var6 = this.field1118[var5].field1245 * 22050 / 1000;
                int var7 = this.field1118[var5].field1243 * 22050 / 1000;
                int[] var8 = this.field1118[var5].method1310(var6, this.field1118[var5].field1245);
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
