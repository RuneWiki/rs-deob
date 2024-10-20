package deob;

@ObfuscatedName("gs")
public class class193 {

    @ObfuscatedName("gs.cl")
    public long field2486;

    @ObfuscatedName("gs.ct")
    public class193 field2485;

    @ObfuscatedName("gs.cp")
    public class193 field2487;

    @ObfuscatedName("gs.jt()V")
    public void method3407() {
        if (this.field2487 != null) {
            this.field2487.field2485 = this.field2485;
            this.field2485.field2487 = this.field2487;
            this.field2485 = null;
            this.field2487 = null;
        }
    }

    @ObfuscatedName("gs.js()Z")
    public boolean method3405() {
        return this.field2487 != null;
    }
}
