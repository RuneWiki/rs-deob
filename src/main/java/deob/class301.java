package deob;

@ObfuscatedName("kc")
public class class301 {

    @ObfuscatedName("kc.z")
    public String field3872;

    @ObfuscatedName("kc.t")
    public class247 field3873;

    @ObfuscatedName("kc.f")
    public int field3877 = 0;

    @ObfuscatedName("kc.g")
    public boolean field3878 = false;

    public class301(class247 arg0) {
        this.field3873 = arg0;
    }

    @ObfuscatedName("kc.a(Ljava/lang/String;I)V")
    public void method4939(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3872 != arg0) {
            this.field3872 = arg0;
            this.field3877 = 0;
            this.field3878 = false;
            this.method4935();
        }
    }

    @ObfuscatedName("kc.w(I)I")
    public int method4935() {
        if (this.field3877 < 25) {
            if (!this.field3873.method3920(class41.field509.field515, this.field3872)) {
                return this.field3877;
            }
            this.field3877 = 25;
        }
        if (this.field3877 == 25) {
            if (!this.field3873.method3920(this.field3872, class41.field512.field515)) {
                return 25 + this.field3873.method3919(this.field3872) * 25 / 100;
            }
            this.field3877 = 50;
        }
        if (this.field3877 == 50) {
            if (this.field3873.method3914(class41.field514.field515, this.field3872) && !this.field3873.method3920(class41.field514.field515, this.field3872)) {
                return 50;
            }
            this.field3877 = 75;
        }
        if (this.field3877 == 75) {
            if (!this.field3873.method3920(this.field3872, class41.field513.field515)) {
                return 75;
            }
            this.field3877 = 100;
            this.field3878 = true;
        }
        return this.field3877;
    }

    @ObfuscatedName("kc.e(I)Z")
    public boolean method4944() {
        return this.field3878;
    }

    @ObfuscatedName("kc.k(B)I")
    public int method4936() {
        return this.field3877;
    }
}
