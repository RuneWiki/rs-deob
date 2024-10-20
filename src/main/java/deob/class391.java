package deob;

@ObfuscatedName("ok")
public class class391 {

    @ObfuscatedName("ok.t")
    public String field4303;

    @ObfuscatedName("ok.s")
    public class302 field4302;

    @ObfuscatedName("ok.j")
    public int field4301 = 0;

    @ObfuscatedName("ok.w")
    public boolean field4306 = false;

    public class391(class302 arg0) {
        this.field4302 = arg0;
    }

    @ObfuscatedName("ok.c(Ljava/lang/String;I)V")
    public void method6197(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4303 != arg0) {
            this.field4303 = arg0;
            this.field4301 = 0;
            this.field4306 = false;
            this.method6193();
        }
    }

    @ObfuscatedName("ok.b(I)I")
    public int method6193() {
        if (this.field4301 < 33) {
            if (!this.field4302.method5092(class237.field2764.field2770, this.field4303)) {
                return this.field4301;
            }
            this.field4301 = 33;
        }
        if (this.field4301 == 33) {
            if (this.field4302.method5071(class237.field2765.field2770, this.field4303) && !this.field4302.method5092(class237.field2765.field2770, this.field4303)) {
                return this.field4301;
            }
            this.field4301 = 66;
        }
        if (this.field4301 == 66) {
            if (!this.field4302.method5092(this.field4303, class237.field2767.field2770)) {
                return this.field4301;
            }
            this.field4301 = 100;
            this.field4306 = true;
        }
        return this.field4301;
    }

    @ObfuscatedName("ok.p(B)Z")
    public boolean method6194() {
        return this.field4306;
    }

    @ObfuscatedName("ok.m(B)I")
    public int method6195() {
        return this.field4301;
    }
}
