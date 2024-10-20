package deob;

@ObfuscatedName("ho")
public class class217 {

    @ObfuscatedName("ho.cp")
    public long field2655;

    @ObfuscatedName("ho.ch")
    public class217 field2654;

    @ObfuscatedName("ho.cr")
    public class217 field2653;

    @ObfuscatedName("ho.kn()V")
    public void method3785() {
        if (this.field2653 != null) {
            this.field2653.field2654 = this.field2654;
            this.field2654.field2653 = this.field2653;
            this.field2654 = null;
            this.field2653 = null;
        }
    }

    @ObfuscatedName("ho.kl()Z")
    public boolean method3786() {
        return this.field2653 != null;
    }
}
