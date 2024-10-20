package deob;

@ObfuscatedName("lj")
public class class329 {

    @ObfuscatedName("lj.i")
    public String field3907;

    @ObfuscatedName("lj.h")
    public class250 field3908;

    @ObfuscatedName("lj.l")
    public int field3910 = 0;

    @ObfuscatedName("lj.d")
    public boolean field3909 = false;

    public class329(class250 arg0) {
        this.field3908 = arg0;
    }

    @ObfuscatedName("lj.c(Ljava/lang/String;I)V")
    public void method5643(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3907 != arg0) {
            this.field3907 = arg0;
            this.field3910 = 0;
            this.field3909 = false;
            this.method5644();
        }
    }

    @ObfuscatedName("lj.q(I)I")
    public int method5644() {
        if (this.field3910 < 25) {
            if (!this.field3908.method4298(class30.field271.field278, this.field3907)) {
                return this.field3910;
            }
            this.field3910 = 25;
        }
        if (this.field3910 == 25) {
            if (!this.field3908.method4298(this.field3907, class30.field273.field278)) {
                return 25 + this.field3908.method4235(this.field3907) * 25 / 100;
            }
            this.field3910 = 50;
        }
        if (this.field3910 == 50) {
            if (this.field3908.method4230(class30.field274.field278, this.field3907) && !this.field3908.method4298(class30.field274.field278, this.field3907)) {
                return 50;
            }
            this.field3910 = 75;
        }
        if (this.field3910 == 75) {
            if (!this.field3908.method4298(this.field3907, class30.field270.field278)) {
                return 75;
            }
            this.field3910 = 100;
            this.field3909 = true;
        }
        return this.field3910;
    }

    @ObfuscatedName("lj.m(I)Z")
    public boolean method5645() {
        return this.field3909;
    }

    @ObfuscatedName("lj.j(B)I")
    public int method5642() {
        return this.field3910;
    }
}
