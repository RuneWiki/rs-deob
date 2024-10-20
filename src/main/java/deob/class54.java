package deob;

@ObfuscatedName("bm")
public class class54 {

    @ObfuscatedName("bm.y")
    public class71[] field987 = new class71[10];

    @ObfuscatedName("bm.o")
    public int field989;

    @ObfuscatedName("bm.r")
    public int field988;

    @ObfuscatedName("bm.k(Lgh;II)Lbm;")
    public static class54 method959(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3065(arg1, arg2);
        return var3 == null ? null : new class54(new class161(var3));
    }

    public class54(class161 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2733();
            if (var3 != 0) {
                arg0.field2267--;
                this.field987[var2] = new class71();
                this.field987[var2].method1292(arg0);
            }
        }
        this.field989 = arg0.method2735();
        this.field988 = arg0.method2735();
    }

    @ObfuscatedName("bm.y()Lbl;")
    public class56 method953() {
        byte[] var1 = this.method954();
        return new class56(22050, var1, this.field989 * 22050 / 1000, this.field988 * 22050 / 1000);
    }

    @ObfuscatedName("bm.o()I")
    public final int method955() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field987[var2] != null && this.field987[var2].field1172 / 20 < var1) {
                var1 = this.field987[var2].field1172 / 20;
            }
        }
        if (this.field989 < this.field988 && this.field989 / 20 < var1) {
            var1 = this.field989 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field987[var3] != null) {
                this.field987[var3].field1172 -= var1 * 20;
            }
        }
        if (this.field989 < this.field988) {
            this.field989 -= var1 * 20;
            this.field988 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bm.r()[B")
    public final byte[] method954() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field987[var2] != null && this.field987[var2].field1175 + this.field987[var2].field1172 > var1) {
                var1 = this.field987[var2].field1175 + this.field987[var2].field1172;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field987[var5] != null) {
                int var6 = this.field987[var5].field1175 * 22050 / 1000;
                int var7 = this.field987[var5].field1172 * 22050 / 1000;
                int[] var8 = this.field987[var5].method1298(var6, this.field987[var5].field1175);
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
