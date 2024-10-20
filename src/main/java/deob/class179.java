package deob;

@ObfuscatedName("fz")
public class class179 {

    @ObfuscatedName("fz.df")
    public long field2823;

    @ObfuscatedName("fz.ec")
    public class179 field2822;

    @ObfuscatedName("fz.ew")
    public class179 field2824;

    @ObfuscatedName("fz.hz()V")
    public void method3404() {
        if (this.field2824 != null) {
            this.field2824.field2822 = this.field2822;
            this.field2822.field2824 = this.field2824;
            this.field2822 = null;
            this.field2824 = null;
        }
    }

    @ObfuscatedName("fz.hm()Z")
    public boolean method3405() {
        return this.field2824 != null;
    }
}
