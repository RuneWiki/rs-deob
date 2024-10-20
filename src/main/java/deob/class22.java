package deob;

@ObfuscatedName("z")
public class class22 {

    @ObfuscatedName("z.l")
    public class19[] field307 = new class19[10];

    @ObfuscatedName("z.a")
    public int field309;

    @ObfuscatedName("z.o")
    public int field308;

    @ObfuscatedName("z.q(Lcv;II)Lz;")
    public static class22 method263(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1024(arg1, arg2);
        return var3 == null ? null : new class22(new class136(var3));
    }

    public class22(class136 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1602();
            if (var3 != 0) {
                arg0.field1722--;
                this.field307[var2] = new class19();
                this.field307[var2].method233(arg0);
            }
        }
        this.field309 = arg0.method1712();
        this.field308 = arg0.method1712();
    }

    @ObfuscatedName("z.l()Leg;")
    public class146 method256() {
        byte[] var1 = this.method258();
        return new class146(22050, var1, this.field309 * 22050 / 1000, this.field308 * 22050 / 1000);
    }

    @ObfuscatedName("z.a()I")
    public final int method255() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field307[var2] != null && this.field307[var2].field280 / 20 < var1) {
                var1 = this.field307[var2].field280 / 20;
            }
        }
        if (this.field309 < this.field308 && this.field309 / 20 < var1) {
            var1 = this.field309 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field307[var3] != null) {
                this.field307[var3].field280 -= var1 * 20;
            }
        }
        if (this.field309 < this.field308) {
            this.field309 -= var1 * 20;
            this.field308 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("z.o()[B")
    public final byte[] method258() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field307[var2] != null && this.field307[var2].field286 + this.field307[var2].field280 > var1) {
                var1 = this.field307[var2].field286 + this.field307[var2].field280;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field307[var5] != null) {
                int var6 = this.field307[var5].field286 * 22050 / 1000;
                int var7 = this.field307[var5].field280 * 22050 / 1000;
                int[] var8 = this.field307[var5].method237(var6, this.field307[var5].field286);
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
