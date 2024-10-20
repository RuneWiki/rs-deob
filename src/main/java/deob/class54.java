package deob;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.j")
    public class71[] field997 = new class71[10];

    @ObfuscatedName("bd.c")
    public int field996;

    @ObfuscatedName("bd.d")
    public int field999;

    @ObfuscatedName("bd.x(Lgk;II)Lbd;")
    public static class54 method1032(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3121(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2701();
            if (var3 != 0) {
                arg0.field2086--;
                this.field997[var2] = new class71();
                this.field997[var2].method1352(arg0);
            }
        }
        this.field996 = arg0.method2745();
        this.field999 = arg0.method2745();
    }

    @ObfuscatedName("bd.j()Lbt;")
    public class56 method1023() {
        byte[] var1 = this.method1026();
        return new class56(22050, var1, this.field996 * 22050 / 1000, this.field999 * 22050 / 1000);
    }

    @ObfuscatedName("bd.c()I")
    public final int method1024() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field997[var2] != null && this.field997[var2].field1172 / 20 < var1) {
                var1 = this.field997[var2].field1172 / 20;
            }
        }
        if (this.field996 < this.field999 && this.field996 / 20 < var1) {
            var1 = this.field996 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field997[var3] != null) {
                this.field997[var3].field1172 -= var1 * 20;
            }
        }
        if (this.field996 < this.field999) {
            this.field996 -= var1 * 20;
            this.field999 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.d()[B")
    public final byte[] method1026() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field997[var2] != null && this.field997[var2].field1174 + this.field997[var2].field1172 > var1) {
                var1 = this.field997[var2].field1174 + this.field997[var2].field1172;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field997[var5] != null) {
                int var6 = this.field997[var5].field1174 * 22050 / 1000;
                int var7 = this.field997[var5].field1172 * 22050 / 1000;
                int[] var8 = this.field997[var5].method1349(var6, this.field997[var5].field1174);
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
