package deob;

@ObfuscatedName("lg")
public class class324 {

    @ObfuscatedName("lg.i")
    public String field3847;

    @ObfuscatedName("lg.t")
    public class250 field3846;

    @ObfuscatedName("lg.p")
    public int field3848 = 0;

    @ObfuscatedName("lg.l")
    public boolean field3849 = false;

    public class324(class250 arg0) {
        this.field3846 = arg0;
    }

    @ObfuscatedName("lg.v(Ljava/lang/String;B)V")
    public void method5646(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3847 != arg0) {
            this.field3847 = arg0;
            this.field3848 = 0;
            this.field3849 = false;
            this.method5642();
        }
    }

    @ObfuscatedName("lg.s(I)I")
    public int method5642() {
        if (this.field3848 < 25) {
            if (!this.field3846.method4344(class30.field261.field265, this.field3847)) {
                return this.field3848;
            }
            this.field3848 = 25;
        }
        if (this.field3848 == 25) {
            if (!this.field3846.method4344(this.field3847, class30.field271.field265)) {
                return 25 + this.field3846.method4334(this.field3847) * 25 / 100;
            }
            this.field3848 = 50;
        }
        if (this.field3848 == 50) {
            if (this.field3846.method4290(class30.field268.field265, this.field3847) && !this.field3846.method4344(class30.field268.field265, this.field3847)) {
                return 50;
            }
            this.field3848 = 75;
        }
        if (this.field3848 == 75) {
            if (!this.field3846.method4344(this.field3847, class30.field264.field265)) {
                return 75;
            }
            this.field3848 = 100;
            this.field3849 = true;
        }
        return this.field3848;
    }

    @ObfuscatedName("lg.o(I)Z")
    public boolean method5645() {
        return this.field3849;
    }

    @ObfuscatedName("lg.k(I)I")
    public int method5652() {
        return this.field3848;
    }
}
