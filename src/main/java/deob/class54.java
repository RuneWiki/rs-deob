package deob;

@ObfuscatedName("bk")
public class class54 {

    @ObfuscatedName("bk.a")
    public class67[] field1091 = new class67[10];

    @ObfuscatedName("bk.l")
    public int field1092;

    @ObfuscatedName("bk.c")
    public int field1090;

    @ObfuscatedName("bk.e(Lfv;II)Lbk;")
    public static class54 method1087(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2843(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2176();
            if (var3 != 0) {
                arg0.field1834--;
                this.field1091[var2] = new class67();
                this.field1091[var2].method1350(arg0);
            }
        }
        this.field1092 = arg0.method2178();
        this.field1090 = arg0.method2178();
    }

    @ObfuscatedName("bk.a()Lbe;")
    public class58 method1086() {
        byte[] var1 = this.method1085();
        return new class58(22050, var1, this.field1092 * 22050 / 1000, this.field1090 * 22050 / 1000);
    }

    @ObfuscatedName("bk.l()I")
    public final int method1094() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1091[var2] != null && this.field1091[var2].field1210 / 20 < var1) {
                var1 = this.field1091[var2].field1210 / 20;
            }
        }
        if (this.field1092 < this.field1090 && this.field1092 / 20 < var1) {
            var1 = this.field1092 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1091[var3] != null) {
                this.field1091[var3].field1210 -= var1 * 20;
            }
        }
        if (this.field1092 < this.field1090) {
            this.field1092 -= var1 * 20;
            this.field1090 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bk.c()[B")
    public final byte[] method1085() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1091[var2] != null && this.field1091[var2].field1216 + this.field1091[var2].field1210 > var1) {
                var1 = this.field1091[var2].field1216 + this.field1091[var2].field1210;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1091[var5] != null) {
                int var6 = this.field1091[var5].field1216 * 22050 / 1000;
                int var7 = this.field1091[var5].field1210 * 22050 / 1000;
                int[] var8 = this.field1091[var5].method1348(var6, this.field1091[var5].field1216);
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
