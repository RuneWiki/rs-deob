package deob;

@ObfuscatedName("st")
public class class483 {

    @ObfuscatedName("st.as")
    public String field4881;

    @ObfuscatedName("st.aj")
    public class360 field4879;

    @ObfuscatedName("st.ag")
    public int field4882 = 0;

    @ObfuscatedName("st.az")
    public boolean field4885 = false;

    public class483(class360 arg0) {
        this.field4879 = arg0;
    }

    @ObfuscatedName("st.aw(Ljava/lang/String;I)V")
    public void method7709(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4881 != arg0) {
            this.field4881 = arg0;
            this.field4882 = 0;
            this.field4885 = false;
            this.method7710();
        }
    }

    @ObfuscatedName("st.ay(S)I")
    public int method7710() {
        if (this.field4881 == null) {
            this.field4882 = 100;
            this.field4885 = true;
        } else {
            if (this.field4882 < 33) {
                if (!this.field4879.method6137(class277.field3047.field3048, this.field4881)) {
                    return this.field4882;
                }
                this.field4882 = 33;
            }
            if (this.field4882 == 33) {
                if (this.field4879.method6135(class277.field3052.field3048, this.field4881) && !this.field4879.method6137(class277.field3052.field3048, this.field4881)) {
                    return this.field4882;
                }
                this.field4882 = 66;
            }
            if (this.field4882 == 66) {
                if (!this.field4879.method6137(this.field4881, class277.field3050.field3048)) {
                    return this.field4882;
                }
                this.field4882 = 100;
                this.field4885 = true;
            }
        }
        return this.field4882;
    }

    @ObfuscatedName("st.ar(B)Z")
    public boolean method7711() {
        return this.field4885;
    }

    @ObfuscatedName("st.am(B)I")
    public int method7712() {
        return this.field4882;
    }
}
