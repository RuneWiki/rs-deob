package deob;

@ObfuscatedName("av")
public class class35 {

    @ObfuscatedName("av.c")
    public class53[] field250 = new class53[10];

    @ObfuscatedName("av.i")
    public int field249;

    @ObfuscatedName("av.f")
    public int field251;

    @ObfuscatedName("av.v(Lln;II)Lav;")
    public static class35 method652(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5296(arg1, arg2);
        return var3 == null ? null : new class35(new class438(var3));
    }

    public class35(class438 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6971();
            if (var3 != 0) {
                arg0.field4621--;
                this.field250[var2] = new class53();
                this.field250[var2].method997(arg0);
            }
        }
        this.field249 = arg0.method7148();
        this.field251 = arg0.method7148();
    }

    @ObfuscatedName("av.c()Lat;")
    public class36 method649() {
        byte[] var1 = this.method651();
        return new class36(22050, var1, this.field249 * 22050 / 1000, this.field251 * 22050 / 1000);
    }

    @ObfuscatedName("av.i()I")
    public final int method647() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field250[var2] != null && this.field250[var2].field431 / 20 < var1) {
                var1 = this.field250[var2].field431 / 20;
            }
        }
        if (this.field249 < this.field251 && this.field249 / 20 < var1) {
            var1 = this.field249 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field250[var3] != null) {
                this.field250[var3].field431 -= var1 * 20;
            }
        }
        if (this.field249 < this.field251) {
            this.field249 -= var1 * 20;
            this.field251 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("av.f()[B")
    public final byte[] method651() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field250[var2] != null && this.field250[var2].field431 + this.field250[var2].field430 > var1) {
                var1 = this.field250[var2].field431 + this.field250[var2].field430;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field250[var5] != null) {
                int var6 = this.field250[var5].field430 * 22050 / 1000;
                int var7 = this.field250[var5].field431 * 22050 / 1000;
                int[] var8 = this.field250[var5].method996(var6, this.field250[var5].field430);
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
