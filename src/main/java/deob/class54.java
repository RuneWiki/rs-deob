package deob;

@ObfuscatedName("bh")
public class class54 {

    @ObfuscatedName("bh.i")
    public class71[] field1009 = new class71[10];

    @ObfuscatedName("bh.u")
    public int field1007;

    @ObfuscatedName("bh.h")
    public int field1010;

    @ObfuscatedName("bh.f(Lgb;II)Lbh;")
    public static class54 method991(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3163(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2666();
            if (var3 != 0) {
                arg0.field2111--;
                this.field1009[var2] = new class71();
                this.field1009[var2].method1321(arg0);
            }
        }
        this.field1007 = arg0.method2668();
        this.field1010 = arg0.method2668();
    }

    @ObfuscatedName("bh.i()Lbr;")
    public class56 method986() {
        byte[] var1 = this.method985();
        return new class56(22050, var1, this.field1007 * 22050 / 1000, this.field1010 * 22050 / 1000);
    }

    @ObfuscatedName("bh.u()I")
    public final int method981() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1009[var2] != null && this.field1009[var2].field1189 / 20 < var1) {
                var1 = this.field1009[var2].field1189 / 20;
            }
        }
        if (this.field1007 < this.field1010 && this.field1007 / 20 < var1) {
            var1 = this.field1007 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1009[var3] != null) {
                this.field1009[var3].field1189 -= var1 * 20;
            }
        }
        if (this.field1007 < this.field1010) {
            this.field1007 -= var1 * 20;
            this.field1010 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.r()[B")
    public final byte[] method985() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1009[var2] != null && this.field1009[var2].field1189 + this.field1009[var2].field1177 > var1) {
                var1 = this.field1009[var2].field1189 + this.field1009[var2].field1177;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1009[var5] != null) {
                int var6 = this.field1009[var5].field1177 * 22050 / 1000;
                int var7 = this.field1009[var5].field1189 * 22050 / 1000;
                int[] var8 = this.field1009[var5].method1315(var6, this.field1009[var5].field1177);
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
