package deob;

@ObfuscatedName("ow")
public class class416 {

    @ObfuscatedName("ow.k")
    public String field4548;

    @ObfuscatedName("ow.w")
    public class317 field4549;

    @ObfuscatedName("ow.s")
    public int field4550 = 0;

    @ObfuscatedName("ow.q")
    public boolean field4551 = false;

    public class416(class317 arg0) {
        this.field4549 = arg0;
    }

    @ObfuscatedName("ow.c(Ljava/lang/String;I)V")
    public void method6681(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4548 != arg0) {
            this.field4548 = arg0;
            this.field4550 = 0;
            this.field4551 = false;
            this.method6682();
        }
    }

    @ObfuscatedName("ow.p(I)I")
    public int method6682() {
        if (this.field4550 < 33) {
            if (!this.field4549.method5431(class245.field2895.field2898, this.field4548)) {
                return this.field4550;
            }
            this.field4550 = 33;
        }
        if (this.field4550 == 33) {
            if (this.field4549.method5433(class245.field2896.field2898, this.field4548) && !this.field4549.method5431(class245.field2896.field2898, this.field4548)) {
                return this.field4550;
            }
            this.field4550 = 66;
        }
        if (this.field4550 == 66) {
            if (!this.field4549.method5431(this.field4548, class245.field2901.field2898)) {
                return this.field4550;
            }
            this.field4550 = 100;
            this.field4551 = true;
        }
        return this.field4550;
    }

    @ObfuscatedName("ow.f(B)Z")
    public boolean method6683() {
        return this.field4551;
    }

    @ObfuscatedName("ow.n(I)I")
    public int method6685() {
        return this.field4550;
    }
}
