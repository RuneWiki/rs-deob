package deob;

@ObfuscatedName("ar")
public class class52 {

    @ObfuscatedName("ar.b")
    public class65[] field1106 = new class65[10];

    @ObfuscatedName("ar.e")
    public int field1108;

    @ObfuscatedName("ar.i")
    public int field1109;

    @ObfuscatedName("ar.k(Ley;II)Lar;")
    public static class52 method1047(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2759(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2115();
            if (var3 != 0) {
                arg0.field1862--;
                this.field1106[var2] = new class65();
                this.field1106[var2].method1305(arg0);
            }
        }
        this.field1108 = arg0.method2117();
        this.field1109 = arg0.method2117();
    }

    @ObfuscatedName("ar.b()Lbf;")
    public class56 method1037() {
        byte[] var1 = this.method1039();
        return new class56(22050, var1, this.field1108 * 22050 / 1000, this.field1109 * 22050 / 1000);
    }

    @ObfuscatedName("ar.e()I")
    public final int method1038() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1220 / 20 < var1) {
                var1 = this.field1106[var2].field1220 / 20;
            }
        }
        if (this.field1108 < this.field1109 && this.field1108 / 20 < var1) {
            var1 = this.field1108 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1106[var3] != null) {
                this.field1106[var3].field1220 -= var1 * 20;
            }
        }
        if (this.field1108 < this.field1109) {
            this.field1108 -= var1 * 20;
            this.field1109 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ar.i()[B")
    public final byte[] method1039() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1234 + this.field1106[var2].field1220 > var1) {
                var1 = this.field1106[var2].field1234 + this.field1106[var2].field1220;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1106[var5] != null) {
                int var6 = this.field1106[var5].field1234 * 22050 / 1000;
                int var7 = this.field1106[var5].field1220 * 22050 / 1000;
                int[] var8 = this.field1106[var5].method1303(var6, this.field1106[var5].field1234);
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
