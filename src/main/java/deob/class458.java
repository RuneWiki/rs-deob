package deob;

@ObfuscatedName("rh")
public class class458 {

    @ObfuscatedName("rh.au")
    public String field4808;

    @ObfuscatedName("rh.ab")
    public class344 field4810;

    @ObfuscatedName("rh.aq")
    public int field4811 = 0;

    @ObfuscatedName("rh.al")
    public boolean field4812 = false;

    public class458(class344 arg0) {
        this.field4810 = arg0;
    }

    @ObfuscatedName("rh.af(Ljava/lang/String;I)V")
    public void method7702(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4808 != arg0) {
            this.field4808 = arg0;
            this.field4811 = 0;
            this.field4812 = false;
            this.method7703();
        }
    }

    @ObfuscatedName("rh.an(I)I")
    public int method7703() {
        if (this.field4808 == null) {
            this.field4811 = 100;
            this.field4812 = true;
        } else {
            if (this.field4811 < 33) {
                if (!this.field4810.method6140(class268.field3059.field3058, this.field4808)) {
                    return this.field4811;
                }
                this.field4811 = 33;
            }
            if (this.field4811 == 33) {
                if (this.field4810.method6088(class268.field3056.field3058, this.field4808) && !this.field4810.method6140(class268.field3056.field3058, this.field4808)) {
                    return this.field4811;
                }
                this.field4811 = 66;
            }
            if (this.field4811 == 66) {
                if (!this.field4810.method6140(this.field4808, class268.field3054.field3058)) {
                    return this.field4811;
                }
                this.field4811 = 100;
                this.field4812 = true;
            }
        }
        return this.field4811;
    }

    @ObfuscatedName("rh.aw(I)Z")
    public boolean method7704() {
        return this.field4812;
    }

    @ObfuscatedName("rh.ac(B)I")
    public int method7705() {
        return this.field4811;
    }
}
