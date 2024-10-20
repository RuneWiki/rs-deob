package deob;

@ObfuscatedName("bt")
public class class56 {

    @ObfuscatedName("bt.k")
    public class53[] field1185 = new class53[10];

    @ObfuscatedName("bt.x")
    public int field1183;

    @ObfuscatedName("bt.m")
    public int field1186;

    @ObfuscatedName("bt.u(Leb;II)Lbt;")
    public static class56 method1248(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2965(arg1, arg2);
        return var3 == null ? null : new class56(new class126(var3));
    }

    public class56(class126 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2559();
            if (var3 != 0) {
                arg0.field2024--;
                this.field1185[var2] = new class53();
                this.field1185[var2].method1221(arg0);
            }
        }
        this.field1183 = arg0.method2450();
        this.field1186 = arg0.method2450();
    }

    @ObfuscatedName("bt.k()Lbp;")
    public class62 method1256() {
        byte[] var1 = this.method1251();
        return new class62(22050, var1, this.field1183 * 22050 / 1000, this.field1186 * 22050 / 1000);
    }

    @ObfuscatedName("bt.x()I")
    public final int method1260() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1185[var2] != null && this.field1185[var2].field1163 / 20 < var1) {
                var1 = this.field1185[var2].field1163 / 20;
            }
        }
        if (this.field1183 < this.field1186 && this.field1183 / 20 < var1) {
            var1 = this.field1183 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1185[var3] != null) {
                this.field1185[var3].field1163 -= var1 * 20;
            }
        }
        if (this.field1183 < this.field1186) {
            this.field1183 -= var1 * 20;
            this.field1186 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bt.m()[B")
    public final byte[] method1251() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1185[var2] != null && this.field1185[var2].field1163 + this.field1185[var2].field1153 > var1) {
                var1 = this.field1185[var2].field1163 + this.field1185[var2].field1153;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1185[var5] != null) {
                int var6 = this.field1185[var5].field1153 * 22050 / 1000;
                int var7 = this.field1185[var5].field1163 * 22050 / 1000;
                int[] var8 = this.field1185[var5].method1214(var6, this.field1185[var5].field1153);
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
