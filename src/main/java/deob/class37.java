package deob;

@ObfuscatedName("ap")
public class class37 extends class174 {

    @ObfuscatedName("ap.h")
    public static class170 field952 = new class170(64);

    @ObfuscatedName("ap.s")
    public int field943 = 0;

    @ObfuscatedName("ap.o")
    public int field944 = -1;

    @ObfuscatedName("ap.p")
    public boolean field945 = true;

    @ObfuscatedName("ap.x")
    public int field941 = -1;

    @ObfuscatedName("ap.k")
    public int field947;

    @ObfuscatedName("ap.r")
    public int field948;

    @ObfuscatedName("ap.z")
    public int field949;

    @ObfuscatedName("ap.n")
    public int field956;

    @ObfuscatedName("ap.j")
    public int field951;

    @ObfuscatedName("ap.b")
    public int field942;

    @ObfuscatedName("d.g(Leu;I)V")
    public static void method230(class153 arg0) {
        Statics.field950 = arg0;
    }

    @ObfuscatedName("ap.h(I)V")
    public void method787() {
        if (this.field941 != -1) {
            this.method790(this.field941);
            this.field956 = this.field947;
            this.field951 = this.field948;
            this.field942 = this.field949;
        }
        this.method790(this.field943);
    }

    @ObfuscatedName("ap.s(Ldw;II)V")
    public void method803(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2499();
            if (var3 == 0) {
                return;
            }
            this.method789(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.o(Ldw;III)V")
    public void method789(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field943 = arg0.method2503();
        } else if (arg1 == 2) {
            this.field944 = arg0.method2499();
        } else if (arg1 == 5) {
            this.field945 = false;
        } else if (arg1 == 7) {
            this.field941 = arg0.method2503();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ap.p(II)V")
    public void method790(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field947 = (int) (var18 * 256.0D);
        this.field948 = (int) (var14 * 256.0D);
        this.field949 = (int) (var16 * 256.0D);
        if (this.field948 < 0) {
            this.field948 = 0;
        } else if (this.field948 > 255) {
            this.field948 = 255;
        }
        if (this.field949 < 0) {
            this.field949 = 0;
        } else if (this.field949 > 255) {
            this.field949 = 255;
        }
    }
}
