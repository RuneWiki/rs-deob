package deob;

@ObfuscatedName("kx")
public class class312 {

    @ObfuscatedName("kx.w")
    public String field3917;

    @ObfuscatedName("kx.t")
    public class247 field3918;

    @ObfuscatedName("kx.d")
    public int field3919 = 0;

    @ObfuscatedName("kx.z")
    public boolean field3920 = false;

    public class312(class247 arg0) {
        this.field3918 = arg0;
    }

    @ObfuscatedName("kx.s(Ljava/lang/String;I)V")
    public void method5413(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3917 != arg0) {
            this.field3917 = arg0;
            this.field3919 = 0;
            this.field3920 = false;
            this.method5414();
        }
    }

    @ObfuscatedName("kx.g(I)I")
    public int method5414() {
        if (this.field3919 < 25) {
            if (!this.field3918.method4205(class41.field517.field516, this.field3917)) {
                return this.field3919;
            }
            this.field3919 = 25;
        }
        if (this.field3919 == 25) {
            if (!this.field3918.method4205(this.field3917, class41.field519.field516)) {
                return 25 + this.field3918.method4208(this.field3917) * 25 / 100;
            }
            this.field3919 = 50;
        }
        if (this.field3919 == 50) {
            if (this.field3918.method4183(class41.field518.field516, this.field3917) && !this.field3918.method4205(class41.field518.field516, this.field3917)) {
                return 50;
            }
            this.field3919 = 75;
        }
        if (this.field3919 == 75) {
            if (!this.field3918.method4205(this.field3917, class41.field520.field516)) {
                return 75;
            }
            this.field3919 = 100;
            this.field3920 = true;
        }
        return this.field3919;
    }

    @ObfuscatedName("kx.m(I)Z")
    public boolean method5415() {
        return this.field3920;
    }

    @ObfuscatedName("kx.h(I)I")
    public int method5423() {
        return this.field3919;
    }
}
