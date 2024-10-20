package deob;

@ObfuscatedName("ga")
public class class194 {

    @ObfuscatedName("ga.cv")
    public long field2469;

    @ObfuscatedName("ga.ce")
    public class194 field2470;

    @ObfuscatedName("ga.ca")
    public class194 field2468;

    @ObfuscatedName("ga.im()V")
    public void method3314() {
        if (this.field2468 != null) {
            this.field2468.field2470 = this.field2470;
            this.field2470.field2468 = this.field2468;
            this.field2470 = null;
            this.field2468 = null;
        }
    }

    @ObfuscatedName("ga.ja()Z")
    public boolean method3310() {
        return this.field2468 != null;
    }
}
