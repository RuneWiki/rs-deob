package deob;

@ObfuscatedName("bv")
public class class54 {

    @ObfuscatedName("bv.e")
    public class67[] field1141 = new class67[10];

    @ObfuscatedName("bv.a")
    public int field1142;

    @ObfuscatedName("bv.k")
    public int field1140;

    @ObfuscatedName("bv.b(Lfj;II)Lbv;")
    public static class54 method1062(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2819(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2127();
            if (var3 != 0) {
                arg0.field1894--;
                this.field1141[var2] = new class67();
                this.field1141[var2].method1307(arg0);
            }
        }
        this.field1142 = arg0.method2129();
        this.field1140 = arg0.method2129();
    }

    @ObfuscatedName("bv.e()Lbe;")
    public class58 method1055() {
        byte[] var1 = this.method1056();
        return new class58(22050, var1, this.field1142 * 22050 / 1000, this.field1140 * 22050 / 1000);
    }

    @ObfuscatedName("bv.a()I")
    public final int method1054() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1141[var2] != null && this.field1141[var2].field1273 / 20 < var1) {
                var1 = this.field1141[var2].field1273 / 20;
            }
        }
        if (this.field1142 < this.field1140 && this.field1142 / 20 < var1) {
            var1 = this.field1142 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1141[var3] != null) {
                this.field1141[var3].field1273 -= var1 * 20;
            }
        }
        if (this.field1142 < this.field1140) {
            this.field1142 -= var1 * 20;
            this.field1140 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bv.k()[B")
    public final byte[] method1056() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1141[var2] != null && this.field1141[var2].field1273 + this.field1141[var2].field1272 > var1) {
                var1 = this.field1141[var2].field1273 + this.field1141[var2].field1272;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1141[var5] != null) {
                int var6 = this.field1141[var5].field1272 * 22050 / 1000;
                int var7 = this.field1141[var5].field1273 * 22050 / 1000;
                int[] var8 = this.field1141[var5].method1312(var6, this.field1141[var5].field1272);
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
