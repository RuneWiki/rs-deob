package deob;

@ObfuscatedName("ly")
public class class332 {

    @ObfuscatedName("ly.l")
    public String field3938;

    @ObfuscatedName("ly.u")
    public class234 field3942;

    @ObfuscatedName("ly.j")
    public int field3943 = 0;

    @ObfuscatedName("ly.v")
    public boolean field3941 = false;

    public class332(class234 arg0) {
        this.field3942 = arg0;
    }

    @ObfuscatedName("ly.c(Ljava/lang/String;B)V")
    public void method5823(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3938 != arg0) {
            this.field3938 = arg0;
            this.field3943 = 0;
            this.field3941 = false;
            this.method5824();
        }
    }

    @ObfuscatedName("ly.x(I)I")
    public int method5824() {
        if (this.field3943 < 33) {
            if (!this.field3942.method3829(class36.field296.field300, this.field3938)) {
                return this.field3943;
            }
            this.field3943 = 33;
        }
        if (this.field3943 == 33) {
            if (this.field3942.method3845(class36.field297.field300, this.field3938) && !this.field3942.method3829(class36.field297.field300, this.field3938)) {
                return this.field3943;
            }
            this.field3943 = 66;
        }
        if (this.field3943 == 66) {
            if (!this.field3942.method3829(this.field3938, class36.field299.field300)) {
                return this.field3943;
            }
            this.field3943 = 100;
            this.field3941 = true;
        }
        return this.field3943;
    }

    @ObfuscatedName("ly.t(I)Z")
    public boolean method5825() {
        return this.field3941;
    }

    @ObfuscatedName("ly.g(B)I")
    public int method5834() {
        return this.field3943;
    }
}
