package deob;

@ObfuscatedName("bv")
public class class54 {

    @ObfuscatedName("bv.g")
    public class67[] field1169 = new class67[10];

    @ObfuscatedName("bv.a")
    public int field1168;

    @ObfuscatedName("bv.m")
    public int field1166;

    @ObfuscatedName("bv.n(Lfi;II)Lbv;")
    public static class54 method1100(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2929(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2211();
            if (var3 != 0) {
                arg0.field1896--;
                this.field1169[var2] = new class67();
                this.field1169[var2].method1389(arg0);
            }
        }
        this.field1168 = arg0.method2395();
        this.field1166 = arg0.method2395();
    }

    @ObfuscatedName("bv.g()Lbr;")
    public class58 method1105() {
        byte[] var1 = this.method1098();
        return new class58(22050, var1, this.field1168 * 22050 / 1000, this.field1166 * 22050 / 1000);
    }

    @ObfuscatedName("bv.a()I")
    public final int method1097() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1169[var2] != null && this.field1169[var2].field1288 / 20 < var1) {
                var1 = this.field1169[var2].field1288 / 20;
            }
        }
        if (this.field1168 < this.field1166 && this.field1168 / 20 < var1) {
            var1 = this.field1168 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1169[var3] != null) {
                this.field1169[var3].field1288 -= var1 * 20;
            }
        }
        if (this.field1168 < this.field1166) {
            this.field1168 -= var1 * 20;
            this.field1166 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bv.m()[B")
    public final byte[] method1098() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1169[var2] != null && this.field1169[var2].field1292 + this.field1169[var2].field1288 > var1) {
                var1 = this.field1169[var2].field1292 + this.field1169[var2].field1288;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1169[var5] != null) {
                int var6 = this.field1169[var5].field1292 * 22050 / 1000;
                int var7 = this.field1169[var5].field1288 * 22050 / 1000;
                int[] var8 = this.field1169[var5].method1387(var6, this.field1169[var5].field1292);
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
