package deob;

@ObfuscatedName("bw")
public class class40 {

    @ObfuscatedName("bw.ad")
    public class62[] field244 = new class62[10];

    @ObfuscatedName("bw.ag")
    public int field246;

    @ObfuscatedName("bw.ak")
    public int field245;

    @ObfuscatedName("bw.aq(Lok;II)Lbw;")
    public static class40 method765(class388 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6539(arg1, arg2);
        return var3 == null ? null : new class40(new class547(var3));
    }

    public class40(class547 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8804();
            if (var3 != 0) {
                arg0.field5363--;
                this.field244[var2] = new class62();
                this.field244[var2].method1108(arg0);
            }
        }
        this.field246 = arg0.method8899();
        this.field245 = arg0.method8899();
    }

    @ObfuscatedName("bw.ad()Lbl;")
    public class41 method754() {
        byte[] var1 = this.method764();
        return new class41(22050, var1, this.field246 * 22050 / 1000, this.field245 * 22050 / 1000);
    }

    @ObfuscatedName("bw.ag()I")
    public final int method755() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field244[var2] != null && this.field244[var2].field432 / 20 < var1) {
                var1 = this.field244[var2].field432 / 20;
            }
        }
        if (this.field246 < this.field245 && this.field246 / 20 < var1) {
            var1 = this.field246 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field244[var3] != null) {
                this.field244[var3].field432 -= var1 * 20;
            }
        }
        if (this.field246 < this.field245) {
            this.field246 -= var1 * 20;
            this.field245 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.ak()[B")
    public final byte[] method764() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field244[var2] != null && this.field244[var2].field432 + this.field244[var2].field416 > var1) {
                var1 = this.field244[var2].field432 + this.field244[var2].field416;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field244[var5] != null) {
                int var6 = this.field244[var5].field416 * 22050 / 1000;
                int var7 = this.field244[var5].field432 * 22050 / 1000;
                int[] var8 = this.field244[var5].method1109(var6, this.field244[var5].field416);
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
