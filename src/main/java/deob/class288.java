package deob;

@ObfuscatedName("ki")
public class class288 {

    @ObfuscatedName("ki.m")
    public String field3793;

    @ObfuscatedName("ki.s")
    public class236 field3794;

    @ObfuscatedName("ki.x")
    public int field3791 = 0;

    @ObfuscatedName("ki.p")
    public boolean field3792 = false;

    public class288(class236 arg0) {
        this.field3794 = arg0;
    }

    @ObfuscatedName("ki.c(Ljava/lang/String;B)V")
    public void method4742(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3793 != arg0) {
            this.field3793 = arg0;
            this.field3791 = 0;
            this.field3792 = false;
            this.method4743();
        }
    }

    @ObfuscatedName("ki.o(I)I")
    public int method4743() {
        if (this.field3791 < 25) {
            if (!this.field3794.method3734(class41.field542.field550, this.field3793)) {
                return this.field3791;
            }
            this.field3791 = 25;
        }
        if (this.field3791 == 25) {
            if (!this.field3794.method3734(this.field3793, class41.field546.field550)) {
                return 25 + this.field3794.method3737(this.field3793) * 25 / 100;
            }
            this.field3791 = 50;
        }
        if (this.field3791 == 50) {
            if (this.field3794.method3732(class41.field543.field550, this.field3793) && !this.field3794.method3734(class41.field543.field550, this.field3793)) {
                return 50;
            }
            this.field3791 = 75;
        }
        if (this.field3791 == 75) {
            if (!this.field3794.method3734(this.field3793, class41.field545.field550)) {
                return 75;
            }
            this.field3791 = 100;
            this.field3792 = true;
        }
        return this.field3791;
    }

    @ObfuscatedName("ki.i(B)Z")
    public boolean method4750() {
        return this.field3792;
    }

    @ObfuscatedName("ki.u(B)I")
    public int method4745() {
        return this.field3791;
    }
}
