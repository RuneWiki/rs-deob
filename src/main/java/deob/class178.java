package deob;

@ObfuscatedName("fv")
public class class178 {

    @ObfuscatedName("fv.dh")
    public long field2808;

    @ObfuscatedName("fv.dc")
    public class178 field2807;

    @ObfuscatedName("fv.eh")
    public class178 field2806;

    @ObfuscatedName("fv.ic()V")
    public void method3357() {
        if (this.field2806 != null) {
            this.field2806.field2807 = this.field2807;
            this.field2807.field2806 = this.field2806;
            this.field2807 = null;
            this.field2806 = null;
        }
    }

    @ObfuscatedName("fv.iy()Z")
    public boolean method3360() {
        return this.field2806 != null;
    }
}
