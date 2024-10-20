package deob;

@ObfuscatedName("ka")
public class class288 {

    @ObfuscatedName("ka.f")
    public String field3788;

    @ObfuscatedName("ka.v")
    public class236 field3785;

    @ObfuscatedName("ka.t")
    public int field3790 = 0;

    @ObfuscatedName("ka.i")
    public boolean field3791 = false;

    public class288(class236 arg0) {
        this.field3785 = arg0;
    }

    @ObfuscatedName("ka.d(Ljava/lang/String;I)V")
    public void method4786(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3788 != arg0) {
            this.field3788 = arg0;
            this.field3790 = 0;
            this.field3791 = false;
            this.method4784();
        }
    }

    @ObfuscatedName("ka.q(I)I")
    public int method4784() {
        if (this.field3790 < 25) {
            if (!this.field3785.method3772(class41.field517.field511, this.field3788)) {
                return this.field3790;
            }
            this.field3790 = 25;
        }
        if (this.field3790 == 25) {
            if (!this.field3785.method3772(this.field3788, class41.field513.field511)) {
                return 25 + this.field3785.method3773(this.field3788) * 25 / 100;
            }
            this.field3790 = 50;
        }
        if (this.field3790 == 50) {
            if (this.field3785.method3787(class41.field512.field511, this.field3788) && !this.field3785.method3772(class41.field512.field511, this.field3788)) {
                return 50;
            }
            this.field3790 = 75;
        }
        if (this.field3790 == 75) {
            if (!this.field3785.method3772(this.field3788, class41.field514.field511)) {
                return 75;
            }
            this.field3790 = 100;
            this.field3791 = true;
        }
        return this.field3790;
    }

    @ObfuscatedName("ka.x(I)Z")
    public boolean method4785() {
        return this.field3791;
    }

    @ObfuscatedName("ka.y(B)I")
    public int method4792() {
        return this.field3790;
    }
}
