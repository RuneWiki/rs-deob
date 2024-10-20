package deob;

@ObfuscatedName("lq")
public class class321 {

    @ObfuscatedName("lq.n")
    public String field3814;

    @ObfuscatedName("lq.h")
    public class248 field3815;

    @ObfuscatedName("lq.x")
    public int field3811 = 0;

    @ObfuscatedName("lq.j")
    public boolean field3813 = false;

    public class321(class248 arg0) {
        this.field3815 = arg0;
    }

    @ObfuscatedName("lq.w(Ljava/lang/String;I)V")
    public void method5599(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3814 != arg0) {
            this.field3814 = arg0;
            this.field3811 = 0;
            this.field3813 = false;
            this.method5591();
        }
    }

    @ObfuscatedName("lq.m(I)I")
    public int method5591() {
        if (this.field3811 < 25) {
            if (!this.field3815.method4312(class30.field262.field263, this.field3814)) {
                return this.field3811;
            }
            this.field3811 = 25;
        }
        if (this.field3811 == 25) {
            if (!this.field3815.method4312(this.field3814, class30.field261.field263)) {
                return 25 + this.field3815.method4275(this.field3814) * 25 / 100;
            }
            this.field3811 = 50;
        }
        if (this.field3811 == 50) {
            if (this.field3815.method4313(class30.field260.field263, this.field3814) && !this.field3815.method4312(class30.field260.field263, this.field3814)) {
                return 50;
            }
            this.field3811 = 75;
        }
        if (this.field3811 == 75) {
            if (!this.field3815.method4312(this.field3814, class30.field259.field263)) {
                return 75;
            }
            this.field3811 = 100;
            this.field3813 = true;
        }
        return this.field3811;
    }

    @ObfuscatedName("lq.q(I)Z")
    public boolean method5592() {
        return this.field3813;
    }

    @ObfuscatedName("lq.x(I)I")
    public int method5593() {
        return this.field3811;
    }
}
