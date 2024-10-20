package deob;

@ObfuscatedName("ac")
public class class40 {

    @ObfuscatedName("ac.w")
    public class58[] field286 = new class58[10];

    @ObfuscatedName("ac.v")
    public int field287;

    @ObfuscatedName("ac.s")
    public int field285;

    @ObfuscatedName("ac.f(Lln;II)Lac;")
    public static class40 method734(class337 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5990(arg1, arg2);
        return var3 == null ? null : new class40(new class474(var3));
    }

    public class40(class474 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7964();
            if (var3 != 0) {
                arg0.field4939--;
                this.field286[var2] = new class58();
                this.field286[var2].method1077(arg0);
            }
        }
        this.field287 = arg0.method8032();
        this.field285 = arg0.method8032();
    }

    @ObfuscatedName("ac.w()Lav;")
    public class41 method733() {
        byte[] var1 = this.method735();
        return new class41(22050, var1, this.field287 * 22050 / 1000, this.field285 * 22050 / 1000);
    }

    @ObfuscatedName("ac.v()I")
    public final int method732() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field286[var2] != null && this.field286[var2].field457 / 20 < var1) {
                var1 = this.field286[var2].field457 / 20;
            }
        }
        if (this.field287 < this.field285 && this.field287 / 20 < var1) {
            var1 = this.field287 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field286[var3] != null) {
                this.field286[var3].field457 -= var1 * 20;
            }
        }
        if (this.field287 < this.field285) {
            this.field287 -= var1 * 20;
            this.field285 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ac.s()[B")
    public final byte[] method735() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field286[var2] != null && this.field286[var2].field465 + this.field286[var2].field457 > var1) {
                var1 = this.field286[var2].field465 + this.field286[var2].field457;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field286[var5] != null) {
                int var6 = this.field286[var5].field465 * 22050 / 1000;
                int var7 = this.field286[var5].field457 * 22050 / 1000;
                int[] var8 = this.field286[var5].method1083(var6, this.field286[var5].field465);
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
