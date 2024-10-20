package deob;

@ObfuscatedName("lh")
public class class333 {

    @ObfuscatedName("lh.k")
    public String field3965;

    @ObfuscatedName("lh.l")
    public class234 field3967;

    @ObfuscatedName("lh.b")
    public int field3968 = 0;

    @ObfuscatedName("lh.i")
    public boolean field3969 = false;

    public class333(class234 arg0) {
        this.field3967 = arg0;
    }

    @ObfuscatedName("lh.q(Ljava/lang/String;B)V")
    public void method5801(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3965 != arg0) {
            this.field3965 = arg0;
            this.field3968 = 0;
            this.field3969 = false;
            this.method5802();
        }
    }

    @ObfuscatedName("lh.w(I)I")
    public int method5802() {
        if (this.field3968 < 33) {
            if (!this.field3967.method3795(class36.field303.field307, this.field3965)) {
                return this.field3968;
            }
            this.field3968 = 33;
        }
        if (this.field3968 == 33) {
            if (this.field3967.method3793(class36.field304.field307, this.field3965) && !this.field3967.method3795(class36.field304.field307, this.field3965)) {
                return this.field3968;
            }
            this.field3968 = 66;
        }
        if (this.field3968 == 66) {
            if (!this.field3967.method3795(this.field3965, class36.field306.field307)) {
                return this.field3968;
            }
            this.field3968 = 100;
            this.field3969 = true;
        }
        return this.field3968;
    }

    @ObfuscatedName("lh.e(I)Z")
    public boolean method5811() {
        return this.field3969;
    }

    @ObfuscatedName("lh.p(I)I")
    public int method5800() {
        return this.field3968;
    }
}
