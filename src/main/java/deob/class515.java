package deob;

@ObfuscatedName("tc")
public class class515 {

    @ObfuscatedName("tc.ax")
    public String field5149;

    @ObfuscatedName("tc.ao")
    public class389 field5150;

    @ObfuscatedName("tc.am")
    public int field5151 = 0;

    @ObfuscatedName("tc.ac")
    public boolean field5152 = false;

    public class515(class389 arg0) {
        this.field5150 = arg0;
    }

    @ObfuscatedName("tc.ab(Ljava/lang/String;B)V")
    public void method8282(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field5149 != arg0) {
            this.field5149 = arg0;
            this.field5151 = 0;
            this.field5152 = false;
            this.method8281();
        }
    }

    @ObfuscatedName("tc.ay(I)I")
    public int method8281() {
        if (this.field5149 == null) {
            this.field5151 = 100;
            this.field5152 = true;
        } else {
            if (this.field5151 < 33) {
                if (!this.field5150.method6658(class303.field3212.field3217, this.field5149)) {
                    return this.field5151;
                }
                this.field5151 = 33;
            }
            if (this.field5151 == 33) {
                if (this.field5150.method6728(class303.field3214.field3217, this.field5149) && !this.field5150.method6658(class303.field3214.field3217, this.field5149)) {
                    return this.field5151;
                }
                this.field5151 = 66;
            }
            if (this.field5151 == 66) {
                if (!this.field5150.method6658(this.field5149, class303.field3213.field3217)) {
                    return this.field5151;
                }
                this.field5151 = 100;
                this.field5152 = true;
            }
        }
        return this.field5151;
    }

    @ObfuscatedName("tc.an(I)Z")
    public boolean method8288() {
        return this.field5152;
    }

    @ObfuscatedName("tc.au(B)I")
    public int method8289() {
        return this.field5151;
    }
}
