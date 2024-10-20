package deob;

@ObfuscatedName("gt")
public class class200 {

    @ObfuscatedName("gt.cn")
    public long field2557;

    @ObfuscatedName("gt.cp")
    public class200 field2556;

    @ObfuscatedName("gt.ca")
    public class200 field2555;

    @ObfuscatedName("gt.jm()V")
    public void method3392() {
        if (this.field2555 != null) {
            this.field2555.field2556 = this.field2556;
            this.field2556.field2555 = this.field2555;
            this.field2556 = null;
            this.field2555 = null;
        }
    }

    @ObfuscatedName("gt.ji()Z")
    public boolean method3393() {
        return this.field2555 != null;
    }
}
