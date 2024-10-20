package deob;

@ObfuscatedName("lc")
public class class329 {

    @ObfuscatedName("lc.w")
    public String field3924;

    @ObfuscatedName("lc.d")
    public class250 field3929;

    @ObfuscatedName("lc.n")
    public int field3930 = 0;

    @ObfuscatedName("lc.s")
    public boolean field3931 = false;

    public class329(class250 arg0) {
        this.field3929 = arg0;
    }

    @ObfuscatedName("lc.f(Ljava/lang/String;I)V")
    public void method5623(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3924 != arg0) {
            this.field3924 = arg0;
            this.field3930 = 0;
            this.field3931 = false;
            this.method5622();
        }
    }

    @ObfuscatedName("lc.h(I)I")
    public int method5622() {
        if (this.field3930 < 25) {
            if (!this.field3929.method4289(class30.field253.field257, this.field3924)) {
                return this.field3930;
            }
            this.field3930 = 25;
        }
        if (this.field3930 == 25) {
            if (!this.field3929.method4289(this.field3924, class30.field255.field257)) {
                return 25 + this.field3929.method4292(this.field3924) * 25 / 100;
            }
            this.field3930 = 50;
        }
        if (this.field3930 == 50) {
            if (this.field3929.method4282(class30.field256.field257, this.field3924) && !this.field3929.method4289(class30.field256.field257, this.field3924)) {
                return 50;
            }
            this.field3930 = 75;
        }
        if (this.field3930 == 75) {
            if (!this.field3929.method4289(this.field3924, class30.field252.field257)) {
                return 75;
            }
            this.field3930 = 100;
            this.field3931 = true;
        }
        return this.field3930;
    }

    @ObfuscatedName("lc.e(I)Z")
    public boolean method5616() {
        return this.field3931;
    }

    @ObfuscatedName("lc.b(I)I")
    public int method5617() {
        return this.field3930;
    }
}
