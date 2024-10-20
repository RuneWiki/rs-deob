package deob;

@ObfuscatedName("kn")
public class class288 {

    @ObfuscatedName("kn.b")
    public String field3797;

    @ObfuscatedName("kn.k")
    public class236 field3798;

    @ObfuscatedName("kn.f")
    public int field3799 = 0;

    @ObfuscatedName("kn.j")
    public boolean field3800 = false;

    public class288(class236 arg0) {
        this.field3798 = arg0;
    }

    @ObfuscatedName("kn.e(Ljava/lang/String;I)V")
    public void method4810(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3797 != arg0) {
            this.field3797 = arg0;
            this.field3799 = 0;
            this.field3800 = false;
            this.method4813();
        }
    }

    @ObfuscatedName("kn.o(I)I")
    public int method4813() {
        if (this.field3799 < 25) {
            if (!this.field3798.method3780(class41.field544.field548, this.field3797)) {
                return this.field3799;
            }
            this.field3799 = 25;
        }
        if (this.field3799 == 25) {
            if (!this.field3798.method3780(this.field3797, class41.field546.field548)) {
                return 25 + this.field3798.method3819(this.field3797) * 25 / 100;
            }
            this.field3799 = 50;
        }
        if (this.field3799 == 50) {
            if (this.field3798.method3778(class41.field545.field548, this.field3797) && !this.field3798.method3780(class41.field545.field548, this.field3797)) {
                return 50;
            }
            this.field3799 = 75;
        }
        if (this.field3799 == 75) {
            if (!this.field3798.method3780(this.field3797, class41.field547.field548)) {
                return 75;
            }
            this.field3799 = 100;
            this.field3800 = true;
        }
        return this.field3799;
    }

    @ObfuscatedName("kn.m(I)Z")
    public boolean method4812() {
        return this.field3800;
    }

    @ObfuscatedName("kn.g(I)I")
    public int method4811() {
        return this.field3799;
    }
}
