package deob;

@ObfuscatedName("sg")
public class class470 {

    @ObfuscatedName("sg.ax")
    public String field4820;

    @ObfuscatedName("sg.ap")
    public class357 field4824;

    @ObfuscatedName("sg.ab")
    public int field4823 = 0;

    @ObfuscatedName("sg.ak")
    public boolean field4825 = false;

    public class470(class357 arg0) {
        this.field4824 = arg0;
    }

    @ObfuscatedName("sg.at(Ljava/lang/String;B)V")
    public void method7634(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4820 != arg0) {
            this.field4820 = arg0;
            this.field4823 = 0;
            this.field4825 = false;
            this.method7624();
        }
    }

    @ObfuscatedName("sg.an(I)I")
    public int method7624() {
        if (this.field4820 == null) {
            this.field4823 = 100;
            this.field4825 = true;
        } else {
            if (this.field4823 < 33) {
                if (!this.field4824.method6101(class275.field3045.field3044, this.field4820)) {
                    return this.field4823;
                }
                this.field4823 = 33;
            }
            if (this.field4823 == 33) {
                if (this.field4824.method6099(class275.field3046.field3044, this.field4820) && !this.field4824.method6101(class275.field3046.field3044, this.field4820)) {
                    return this.field4823;
                }
                this.field4823 = 66;
            }
            if (this.field4823 == 66) {
                if (!this.field4824.method6101(this.field4820, class275.field3048.field3044)) {
                    return this.field4823;
                }
                this.field4823 = 100;
                this.field4825 = true;
            }
        }
        return this.field4823;
    }

    @ObfuscatedName("sg.av(B)Z")
    public boolean method7633() {
        return this.field4825;
    }

    @ObfuscatedName("sg.as(I)I")
    public int method7625() {
        return this.field4823;
    }
}
