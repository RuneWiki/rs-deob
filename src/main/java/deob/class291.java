package deob;

@ObfuscatedName("ka")
public class class291 {

    @ObfuscatedName("ka.t")
    public String field3811;

    @ObfuscatedName("ka.p")
    public class239 field3812;

    @ObfuscatedName("ka.d")
    public int field3813 = 0;

    @ObfuscatedName("ka.n")
    public boolean field3814 = false;

    public class291(class239 arg0) {
        this.field3812 = arg0;
    }

    @ObfuscatedName("ka.s(Ljava/lang/String;S)V")
    public void method4885(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3811 != arg0) {
            this.field3811 = arg0;
            this.field3813 = 0;
            this.field3814 = false;
            this.method4886();
        }
    }

    @ObfuscatedName("ka.c(I)I")
    public int method4886() {
        if (this.field3813 < 25) {
            if (!this.field3812.method3869(class41.field538.field542, this.field3811)) {
                return this.field3813;
            }
            this.field3813 = 25;
        }
        if (this.field3813 == 25) {
            if (!this.field3812.method3869(this.field3811, class41.field545.field542)) {
                return 25 + this.field3812.method3923(this.field3811) * 25 / 100;
            }
            this.field3813 = 50;
        }
        if (this.field3813 == 50) {
            if (this.field3812.method3916(class41.field539.field542, this.field3811) && !this.field3812.method3869(class41.field539.field542, this.field3811)) {
                return 50;
            }
            this.field3813 = 75;
        }
        if (this.field3813 == 75) {
            if (!this.field3812.method3869(this.field3811, class41.field541.field542)) {
                return 75;
            }
            this.field3813 = 100;
            this.field3814 = true;
        }
        return this.field3813;
    }

    @ObfuscatedName("ka.f(B)Z")
    public boolean method4887() {
        return this.field3814;
    }

    @ObfuscatedName("ka.m(B)I")
    public int method4895() {
        return this.field3813;
    }
}
