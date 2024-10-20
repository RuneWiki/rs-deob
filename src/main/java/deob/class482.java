package deob;

@ObfuscatedName("sb")
public class class482 {

    @ObfuscatedName("sb.ac")
    public String field4885;

    @ObfuscatedName("sb.ai")
    public class359 field4886;

    @ObfuscatedName("sb.az")
    public int field4887 = 0;

    @ObfuscatedName("sb.ap")
    public boolean field4889 = false;

    public class482(class359 arg0) {
        this.field4886 = arg0;
    }

    @ObfuscatedName("sb.au(Ljava/lang/String;I)V")
    public void method7763(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4885 != arg0) {
            this.field4885 = arg0;
            this.field4887 = 0;
            this.field4889 = false;
            this.method7764();
        }
    }

    @ObfuscatedName("sb.ae(I)I")
    public int method7764() {
        if (this.field4885 == null) {
            this.field4887 = 100;
            this.field4889 = true;
        } else {
            if (this.field4887 < 33) {
                if (!this.field4886.method6147(class276.field3064.field3068, this.field4885)) {
                    return this.field4887;
                }
                this.field4887 = 33;
            }
            if (this.field4887 == 33) {
                if (this.field4886.method6150(class276.field3063.field3068, this.field4885) && !this.field4886.method6147(class276.field3063.field3068, this.field4885)) {
                    return this.field4887;
                }
                this.field4887 = 66;
            }
            if (this.field4887 == 66) {
                if (!this.field4886.method6147(this.field4885, class276.field3067.field3068)) {
                    return this.field4887;
                }
                this.field4887 = 100;
                this.field4889 = true;
            }
        }
        return this.field4887;
    }

    @ObfuscatedName("sb.ao(B)Z")
    public boolean method7766() {
        return this.field4889;
    }

    @ObfuscatedName("sb.at(I)I")
    public int method7767() {
        return this.field4887;
    }
}
