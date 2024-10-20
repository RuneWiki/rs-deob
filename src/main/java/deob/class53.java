package deob;

@ObfuscatedName("bx")
public class class53 {

    @ObfuscatedName("bx.t")
    public int field1108;

    @ObfuscatedName("bx.f")
    public class66[] field1106 = new class66[10];

    @ObfuscatedName("bx.j")
    public int field1109;

    @ObfuscatedName("bx.v(Lem;II)Lbx;")
    public static class53 method1054(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2852(arg1, arg2);
        return var3 == null ? null : new class53(new class110(var3));
    }

    public class53(class110 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2257();
            if (var3 != 0) {
                arg0.field1847--;
                this.field1106[var2] = new class66();
                this.field1106[var2].method1310(arg0);
            }
        }
        this.field1108 = arg0.method2194();
        this.field1109 = arg0.method2194();
    }

    @ObfuscatedName("bx.t()Lbb;")
    public class57 method1047() {
        byte[] var1 = this.method1049();
        return new class57(22050, var1, this.field1108 * 22050 / 1000, this.field1109 * 22050 / 1000);
    }

    @ObfuscatedName("bx.f()I")
    public final int method1048() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1236 / 20 < var1) {
                var1 = this.field1106[var2].field1236 / 20;
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
                this.field1106[var3].field1236 -= var1 * 20;
            }
        }
        if (this.field1108 < this.field1109) {
            this.field1108 -= var1 * 20;
            this.field1109 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bx.j()[B")
    public final byte[] method1049() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1236 + this.field1106[var2].field1235 > var1) {
                var1 = this.field1106[var2].field1236 + this.field1106[var2].field1235;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1106[var5] != null) {
                int var6 = this.field1106[var5].field1235 * 22050 / 1000;
                int var7 = this.field1106[var5].field1236 * 22050 / 1000;
                int[] var8 = this.field1106[var5].method1308(var6, this.field1106[var5].field1235);
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
