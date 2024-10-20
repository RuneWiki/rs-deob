package deob;

@ObfuscatedName("kb")
public class class297 {

    @ObfuscatedName("kb.x")
    public String field3857;

    @ObfuscatedName("kb.e")
    public class243 field3861;

    @ObfuscatedName("kb.l")
    public int field3862 = 0;

    @ObfuscatedName("kb.b")
    public boolean field3864 = false;

    public class297(class243 arg0) {
        this.field3861 = arg0;
    }

    @ObfuscatedName("kb.m(Ljava/lang/String;I)V")
    public void method5012(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3857 != arg0) {
            this.field3857 = arg0;
            this.field3862 = 0;
            this.field3864 = false;
            this.method5023();
        }
    }

    @ObfuscatedName("kb.p(I)I")
    public int method5023() {
        if (this.field3862 < 25) {
            if (!this.field3861.method3946(class41.field511.field513, this.field3857)) {
                return this.field3862;
            }
            this.field3862 = 25;
        }
        if (this.field3862 == 25) {
            if (!this.field3861.method3946(this.field3857, class41.field516.field513)) {
                return 25 + this.field3861.method3974(this.field3857) * 25 / 100;
            }
            this.field3862 = 50;
        }
        if (this.field3862 == 50) {
            if (this.field3861.method3948(class41.field510.field513, this.field3857) && !this.field3861.method3946(class41.field510.field513, this.field3857)) {
                return 50;
            }
            this.field3862 = 75;
        }
        if (this.field3862 == 75) {
            if (!this.field3861.method3946(this.field3857, class41.field514.field513)) {
                return 75;
            }
            this.field3862 = 100;
            this.field3864 = true;
        }
        return this.field3862;
    }

    @ObfuscatedName("kb.i(I)Z")
    public boolean method5014() {
        return this.field3864;
    }

    @ObfuscatedName("kb.j(I)I")
    public int method5013() {
        return this.field3862;
    }
}
