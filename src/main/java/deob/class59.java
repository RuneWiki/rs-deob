package deob;

@ObfuscatedName("be")
public class class59 {

    @ObfuscatedName("be.h")
    public class72[] field1189 = new class72[10];

    @ObfuscatedName("be.o")
    public int field1190;

    @ObfuscatedName("be.z")
    public int field1188;

    @ObfuscatedName("be.k(Lfo;II)Lbe;")
    public static class59 method1184(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3118(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2330();
            if (var3 != 0) {
                arg0.field1949--;
                this.field1189[var2] = new class72();
                this.field1189[var2].method1445(arg0);
            }
        }
        this.field1190 = arg0.method2332();
        this.field1188 = arg0.method2332();
    }

    @ObfuscatedName("be.h()Lbx;")
    public class63 method1179() {
        byte[] var1 = this.method1181();
        return new class63(22050, var1, this.field1190 * 22050 / 1000, this.field1188 * 22050 / 1000);
    }

    @ObfuscatedName("be.o()I")
    public final int method1180() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1189[var2] != null && this.field1189[var2].field1315 / 20 < var1) {
                var1 = this.field1189[var2].field1315 / 20;
            }
        }
        if (this.field1190 < this.field1188 && this.field1190 / 20 < var1) {
            var1 = this.field1190 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1189[var3] != null) {
                this.field1189[var3].field1315 -= var1 * 20;
            }
        }
        if (this.field1190 < this.field1188) {
            this.field1190 -= var1 * 20;
            this.field1188 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("be.z()[B")
    public final byte[] method1181() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1189[var2] != null && this.field1189[var2].field1315 + this.field1189[var2].field1300 > var1) {
                var1 = this.field1189[var2].field1315 + this.field1189[var2].field1300;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1189[var5] != null) {
                int var6 = this.field1189[var5].field1300 * 22050 / 1000;
                int var7 = this.field1189[var5].field1315 * 22050 / 1000;
                int[] var8 = this.field1189[var5].method1443(var6, this.field1189[var5].field1300);
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
