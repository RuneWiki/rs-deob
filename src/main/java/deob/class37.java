package deob;

@ObfuscatedName("ap")
public class class37 {

    @ObfuscatedName("ap.p")
    public class55[] field267 = new class55[10];

    @ObfuscatedName("ap.f")
    public int field266;

    @ObfuscatedName("ap.n")
    public int field268;

    @ObfuscatedName("ap.c(Llv;II)Lap;")
    public static class37 method685(class317 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5499(arg1, arg2);
        return var3 == null ? null : new class37(new class445(var3));
    }

    public class37(class445 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7196();
            if (var3 != 0) {
                arg0.field4735--;
                this.field267[var2] = new class55();
                this.field267[var2].method1058(arg0);
            }
        }
        this.field266 = arg0.method7198();
        this.field268 = arg0.method7198();
    }

    @ObfuscatedName("ap.p()Lab;")
    public class38 method686() {
        byte[] var1 = this.method694();
        return new class38(22050, var1, this.field266 * 22050 / 1000, this.field268 * 22050 / 1000);
    }

    @ObfuscatedName("ap.f()I")
    public final int method684() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field267[var2] != null && this.field267[var2].field441 / 20 < var1) {
                var1 = this.field267[var2].field441 / 20;
            }
        }
        if (this.field266 < this.field268 && this.field266 / 20 < var1) {
            var1 = this.field266 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field267[var3] != null) {
                this.field267[var3].field441 -= var1 * 20;
            }
        }
        if (this.field266 < this.field268) {
            this.field266 -= var1 * 20;
            this.field268 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ap.n()[B")
    public final byte[] method694() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field267[var2] != null && this.field267[var2].field451 + this.field267[var2].field441 > var1) {
                var1 = this.field267[var2].field451 + this.field267[var2].field441;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field267[var5] != null) {
                int var6 = this.field267[var5].field451 * 22050 / 1000;
                int var7 = this.field267[var5].field441 * 22050 / 1000;
                int[] var8 = this.field267[var5].method1056(var6, this.field267[var5].field451);
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
