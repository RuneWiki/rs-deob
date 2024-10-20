package deob;

@ObfuscatedName("bu")
public class class54 {

    @ObfuscatedName("bu.g")
    public class71[] field989 = new class71[10];

    @ObfuscatedName("bu.x")
    public int field988;

    @ObfuscatedName("bu.q")
    public int field986;

    @ObfuscatedName("bu.p(Lgp;II)Lbu;")
    public static class54 method929(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3044(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2593();
            if (var3 != 0) {
                arg0.field2098--;
                this.field989[var2] = new class71();
                this.field989[var2].method1264(arg0);
            }
        }
        this.field988 = arg0.method2595();
        this.field986 = arg0.method2595();
    }

    @ObfuscatedName("bu.g()Lbr;")
    public class56 method927() {
        byte[] var1 = this.method928();
        return new class56(22050, var1, this.field988 * 22050 / 1000, this.field986 * 22050 / 1000);
    }

    @ObfuscatedName("bu.x()I")
    public final int method925() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field989[var2] != null && this.field989[var2].field1166 / 20 < var1) {
                var1 = this.field989[var2].field1166 / 20;
            }
        }
        if (this.field988 < this.field986 && this.field988 / 20 < var1) {
            var1 = this.field988 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field989[var3] != null) {
                this.field989[var3].field1166 -= var1 * 20;
            }
        }
        if (this.field988 < this.field986) {
            this.field988 -= var1 * 20;
            this.field986 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.q()[B")
    public final byte[] method928() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field989[var2] != null && this.field989[var2].field1167 + this.field989[var2].field1166 > var1) {
                var1 = this.field989[var2].field1167 + this.field989[var2].field1166;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field989[var5] != null) {
                int var6 = this.field989[var5].field1167 * 22050 / 1000;
                int var7 = this.field989[var5].field1166 * 22050 / 1000;
                int[] var8 = this.field989[var5].method1262(var6, this.field989[var5].field1167);
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
