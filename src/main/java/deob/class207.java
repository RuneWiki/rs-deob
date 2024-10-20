package deob;

@ObfuscatedName("gc")
public class class207 extends class205 {

    @ObfuscatedName("gc.cc")
    public long field2455;

    @ObfuscatedName("gc.cy")
    public class207 field2454;

    @ObfuscatedName("gc.ch")
    public class207 field2453;

    @ObfuscatedName("gc.cv()V")
    public void method3819() {
        if (this.field2453 != null) {
            this.field2453.field2454 = this.field2454;
            this.field2454.field2453 = this.field2453;
            this.field2454 = null;
            this.field2453 = null;
        }
    }
}
