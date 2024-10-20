package deob;

@ObfuscatedName("gf")
public class class207 {

    @ObfuscatedName("gf.cj")
    public long field2486;

    @ObfuscatedName("gf.cd")
    public class207 field2487;

    @ObfuscatedName("gf.cr")
    public class207 field2485;

    @ObfuscatedName("gf.jh()V")
    public void method3812() {
        if (this.field2485 != null) {
            this.field2485.field2487 = this.field2487;
            this.field2487.field2485 = this.field2485;
            this.field2487 = null;
            this.field2485 = null;
        }
    }

    @ObfuscatedName("gf.ki()Z")
    public boolean method3808() {
        return this.field2485 != null;
    }
}
