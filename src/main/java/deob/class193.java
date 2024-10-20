package deob;

@ObfuscatedName("gm")
public class class193 {

    @ObfuscatedName("gm.cy")
    public long field2441;

    @ObfuscatedName("gm.cz")
    public class193 field2440;

    @ObfuscatedName("gm.cw")
    public class193 field2439;

    @ObfuscatedName("gm.is()V")
    public void method3312() {
        if (this.field2439 != null) {
            this.field2439.field2440 = this.field2440;
            this.field2440.field2439 = this.field2439;
            this.field2440 = null;
            this.field2439 = null;
        }
    }

    @ObfuscatedName("gm.ii()Z")
    public boolean method3311() {
        return this.field2439 != null;
    }
}
