package deob;

@ObfuscatedName("br")
public class class59 {

    @ObfuscatedName("br.l")
    public class72[] field1218 = new class72[10];

    @ObfuscatedName("br.a")
    public int field1217;

    @ObfuscatedName("br.i")
    public int field1220;

    @ObfuscatedName("br.j(Lff;II)Lbr;")
    public static class59 method1210(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3005(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2316();
            if (var3 != 0) {
                arg0.field1999--;
                this.field1218[var2] = new class72();
                this.field1218[var2].method1466(arg0);
            }
        }
        this.field1217 = arg0.method2318();
        this.field1220 = arg0.method2318();
    }

    @ObfuscatedName("br.l()Lbj;")
    public class63 method1215() {
        byte[] var1 = this.method1204();
        return new class63(22050, var1, this.field1217 * 22050 / 1000, this.field1220 * 22050 / 1000);
    }

    @ObfuscatedName("br.a()I")
    public final int method1205() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1218[var2] != null && this.field1218[var2].field1351 / 20 < var1) {
                var1 = this.field1218[var2].field1351 / 20;
            }
        }
        if (this.field1217 < this.field1220 && this.field1217 / 20 < var1) {
            var1 = this.field1217 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1218[var3] != null) {
                this.field1218[var3].field1351 -= var1 * 20;
            }
        }
        if (this.field1217 < this.field1220) {
            this.field1217 -= var1 * 20;
            this.field1220 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.i()[B")
    public final byte[] method1204() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1218[var2] != null && this.field1218[var2].field1351 + this.field1218[var2].field1345 > var1) {
                var1 = this.field1218[var2].field1351 + this.field1218[var2].field1345;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1218[var5] != null) {
                int var6 = this.field1218[var5].field1345 * 22050 / 1000;
                int var7 = this.field1218[var5].field1351 * 22050 / 1000;
                int[] var8 = this.field1218[var5].method1464(var6, this.field1218[var5].field1345);
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
