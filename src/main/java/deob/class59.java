package deob;

@ObfuscatedName("bi")
public class class59 {

    @ObfuscatedName("bi.m")
    public class72[] field1222 = new class72[10];

    @ObfuscatedName("bi.i")
    public int field1221;

    @ObfuscatedName("bi.q")
    public int field1219;

    @ObfuscatedName("bi.h(Lfv;II)Lbi;")
    public static class59 method1204(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3051(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2320();
            if (var3 != 0) {
                arg0.field1988--;
                this.field1222[var2] = new class72();
                this.field1222[var2].method1450(arg0);
            }
        }
        this.field1221 = arg0.method2322();
        this.field1219 = arg0.method2322();
    }

    @ObfuscatedName("bi.m()Lby;")
    public class63 method1196() {
        byte[] var1 = this.method1197();
        return new class63(22050, var1, this.field1221 * 22050 / 1000, this.field1219 * 22050 / 1000);
    }

    @ObfuscatedName("bi.i()I")
    public final int method1194() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1222[var2] != null && this.field1222[var2].field1332 / 20 < var1) {
                var1 = this.field1222[var2].field1332 / 20;
            }
        }
        if (this.field1221 < this.field1219 && this.field1221 / 20 < var1) {
            var1 = this.field1221 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1222[var3] != null) {
                this.field1222[var3].field1332 -= var1 * 20;
            }
        }
        if (this.field1221 < this.field1219) {
            this.field1221 -= var1 * 20;
            this.field1219 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bi.q()[B")
    public final byte[] method1197() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1222[var2] != null && this.field1222[var2].field1347 + this.field1222[var2].field1332 > var1) {
                var1 = this.field1222[var2].field1347 + this.field1222[var2].field1332;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1222[var5] != null) {
                int var6 = this.field1222[var5].field1347 * 22050 / 1000;
                int var7 = this.field1222[var5].field1332 * 22050 / 1000;
                int[] var8 = this.field1222[var5].method1453(var6, this.field1222[var5].field1347);
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
