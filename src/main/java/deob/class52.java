package deob;

@ObfuscatedName("av")
public class class52 {

    @ObfuscatedName("av.j")
    public class65[] field1078 = new class65[10];

    @ObfuscatedName("av.a")
    public int field1077;

    @ObfuscatedName("av.y")
    public int field1080;

    @ObfuscatedName("av.z(Ler;II)Lav;")
    public static class52 method1008(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2705(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2122();
            if (var3 != 0) {
                arg0.field1819--;
                this.field1078[var2] = new class65();
                this.field1078[var2].method1283(arg0);
            }
        }
        this.field1077 = arg0.method2239();
        this.field1080 = arg0.method2239();
    }

    @ObfuscatedName("av.j()Lbi;")
    public class56 method1009() {
        byte[] var1 = this.method1011();
        return new class56(22050, var1, this.field1077 * 22050 / 1000, this.field1080 * 22050 / 1000);
    }

    @ObfuscatedName("av.a()I")
    public final int method1014() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1078[var2] != null && this.field1078[var2].field1198 / 20 < var1) {
                var1 = this.field1078[var2].field1198 / 20;
            }
        }
        if (this.field1077 < this.field1080 && this.field1077 / 20 < var1) {
            var1 = this.field1077 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1078[var3] != null) {
                this.field1078[var3].field1198 -= var1 * 20;
            }
        }
        if (this.field1077 < this.field1080) {
            this.field1077 -= var1 * 20;
            this.field1080 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("av.y()[B")
    public final byte[] method1011() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1078[var2] != null && this.field1078[var2].field1205 + this.field1078[var2].field1198 > var1) {
                var1 = this.field1078[var2].field1205 + this.field1078[var2].field1198;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1078[var5] != null) {
                int var6 = this.field1078[var5].field1205 * 22050 / 1000;
                int var7 = this.field1078[var5].field1198 * 22050 / 1000;
                int[] var8 = this.field1078[var5].method1285(var6, this.field1078[var5].field1205);
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
