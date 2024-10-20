package deob;

@ObfuscatedName("bs")
public class class40 {

    @ObfuscatedName("bs.an")
    public class58[] field277 = new class58[10];

    @ObfuscatedName("bs.aw")
    public int field278;

    @ObfuscatedName("bs.ac")
    public int field279;

    @ObfuscatedName("bs.af(Lnm;II)Lbs;")
    public static class40 method766(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6090(arg1, arg2);
        return var3 == null ? null : new class40(new class489(var3));
    }

    public class40(class489 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8248();
            if (var3 != 0) {
                arg0.field4989--;
                this.field277[var2] = new class58();
                this.field277[var2].method1088(arg0);
            }
        }
        this.field278 = arg0.method8250();
        this.field279 = arg0.method8250();
    }

    @ObfuscatedName("bs.an()Lbr;")
    public class41 method767() {
        byte[] var1 = this.method769();
        return new class41(22050, var1, this.field278 * 22050 / 1000, this.field279 * 22050 / 1000);
    }

    @ObfuscatedName("bs.aw()I")
    public final int method768() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field277[var2] != null && this.field277[var2].field445 / 20 < var1) {
                var1 = this.field277[var2].field445 / 20;
            }
        }
        if (this.field278 < this.field279 && this.field278 / 20 < var1) {
            var1 = this.field278 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field277[var3] != null) {
                this.field277[var3].field445 -= var1 * 20;
            }
        }
        if (this.field278 < this.field279) {
            this.field278 -= var1 * 20;
            this.field279 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bs.ac()[B")
    public final byte[] method769() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field277[var2] != null && this.field277[var2].field445 + this.field277[var2].field443 > var1) {
                var1 = this.field277[var2].field445 + this.field277[var2].field443;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field277[var5] != null) {
                int var6 = this.field277[var5].field443 * 22050 / 1000;
                int var7 = this.field277[var5].field445 * 22050 / 1000;
                int[] var8 = this.field277[var5].method1085(var6, this.field277[var5].field443);
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
