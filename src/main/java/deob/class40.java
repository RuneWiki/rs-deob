package deob;

@ObfuscatedName("bt")
public class class40 {

    @ObfuscatedName("bt.al")
    public class58[] field264 = new class58[10];

    @ObfuscatedName("bt.ac")
    public int field265;

    @ObfuscatedName("bt.ab")
    public int field263;

    @ObfuscatedName("bt.aj(Lne;II)Lbt;")
    public static class40 method725(class340 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5860(arg1, arg2);
        return var3 == null ? null : new class40(new class478(var3));
    }

    public class40(class478 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7909();
            if (var3 != 0) {
                arg0.field4904--;
                this.field264[var2] = new class58();
                this.field264[var2].method1072(arg0);
            }
        }
        this.field265 = arg0.method7905();
        this.field263 = arg0.method7905();
    }

    @ObfuscatedName("bt.al()Lbe;")
    public class41 method719() {
        byte[] var1 = this.method721();
        return new class41(22050, var1, this.field265 * 22050 / 1000, this.field263 * 22050 / 1000);
    }

    @ObfuscatedName("bt.ac()I")
    public final int method718() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field264[var2] != null && this.field264[var2].field441 / 20 < var1) {
                var1 = this.field264[var2].field441 / 20;
            }
        }
        if (this.field265 < this.field263 && this.field265 / 20 < var1) {
            var1 = this.field265 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field264[var3] != null) {
                this.field264[var3].field441 -= var1 * 20;
            }
        }
        if (this.field265 < this.field263) {
            this.field265 -= var1 * 20;
            this.field263 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bt.ab()[B")
    public final byte[] method721() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field264[var2] != null && this.field264[var2].field441 + this.field264[var2].field429 > var1) {
                var1 = this.field264[var2].field441 + this.field264[var2].field429;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field264[var5] != null) {
                int var6 = this.field264[var5].field429 * 22050 / 1000;
                int var7 = this.field264[var5].field441 * 22050 / 1000;
                int[] var8 = this.field264[var5].method1070(var6, this.field264[var5].field429);
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
