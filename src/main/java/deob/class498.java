package deob;

@ObfuscatedName("tl")
public class class498 {

    @ObfuscatedName("tl.aq")
    public String field4959;

    @ObfuscatedName("tl.ar")
    public class375 field4960;

    @ObfuscatedName("tl.ag")
    public int field4955 = 0;

    @ObfuscatedName("tl.ao")
    public boolean field4962 = false;

    public class498(class375 arg0) {
        this.field4960 = arg0;
    }

    @ObfuscatedName("tl.am(Ljava/lang/String;I)V")
    public void method8047(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4959 != arg0) {
            this.field4959 = arg0;
            this.field4955 = 0;
            this.field4962 = false;
            this.method8057();
        }
    }

    @ObfuscatedName("tl.ap(B)I")
    public int method8057() {
        if (this.field4959 == null) {
            this.field4955 = 100;
            this.field4962 = true;
        } else {
            if (this.field4955 < 33) {
                if (!this.field4960.method6416(class259.field2672.field2676, this.field4959)) {
                    return this.field4955;
                }
                this.field4955 = 33;
            }
            if (this.field4955 == 33) {
                if (this.field4960.method6414(class259.field2671.field2676, this.field4959) && !this.field4960.method6416(class259.field2671.field2676, this.field4959)) {
                    return this.field4955;
                }
                this.field4955 = 66;
            }
            if (this.field4955 == 66) {
                if (!this.field4960.method6416(this.field4959, class259.field2673.field2676)) {
                    return this.field4955;
                }
                this.field4955 = 100;
                this.field4962 = true;
            }
        }
        return this.field4955;
    }

    @ObfuscatedName("tl.af(B)Z")
    public boolean method8049() {
        return this.field4962;
    }

    @ObfuscatedName("tl.aj(B)I")
    public int method8050() {
        return this.field4955;
    }
}
