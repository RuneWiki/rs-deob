package deob;

@ObfuscatedName("kl")
public class class289 {

    @ObfuscatedName("kl.k")
    public String field3787;

    @ObfuscatedName("kl.v")
    public class237 field3791;

    @ObfuscatedName("kl.z")
    public int field3788 = 0;

    @ObfuscatedName("kl.r")
    public boolean field3790 = false;

    public class289(class237 arg0) {
        this.field3791 = arg0;
    }

    @ObfuscatedName("kl.e(Ljava/lang/String;I)V")
    public void method4876(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3787 != arg0) {
            this.field3787 = arg0;
            this.field3788 = 0;
            this.field3790 = false;
            this.method4888();
        }
    }

    @ObfuscatedName("kl.n(I)I")
    public int method4888() {
        if (this.field3788 < 25) {
            if (!this.field3791.method3837(class41.field536.field541, this.field3787)) {
                return this.field3788;
            }
            this.field3788 = 25;
        }
        if (this.field3788 == 25) {
            if (!this.field3791.method3837(this.field3787, class41.field539.field541)) {
                return 25 + this.field3791.method3840(this.field3787) * 25 / 100;
            }
            this.field3788 = 50;
        }
        if (this.field3788 == 50) {
            if (this.field3791.method3835(class41.field537.field541, this.field3787) && !this.field3791.method3837(class41.field537.field541, this.field3787)) {
                return 50;
            }
            this.field3788 = 75;
        }
        if (this.field3788 == 75) {
            if (!this.field3791.method3837(this.field3787, class41.field540.field541)) {
                return 75;
            }
            this.field3788 = 100;
            this.field3790 = true;
        }
        return this.field3788;
    }

    @ObfuscatedName("kl.g(S)Z")
    public boolean method4878() {
        return this.field3790;
    }

    @ObfuscatedName("kl.y(I)I")
    public int method4879() {
        return this.field3788;
    }
}
