package deob;

@ObfuscatedName("kd")
public class class288 {

    @ObfuscatedName("kd.y")
    public String field3799;

    @ObfuscatedName("kd.h")
    public class236 field3801;

    @ObfuscatedName("kd.x")
    public int field3796 = 0;

    @ObfuscatedName("kd.f")
    public boolean field3800 = false;

    public class288(class236 arg0) {
        this.field3801 = arg0;
    }

    @ObfuscatedName("kd.i(Ljava/lang/String;I)V")
    public void method4786(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3799 != arg0) {
            this.field3799 = arg0;
            this.field3796 = 0;
            this.field3800 = false;
            this.method4787();
        }
    }

    @ObfuscatedName("kd.c(I)I")
    public int method4787() {
        if (this.field3796 < 25) {
            if (!this.field3801.method3788(class41.field546.field543, this.field3799)) {
                return this.field3796;
            }
            this.field3796 = 25;
        }
        if (this.field3796 == 25) {
            if (!this.field3801.method3788(this.field3799, class41.field545.field543)) {
                return 25 + this.field3801.method3793(this.field3799) * 25 / 100;
            }
            this.field3796 = 50;
        }
        if (this.field3796 == 50) {
            if (this.field3801.method3836(class41.field540.field543, this.field3799) && !this.field3801.method3788(class41.field540.field543, this.field3799)) {
                return 50;
            }
            this.field3796 = 75;
        }
        if (this.field3796 == 75) {
            if (!this.field3801.method3788(this.field3799, class41.field542.field543)) {
                return 75;
            }
            this.field3796 = 100;
            this.field3800 = true;
        }
        return this.field3796;
    }

    @ObfuscatedName("kd.e(I)Z")
    public boolean method4785() {
        return this.field3800;
    }

    @ObfuscatedName("kd.v(I)I")
    public int method4789() {
        return this.field3796;
    }
}
