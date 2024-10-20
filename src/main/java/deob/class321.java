package deob;

@ObfuscatedName("ld")
public class class321 {

    @ObfuscatedName("ld.q")
    public String field3808;

    @ObfuscatedName("ld.k")
    public class248 field3806;

    @ObfuscatedName("ld.i")
    public int field3804 = 0;

    @ObfuscatedName("ld.x")
    public boolean field3811 = false;

    public class321(class248 arg0) {
        this.field3806 = arg0;
    }

    @ObfuscatedName("ld.z(Ljava/lang/String;I)V")
    public void method5555(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3808 != arg0) {
            this.field3808 = arg0;
            this.field3804 = 0;
            this.field3811 = false;
            this.method5545();
        }
    }

    @ObfuscatedName("ld.w(B)I")
    public int method5545() {
        if (this.field3804 < 25) {
            if (!this.field3806.method4268(class30.field252.field256, this.field3808)) {
                return this.field3804;
            }
            this.field3804 = 25;
        }
        if (this.field3804 == 25) {
            if (!this.field3806.method4268(this.field3808, class30.field263.field256)) {
                return 25 + this.field3806.method4309(this.field3808) * 25 / 100;
            }
            this.field3804 = 50;
        }
        if (this.field3804 == 50) {
            if (this.field3806.method4266(class30.field258.field256, this.field3808) && !this.field3806.method4268(class30.field258.field256, this.field3808)) {
                return 50;
            }
            this.field3804 = 75;
        }
        if (this.field3804 == 75) {
            if (!this.field3806.method4268(this.field3808, class30.field255.field256)) {
                return 75;
            }
            this.field3804 = 100;
            this.field3811 = true;
        }
        return this.field3804;
    }

    @ObfuscatedName("ld.s(I)Z")
    public boolean method5547() {
        return this.field3811;
    }

    @ObfuscatedName("ld.l(I)I")
    public int method5548() {
        return this.field3804;
    }
}
