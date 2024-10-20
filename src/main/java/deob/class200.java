package deob;

@ObfuscatedName("gx")
public final class class200 {

    @ObfuscatedName("gx.s")
    public int field3144;

    @ObfuscatedName("gx.z")
    public class212[] field3140;

    @ObfuscatedName("gx.t")
    public class212 field3142;

    @ObfuscatedName("gx.y")
    public class212 field3143;

    @ObfuscatedName("gx.p")
    public int field3141 = 0;

    public class200(int arg0) {
        this.field3144 = arg0;
        this.field3140 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3140[var2] = new class212();
            var3.field3166 = var3;
            var3.field3168 = var3;
        }
    }

    @ObfuscatedName("gx.s(J)Lhg;")
    public class212 method3555(long arg0) {
        class212 var3 = this.field3140[(int) (arg0 & (long) (this.field3144 - 1))];
        for (this.field3142 = var3.field3166; this.field3142 != var3; this.field3142 = this.field3142.field3166) {
            if (this.field3142.field3167 == arg0) {
                class212 var4 = this.field3142;
                this.field3142 = this.field3142.field3166;
                return var4;
            }
        }
        this.field3142 = null;
        return null;
    }

    @ObfuscatedName("gx.z(Lhg;J)V")
    public void method3556(class212 arg0, long arg1) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        class212 var4 = this.field3140[(int) (arg1 & (long) (this.field3144 - 1))];
        arg0.field3168 = var4.field3168;
        arg0.field3166 = var4;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
        arg0.field3167 = arg1;
    }

    @ObfuscatedName("gx.t()V")
    public void method3557() {
        for (int var1 = 0; var1 < this.field3144; var1++) {
            class212 var2 = this.field3140[var1];
            while (true) {
                class212 var3 = var2.field3166;
                if (var2 == var3) {
                    break;
                }
                var3.method3699();
            }
        }
        this.field3142 = null;
        this.field3143 = null;
    }

    @ObfuscatedName("gx.y()Lhg;")
    public class212 method3560() {
        this.field3141 = 0;
        return this.method3565();
    }

    @ObfuscatedName("gx.p()Lhg;")
    public class212 method3565() {
        if (this.field3141 > 0 && this.field3140[this.field3141 - 1] != this.field3143) {
            class212 var1 = this.field3143;
            this.field3143 = var1.field3166;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3141 >= this.field3144) {
                return null;
            }
            var2 = this.field3140[this.field3141++].field3166;
        } while (this.field3140[this.field3141 - 1] == var2);
        this.field3143 = var2.field3166;
        return var2;
    }
}
