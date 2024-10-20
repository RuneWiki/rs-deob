package deob;

@ObfuscatedName("kl")
public class class288 {

    @ObfuscatedName("kl.e")
    public String field3803;

    @ObfuscatedName("kl.l")
    public class236 field3800;

    @ObfuscatedName("kl.s")
    public int field3805 = 0;

    @ObfuscatedName("kl.w")
    public boolean field3804 = false;

    public class288(class236 arg0) {
        this.field3800 = arg0;
    }

    @ObfuscatedName("kl.a(Ljava/lang/String;I)V")
    public void method4752(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3803 != arg0) {
            this.field3803 = arg0;
            this.field3805 = 0;
            this.field3804 = false;
            this.method4747();
        }
    }

    @ObfuscatedName("kl.j(I)I")
    public int method4747() {
        if (this.field3805 < 25) {
            if (!this.field3800.method3781(class41.field529.field533, this.field3803)) {
                return this.field3805;
            }
            this.field3805 = 25;
        }
        if (this.field3805 == 25) {
            if (!this.field3800.method3781(this.field3803, class41.field534.field533)) {
                return 25 + this.field3800.method3792(this.field3803) * 25 / 100;
            }
            this.field3805 = 50;
        }
        if (this.field3805 == 50) {
            if (this.field3800.method3764(class41.field530.field533, this.field3803) && !this.field3800.method3781(class41.field530.field533, this.field3803)) {
                return 50;
            }
            this.field3805 = 75;
        }
        if (this.field3805 == 75) {
            if (!this.field3800.method3781(this.field3803, class41.field532.field533)) {
                return 75;
            }
            this.field3805 = 100;
            this.field3804 = true;
        }
        return this.field3805;
    }

    @ObfuscatedName("kl.n(I)Z")
    public boolean method4754() {
        return this.field3804;
    }

    @ObfuscatedName("kl.r(I)I")
    public int method4748() {
        return this.field3805;
    }
}
