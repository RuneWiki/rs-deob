package deob;

@ObfuscatedName("bq")
public class class59 {

    @ObfuscatedName("bq.p")
    public class72[] field1213 = new class72[10];

    @ObfuscatedName("bq.v")
    public int field1212;

    @ObfuscatedName("bq.l")
    public int field1215;

    @ObfuscatedName("bq.d(Lfn;II)Lbq;")
    public static class59 method1201(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3134(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2357();
            if (var3 != 0) {
                arg0.field1966--;
                this.field1213[var2] = new class72();
                this.field1213[var2].method1465(arg0);
            }
        }
        this.field1212 = arg0.method2359();
        this.field1215 = arg0.method2359();
    }

    @ObfuscatedName("bq.p()Lbh;")
    public class63 method1206() {
        byte[] var1 = this.method1203();
        return new class63(22050, var1, this.field1212 * 22050 / 1000, this.field1215 * 22050 / 1000);
    }

    @ObfuscatedName("bq.v()I")
    public final int method1204() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1213[var2] != null && this.field1213[var2].field1339 / 20 < var1) {
                var1 = this.field1213[var2].field1339 / 20;
            }
        }
        if (this.field1212 < this.field1215 && this.field1212 / 20 < var1) {
            var1 = this.field1212 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1213[var3] != null) {
                this.field1213[var3].field1339 -= var1 * 20;
            }
        }
        if (this.field1212 < this.field1215) {
            this.field1212 -= var1 * 20;
            this.field1215 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bq.l()[B")
    public final byte[] method1203() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1213[var2] != null && this.field1213[var2].field1339 + this.field1213[var2].field1338 > var1) {
                var1 = this.field1213[var2].field1339 + this.field1213[var2].field1338;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1213[var5] != null) {
                int var6 = this.field1213[var5].field1338 * 22050 / 1000;
                int var7 = this.field1213[var5].field1339 * 22050 / 1000;
                int[] var8 = this.field1213[var5].method1463(var6, this.field1213[var5].field1338);
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
