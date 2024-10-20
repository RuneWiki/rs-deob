package deob;

@ObfuscatedName("th")
public class class513 {

    @ObfuscatedName("th.af")
    public String field5113;

    @ObfuscatedName("th.aa")
    public class387 field5116;

    @ObfuscatedName("th.at")
    public int field5115 = 0;

    @ObfuscatedName("th.ab")
    public boolean field5117 = false;

    public class513(class387 arg0) {
        this.field5116 = arg0;
    }

    @ObfuscatedName("th.ak(Ljava/lang/String;I)V")
    public void method8239(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field5113 != arg0) {
            this.field5113 = arg0;
            this.field5115 = 0;
            this.field5117 = false;
            this.method8240();
        }
    }

    @ObfuscatedName("th.al(I)I")
    public int method8240() {
        if (this.field5113 == null) {
            this.field5115 = 100;
            this.field5117 = true;
        } else {
            if (this.field5115 < 33) {
                if (!this.field5116.method6602(class300.field3234.field3239, this.field5113)) {
                    return this.field5115;
                }
                this.field5115 = 33;
            }
            if (this.field5115 == 33) {
                if (this.field5116.method6589(class300.field3235.field3239, this.field5113) && !this.field5116.method6602(class300.field3235.field3239, this.field5113)) {
                    return this.field5115;
                }
                this.field5115 = 66;
            }
            if (this.field5115 == 66) {
                if (!this.field5116.method6602(this.field5113, class300.field3233.field3239)) {
                    return this.field5115;
                }
                this.field5115 = 100;
                this.field5117 = true;
            }
        }
        return this.field5115;
    }

    @ObfuscatedName("th.aj(I)Z")
    public boolean method8242() {
        return this.field5117;
    }

    @ObfuscatedName("th.az(B)I")
    public int method8243() {
        return this.field5115;
    }
}
