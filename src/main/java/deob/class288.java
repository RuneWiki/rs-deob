package deob;

@ObfuscatedName("kx")
public class class288 {

    @ObfuscatedName("kx.z")
    public String field3803;

    @ObfuscatedName("kx.j")
    public class236 field3804;

    @ObfuscatedName("kx.i")
    public int field3800 = 0;

    @ObfuscatedName("kx.f")
    public boolean field3802 = false;

    public class288(class236 arg0) {
        this.field3804 = arg0;
    }

    @ObfuscatedName("kx.p(Ljava/lang/String;I)V")
    public void method4703(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3803 != arg0) {
            this.field3803 = arg0;
            this.field3800 = 0;
            this.field3802 = false;
            this.method4704();
        }
    }

    @ObfuscatedName("kx.m(I)I")
    public int method4704() {
        if (this.field3800 < 25) {
            if (!this.field3804.method3735(class41.field548.field549, this.field3803)) {
                return this.field3800;
            }
            this.field3800 = 25;
        }
        if (this.field3800 == 25) {
            if (!this.field3804.method3735(this.field3803, class41.field552.field549)) {
                return 25 + this.field3804.method3727(this.field3803) * 25 / 100;
            }
            this.field3800 = 50;
        }
        if (this.field3800 == 50) {
            if (this.field3804.method3722(class41.field558.field549, this.field3803) && !this.field3804.method3735(class41.field558.field549, this.field3803)) {
                return 50;
            }
            this.field3800 = 75;
        }
        if (this.field3800 == 75) {
            if (!this.field3804.method3735(this.field3803, class41.field551.field549)) {
                return 75;
            }
            this.field3800 = 100;
            this.field3802 = true;
        }
        return this.field3800;
    }

    @ObfuscatedName("kx.e(B)Z")
    public boolean method4705() {
        return this.field3802;
    }

    @ObfuscatedName("kx.t(I)I")
    public int method4706() {
        return this.field3800;
    }
}
