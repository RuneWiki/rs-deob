package deob;

@ObfuscatedName("mi")
public class class342 {

    @ObfuscatedName("mi.w")
    public String field3964;

    @ObfuscatedName("mi.v")
    public class244 field3965;

    @ObfuscatedName("mi.q")
    public int field3968 = 0;

    @ObfuscatedName("mi.z")
    public boolean field3961 = false;

    public class342(class244 arg0) {
        this.field3965 = arg0;
    }

    @ObfuscatedName("mi.x(Ljava/lang/String;I)V")
    public void method5907(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3964 != arg0) {
            this.field3964 = arg0;
            this.field3968 = 0;
            this.field3961 = false;
            this.method5911();
        }
    }

    @ObfuscatedName("mi.m(I)I")
    public int method5911() {
        if (this.field3968 < 33) {
            if (!this.field3965.method3886(class45.field341.field345, this.field3964)) {
                return this.field3968;
            }
            this.field3968 = 33;
        }
        if (this.field3968 == 33) {
            if (this.field3965.method3944(class45.field342.field345, this.field3964) && !this.field3965.method3886(class45.field342.field345, this.field3964)) {
                return this.field3968;
            }
            this.field3968 = 66;
        }
        if (this.field3968 == 66) {
            if (!this.field3965.method3886(this.field3964, class45.field344.field345)) {
                return this.field3968;
            }
            this.field3968 = 100;
            this.field3961 = true;
        }
        return this.field3968;
    }

    @ObfuscatedName("mi.k(B)Z")
    public boolean method5908() {
        return this.field3961;
    }

    @ObfuscatedName("mi.d(B)I")
    public int method5910() {
        return this.field3968;
    }
}
