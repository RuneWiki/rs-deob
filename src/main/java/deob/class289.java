package deob;

@ObfuscatedName("kp")
public class class289 {

    @ObfuscatedName("kp.s")
    public String field3813;

    @ObfuscatedName("kp.r")
    public class236 field3816;

    @ObfuscatedName("kp.g")
    public int field3810 = 0;

    @ObfuscatedName("kp.v")
    public boolean field3818 = false;

    public class289(class236 arg0) {
        this.field3816 = arg0;
    }

    @ObfuscatedName("kp.d(Ljava/lang/String;I)V")
    public void method4925(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3813 != arg0) {
            this.field3813 = arg0;
            this.field3810 = 0;
            this.field3818 = false;
            this.method4926();
        }
    }

    @ObfuscatedName("kp.k(I)I")
    public int method4926() {
        if (this.field3810 < 25) {
            if (!this.field3816.method3895(class41.field561.field560, this.field3813)) {
                return this.field3810;
            }
            this.field3810 = 25;
        }
        if (this.field3810 == 25) {
            if (!this.field3816.method3895(this.field3813, class41.field563.field560)) {
                return 25 + this.field3816.method3898(this.field3813) * 25 / 100;
            }
            this.field3810 = 50;
        }
        if (this.field3810 == 50) {
            if (this.field3816.method3933(class41.field569.field560, this.field3813) && !this.field3816.method3895(class41.field569.field560, this.field3813)) {
                return 50;
            }
            this.field3810 = 75;
        }
        if (this.field3810 == 75) {
            if (!this.field3816.method3895(this.field3813, class41.field565.field560)) {
                return 75;
            }
            this.field3810 = 100;
            this.field3818 = true;
        }
        return this.field3810;
    }

    @ObfuscatedName("kp.e(B)Z")
    public boolean method4927() {
        return this.field3818;
    }

    @ObfuscatedName("kp.p(B)I")
    public int method4928() {
        return this.field3810;
    }
}
