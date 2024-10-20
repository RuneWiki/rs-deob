package deob;

@ObfuscatedName("at")
public class class35 {

    @ObfuscatedName("at.w")
    public class53[] field234 = new class53[10];

    @ObfuscatedName("at.s")
    public int field233;

    @ObfuscatedName("at.a")
    public int field231;

    @ObfuscatedName("at.i(Lko;II)Lat;")
    public static class35 method666(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4743(arg1, arg2);
        return var3 == null ? null : new class35(new class401(var3));
    }

    public class35(class401 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6240();
            if (var3 != 0) {
                arg0.field4300--;
                this.field234[var2] = new class53();
                this.field234[var2].method1011(arg0);
            }
        }
        this.field233 = arg0.method6242();
        this.field231 = arg0.method6242();
    }

    @ObfuscatedName("at.w()Laz;")
    public class36 method667() {
        byte[] var1 = this.method673();
        return new class36(22050, var1, this.field233 * 22050 / 1000, this.field231 * 22050 / 1000);
    }

    @ObfuscatedName("at.s()I")
    public final int method672() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field234[var2] != null && this.field234[var2].field414 / 20 < var1) {
                var1 = this.field234[var2].field414 / 20;
            }
        }
        if (this.field233 < this.field231 && this.field233 / 20 < var1) {
            var1 = this.field233 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field234[var3] != null) {
                this.field234[var3].field414 -= var1 * 20;
            }
        }
        if (this.field233 < this.field231) {
            this.field233 -= var1 * 20;
            this.field231 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("at.a()[B")
    public final byte[] method673() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field234[var2] != null && this.field234[var2].field414 + this.field234[var2].field412 > var1) {
                var1 = this.field234[var2].field414 + this.field234[var2].field412;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field234[var5] != null) {
                int var6 = this.field234[var5].field412 * 22050 / 1000;
                int var7 = this.field234[var5].field414 * 22050 / 1000;
                int[] var8 = this.field234[var5].method1012(var6, this.field234[var5].field412);
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
