package deob;

@ObfuscatedName("kv")
public class class288 {

    @ObfuscatedName("kv.m")
    public String field3802;

    @ObfuscatedName("kv.c")
    public class236 field3801;

    @ObfuscatedName("kv.z")
    public int field3797 = 0;

    @ObfuscatedName("kv.h")
    public boolean field3803 = false;

    public class288(class236 arg0) {
        this.field3801 = arg0;
    }

    @ObfuscatedName("kv.n(Ljava/lang/String;I)V")
    public void method4880(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3802 != arg0) {
            this.field3802 = arg0;
            this.field3797 = 0;
            this.field3803 = false;
            this.method4879();
        }
    }

    @ObfuscatedName("kv.p(B)I")
    public int method4879() {
        if (this.field3797 < 25) {
            if (!this.field3801.method3850(class41.field545.field544, this.field3802)) {
                return this.field3797;
            }
            this.field3797 = 25;
        }
        if (this.field3797 == 25) {
            if (!this.field3801.method3850(this.field3802, class41.field543.field544)) {
                return 25 + this.field3801.method3877(this.field3802) * 25 / 100;
            }
            this.field3797 = 50;
        }
        if (this.field3797 == 50) {
            if (this.field3801.method3898(class41.field542.field544, this.field3802) && !this.field3801.method3850(class41.field542.field544, this.field3802)) {
                return 50;
            }
            this.field3797 = 75;
        }
        if (this.field3797 == 75) {
            if (!this.field3801.method3850(this.field3802, class41.field540.field544)) {
                return 75;
            }
            this.field3797 = 100;
            this.field3803 = true;
        }
        return this.field3797;
    }

    @ObfuscatedName("kv.i(I)Z")
    public boolean method4884() {
        return this.field3803;
    }

    @ObfuscatedName("kv.j(I)I")
    public int method4881() {
        return this.field3797;
    }
}
