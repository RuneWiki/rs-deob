package deob;

@ObfuscatedName("bi")
public class class57 {

    @ObfuscatedName("bi.p")
    public class54[] field1171 = new class54[10];

    @ObfuscatedName("bi.k")
    public int field1173;

    @ObfuscatedName("bi.a")
    public int field1174;

    @ObfuscatedName("bi.x(Lej;II)Lbi;")
    public static class57 method1228(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2920(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2484();
            if (var3 != 0) {
                arg0.field2008--;
                this.field1171[var2] = new class54();
                this.field1171[var2].method1192(arg0);
            }
        }
        this.field1173 = arg0.method2539();
        this.field1174 = arg0.method2539();
    }

    @ObfuscatedName("bi.p()Lbj;")
    public class63 method1221() {
        byte[] var1 = this.method1220();
        return new class63(22050, var1, this.field1173 * 22050 / 1000, this.field1174 * 22050 / 1000);
    }

    @ObfuscatedName("bi.k()I")
    public final int method1222() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1171[var2] != null && this.field1171[var2].field1130 / 20 < var1) {
                var1 = this.field1171[var2].field1130 / 20;
            }
        }
        if (this.field1173 < this.field1174 && this.field1173 / 20 < var1) {
            var1 = this.field1173 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1171[var3] != null) {
                this.field1171[var3].field1130 -= var1 * 20;
            }
        }
        if (this.field1173 < this.field1174) {
            this.field1173 -= var1 * 20;
            this.field1174 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bi.a()[B")
    public final byte[] method1220() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1171[var2] != null && this.field1171[var2].field1140 + this.field1171[var2].field1130 > var1) {
                var1 = this.field1171[var2].field1140 + this.field1171[var2].field1130;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1171[var5] != null) {
                int var6 = this.field1171[var5].field1140 * 22050 / 1000;
                int var7 = this.field1171[var5].field1130 * 22050 / 1000;
                int[] var8 = this.field1171[var5].method1193(var6, this.field1171[var5].field1140);
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
