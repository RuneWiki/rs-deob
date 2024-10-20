package deob;

@ObfuscatedName("ay")
public class class37 {

    @ObfuscatedName("ay.h")
    public class55[] field258 = new class55[10];

    @ObfuscatedName("ay.w")
    public int field259;

    @ObfuscatedName("ay.v")
    public int field257;

    @ObfuscatedName("ay.s(Lls;II)Lay;")
    public static class37 method628(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5179(arg1, arg2);
        return var3 == null ? null : new class37(new class444(var3));
    }

    public class37(class444 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6929();
            if (var3 != 0) {
                arg0.field4708--;
                this.field258[var2] = new class55();
                this.field258[var2].method948(arg0);
            }
        }
        this.field259 = arg0.method7120();
        this.field257 = arg0.method7120();
    }

    @ObfuscatedName("ay.h()Lag;")
    public class38 method630() {
        byte[] var1 = this.method623();
        return new class38(22050, var1, this.field259 * 22050 / 1000, this.field257 * 22050 / 1000);
    }

    @ObfuscatedName("ay.w()I")
    public final int method622() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field258[var2] != null && this.field258[var2].field427 / 20 < var1) {
                var1 = this.field258[var2].field427 / 20;
            }
        }
        if (this.field259 < this.field257 && this.field259 / 20 < var1) {
            var1 = this.field259 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field258[var3] != null) {
                this.field258[var3].field427 -= var1 * 20;
            }
        }
        if (this.field259 < this.field257) {
            this.field259 -= var1 * 20;
            this.field257 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ay.v()[B")
    public final byte[] method623() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field258[var2] != null && this.field258[var2].field436 + this.field258[var2].field427 > var1) {
                var1 = this.field258[var2].field436 + this.field258[var2].field427;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field258[var5] != null) {
                int var6 = this.field258[var5].field436 * 22050 / 1000;
                int var7 = this.field258[var5].field427 * 22050 / 1000;
                int[] var8 = this.field258[var5].method946(var6, this.field258[var5].field436);
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
