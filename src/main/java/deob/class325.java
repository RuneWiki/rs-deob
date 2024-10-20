package deob;

@ObfuscatedName("lg")
public class class325 {

    @ObfuscatedName("lg.h")
    public String field3922;

    @ObfuscatedName("lg.l")
    public class256 field3925;

    @ObfuscatedName("lg.y")
    public int field3924 = 0;

    @ObfuscatedName("lg.g")
    public boolean field3921 = false;

    public class325(class256 arg0) {
        this.field3925 = arg0;
    }

    @ObfuscatedName("lg.b(Ljava/lang/String;I)V")
    public void method5482(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3922 != arg0) {
            this.field3922 = arg0;
            this.field3924 = 0;
            this.field3921 = false;
            this.method5483();
        }
    }

    @ObfuscatedName("lg.q(I)I")
    public int method5483() {
        if (this.field3924 < 25) {
            if (!this.field3925.method4181(class41.field504.field503, this.field3922)) {
                return this.field3924;
            }
            this.field3924 = 25;
        }
        if (this.field3924 == 25) {
            if (!this.field3925.method4181(this.field3922, class41.field501.field503)) {
                return 25 + this.field3925.method4184(this.field3922) * 25 / 100;
            }
            this.field3924 = 50;
        }
        if (this.field3924 == 50) {
            if (this.field3925.method4161(class41.field507.field503, this.field3922) && !this.field3925.method4181(class41.field507.field503, this.field3922)) {
                return 50;
            }
            this.field3924 = 75;
        }
        if (this.field3924 == 75) {
            if (!this.field3925.method4181(this.field3922, class41.field502.field503)) {
                return 75;
            }
            this.field3924 = 100;
            this.field3921 = true;
        }
        return this.field3924;
    }

    @ObfuscatedName("lg.o(B)Z")
    public boolean method5491() {
        return this.field3921;
    }

    @ObfuscatedName("lg.p(I)I")
    public int method5485() {
        return this.field3924;
    }
}
