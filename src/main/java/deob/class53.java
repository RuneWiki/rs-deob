package deob;

@ObfuscatedName("ba")
public class class53 {

    @ObfuscatedName("ba.k")
    public class66[] field1124 = new class66[10];

    @ObfuscatedName("ba.y")
    public int field1125;

    @ObfuscatedName("ba.e")
    public int field1123;

    @ObfuscatedName("ba.f(Lev;II)Lba;")
    public static class53 method1073(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2763(arg1, arg2);
        return var3 == null ? null : new class53(new class108(var3));
    }

    public class53(class108 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2158();
            if (var3 != 0) {
                arg0.field1859--;
                this.field1124[var2] = new class66();
                this.field1124[var2].method1345(arg0);
            }
        }
        this.field1125 = arg0.method2160();
        this.field1123 = arg0.method2160();
    }

    @ObfuscatedName("ba.k()Lbu;")
    public class57 method1085() {
        byte[] var1 = this.method1076();
        return new class57(22050, var1, this.field1125 * 22050 / 1000, this.field1123 * 22050 / 1000);
    }

    @ObfuscatedName("ba.y()I")
    public final int method1074() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1124[var2] != null && this.field1124[var2].field1260 / 20 < var1) {
                var1 = this.field1124[var2].field1260 / 20;
            }
        }
        if (this.field1125 < this.field1123 && this.field1125 / 20 < var1) {
            var1 = this.field1125 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1124[var3] != null) {
                this.field1124[var3].field1260 -= var1 * 20;
            }
        }
        if (this.field1125 < this.field1123) {
            this.field1125 -= var1 * 20;
            this.field1123 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ba.e()[B")
    public final byte[] method1076() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1124[var2] != null && this.field1124[var2].field1260 + this.field1124[var2].field1255 > var1) {
                var1 = this.field1124[var2].field1260 + this.field1124[var2].field1255;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1124[var5] != null) {
                int var6 = this.field1124[var5].field1255 * 22050 / 1000;
                int var7 = this.field1124[var5].field1260 * 22050 / 1000;
                int[] var8 = this.field1124[var5].method1342(var6, this.field1124[var5].field1255);
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
