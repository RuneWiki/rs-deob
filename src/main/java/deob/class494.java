package deob;

@ObfuscatedName("sl")
public class class494 {

    @ObfuscatedName("sl.ab")
    public String field4924;

    @ObfuscatedName("sl.au")
    public class371 field4922;

    @ObfuscatedName("sl.aa")
    public int field4923 = 0;

    @ObfuscatedName("sl.ac")
    public boolean field4918 = false;

    public class494(class371 arg0) {
        this.field4922 = arg0;
    }

    @ObfuscatedName("sl.at(Ljava/lang/String;I)V")
    public void method7888(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4924 != arg0) {
            this.field4924 = arg0;
            this.field4923 = 0;
            this.field4918 = false;
            this.method7887();
        }
    }

    @ObfuscatedName("sl.ah(B)I")
    public int method7887() {
        if (this.field4924 == null) {
            this.field4923 = 100;
            this.field4918 = true;
        } else {
            if (this.field4923 < 33) {
                if (!this.field4922.method6304(class256.field2627.field2628, this.field4924)) {
                    return this.field4923;
                }
                this.field4923 = 33;
            }
            if (this.field4923 == 33) {
                if (this.field4922.method6302(class256.field2629.field2628, this.field4924) && !this.field4922.method6304(class256.field2629.field2628, this.field4924)) {
                    return this.field4923;
                }
                this.field4923 = 66;
            }
            if (this.field4923 == 66) {
                if (!this.field4922.method6304(this.field4924, class256.field2631.field2628)) {
                    return this.field4923;
                }
                this.field4923 = 100;
                this.field4918 = true;
            }
        }
        return this.field4923;
    }

    @ObfuscatedName("sl.ar(B)Z")
    public boolean method7879() {
        return this.field4918;
    }

    @ObfuscatedName("sl.ao(I)I")
    public int method7877() {
        return this.field4923;
    }
}
