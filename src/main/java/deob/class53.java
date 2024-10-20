package deob;

@ObfuscatedName("bm")
public class class53 {

    @ObfuscatedName("bm.y")
    public class66[] field1106 = new class66[10];

    @ObfuscatedName("bm.g")
    public int field1105;

    @ObfuscatedName("bm.j")
    public int field1108;

    @ObfuscatedName("bm.l(Leo;II)Lbm;")
    public static class53 method1027(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2752(arg1, arg2);
        return var3 == null ? null : new class53(new class108(var3));
    }

    public class53(class108 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2291();
            if (var3 != 0) {
                arg0.field1823--;
                this.field1106[var2] = new class66();
                this.field1106[var2].method1302(arg0);
            }
        }
        this.field1105 = arg0.method2163();
        this.field1108 = arg0.method2163();
    }

    @ObfuscatedName("bm.y()Lbe;")
    public class57 method1029() {
        byte[] var1 = this.method1030();
        return new class57(22050, var1, this.field1105 * 22050 / 1000, this.field1108 * 22050 / 1000);
    }

    @ObfuscatedName("bm.g()I")
    public final int method1033() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1233 / 20 < var1) {
                var1 = this.field1106[var2].field1233 / 20;
            }
        }
        if (this.field1105 < this.field1108 && this.field1105 / 20 < var1) {
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
        if (this.field1105 < this.field1108) {
            this.field1105 -= var1 * 20;
            this.field1108 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bm.j()[B")
    public final byte[] method1030() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1106[var2] != null && this.field1106[var2].field1233 + this.field1106[var2].field1225 > var1) {
                var1 = this.field1106[var2].field1233 + this.field1106[var2].field1225;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1106[var5] != null) {
                int var6 = this.field1106[var5].field1225 * 22050 / 1000;
                int var7 = this.field1106[var5].field1233 * 22050 / 1000;
                int[] var8 = this.field1106[var5].method1303(var6, this.field1106[var5].field1225);
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
