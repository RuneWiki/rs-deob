package deob;

@ObfuscatedName("bu")
public class class57 {

    @ObfuscatedName("bu.w")
    public class54[] field1204 = new class54[10];

    @ObfuscatedName("bu.f")
    public int field1203;

    @ObfuscatedName("bu.e")
    public int field1206;

    @ObfuscatedName("bu.i(Leg;II)Lbu;")
    public static class57 method1251(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2970(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2472();
            if (var3 != 0) {
                arg0.field2045--;
                this.field1204[var2] = new class54();
                this.field1204[var2].method1218(arg0);
            }
        }
        this.field1203 = arg0.method2615();
        this.field1206 = arg0.method2615();
    }

    @ObfuscatedName("bu.w()Lbb;")
    public class63 method1242() {
        byte[] var1 = this.method1253();
        return new class63(22050, var1, this.field1203 * 22050 / 1000, this.field1206 * 22050 / 1000);
    }

    @ObfuscatedName("bu.f()I")
    public final int method1243() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field1157 / 20 < var1) {
                var1 = this.field1204[var2].field1157 / 20;
            }
        }
        if (this.field1203 < this.field1206 && this.field1203 / 20 < var1) {
            var1 = this.field1203 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1204[var3] != null) {
                this.field1204[var3].field1157 -= var1 * 20;
            }
        }
        if (this.field1203 < this.field1206) {
            this.field1203 -= var1 * 20;
            this.field1206 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.e()[B")
    public final byte[] method1253() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field1171 + this.field1204[var2].field1157 > var1) {
                var1 = this.field1204[var2].field1171 + this.field1204[var2].field1157;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1204[var5] != null) {
                int var6 = this.field1204[var5].field1171 * 22050 / 1000;
                int var7 = this.field1204[var5].field1157 * 22050 / 1000;
                int[] var8 = this.field1204[var5].method1216(var6, this.field1204[var5].field1171);
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
