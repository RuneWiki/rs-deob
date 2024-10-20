package deob;

@ObfuscatedName("bt")
public class class54 {

    @ObfuscatedName("bt.d")
    public class71[] field977 = new class71[10];

    @ObfuscatedName("bt.m")
    public int field976;

    @ObfuscatedName("bt.h")
    public int field979;

    @ObfuscatedName("bt.n(Lgj;II)Lbt;")
    public static class54 method943(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3093(arg1, arg2);
        return var3 == null ? null : new class54(new class161(var3));
    }

    public class54(class161 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2823();
            if (var3 != 0) {
                arg0.field2285--;
                this.field977[var2] = new class71();
                this.field977[var2].method1307(arg0);
            }
        }
        this.field976 = arg0.method2887();
        this.field979 = arg0.method2887();
    }

    @ObfuscatedName("bt.d()Lbd;")
    public class56 method937() {
        byte[] var1 = this.method939();
        return new class56(22050, var1, this.field976 * 22050 / 1000, this.field979 * 22050 / 1000);
    }

    @ObfuscatedName("bt.m()I")
    public final int method938() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field977[var2] != null && this.field977[var2].field1161 / 20 < var1) {
                var1 = this.field977[var2].field1161 / 20;
            }
        }
        if (this.field976 < this.field979 && this.field976 / 20 < var1) {
            var1 = this.field976 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field977[var3] != null) {
                this.field977[var3].field1161 -= var1 * 20;
            }
        }
        if (this.field976 < this.field979) {
            this.field976 -= var1 * 20;
            this.field979 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bt.h()[B")
    public final byte[] method939() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field977[var2] != null && this.field977[var2].field1161 + this.field977[var2].field1157 > var1) {
                var1 = this.field977[var2].field1161 + this.field977[var2].field1157;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field977[var5] != null) {
                int var6 = this.field977[var5].field1157 * 22050 / 1000;
                int var7 = this.field977[var5].field1161 * 22050 / 1000;
                int[] var8 = this.field977[var5].method1305(var6, this.field977[var5].field1157);
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
