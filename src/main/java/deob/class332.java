package deob;

@ObfuscatedName("lm")
public class class332 {

    @ObfuscatedName("lm.p")
    public String field3940;

    @ObfuscatedName("lm.b")
    public class234 field3941;

    @ObfuscatedName("lm.e")
    public int field3942 = 0;

    @ObfuscatedName("lm.x")
    public boolean field3943 = false;

    public class332(class234 arg0) {
        this.field3941 = arg0;
    }

    @ObfuscatedName("lm.f(Ljava/lang/String;I)V")
    public void method5836(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3940 != arg0) {
            this.field3940 = arg0;
            this.field3942 = 0;
            this.field3943 = false;
            this.method5837();
        }
    }

    @ObfuscatedName("lm.i(B)I")
    public int method5837() {
        if (this.field3942 < 33) {
            if (!this.field3941.method3771(class36.field287.field286, this.field3940)) {
                return this.field3942;
            }
            this.field3942 = 33;
        }
        if (this.field3942 == 33) {
            if (this.field3941.method3772(class36.field288.field286, this.field3940) && !this.field3941.method3771(class36.field288.field286, this.field3940)) {
                return this.field3942;
            }
            this.field3942 = 66;
        }
        if (this.field3942 == 66) {
            if (!this.field3941.method3771(this.field3940, class36.field290.field286)) {
                return this.field3942;
            }
            this.field3942 = 100;
            this.field3943 = true;
        }
        return this.field3942;
    }

    @ObfuscatedName("lm.y(I)Z")
    public boolean method5838() {
        return this.field3943;
    }

    @ObfuscatedName("lm.w(I)I")
    public int method5839() {
        return this.field3942;
    }
}
