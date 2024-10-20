package deob;

@ObfuscatedName("ox")
public class class414 {

    @ObfuscatedName("ox.j")
    public String field4508;

    @ObfuscatedName("ox.e")
    public class315 field4509;

    @ObfuscatedName("ox.g")
    public int field4510 = 0;

    @ObfuscatedName("ox.w")
    public boolean field4511 = false;

    public class414(class315 arg0) {
        this.field4509 = arg0;
    }

    @ObfuscatedName("ox.c(Ljava/lang/String;I)V")
    public void method6519(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4508 != arg0) {
            this.field4508 = arg0;
            this.field4510 = 0;
            this.field4511 = false;
            this.method6520();
        }
    }

    @ObfuscatedName("ox.v(B)I")
    public int method6520() {
        if (this.field4510 < 33) {
            if (!this.field4509.method5331(class244.field2866.field2865, this.field4508)) {
                return this.field4510;
            }
            this.field4510 = 33;
        }
        if (this.field4510 == 33) {
            if (this.field4509.method5318(class244.field2867.field2865, this.field4508) && !this.field4509.method5331(class244.field2867.field2865, this.field4508)) {
                return this.field4510;
            }
            this.field4510 = 66;
        }
        if (this.field4510 == 66) {
            if (!this.field4509.method5331(this.field4508, class244.field2869.field2865)) {
                return this.field4510;
            }
            this.field4510 = 100;
            this.field4511 = true;
        }
        return this.field4510;
    }

    @ObfuscatedName("ox.q(I)Z")
    public boolean method6521() {
        return this.field4511;
    }

    @ObfuscatedName("ox.f(I)I")
    public int method6527() {
        return this.field4510;
    }
}
