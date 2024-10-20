package deob;

@ObfuscatedName("gd")
public class class193 {

    @ObfuscatedName("gd.cw")
    public long field2464;

    @ObfuscatedName("gd.ch")
    public class193 field2465;

    @ObfuscatedName("gd.cx")
    public class193 field2466;

    @ObfuscatedName("gd.jn()V")
    public void method3425() {
        if (this.field2466 != null) {
            this.field2466.field2465 = this.field2465;
            this.field2465.field2466 = this.field2466;
            this.field2465 = null;
            this.field2466 = null;
        }
    }

    @ObfuscatedName("gd.jp()Z")
    public boolean method3426() {
        return this.field2466 != null;
    }
}
