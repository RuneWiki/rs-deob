package deob;

@ObfuscatedName("lz")
public class class329 {

    @ObfuscatedName("lz.l")
    public String field3940;

    @ObfuscatedName("lz.b")
    public class250 field3937;

    @ObfuscatedName("lz.w")
    public int field3938 = 0;

    @ObfuscatedName("lz.n")
    public boolean field3939 = false;

    public class329(class250 arg0) {
        this.field3937 = arg0;
    }

    @ObfuscatedName("lz.g(Ljava/lang/String;I)V")
    public void method5825(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3940 != arg0) {
            this.field3940 = arg0;
            this.field3938 = 0;
            this.field3939 = false;
            this.method5826();
        }
    }

    @ObfuscatedName("lz.r(I)I")
    public int method5826() {
        if (this.field3938 < 25) {
            if (!this.field3937.method4460(class30.field289.field299, this.field3940)) {
                return this.field3938;
            }
            this.field3938 = 25;
        }
        if (this.field3938 == 25) {
            if (!this.field3937.method4460(this.field3940, class30.field291.field299)) {
                return 25 + this.field3937.method4452(this.field3940) * 25 / 100;
            }
            this.field3938 = 50;
        }
        if (this.field3938 == 50) {
            if (this.field3937.method4455(class30.field290.field299, this.field3940) && !this.field3937.method4460(class30.field290.field299, this.field3940)) {
                return 50;
            }
            this.field3938 = 75;
        }
        if (this.field3938 == 75) {
            if (!this.field3937.method4460(this.field3940, class30.field293.field299)) {
                return 75;
            }
            this.field3938 = 100;
            this.field3939 = true;
        }
        return this.field3938;
    }

    @ObfuscatedName("lz.e(B)Z")
    public boolean method5827() {
        return this.field3939;
    }

    @ObfuscatedName("lz.q(I)I")
    public int method5836() {
        return this.field3938;
    }
}
