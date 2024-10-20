package deob;

@ObfuscatedName("lw")
public class class333 {

    @ObfuscatedName("lw.h")
    public String field3945;

    @ObfuscatedName("lw.f")
    public class255 field3946;

    @ObfuscatedName("lw.p")
    public int field3947 = 0;

    @ObfuscatedName("lw.m")
    public boolean field3943 = false;

    public class333(class255 arg0) {
        this.field3946 = arg0;
    }

    @ObfuscatedName("lw.a(Ljava/lang/String;B)V")
    public void method5802(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3945 != arg0) {
            this.field3945 = arg0;
            this.field3947 = 0;
            this.field3943 = false;
            this.method5813();
        }
    }

    @ObfuscatedName("lw.s(B)I")
    public int method5813() {
        if (this.field3947 < 33) {
            if (!this.field3946.method4443(class36.field304.field308, this.field3945)) {
                return this.field3947;
            }
            this.field3947 = 33;
        }
        if (this.field3947 == 33) {
            if (this.field3946.method4441(class36.field305.field308, this.field3945) && !this.field3946.method4443(class36.field305.field308, this.field3945)) {
                return this.field3947;
            }
            this.field3947 = 66;
        }
        if (this.field3947 == 66) {
            if (!this.field3946.method4443(this.field3945, class36.field307.field308)) {
                return this.field3947;
            }
            this.field3947 = 100;
            this.field3943 = true;
        }
        return this.field3947;
    }

    @ObfuscatedName("lw.g(I)Z")
    public boolean method5812() {
        return this.field3943;
    }

    @ObfuscatedName("lw.x(I)I")
    public int method5805() {
        return this.field3947;
    }
}
