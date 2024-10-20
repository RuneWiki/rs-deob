package deob;

@ObfuscatedName("kq")
public class class289 {

    @ObfuscatedName("kq.g")
    public String field3791;

    @ObfuscatedName("kq.c")
    public class237 field3792;

    @ObfuscatedName("kq.l")
    public int field3793 = 0;

    @ObfuscatedName("kq.w")
    public boolean field3794 = false;

    public class289(class237 arg0) {
        this.field3792 = arg0;
    }

    @ObfuscatedName("kq.j(Ljava/lang/String;B)V")
    public void method4837(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3791 != arg0) {
            this.field3791 = arg0;
            this.field3793 = 0;
            this.field3794 = false;
            this.method4836();
        }
    }

    @ObfuscatedName("kq.h(B)I")
    public int method4836() {
        if (this.field3793 < 25) {
            if (!this.field3792.method3793(class41.field551.field552, this.field3791)) {
                return this.field3793;
            }
            this.field3793 = 25;
        }
        if (this.field3793 == 25) {
            if (!this.field3792.method3793(this.field3791, class41.field553.field552)) {
                return 25 + this.field3792.method3796(this.field3791) * 25 / 100;
            }
            this.field3793 = 50;
        }
        if (this.field3793 == 50) {
            if (this.field3792.method3851(class41.field555.field552, this.field3791) && !this.field3792.method3793(class41.field555.field552, this.field3791)) {
                return 50;
            }
            this.field3793 = 75;
        }
        if (this.field3793 == 75) {
            if (!this.field3792.method3793(this.field3791, class41.field554.field552)) {
                return 75;
            }
            this.field3793 = 100;
            this.field3794 = true;
        }
        return this.field3793;
    }

    @ObfuscatedName("kq.f(B)Z")
    public boolean method4846() {
        return this.field3794;
    }

    @ObfuscatedName("kq.p(I)I")
    public int method4838() {
        return this.field3793;
    }
}
