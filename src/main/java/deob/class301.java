package deob;

@ObfuscatedName("kp")
public class class301 {

    @ObfuscatedName("kp.d")
    public String field3874;

    @ObfuscatedName("kp.s")
    public class247 field3879;

    @ObfuscatedName("kp.b")
    public int field3878 = 0;

    @ObfuscatedName("kp.e")
    public boolean field3881 = false;

    public class301(class247 arg0) {
        this.field3879 = arg0;
    }

    @ObfuscatedName("kp.n(Ljava/lang/String;I)V")
    public void method4989(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3874 != arg0) {
            this.field3874 = arg0;
            this.field3878 = 0;
            this.field3881 = false;
            this.method4990();
        }
    }

    @ObfuscatedName("kp.v(I)I")
    public int method4990() {
        if (this.field3878 < 25) {
            if (!this.field3879.method3937(class41.field519.field518, this.field3874)) {
                return this.field3878;
            }
            this.field3878 = 25;
        }
        if (this.field3878 == 25) {
            if (!this.field3879.method3937(this.field3874, class41.field522.field518)) {
                return 25 + this.field3879.method3940(this.field3874) * 25 / 100;
            }
            this.field3878 = 50;
        }
        if (this.field3878 == 50) {
            if (this.field3879.method3932(class41.field520.field518, this.field3874) && !this.field3879.method3937(class41.field520.field518, this.field3874)) {
                return 50;
            }
            this.field3878 = 75;
        }
        if (this.field3878 == 75) {
            if (!this.field3879.method3937(this.field3874, class41.field521.field518)) {
                return 75;
            }
            this.field3878 = 100;
            this.field3881 = true;
        }
        return this.field3878;
    }

    @ObfuscatedName("kp.y(B)Z")
    public boolean method4991() {
        return this.field3881;
    }

    @ObfuscatedName("kp.r(I)I")
    public int method4992() {
        return this.field3878;
    }
}
