package deob;

@ObfuscatedName("bv")
public class class40 {

    @ObfuscatedName("bv.ap")
    public class62[] field265 = new class62[10];

    @ObfuscatedName("bv.af")
    public int field266;

    @ObfuscatedName("bv.aj")
    public int field267;

    @ObfuscatedName("bv.am(Low;II)Lbv;")
    public static class40 method769(class375 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6396(arg1, arg2);
        return var3 == null ? null : new class40(new class531(var3));
    }

    public class40(class531 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8561();
            if (var3 != 0) {
                arg0.field5181--;
                this.field265[var2] = new class62();
                this.field265[var2].method1141(arg0);
            }
        }
        this.field266 = arg0.method8775();
        this.field267 = arg0.method8775();
    }

    @ObfuscatedName("bv.ap()Lbm;")
    public class41 method770() {
        byte[] var1 = this.method771();
        return new class41(22050, var1, this.field266 * 22050 / 1000, this.field267 * 22050 / 1000);
    }

    @ObfuscatedName("bv.af()I")
    public final int method777() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field265[var2] != null && this.field265[var2].field457 / 20 < var1) {
                var1 = this.field265[var2].field457 / 20;
            }
        }
        if (this.field266 < this.field267 && this.field266 / 20 < var1) {
            var1 = this.field266 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field265[var3] != null) {
                this.field265[var3].field457 -= var1 * 20;
            }
        }
        if (this.field266 < this.field267) {
            this.field266 -= var1 * 20;
            this.field267 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bv.aj()[B")
    public final byte[] method771() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field265[var2] != null && this.field265[var2].field457 + this.field265[var2].field456 > var1) {
                var1 = this.field265[var2].field457 + this.field265[var2].field456;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field265[var5] != null) {
                int var6 = this.field265[var5].field456 * 22050 / 1000;
                int var7 = this.field265[var5].field457 * 22050 / 1000;
                int[] var8 = this.field265[var5].method1138(var6, this.field265[var5].field456);
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
