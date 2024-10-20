package deob;

@ObfuscatedName("gl")
public class class207 {

    @ObfuscatedName("gl.cr")
    public long field2464;

    @ObfuscatedName("gl.co")
    public class207 field2463;

    @ObfuscatedName("gl.cy")
    public class207 field2465;

    @ObfuscatedName("gl.jz()V")
    public void method3787() {
        if (this.field2465 != null) {
            this.field2465.field2463 = this.field2463;
            this.field2463.field2465 = this.field2465;
            this.field2463 = null;
            this.field2465 = null;
        }
    }

    @ObfuscatedName("gl.jx()Z")
    public boolean method3788() {
        return this.field2465 != null;
    }
}
