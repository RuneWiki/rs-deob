package deob;

@ObfuscatedName("kr")
public class class288 {

    @ObfuscatedName("kr.v")
    public String field3795;

    @ObfuscatedName("kr.t")
    public class236 field3792;

    @ObfuscatedName("kr.p")
    public int field3793 = 0;

    @ObfuscatedName("kr.l")
    public boolean field3794 = false;

    public class288(class236 arg0) {
        this.field3792 = arg0;
    }

    @ObfuscatedName("kr.i(Ljava/lang/String;I)V")
    public void method4865(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3795 != arg0) {
            this.field3795 = arg0;
            this.field3793 = 0;
            this.field3794 = false;
            this.method4876();
        }
    }

    @ObfuscatedName("kr.h(I)I")
    public int method4876() {
        if (this.field3793 < 25) {
            if (!this.field3792.method3855(class41.field533.field541, this.field3795)) {
                return this.field3793;
            }
            this.field3793 = 25;
        }
        if (this.field3793 == 25) {
            if (!this.field3792.method3855(this.field3795, class41.field535.field541)) {
                return 25 + this.field3792.method3858(this.field3795) * 25 / 100;
            }
            this.field3793 = 50;
        }
        if (this.field3793 == 50) {
            if (this.field3792.method3853(class41.field534.field541, this.field3795) && !this.field3792.method3855(class41.field534.field541, this.field3795)) {
                return 50;
            }
            this.field3793 = 75;
        }
        if (this.field3793 == 75) {
            if (!this.field3792.method3855(this.field3795, class41.field536.field541)) {
                return 75;
            }
            this.field3793 = 100;
            this.field3794 = true;
        }
        return this.field3793;
    }

    @ObfuscatedName("kr.u(I)Z")
    public boolean method4867() {
        return this.field3794;
    }

    @ObfuscatedName("kr.q(I)I")
    public int method4868() {
        return this.field3793;
    }
}
