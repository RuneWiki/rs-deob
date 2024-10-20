package deob;

@ObfuscatedName("tp")
public class class514 {

    @ObfuscatedName("tp.ap")
    public String field5150;

    @ObfuscatedName("tp.an")
    public class388 field5148;

    @ObfuscatedName("tp.aj")
    public int field5149 = 0;

    @ObfuscatedName("tp.av")
    public boolean field5144 = false;

    public class514(class388 arg0) {
        this.field5148 = arg0;
    }

    @ObfuscatedName("tp.aq(Ljava/lang/String;I)V")
    public void method8187(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field5150 != arg0) {
            this.field5150 = arg0;
            this.field5149 = 0;
            this.field5144 = false;
            this.method8182();
        }
    }

    @ObfuscatedName("tp.ad(B)I")
    public int method8182() {
        if (this.field5150 == null) {
            this.field5149 = 100;
            this.field5144 = true;
        } else {
            if (this.field5149 < 33) {
                if (!this.field5148.method6572(class267.field2739.field2738, this.field5150)) {
                    return this.field5149;
                }
                this.field5149 = 33;
            }
            if (this.field5149 == 33) {
                if (this.field5148.method6544(class267.field2740.field2738, this.field5150) && !this.field5148.method6572(class267.field2740.field2738, this.field5150)) {
                    return this.field5149;
                }
                this.field5149 = 66;
            }
            if (this.field5149 == 66) {
                if (!this.field5148.method6572(this.field5150, class267.field2742.field2738)) {
                    return this.field5149;
                }
                this.field5149 = 100;
                this.field5144 = true;
            }
        }
        return this.field5149;
    }

    @ObfuscatedName("tp.ag(I)Z")
    public boolean method8191() {
        return this.field5144;
    }

    @ObfuscatedName("tp.ak(I)I")
    public int method8196() {
        return this.field5149;
    }
}
