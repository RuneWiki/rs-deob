package deob;

@ObfuscatedName("ah")
public class class52 {

    @ObfuscatedName("ah.x")
    public class65[] field1106 = new class65[10];

    @ObfuscatedName("ah.k")
    public int field1105;

    @ObfuscatedName("ah.i")
    public int field1103;

    @ObfuscatedName("ah.n(Lej;II)Lah;")
    public static class52 method1064(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2738(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2148();
            if (var3 != 0) {
                arg0.field1826--;
                this.field1106[var2] = new class65();
                this.field1106[var2].method1310(arg0);
            }
        }
        this.field1105 = arg0.method2140();
        this.field1103 = arg0.method2140();
    }

    @ObfuscatedName("ah.x()Lbv;")
    public class56 method1057() {
        byte[] var1 = this.method1062();
        return new class56(22050, var1, this.field1105 * 22050 / 1000, this.field1103 * 22050 / 1000);
    }

    @ObfuscatedName("ah.k()I")
    public final int method1058() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1233 / 20 < var1) {
                var1 = this.field1106[var2].field1233 / 20;
            }
        }
        if (this.field1105 < this.field1103 && this.field1105 / 20 < var1) {
            var1 = this.field1105 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1106[var3] != null) {
                this.field1106[var3].field1233 -= var1 * 20;
            }
        }
        if (this.field1105 < this.field1103) {
            this.field1105 -= var1 * 20;
            this.field1103 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ah.i()[B")
    public final byte[] method1062() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1233 + this.field1106[var2].field1227 > var1) {
                var1 = this.field1106[var2].field1233 + this.field1106[var2].field1227;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1106[var5] != null) {
                int var6 = this.field1106[var5].field1227 * 22050 / 1000;
                int var7 = this.field1106[var5].field1233 * 22050 / 1000;
                int[] var8 = this.field1106[var5].method1313(var6, this.field1106[var5].field1227);
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
