package deob;

@ObfuscatedName("lp")
public class class332 {

    @ObfuscatedName("lp.v")
    public String field3943;

    @ObfuscatedName("lp.l")
    public class234 field3942;

    @ObfuscatedName("lp.c")
    public int field3940 = 0;

    @ObfuscatedName("lp.o")
    public boolean field3944 = false;

    public class332(class234 arg0) {
        this.field3942 = arg0;
    }

    @ObfuscatedName("lp.a(Ljava/lang/String;I)V")
    public void method5858(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3943 != arg0) {
            this.field3943 = arg0;
            this.field3940 = 0;
            this.field3944 = false;
            this.method5867();
        }
    }

    @ObfuscatedName("lp.t(I)I")
    public int method5867() {
        if (this.field3940 < 33) {
            if (!this.field3942.method3895(class36.field290.field294, this.field3943)) {
                return this.field3940;
            }
            this.field3940 = 33;
        }
        if (this.field3940 == 33) {
            if (this.field3942.method3893(class36.field291.field294, this.field3943) && !this.field3942.method3895(class36.field291.field294, this.field3943)) {
                return this.field3940;
            }
            this.field3940 = 66;
        }
        if (this.field3940 == 66) {
            if (!this.field3942.method3895(this.field3943, class36.field293.field294)) {
                return this.field3940;
            }
            this.field3940 = 100;
            this.field3944 = true;
        }
        return this.field3940;
    }

    @ObfuscatedName("lp.n(B)Z")
    public boolean method5859() {
        return this.field3944;
    }

    @ObfuscatedName("lp.q(B)I")
    public int method5860() {
        return this.field3940;
    }
}
