package deob;

@ObfuscatedName("gh")
public class class193 {

    @ObfuscatedName("gh.cb")
    public long field2437;

    @ObfuscatedName("gh.cz")
    public class193 field2438;

    @ObfuscatedName("gh.cr")
    public class193 field2439;

    @ObfuscatedName("gh.it()V")
    public void method3287() {
        if (this.field2439 != null) {
            this.field2439.field2438 = this.field2438;
            this.field2438.field2439 = this.field2439;
            this.field2438 = null;
            this.field2439 = null;
        }
    }

    @ObfuscatedName("gh.ic()Z")
    public boolean method3286() {
        return this.field2439 != null;
    }
}
