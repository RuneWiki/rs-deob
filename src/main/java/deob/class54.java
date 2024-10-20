package deob;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.m")
    public class71[] field985 = new class71[10];

    @ObfuscatedName("bd.b")
    public int field986;

    @ObfuscatedName("bd.g")
    public int field984;

    @ObfuscatedName("bd.o(Lgl;II)Lbd;")
    public static class54 method937(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3012(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2552();
            if (var3 != 0) {
                arg0.field2105--;
                this.field985[var2] = new class71();
                this.field985[var2].method1270(arg0);
            }
        }
        this.field986 = arg0.method2554();
        this.field984 = arg0.method2554();
    }

    @ObfuscatedName("bd.m()Lbh;")
    public class56 method926() {
        byte[] var1 = this.method928();
        return new class56(22050, var1, this.field986 * 22050 / 1000, this.field984 * 22050 / 1000);
    }

    @ObfuscatedName("bd.b()I")
    public final int method936() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field985[var2] != null && this.field985[var2].field1168 / 20 < var1) {
                var1 = this.field985[var2].field1168 / 20;
            }
        }
        if (this.field986 < this.field984 && this.field986 / 20 < var1) {
            var1 = this.field986 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field985[var3] != null) {
                this.field985[var3].field1168 -= var1 * 20;
            }
        }
        if (this.field986 < this.field984) {
            this.field986 -= var1 * 20;
            this.field984 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.g()[B")
    public final byte[] method928() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field985[var2] != null && this.field985[var2].field1168 + this.field985[var2].field1167 > var1) {
                var1 = this.field985[var2].field1168 + this.field985[var2].field1167;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field985[var5] != null) {
                int var6 = this.field985[var5].field1167 * 22050 / 1000;
                int var7 = this.field985[var5].field1168 * 22050 / 1000;
                int[] var8 = this.field985[var5].method1268(var6, this.field985[var5].field1167);
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
