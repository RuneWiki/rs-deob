package deob;

@ObfuscatedName("bm")
public class class54 {

    @ObfuscatedName("bm.l")
    public class67[] field1134 = new class67[10];

    @ObfuscatedName("bm.g")
    public int field1133;

    @ObfuscatedName("bm.u")
    public int field1132;

    @ObfuscatedName("bm.o(Lfg;II)Lbm;")
    public static class54 method1129(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2940(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2219();
            if (var3 != 0) {
                arg0.field1861--;
                this.field1134[var2] = new class67();
                this.field1134[var2].method1364(arg0);
            }
        }
        this.field1133 = arg0.method2397();
        this.field1132 = arg0.method2397();
    }

    @ObfuscatedName("bm.l()Lbz;")
    public class58 method1122() {
        byte[] var1 = this.method1121();
        return new class58(22050, var1, this.field1133 * 22050 / 1000, this.field1132 * 22050 / 1000);
    }

    @ObfuscatedName("bm.g()I")
    public final int method1128() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1134[var2] != null && this.field1134[var2].field1261 / 20 < var1) {
                var1 = this.field1134[var2].field1261 / 20;
            }
        }
        if (this.field1133 < this.field1132 && this.field1133 / 20 < var1) {
            var1 = this.field1133 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1134[var3] != null) {
                this.field1134[var3].field1261 -= var1 * 20;
            }
        }
        if (this.field1133 < this.field1132) {
            this.field1133 -= var1 * 20;
            this.field1132 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bm.u()[B")
    public final byte[] method1121() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1134[var2] != null && this.field1134[var2].field1268 + this.field1134[var2].field1261 > var1) {
                var1 = this.field1134[var2].field1268 + this.field1134[var2].field1261;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1134[var5] != null) {
                int var6 = this.field1134[var5].field1268 * 22050 / 1000;
                int var7 = this.field1134[var5].field1261 * 22050 / 1000;
                int[] var8 = this.field1134[var5].method1362(var6, this.field1134[var5].field1268);
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
