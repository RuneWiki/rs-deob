package deob;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.c")
    public class71[] field975 = new class71[10];

    @ObfuscatedName("br.n")
    public int field976;

    @ObfuscatedName("br.q")
    public int field974;

    @ObfuscatedName("br.d(Lgd;II)Lbr;")
    public static class54 method965(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3129(arg1, arg2);
        return var3 == null ? null : new class54(new class130(var3));
    }

    public class54(class130 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2379();
            if (var3 != 0) {
                arg0.field1956--;
                this.field975[var2] = new class71();
                this.field975[var2].method1301(arg0);
            }
        }
        this.field976 = arg0.method2232();
        this.field974 = arg0.method2232();
    }

    @ObfuscatedName("br.c()Lbo;")
    public class56 method963() {
        byte[] var1 = this.method969();
        return new class56(22050, var1, this.field976 * 22050 / 1000, this.field974 * 22050 / 1000);
    }

    @ObfuscatedName("br.n()I")
    public final int method964() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field975[var2] != null && this.field975[var2].field1134 / 20 < var1) {
                var1 = this.field975[var2].field1134 / 20;
            }
        }
        if (this.field976 < this.field974 && this.field976 / 20 < var1) {
            var1 = this.field976 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field975[var3] != null) {
                this.field975[var3].field1134 -= var1 * 20;
            }
        }
        if (this.field976 < this.field974) {
            this.field976 -= var1 * 20;
            this.field974 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.q()[B")
    public final byte[] method969() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field975[var2] != null && this.field975[var2].field1146 + this.field975[var2].field1134 > var1) {
                var1 = this.field975[var2].field1146 + this.field975[var2].field1134;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field975[var5] != null) {
                int var6 = this.field975[var5].field1146 * 22050 / 1000;
                int var7 = this.field975[var5].field1134 * 22050 / 1000;
                int[] var8 = this.field975[var5].method1300(var6, this.field975[var5].field1146);
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
