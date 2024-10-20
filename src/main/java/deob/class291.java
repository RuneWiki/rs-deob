package deob;

@ObfuscatedName("ku")
public class class291 {

    @ObfuscatedName("ku.i")
    public String field3811;

    @ObfuscatedName("ku.j")
    public class239 field3810;

    @ObfuscatedName("ku.m")
    public int field3808 = 0;

    @ObfuscatedName("ku.u")
    public boolean field3812 = false;

    public class291(class239 arg0) {
        this.field3810 = arg0;
    }

    @ObfuscatedName("ku.w(Ljava/lang/String;B)V")
    public void method4828(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3811 != arg0) {
            this.field3811 = arg0;
            this.field3808 = 0;
            this.field3812 = false;
            this.method4824();
        }
    }

    @ObfuscatedName("ku.o(I)I")
    public int method4824() {
        if (this.field3808 < 25) {
            if (!this.field3810.method3723(class41.field554.field555, this.field3811)) {
                return this.field3808;
            }
            this.field3808 = 25;
        }
        if (this.field3808 == 25) {
            if (!this.field3810.method3723(this.field3811, class41.field552.field555)) {
                return 25 + this.field3810.method3734(this.field3811) * 25 / 100;
            }
            this.field3808 = 50;
        }
        if (this.field3808 == 50) {
            if (this.field3810.method3744(class41.field553.field555, this.field3811) && !this.field3810.method3723(class41.field553.field555, this.field3811)) {
                return 50;
            }
            this.field3808 = 75;
        }
        if (this.field3808 == 75) {
            if (!this.field3810.method3723(this.field3811, class41.field562.field555)) {
                return 75;
            }
            this.field3808 = 100;
            this.field3812 = true;
        }
        return this.field3808;
    }

    @ObfuscatedName("ku.x(I)Z")
    public boolean method4825() {
        return this.field3812;
    }

    @ObfuscatedName("ku.k(I)I")
    public int method4826() {
        return this.field3808;
    }
}
