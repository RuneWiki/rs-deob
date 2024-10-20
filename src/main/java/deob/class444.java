package deob;

@ObfuscatedName("qz")
public class class444 {

    @ObfuscatedName("qz.z")
    public String field4756;

    @ObfuscatedName("qz.j")
    public class337 field4757;

    @ObfuscatedName("qz.i")
    public int field4758 = 0;

    @ObfuscatedName("qz.n")
    public boolean field4752 = false;

    public class444(class337 arg0) {
        this.field4757 = arg0;
    }

    @ObfuscatedName("qz.f(Ljava/lang/String;B)V")
    public void method7452(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4756 != arg0) {
            this.field4756 = arg0;
            this.field4758 = 0;
            this.field4752 = false;
            this.method7454();
        }
    }

    @ObfuscatedName("qz.w(I)I")
    public int method7454() {
        if (this.field4758 < 33) {
            if (!this.field4757.method5991(class261.field3017.field3016, this.field4756)) {
                return this.field4758;
            }
            this.field4758 = 33;
        }
        if (this.field4758 == 33) {
            if (this.field4757.method5989(class261.field3012.field3016, this.field4756) && !this.field4757.method5991(class261.field3012.field3016, this.field4756)) {
                return this.field4758;
            }
            this.field4758 = 66;
        }
        if (this.field4758 == 66) {
            if (!this.field4757.method5991(this.field4756, class261.field3015.field3016)) {
                return this.field4758;
            }
            this.field4758 = 100;
            this.field4752 = true;
        }
        return this.field4758;
    }

    @ObfuscatedName("qz.v(I)Z")
    public boolean method7453() {
        return this.field4752;
    }

    @ObfuscatedName("qz.s(B)I")
    public int method7451() {
        return this.field4758;
    }
}
