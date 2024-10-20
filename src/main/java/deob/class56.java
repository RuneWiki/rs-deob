package deob;

@ObfuscatedName("bl")
public class class56 {

    @ObfuscatedName("bl.j")
    public class53[] field1177 = new class53[10];

    @ObfuscatedName("bl.f")
    public int field1179;

    @ObfuscatedName("bl.y")
    public int field1180;

    @ObfuscatedName("bl.c(Lew;II)Lbl;")
    public static class56 method1216(class150 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2821(arg1, arg2);
        return var3 == null ? null : new class56(new class125(var3));
    }

    public class56(class125 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2326();
            if (var3 != 0) {
                arg0.field2003--;
                this.field1177[var2] = new class53();
                this.field1177[var2].method1178(arg0);
            }
        }
        this.field1179 = arg0.method2328();
        this.field1180 = arg0.method2328();
    }

    @ObfuscatedName("bl.j()Lbm;")
    public class62 method1211() {
        byte[] var1 = this.method1218();
        return new class62(22050, var1, this.field1179 * 22050 / 1000, this.field1180 * 22050 / 1000);
    }

    @ObfuscatedName("bl.f()I")
    public final int method1213() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1177[var2] != null && this.field1177[var2].field1148 / 20 < var1) {
                var1 = this.field1177[var2].field1148 / 20;
            }
        }
        if (this.field1179 < this.field1180 && this.field1179 / 20 < var1) {
            var1 = this.field1179 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1177[var3] != null) {
                this.field1177[var3].field1148 -= var1 * 20;
            }
        }
        if (this.field1179 < this.field1180) {
            this.field1179 -= var1 * 20;
            this.field1180 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bl.y()[B")
    public final byte[] method1218() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1177[var2] != null && this.field1177[var2].field1148 + this.field1177[var2].field1139 > var1) {
                var1 = this.field1177[var2].field1148 + this.field1177[var2].field1139;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1177[var5] != null) {
                int var6 = this.field1177[var5].field1139 * 22050 / 1000;
                int var7 = this.field1177[var5].field1148 * 22050 / 1000;
                int[] var8 = this.field1177[var5].method1181(var6, this.field1177[var5].field1139);
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
