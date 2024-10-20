package deob;

@ObfuscatedName("ba")
public class class59 {

    @ObfuscatedName("ba.m")
    public class72[] field1197 = new class72[10];

    @ObfuscatedName("ba.f")
    public int field1198;

    @ObfuscatedName("ba.l")
    public int field1196;

    @ObfuscatedName("ba.j(Lfa;II)Lba;")
    public static class59 method1227(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3124(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2372();
            if (var3 != 0) {
                arg0.field1982--;
                this.field1197[var2] = new class72();
                this.field1197[var2].method1476(arg0);
            }
        }
        this.field1198 = arg0.method2374();
        this.field1196 = arg0.method2374();
    }

    @ObfuscatedName("ba.m()Lbe;")
    public class63 method1225() {
        byte[] var1 = this.method1232();
        return new class63(22050, var1, this.field1198 * 22050 / 1000, this.field1196 * 22050 / 1000);
    }

    @ObfuscatedName("ba.f()I")
    public final int method1224() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1197[var2] != null && this.field1197[var2].field1326 / 20 < var1) {
                var1 = this.field1197[var2].field1326 / 20;
            }
        }
        if (this.field1198 < this.field1196 && this.field1198 / 20 < var1) {
            var1 = this.field1198 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1197[var3] != null) {
                this.field1197[var3].field1326 -= var1 * 20;
            }
        }
        if (this.field1198 < this.field1196) {
            this.field1198 -= var1 * 20;
            this.field1196 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ba.l()[B")
    public final byte[] method1232() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1197[var2] != null && this.field1197[var2].field1326 + this.field1197[var2].field1325 > var1) {
                var1 = this.field1197[var2].field1326 + this.field1197[var2].field1325;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1197[var5] != null) {
                int var6 = this.field1197[var5].field1325 * 22050 / 1000;
                int var7 = this.field1197[var5].field1326 * 22050 / 1000;
                int[] var8 = this.field1197[var5].method1471(var6, this.field1197[var5].field1325);
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
