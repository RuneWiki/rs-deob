package deob;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.e")
    public class71[] field992 = new class71[10];

    @ObfuscatedName("bd.c")
    public int field994;

    @ObfuscatedName("bd.l")
    public int field991;

    @ObfuscatedName("bd.b(Lgv;II)Lbd;")
    public static class54 method969(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3126(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2669();
            if (var3 != 0) {
                arg0.field2079--;
                this.field992[var2] = new class71();
                this.field992[var2].method1321(arg0);
            }
        }
        this.field994 = arg0.method2671();
        this.field991 = arg0.method2671();
    }

    @ObfuscatedName("bd.e()Lbo;")
    public class56 method974() {
        byte[] var1 = this.method970();
        return new class56(22050, var1, this.field994 * 22050 / 1000, this.field991 * 22050 / 1000);
    }

    @ObfuscatedName("bd.c()I")
    public final int method968() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field992[var2] != null && this.field992[var2].field1172 / 20 < var1) {
                var1 = this.field992[var2].field1172 / 20;
            }
        }
        if (this.field994 < this.field991 && this.field994 / 20 < var1) {
            var1 = this.field994 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field992[var3] != null) {
                this.field992[var3].field1172 -= var1 * 20;
            }
        }
        if (this.field994 < this.field991) {
            this.field994 -= var1 * 20;
            this.field991 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.l()[B")
    public final byte[] method970() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field992[var2] != null && this.field992[var2].field1181 + this.field992[var2].field1172 > var1) {
                var1 = this.field992[var2].field1181 + this.field992[var2].field1172;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field992[var5] != null) {
                int var6 = this.field992[var5].field1181 * 22050 / 1000;
                int var7 = this.field992[var5].field1172 * 22050 / 1000;
                int[] var8 = this.field992[var5].method1320(var6, this.field992[var5].field1181);
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
