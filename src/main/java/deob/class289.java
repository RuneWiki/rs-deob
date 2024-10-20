package deob;

@ObfuscatedName("kv")
public class class289 {

    @ObfuscatedName("kv.v")
    public String field3817;

    @ObfuscatedName("kv.p")
    public class236 field3816;

    @ObfuscatedName("kv.e")
    public int field3818 = 0;

    @ObfuscatedName("kv.d")
    public boolean field3812 = false;

    public class289(class236 arg0) {
        this.field3816 = arg0;
    }

    @ObfuscatedName("kv.w(Ljava/lang/String;I)V")
    public void method4927(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3817 != arg0) {
            this.field3817 = arg0;
            this.field3818 = 0;
            this.field3812 = false;
            this.method4938();
        }
    }

    @ObfuscatedName("kv.s(B)I")
    public int method4938() {
        if (this.field3818 < 25) {
            if (!this.field3816.method3896(class41.field565.field564, this.field3817)) {
                return this.field3818;
            }
            this.field3818 = 25;
        }
        if (this.field3818 == 25) {
            if (!this.field3816.method3896(this.field3817, class41.field567.field564)) {
                return 25 + this.field3816.method3899(this.field3817) * 25 / 100;
            }
            this.field3818 = 50;
        }
        if (this.field3818 == 50) {
            if (this.field3816.method3894(class41.field566.field564, this.field3817) && !this.field3816.method3896(class41.field566.field564, this.field3817)) {
                return 50;
            }
            this.field3818 = 75;
        }
        if (this.field3818 == 75) {
            if (!this.field3816.method3896(this.field3817, class41.field569.field564)) {
                return 75;
            }
            this.field3818 = 100;
            this.field3812 = true;
        }
        return this.field3818;
    }

    @ObfuscatedName("kv.q(I)Z")
    public boolean method4937() {
        return this.field3812;
    }

    @ObfuscatedName("kv.o(I)I")
    public int method4930() {
        return this.field3818;
    }
}
