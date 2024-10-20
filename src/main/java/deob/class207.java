package deob;

@ObfuscatedName("gu")
public class class207 {

    @ObfuscatedName("gu.cb")
    public long field2497;

    @ObfuscatedName("gu.cs")
    public class207 field2495;

    @ObfuscatedName("gu.ce")
    public class207 field2496;

    @ObfuscatedName("gu.jr()V")
    public void method3818() {
        if (this.field2496 != null) {
            this.field2496.field2495 = this.field2495;
            this.field2495.field2496 = this.field2496;
            this.field2495 = null;
            this.field2496 = null;
        }
    }

    @ObfuscatedName("gu.jh()Z")
    public boolean method3819() {
        return this.field2496 != null;
    }
}
