package deob;

@ObfuscatedName("tp")
public class class502 {

    @ObfuscatedName("tp.an")
    public String field5013;

    @ObfuscatedName("tp.ao")
    public class379 field5012;

    @ObfuscatedName("tp.ab")
    public int field5014 = 0;

    @ObfuscatedName("tp.aw")
    public boolean field5016 = false;

    public class502(class379 arg0) {
        this.field5012 = arg0;
    }

    @ObfuscatedName("tp.az(Ljava/lang/String;I)V")
    public void method7922(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field5013 != arg0) {
            this.field5013 = arg0;
            this.field5014 = 0;
            this.field5016 = false;
            this.method7923();
        }
    }

    @ObfuscatedName("tp.ah(I)I")
    public int method7923() {
        if (this.field5013 == null) {
            this.field5014 = 100;
            this.field5016 = true;
        } else {
            if (this.field5014 < 33) {
                if (!this.field5012.method6348(class292.field3156.field3160, this.field5013)) {
                    return this.field5014;
                }
                this.field5014 = 33;
            }
            if (this.field5014 == 33) {
                if (this.field5012.method6411(class292.field3157.field3160, this.field5013) && !this.field5012.method6348(class292.field3157.field3160, this.field5013)) {
                    return this.field5014;
                }
                this.field5014 = 66;
            }
            if (this.field5014 == 66) {
                if (!this.field5012.method6348(this.field5013, class292.field3159.field3160)) {
                    return this.field5014;
                }
                this.field5014 = 100;
                this.field5016 = true;
            }
        }
        return this.field5014;
    }

    @ObfuscatedName("tp.af(S)Z")
    public boolean method7929() {
        return this.field5016;
    }

    @ObfuscatedName("tp.at(I)I")
    public int method7937() {
        return this.field5014;
    }
}
