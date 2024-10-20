package deob;

@ObfuscatedName("tb")
public class class497 {

    @ObfuscatedName("tb.ao")
    public String field4928;

    @ObfuscatedName("tb.ah")
    public class374 field4927;

    @ObfuscatedName("tb.ar")
    public int field4926 = 0;

    @ObfuscatedName("tb.ab")
    public boolean field4929 = false;

    public class497(class374 arg0) {
        this.field4927 = arg0;
    }

    @ObfuscatedName("tb.ac(Ljava/lang/String;I)V")
    public void method7846(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4928 != arg0) {
            this.field4928 = arg0;
            this.field4926 = 0;
            this.field4929 = false;
            this.method7833();
        }
    }

    @ObfuscatedName("tb.al(I)I")
    public int method7833() {
        if (this.field4928 == null) {
            this.field4926 = 100;
            this.field4929 = true;
        } else {
            if (this.field4926 < 33) {
                if (!this.field4927.method6282(class290.field3092.field3093, this.field4928)) {
                    return this.field4926;
                }
                this.field4926 = 33;
            }
            if (this.field4926 == 33) {
                if (this.field4927.method6285(class290.field3091.field3093, this.field4928) && !this.field4927.method6282(class290.field3091.field3093, this.field4928)) {
                    return this.field4926;
                }
                this.field4926 = 66;
            }
            if (this.field4926 == 66) {
                if (!this.field4927.method6282(this.field4928, class290.field3095.field3093)) {
                    return this.field4926;
                }
                this.field4926 = 100;
                this.field4929 = true;
            }
        }
        return this.field4926;
    }

    @ObfuscatedName("tb.ak(B)Z")
    public boolean method7845() {
        return this.field4929;
    }

    @ObfuscatedName("tb.ax(I)I")
    public int method7835() {
        return this.field4926;
    }
}
