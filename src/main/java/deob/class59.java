package deob;

@ObfuscatedName("bu")
public class class59 {

    @ObfuscatedName("bu.e")
    public class72[] field1193 = new class72[10];

    @ObfuscatedName("bu.q")
    public int field1195;

    @ObfuscatedName("bu.o")
    public int field1196;

    @ObfuscatedName("bu.l(Lfo;II)Lbu;")
    public static class59 method1232(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3050(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2388();
            if (var3 != 0) {
                arg0.field1988--;
                this.field1193[var2] = new class72();
                this.field1193[var2].method1497(arg0);
            }
        }
        this.field1195 = arg0.method2440();
        this.field1196 = arg0.method2440();
    }

    @ObfuscatedName("bu.e()Lbl;")
    public class63 method1229() {
        byte[] var1 = this.method1231();
        return new class63(22050, var1, this.field1195 * 22050 / 1000, this.field1196 * 22050 / 1000);
    }

    @ObfuscatedName("bu.q()I")
    public final int method1230() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1193[var2] != null && this.field1193[var2].field1323 / 20 < var1) {
                var1 = this.field1193[var2].field1323 / 20;
            }
        }
        if (this.field1195 < this.field1196 && this.field1195 / 20 < var1) {
            var1 = this.field1195 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1193[var3] != null) {
                this.field1193[var3].field1323 -= var1 * 20;
            }
        }
        if (this.field1195 < this.field1196) {
            this.field1195 -= var1 * 20;
            this.field1196 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.o()[B")
    public final byte[] method1231() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1193[var2] != null && this.field1193[var2].field1323 + this.field1193[var2].field1317 > var1) {
                var1 = this.field1193[var2].field1323 + this.field1193[var2].field1317;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1193[var5] != null) {
                int var6 = this.field1193[var5].field1317 * 22050 / 1000;
                int var7 = this.field1193[var5].field1323 * 22050 / 1000;
                int[] var8 = this.field1193[var5].method1502(var6, this.field1193[var5].field1317);
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
