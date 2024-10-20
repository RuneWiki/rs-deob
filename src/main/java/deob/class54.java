package deob;

@ObfuscatedName("bj")
public class class54 {

    @ObfuscatedName("bj.l")
    public class71[] field972 = new class71[10];

    @ObfuscatedName("bj.i")
    public int field971;

    @ObfuscatedName("bj.t")
    public int field974;

    @ObfuscatedName("bj.b(Lgj;II)Lbj;")
    public static class54 method1017(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3226(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2678();
            if (var3 != 0) {
                arg0.field2085--;
                this.field972[var2] = new class71();
                this.field972[var2].method1353(arg0);
            }
        }
        this.field971 = arg0.method2801();
        this.field974 = arg0.method2801();
    }

    @ObfuscatedName("bj.l()Lbl;")
    public class56 method1023() {
        byte[] var1 = this.method1019();
        return new class56(22050, var1, this.field971 * 22050 / 1000, this.field974 * 22050 / 1000);
    }

    @ObfuscatedName("bj.i()I")
    public final int method1020() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field972[var2] != null && this.field972[var2].field1149 / 20 < var1) {
                var1 = this.field972[var2].field1149 / 20;
            }
        }
        if (this.field971 < this.field974 && this.field971 / 20 < var1) {
            var1 = this.field971 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field972[var3] != null) {
                this.field972[var3].field1149 -= var1 * 20;
            }
        }
        if (this.field971 < this.field974) {
            this.field971 -= var1 * 20;
            this.field974 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bj.t()[B")
    public final byte[] method1019() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field972[var2] != null && this.field972[var2].field1149 + this.field972[var2].field1144 > var1) {
                var1 = this.field972[var2].field1149 + this.field972[var2].field1144;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field972[var5] != null) {
                int var6 = this.field972[var5].field1144 * 22050 / 1000;
                int var7 = this.field972[var5].field1149 * 22050 / 1000;
                int[] var8 = this.field972[var5].method1343(var6, this.field972[var5].field1144);
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
