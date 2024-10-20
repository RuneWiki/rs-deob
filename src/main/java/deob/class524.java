package deob;

@ObfuscatedName("ub")
public class class524 {

    @ObfuscatedName("ub.ai")
    public String field5240;

    @ObfuscatedName("ub.ay")
    public class392 field5236;

    @ObfuscatedName("ub.as")
    public int field5241 = 0;

    @ObfuscatedName("ub.ae")
    public boolean field5242 = false;

    public class524(class392 arg0) {
        this.field5236 = arg0;
    }

    @ObfuscatedName("ub.ap(Ljava/lang/String;I)V")
    public void method8714(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field5240 != arg0) {
            this.field5240 = arg0;
            this.field5241 = 0;
            this.field5242 = false;
            this.method8715();
        }
    }

    @ObfuscatedName("ub.aw(I)I")
    public int method8715() {
        if (this.field5240 == null) {
            this.field5241 = 100;
            this.field5242 = true;
        } else {
            if (this.field5241 < 33) {
                if (!this.field5236.method7014(class304.field3271.field3270, this.field5240)) {
                    return this.field5241;
                }
                this.field5241 = 33;
            }
            if (this.field5241 == 33) {
                if (this.field5236.method7012(class304.field3265.field3270, this.field5240) && !this.field5236.method7014(class304.field3265.field3270, this.field5240)) {
                    return this.field5241;
                }
                this.field5241 = 66;
            }
            if (this.field5241 == 66) {
                if (!this.field5236.method7014(this.field5240, class304.field3267.field3270)) {
                    return this.field5241;
                }
                this.field5241 = 100;
                this.field5242 = true;
            }
        }
        return this.field5241;
    }

    @ObfuscatedName("ub.ak(I)Z")
    public boolean method8716() {
        return this.field5242;
    }

    @ObfuscatedName("ub.aj(I)I")
    public int method8717() {
        return this.field5241;
    }
}
