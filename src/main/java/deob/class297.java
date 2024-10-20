package deob;

@ObfuscatedName("kb")
public class class297 {

    @ObfuscatedName("kb.m")
    public String field3859;

    @ObfuscatedName("kb.b")
    public class243 field3857;

    @ObfuscatedName("kb.t")
    public int field3860 = 0;

    @ObfuscatedName("kb.p")
    public boolean field3858 = false;

    public class297(class243 arg0) {
        this.field3857 = arg0;
    }

    @ObfuscatedName("kb.d(Ljava/lang/String;I)V")
    public void method5026(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3859 != arg0) {
            this.field3859 = arg0;
            this.field3860 = 0;
            this.field3858 = false;
            this.method5019();
        }
    }

    @ObfuscatedName("kb.x(I)I")
    public int method5019() {
        if (this.field3860 < 25) {
            if (!this.field3857.method3955(class41.field516.field518, this.field3859)) {
                return this.field3860;
            }
            this.field3860 = 25;
        }
        if (this.field3860 == 25) {
            if (!this.field3857.method3955(this.field3859, class41.field520.field518)) {
                return 25 + this.field3857.method3966(this.field3859) * 25 / 100;
            }
            this.field3860 = 50;
        }
        if (this.field3860 == 50) {
            if (this.field3857.method3953(class41.field517.field518, this.field3859) && !this.field3857.method3955(class41.field517.field518, this.field3859)) {
                return 50;
            }
            this.field3860 = 75;
        }
        if (this.field3860 == 75) {
            if (!this.field3857.method3955(this.field3859, class41.field519.field518)) {
                return 75;
            }
            this.field3860 = 100;
            this.field3858 = true;
        }
        return this.field3860;
    }

    @ObfuscatedName("kb.k(I)Z")
    public boolean method5015() {
        return this.field3858;
    }

    @ObfuscatedName("kb.z(I)I")
    public int method5016() {
        return this.field3860;
    }
}
