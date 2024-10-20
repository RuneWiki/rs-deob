package deob;

@ObfuscatedName("bp")
public class class54 {

    @ObfuscatedName("bp.d")
    public class71[] field1007 = new class71[10];

    @ObfuscatedName("bp.h")
    public int field1006;

    @ObfuscatedName("bp.p")
    public int field1009;

    @ObfuscatedName("bp.q(Lgj;II)Lbp;")
    public static class54 method1022(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3133(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2666();
            if (var3 != 0) {
                arg0.field2091--;
                this.field1007[var2] = new class71();
                this.field1007[var2].method1357(arg0);
            }
        }
        this.field1006 = arg0.method2668();
        this.field1009 = arg0.method2668();
    }

    @ObfuscatedName("bp.d()Lbj;")
    public class56 method1023() {
        byte[] var1 = this.method1027();
        return new class56(22050, var1, this.field1006 * 22050 / 1000, this.field1009 * 22050 / 1000);
    }

    @ObfuscatedName("bp.h()I")
    public final int method1025() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1007[var2] != null && this.field1007[var2].field1172 / 20 < var1) {
                var1 = this.field1007[var2].field1172 / 20;
            }
        }
        if (this.field1006 < this.field1009 && this.field1006 / 20 < var1) {
            var1 = this.field1006 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1007[var3] != null) {
                this.field1007[var3].field1172 -= var1 * 20;
            }
        }
        if (this.field1006 < this.field1009) {
            this.field1006 -= var1 * 20;
            this.field1009 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bp.p()[B")
    public final byte[] method1027() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1007[var2] != null && this.field1007[var2].field1180 + this.field1007[var2].field1172 > var1) {
                var1 = this.field1007[var2].field1180 + this.field1007[var2].field1172;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1007[var5] != null) {
                int var6 = this.field1007[var5].field1180 * 22050 / 1000;
                int var7 = this.field1007[var5].field1172 * 22050 / 1000;
                int[] var8 = this.field1007[var5].method1355(var6, this.field1007[var5].field1180);
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
