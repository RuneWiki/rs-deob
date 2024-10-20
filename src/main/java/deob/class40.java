package deob;

@ObfuscatedName("bp")
public class class40 {

    @ObfuscatedName("bp.al")
    public class62[] field263 = new class62[10];

    @ObfuscatedName("bp.aj")
    public int field262;

    @ObfuscatedName("bp.az")
    public int field265;

    @ObfuscatedName("bp.ak(Lor;II)Lbp;")
    public static class40 method750(class387 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6573(arg1, arg2);
        return var3 == null ? null : new class40(new class546(var3));
    }

    public class40(class546 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8796();
            if (var3 != 0) {
                arg0.field5344--;
                this.field263[var2] = new class62();
                this.field263[var2].method1092(arg0);
            }
        }
        this.field262 = arg0.method8798();
        this.field265 = arg0.method8798();
    }

    @ObfuscatedName("bp.al()Lbr;")
    public class41 method738() {
        byte[] var1 = this.method740();
        return new class41(22050, var1, this.field262 * 22050 / 1000, this.field265 * 22050 / 1000);
    }

    @ObfuscatedName("bp.aj()I")
    public final int method739() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field263[var2] != null && this.field263[var2].field453 / 20 < var1) {
                var1 = this.field263[var2].field453 / 20;
            }
        }
        if (this.field262 < this.field265 && this.field262 / 20 < var1) {
            var1 = this.field262 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field263[var3] != null) {
                this.field263[var3].field453 -= var1 * 20;
            }
        }
        if (this.field262 < this.field265) {
            this.field262 -= var1 * 20;
            this.field265 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bp.az()[B")
    public final byte[] method740() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field263[var2] != null && this.field263[var2].field455 + this.field263[var2].field453 > var1) {
                var1 = this.field263[var2].field455 + this.field263[var2].field453;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field263[var5] != null) {
                int var6 = this.field263[var5].field455 * 22050 / 1000;
                int var7 = this.field263[var5].field453 * 22050 / 1000;
                int[] var8 = this.field263[var5].method1093(var6, this.field263[var5].field455);
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
