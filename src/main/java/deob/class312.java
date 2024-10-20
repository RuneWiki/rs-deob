package deob;

@ObfuscatedName("kr")
public class class312 {

    @ObfuscatedName("kr.a")
    public String field3908;

    @ObfuscatedName("kr.t")
    public class247 field3906;

    @ObfuscatedName("kr.r")
    public int field3907 = 0;

    @ObfuscatedName("kr.m")
    public boolean field3901 = false;

    public class312(class247 arg0) {
        this.field3906 = arg0;
    }

    @ObfuscatedName("kr.p(Ljava/lang/String;I)V")
    public void method5232(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3908 != arg0) {
            this.field3908 = arg0;
            this.field3907 = 0;
            this.field3901 = false;
            this.method5231();
        }
    }

    @ObfuscatedName("kr.i(I)I")
    public int method5231() {
        if (this.field3907 < 25) {
            if (!this.field3906.method4053(class41.field506.field510, this.field3908)) {
                return this.field3907;
            }
            this.field3907 = 25;
        }
        if (this.field3907 == 25) {
            if (!this.field3906.method4053(this.field3908, class41.field513.field510)) {
                return 25 + this.field3906.method4056(this.field3908) * 25 / 100;
            }
            this.field3907 = 50;
        }
        if (this.field3907 == 50) {
            if (this.field3906.method4100(class41.field507.field510, this.field3908) && !this.field3906.method4053(class41.field507.field510, this.field3908)) {
                return 50;
            }
            this.field3907 = 75;
        }
        if (this.field3907 == 75) {
            if (!this.field3906.method4053(this.field3908, class41.field508.field510)) {
                return 75;
            }
            this.field3907 = 100;
            this.field3901 = true;
        }
        return this.field3907;
    }

    @ObfuscatedName("kr.w(I)Z")
    public boolean method5234() {
        return this.field3901;
    }

    @ObfuscatedName("kr.s(I)I")
    public int method5235() {
        return this.field3907;
    }
}
