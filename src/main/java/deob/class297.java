package deob;

@ObfuscatedName("ku")
public class class297 {

    @ObfuscatedName("ku.f")
    public String field3858;

    @ObfuscatedName("ku.u")
    public class243 field3856;

    @ObfuscatedName("ku.t")
    public int field3852 = 0;

    @ObfuscatedName("ku.k")
    public boolean field3854 = false;

    public class297(class243 arg0) {
        this.field3856 = arg0;
    }

    @ObfuscatedName("ku.b(Ljava/lang/String;I)V")
    public void method4905(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3858 != arg0) {
            this.field3858 = arg0;
            this.field3852 = 0;
            this.field3854 = false;
            this.method4916();
        }
    }

    @ObfuscatedName("ku.s(I)I")
    public int method4916() {
        if (this.field3852 < 25) {
            if (!this.field3856.method3836(class41.field501.field505, this.field3858)) {
                return this.field3852;
            }
            this.field3852 = 25;
        }
        if (this.field3852 == 25) {
            if (!this.field3856.method3836(this.field3858, class41.field503.field505)) {
                return 25 + this.field3856.method3837(this.field3858) * 25 / 100;
            }
            this.field3852 = 50;
        }
        if (this.field3852 == 50) {
            if (this.field3856.method3834(class41.field502.field505, this.field3858) && !this.field3856.method3836(class41.field502.field505, this.field3858)) {
                return 50;
            }
            this.field3852 = 75;
        }
        if (this.field3852 == 75) {
            if (!this.field3856.method3836(this.field3858, class41.field504.field505)) {
                return 75;
            }
            this.field3852 = 100;
            this.field3854 = true;
        }
        return this.field3852;
    }

    @ObfuscatedName("ku.r(I)Z")
    public boolean method4907() {
        return this.field3854;
    }

    @ObfuscatedName("ku.g(B)I")
    public int method4911() {
        return this.field3852;
    }
}
