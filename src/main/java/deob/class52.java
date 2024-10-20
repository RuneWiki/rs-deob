package deob;

@ObfuscatedName("aa")
public class class52 {

    @ObfuscatedName("aa.p")
    public class65[] field1101 = new class65[10];

    @ObfuscatedName("aa.a")
    public int field1100;

    @ObfuscatedName("aa.g")
    public int field1103;

    @ObfuscatedName("aa.e(Lec;II)Laa;")
    public static class52 method1072(class145 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2717(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2125();
            if (var3 != 0) {
                arg0.field1841--;
                this.field1101[var2] = new class65();
                this.field1101[var2].method1315(arg0);
            }
        }
        this.field1100 = arg0.method2182();
        this.field1103 = arg0.method2182();
    }

    @ObfuscatedName("aa.p()Lbo;")
    public class56 method1065() {
        byte[] var1 = this.method1066();
        return new class56(22050, var1, this.field1100 * 22050 / 1000, this.field1103 * 22050 / 1000);
    }

    @ObfuscatedName("aa.a()I")
    public final int method1064() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1101[var2] != null && this.field1101[var2].field1214 / 20 < var1) {
                var1 = this.field1101[var2].field1214 / 20;
            }
        }
        if (this.field1100 < this.field1103 && this.field1100 / 20 < var1) {
            var1 = this.field1100 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1101[var3] != null) {
                this.field1101[var3].field1214 -= var1 * 20;
            }
        }
        if (this.field1100 < this.field1103) {
            this.field1100 -= var1 * 20;
            this.field1103 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("aa.g()[B")
    public final byte[] method1066() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1101[var2] != null && this.field1101[var2].field1229 + this.field1101[var2].field1214 > var1) {
                var1 = this.field1101[var2].field1229 + this.field1101[var2].field1214;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1101[var5] != null) {
                int var6 = this.field1101[var5].field1229 * 22050 / 1000;
                int var7 = this.field1101[var5].field1214 * 22050 / 1000;
                int[] var8 = this.field1101[var5].method1312(var6, this.field1101[var5].field1229);
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
