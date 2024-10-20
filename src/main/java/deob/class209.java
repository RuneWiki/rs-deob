package deob;

@ObfuscatedName("hp")
public class class209 extends class207 {

    @ObfuscatedName("hp.cb")
    public long field2490;

    @ObfuscatedName("hp.ct")
    public class209 field2491;

    @ObfuscatedName("hp.ca")
    public class209 field2492;

    @ObfuscatedName("hp.cb()V")
    public void method3845() {
        if (this.field2492 != null) {
            this.field2492.field2491 = this.field2491;
            this.field2491.field2492 = this.field2492;
            this.field2491 = null;
            this.field2492 = null;
        }
    }
}
