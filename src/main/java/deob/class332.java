package deob;

@ObfuscatedName("la")
public class class332 {

    @ObfuscatedName("la.u")
    public String field3944;

    @ObfuscatedName("la.n")
    public class234 field3945;

    @ObfuscatedName("la.t")
    public int field3946 = 0;

    @ObfuscatedName("la.q")
    public boolean field3941 = false;

    public class332(class234 arg0) {
        this.field3945 = arg0;
    }

    @ObfuscatedName("la.s(Ljava/lang/String;B)V")
    public void method5758(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3944 != arg0) {
            this.field3944 = arg0;
            this.field3946 = 0;
            this.field3941 = false;
            this.method5759();
        }
    }

    @ObfuscatedName("la.j(I)I")
    public int method5759() {
        if (this.field3946 < 33) {
            if (!this.field3945.method3781(class36.field291.field295, this.field3944)) {
                return this.field3946;
            }
            this.field3946 = 33;
        }
        if (this.field3946 == 33) {
            if (this.field3945.method3784(class36.field292.field295, this.field3944) && !this.field3945.method3781(class36.field292.field295, this.field3944)) {
                return this.field3946;
            }
            this.field3946 = 66;
        }
        if (this.field3946 == 66) {
            if (!this.field3945.method3781(this.field3944, class36.field294.field295)) {
                return this.field3946;
            }
            this.field3946 = 100;
            this.field3941 = true;
        }
        return this.field3946;
    }

    @ObfuscatedName("la.i(B)Z")
    public boolean method5767() {
        return this.field3941;
    }

    @ObfuscatedName("la.k(B)I")
    public int method5760() {
        return this.field3946;
    }
}
