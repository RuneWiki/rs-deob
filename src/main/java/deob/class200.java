package deob;

@ObfuscatedName("gc")
public class class200 {

    @ObfuscatedName("gc.m")
    public class200 field2495;

    @ObfuscatedName("gc.h")
    public class200 field2496;

    @ObfuscatedName("gc.s()V")
    public void method3427() {
        if (this.field2496 != null) {
            this.field2496.field2495 = this.field2495;
            this.field2495.field2496 = this.field2496;
            this.field2495 = null;
            this.field2496 = null;
        }
    }
}
