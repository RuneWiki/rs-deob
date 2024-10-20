package deob;

@ObfuscatedName("gc")
public class class193 {

    @ObfuscatedName("gc.cg")
    public long field2454;

    @ObfuscatedName("gc.cc")
    public class193 field2453;

    @ObfuscatedName("gc.cu")
    public class193 field2452;

    @ObfuscatedName("gc.ix()V")
    public void method3304() {
        if (this.field2452 != null) {
            this.field2452.field2453 = this.field2453;
            this.field2453.field2452 = this.field2452;
            this.field2453 = null;
            this.field2452 = null;
        }
    }

    @ObfuscatedName("gc.iu()Z")
    public boolean method3305() {
        return this.field2452 != null;
    }
}
