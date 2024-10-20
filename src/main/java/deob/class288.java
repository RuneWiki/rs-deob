package deob;

@ObfuscatedName("ka")
public class class288 {

    @ObfuscatedName("ka.r")
    public String field3808;

    @ObfuscatedName("ka.v")
    public class236 field3809;

    @ObfuscatedName("ka.y")
    public int field3810 = 0;

    @ObfuscatedName("ka.j")
    public boolean field3811 = false;

    public class288(class236 arg0) {
        this.field3809 = arg0;
    }

    @ObfuscatedName("ka.i(Ljava/lang/String;I)V")
    public void method4793(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3808 != arg0) {
            this.field3808 = arg0;
            this.field3810 = 0;
            this.field3811 = false;
            this.method4787();
        }
    }

    @ObfuscatedName("ka.w(I)I")
    public int method4787() {
        if (this.field3810 < 25) {
            if (!this.field3809.method3788(class41.field563.field567, this.field3808)) {
                return this.field3810;
            }
            this.field3810 = 25;
        }
        if (this.field3810 == 25) {
            if (!this.field3809.method3788(this.field3808, class41.field562.field567)) {
                return 25 + this.field3809.method3772(this.field3808) * 25 / 100;
            }
            this.field3810 = 50;
        }
        if (this.field3810 == 50) {
            if (this.field3809.method3844(class41.field568.field567, this.field3808) && !this.field3809.method3788(class41.field568.field567, this.field3808)) {
                return 50;
            }
            this.field3810 = 75;
        }
        if (this.field3810 == 75) {
            if (!this.field3809.method3788(this.field3808, class41.field566.field567)) {
                return 75;
            }
            this.field3810 = 100;
            this.field3811 = true;
        }
        return this.field3810;
    }

    @ObfuscatedName("ka.a(I)Z")
    public boolean method4780() {
        return this.field3811;
    }

    @ObfuscatedName("ka.t(I)I")
    public int method4781() {
        return this.field3810;
    }
}
