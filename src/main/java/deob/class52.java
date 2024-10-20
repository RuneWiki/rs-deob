package deob;

@ObfuscatedName("aa")
public class class52 {

    @ObfuscatedName("aa.y")
    public class65[] field1088 = new class65[10];

    @ObfuscatedName("aa.s")
    public int field1089;

    @ObfuscatedName("aa.g")
    public int field1087;

    @ObfuscatedName("aa.k(Lei;II)Laa;")
    public static class52 method1047(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2729(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2138();
            if (var3 != 0) {
                arg0.field1838--;
                this.field1088[var2] = new class65();
                this.field1088[var2].method1303(arg0);
            }
        }
        this.field1089 = arg0.method2239();
        this.field1087 = arg0.method2239();
    }

    @ObfuscatedName("aa.y()Lbo;")
    public class56 method1042() {
        byte[] var1 = this.method1049();
        return new class56(22050, var1, this.field1089 * 22050 / 1000, this.field1087 * 22050 / 1000);
    }

    @ObfuscatedName("aa.s()I")
    public final int method1043() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1088[var2] != null && this.field1088[var2].field1216 / 20 < var1) {
                var1 = this.field1088[var2].field1216 / 20;
            }
        }
        if (this.field1089 < this.field1087 && this.field1089 / 20 < var1) {
            var1 = this.field1089 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1088[var3] != null) {
                this.field1088[var3].field1216 -= var1 * 20;
            }
        }
        if (this.field1089 < this.field1087) {
            this.field1089 -= var1 * 20;
            this.field1087 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("aa.g()[B")
    public final byte[] method1049() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1088[var2] != null && this.field1088[var2].field1216 + this.field1088[var2].field1215 > var1) {
                var1 = this.field1088[var2].field1216 + this.field1088[var2].field1215;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1088[var5] != null) {
                int var6 = this.field1088[var5].field1215 * 22050 / 1000;
                int var7 = this.field1088[var5].field1216 * 22050 / 1000;
                int[] var8 = this.field1088[var5].method1301(var6, this.field1088[var5].field1215);
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
