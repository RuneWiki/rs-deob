package deob;

@ObfuscatedName("bf")
public class class54 {

    @ObfuscatedName("bf.n")
    public class71[] field996 = new class71[10];

    @ObfuscatedName("bf.g")
    public int field998;

    @ObfuscatedName("bf.v")
    public int field999;

    @ObfuscatedName("bf.x(Lgo;II)Lbf;")
    public static class54 method1042(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3153(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2878();
            if (var3 != 0) {
                arg0.field2087--;
                this.field996[var2] = new class71();
                this.field996[var2].method1377(arg0);
            }
        }
        this.field998 = arg0.method2833();
        this.field999 = arg0.method2833();
    }

    @ObfuscatedName("bf.n()Lbi;")
    public class56 method1036() {
        byte[] var1 = this.method1040();
        return new class56(22050, var1, this.field998 * 22050 / 1000, this.field999 * 22050 / 1000);
    }

    @ObfuscatedName("bf.g()I")
    public final int method1037() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field996[var2] != null && this.field996[var2].field1181 / 20 < var1) {
                var1 = this.field996[var2].field1181 / 20;
            }
        }
        if (this.field998 < this.field999 && this.field998 / 20 < var1) {
            var1 = this.field998 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field996[var3] != null) {
                this.field996[var3].field1181 -= var1 * 20;
            }
        }
        if (this.field998 < this.field999) {
            this.field998 -= var1 * 20;
            this.field999 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bf.v()[B")
    public final byte[] method1040() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field996[var2] != null && this.field996[var2].field1181 + this.field996[var2].field1180 > var1) {
                var1 = this.field996[var2].field1181 + this.field996[var2].field1180;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field996[var5] != null) {
                int var6 = this.field996[var5].field1180 * 22050 / 1000;
                int var7 = this.field996[var5].field1181 * 22050 / 1000;
                int[] var8 = this.field996[var5].method1375(var6, this.field996[var5].field1180);
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
