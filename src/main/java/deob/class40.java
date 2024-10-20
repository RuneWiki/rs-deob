package deob;

@ObfuscatedName("bu")
public class class40 {

    @ObfuscatedName("bu.aw")
    public class62[] field237 = new class62[10];

    @ObfuscatedName("bu.ak")
    public int field239;

    @ObfuscatedName("bu.aj")
    public int field240;

    @ObfuscatedName("bu.ap(Lpe;II)Lbu;")
    public static class40 method753(class392 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method7009(arg1, arg2);
        return var3 == null ? null : new class40(new class558(var3));
    }

    public class40(class558 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method9258();
            if (var3 != 0) {
                arg0.field5462--;
                this.field237[var2] = new class62();
                this.field237[var2].method1150(arg0);
            }
        }
        this.field239 = arg0.method9260();
        this.field240 = arg0.method9260();
    }

    @ObfuscatedName("bu.aw()Lbt;")
    public class41 method739() {
        byte[] var1 = this.method741();
        return new class41(22050, var1, this.field239 * 22050 / 1000, this.field240 * 22050 / 1000);
    }

    @ObfuscatedName("bu.ak()I")
    public final int method751() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field237[var2] != null && this.field237[var2].field426 / 20 < var1) {
                var1 = this.field237[var2].field426 / 20;
            }
        }
        if (this.field239 < this.field240 && this.field239 / 20 < var1) {
            var1 = this.field239 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field237[var3] != null) {
                this.field237[var3].field426 -= var1 * 20;
            }
        }
        if (this.field239 < this.field240) {
            this.field239 -= var1 * 20;
            this.field240 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bu.aj()[B")
    public final byte[] method741() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field237[var2] != null && this.field237[var2].field430 + this.field237[var2].field426 > var1) {
                var1 = this.field237[var2].field430 + this.field237[var2].field426;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field237[var5] != null) {
                int var6 = this.field237[var5].field430 * 22050 / 1000;
                int var7 = this.field237[var5].field426 * 22050 / 1000;
                int[] var8 = this.field237[var5].method1149(var6, this.field237[var5].field430);
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
