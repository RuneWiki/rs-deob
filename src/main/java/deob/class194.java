package deob;

@ObfuscatedName("gx")
public class class194 {

    @ObfuscatedName("gx.cn")
    public long field2451;

    @ObfuscatedName("gx.ca")
    public class194 field2452;

    @ObfuscatedName("gx.cd")
    public class194 field2453;

    @ObfuscatedName("gx.io()V")
    public void method3333() {
        if (this.field2453 != null) {
            this.field2453.field2452 = this.field2452;
            this.field2452.field2453 = this.field2453;
            this.field2452 = null;
            this.field2453 = null;
        }
    }

    @ObfuscatedName("gx.ir()Z")
    public boolean method3334() {
        return this.field2453 != null;
    }
}
