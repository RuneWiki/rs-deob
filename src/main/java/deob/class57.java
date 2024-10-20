package deob;

@ObfuscatedName("bn")
public class class57 {

    @ObfuscatedName("bn.t")
    public int field1185;

    @ObfuscatedName("bn.n")
    public class54[] field1184 = new class54[10];

    @ObfuscatedName("bn.e")
    public int field1183;

    @ObfuscatedName("bn.f(Leo;II)Lbn;")
    public static class57 method1274(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3035(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2458();
            if (var3 != 0) {
                arg0.field2033--;
                this.field1184[var2] = new class54();
                this.field1184[var2].method1239(arg0);
            }
        }
        this.field1185 = arg0.method2460();
        this.field1183 = arg0.method2460();
    }

    @ObfuscatedName("bn.t()Lbt;")
    public class63 method1269() {
        byte[] var1 = this.method1280();
        return new class63(22050, var1, this.field1185 * 22050 / 1000, this.field1183 * 22050 / 1000);
    }

    @ObfuscatedName("bn.n()I")
    public final int method1270() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1184[var2] != null && this.field1184[var2].field1137 / 20 < var1) {
                var1 = this.field1184[var2].field1137 / 20;
            }
        }
        if (this.field1185 < this.field1183 && this.field1185 / 20 < var1) {
            var1 = this.field1185 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1184[var3] != null) {
                this.field1184[var3].field1137 -= var1 * 20;
            }
        }
        if (this.field1185 < this.field1183) {
            this.field1185 -= var1 * 20;
            this.field1183 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bn.e()[B")
    public final byte[] method1280() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1184[var2] != null && this.field1184[var2].field1150 + this.field1184[var2].field1137 > var1) {
                var1 = this.field1184[var2].field1150 + this.field1184[var2].field1137;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1184[var5] != null) {
                int var6 = this.field1184[var5].field1150 * 22050 / 1000;
                int var7 = this.field1184[var5].field1137 * 22050 / 1000;
                int[] var8 = this.field1184[var5].method1237(var6, this.field1184[var5].field1150);
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
