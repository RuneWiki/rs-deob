package deob;

@ObfuscatedName("bi")
public class class57 {

    @ObfuscatedName("bi.m")
    public class54[] field1186 = new class54[10];

    @ObfuscatedName("bi.d")
    public int field1185;

    @ObfuscatedName("bi.k")
    public int field1188;

    @ObfuscatedName("bi.y(Lel;II)Lbi;")
    public static class57 method1259(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2991(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2534();
            if (var3 != 0) {
                arg0.field2036--;
                this.field1186[var2] = new class54();
                this.field1186[var2].method1232(arg0);
            }
        }
        this.field1185 = arg0.method2460();
        this.field1188 = arg0.method2460();
    }

    @ObfuscatedName("bi.m()Lbx;")
    public class63 method1263() {
        byte[] var1 = this.method1260();
        return new class63(22050, var1, this.field1185 * 22050 / 1000, this.field1188 * 22050 / 1000);
    }

    @ObfuscatedName("bi.d()I")
    public final int method1268() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1186[var2] != null && this.field1186[var2].field1158 / 20 < var1) {
                var1 = this.field1186[var2].field1158 / 20;
            }
        }
        if (this.field1185 < this.field1188 && this.field1185 / 20 < var1) {
            var1 = this.field1185 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1186[var3] != null) {
                this.field1186[var3].field1158 -= var1 * 20;
            }
        }
        if (this.field1185 < this.field1188) {
            this.field1185 -= var1 * 20;
            this.field1188 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bi.k()[B")
    public final byte[] method1260() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1186[var2] != null && this.field1186[var2].field1158 + this.field1186[var2].field1140 > var1) {
                var1 = this.field1186[var2].field1158 + this.field1186[var2].field1140;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1186[var5] != null) {
                int var6 = this.field1186[var5].field1140 * 22050 / 1000;
                int var7 = this.field1186[var5].field1158 * 22050 / 1000;
                int[] var8 = this.field1186[var5].method1233(var6, this.field1186[var5].field1140);
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
