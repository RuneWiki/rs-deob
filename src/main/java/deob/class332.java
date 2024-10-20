package deob;

@ObfuscatedName("lj")
public class class332 {

    @ObfuscatedName("lj.r")
    public String field3941;

    @ObfuscatedName("lj.p")
    public class234 field3942;

    @ObfuscatedName("lj.q")
    public int field3938 = 0;

    @ObfuscatedName("lj.m")
    public boolean field3943 = false;

    public class332(class234 arg0) {
        this.field3942 = arg0;
    }

    @ObfuscatedName("lj.z(Ljava/lang/String;B)V")
    public void method5729(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3941 != arg0) {
            this.field3941 = arg0;
            this.field3938 = 0;
            this.field3943 = false;
            this.method5728();
        }
    }

    @ObfuscatedName("lj.n(I)I")
    public int method5728() {
        if (this.field3938 < 33) {
            if (!this.field3942.method3728(class36.field290.field289, this.field3941)) {
                return this.field3938;
            }
            this.field3938 = 33;
        }
        if (this.field3938 == 33) {
            if (this.field3942.method3814(class36.field284.field289, this.field3941) && !this.field3942.method3728(class36.field284.field289, this.field3941)) {
                return this.field3938;
            }
            this.field3938 = 66;
        }
        if (this.field3938 == 66) {
            if (!this.field3942.method3728(this.field3941, class36.field288.field289)) {
                return this.field3938;
            }
            this.field3938 = 100;
            this.field3943 = true;
        }
        return this.field3938;
    }

    @ObfuscatedName("lj.v(I)Z")
    public boolean method5730() {
        return this.field3943;
    }

    @ObfuscatedName("lj.u(I)I")
    public int method5731() {
        return this.field3938;
    }
}
