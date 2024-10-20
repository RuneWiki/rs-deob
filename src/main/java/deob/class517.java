package deob;

@ObfuscatedName("tp")
public class class517 {

    @ObfuscatedName("tp.ax")
    public String field5188;

    @ObfuscatedName("tp.aq")
    public class391 field5187;

    @ObfuscatedName("tp.af")
    public int field5186 = 0;

    @ObfuscatedName("tp.at")
    public boolean field5182 = false;

    public class517(class391 arg0) {
        this.field5187 = arg0;
    }

    @ObfuscatedName("tp.ac(Ljava/lang/String;I)V")
    public void method8425(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field5188 != arg0) {
            this.field5188 = arg0;
            this.field5186 = 0;
            this.field5182 = false;
            this.method8419();
        }
    }

    @ObfuscatedName("tp.ae(I)I")
    public int method8419() {
        if (this.field5188 == null) {
            this.field5186 = 100;
            this.field5182 = true;
        } else {
            if (this.field5186 < 33) {
                if (!this.field5187.method6801(class305.field3260.field3261, this.field5188)) {
                    return this.field5186;
                }
                this.field5186 = 33;
            }
            if (this.field5186 == 33) {
                if (this.field5187.method6799(class305.field3259.field3261, this.field5188) && !this.field5187.method6801(class305.field3259.field3261, this.field5188)) {
                    return this.field5186;
                }
                this.field5186 = 66;
            }
            if (this.field5186 == 66) {
                if (!this.field5187.method6801(this.field5188, class305.field3263.field3261)) {
                    return this.field5186;
                }
                this.field5186 = 100;
                this.field5182 = true;
            }
        }
        return this.field5186;
    }

    @ObfuscatedName("tp.ag(I)Z")
    public boolean method8420() {
        return this.field5182;
    }

    @ObfuscatedName("tp.am(I)I")
    public int method8422() {
        return this.field5186;
    }
}
