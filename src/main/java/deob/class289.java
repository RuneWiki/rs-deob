package deob;

@ObfuscatedName("ki")
public class class289 {

    @ObfuscatedName("ki.n")
    public String field3800;

    @ObfuscatedName("ki.q")
    public class237 field3807;

    @ObfuscatedName("ki.b")
    public int field3806 = 0;

    @ObfuscatedName("ki.k")
    public boolean field3801 = false;

    public class289(class237 arg0) {
        this.field3807 = arg0;
    }

    @ObfuscatedName("ki.i(Ljava/lang/String;I)V")
    public void method4797(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3800 != arg0) {
            this.field3800 = arg0;
            this.field3806 = 0;
            this.field3801 = false;
            this.method4799();
        }
    }

    @ObfuscatedName("ki.j(I)I")
    public int method4799() {
        if (this.field3806 < 25) {
            if (!this.field3807.method3844(class41.field560.field557, this.field3800)) {
                return this.field3806;
            }
            this.field3806 = 25;
        }
        if (this.field3806 == 25) {
            if (!this.field3807.method3844(this.field3800, class41.field559.field557)) {
                return 25 + this.field3807.method3847(this.field3800) * 25 / 100;
            }
            this.field3806 = 50;
        }
        if (this.field3806 == 50) {
            if (this.field3807.method3887(class41.field558.field557, this.field3800) && !this.field3807.method3844(class41.field558.field557, this.field3800)) {
                return 50;
            }
            this.field3806 = 75;
        }
        if (this.field3806 == 75) {
            if (!this.field3807.method3844(this.field3800, class41.field556.field557)) {
                return 75;
            }
            this.field3806 = 100;
            this.field3801 = true;
        }
        return this.field3806;
    }

    @ObfuscatedName("ki.a(I)Z")
    public boolean method4800() {
        return this.field3801;
    }

    @ObfuscatedName("ki.r(I)I")
    public int method4801() {
        return this.field3806;
    }
}
