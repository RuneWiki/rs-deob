package deob;

@ObfuscatedName("aa")
public class class50 {

    @ObfuscatedName("aa.n")
    public class68[] field396 = new class68[10];

    @ObfuscatedName("aa.f")
    public int field397;

    @ObfuscatedName("aa.y")
    public int field398;

    @ObfuscatedName("aa.v(Ljv;II)Laa;")
    public static class50 method593(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4468(arg1, arg2);
        return var3 == null ? null : new class50(new class383(var3));
    }

    public class50(class383 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5965();
            if (var3 != 0) {
                arg0.field4158--;
                this.field396[var2] = new class68();
                this.field396[var2].method935(arg0);
            }
        }
        this.field397 = arg0.method5967();
        this.field398 = arg0.method5967();
    }

    @ObfuscatedName("aa.n()Lau;")
    public class51 method592() {
        byte[] var1 = this.method594();
        return new class51(22050, var1, this.field397 * 22050 / 1000, this.field398 * 22050 / 1000);
    }

    @ObfuscatedName("aa.f()I")
    public final int method591() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field396[var2] != null && this.field396[var2].field583 / 20 < var1) {
                var1 = this.field396[var2].field583 / 20;
            }
        }
        if (this.field397 < this.field398 && this.field397 / 20 < var1) {
            var1 = this.field397 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field396[var3] != null) {
                this.field396[var3].field583 -= var1 * 20;
            }
        }
        if (this.field397 < this.field398) {
            this.field397 -= var1 * 20;
            this.field398 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("aa.y()[B")
    public final byte[] method594() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field396[var2] != null && this.field396[var2].field585 + this.field396[var2].field583 > var1) {
                var1 = this.field396[var2].field585 + this.field396[var2].field583;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field396[var5] != null) {
                int var6 = this.field396[var5].field585 * 22050 / 1000;
                int var7 = this.field396[var5].field583 * 22050 / 1000;
                int[] var8 = this.field396[var5].method933(var6, this.field396[var5].field585);
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
