package deob;

@ObfuscatedName("gm")
public class class193 {

    @ObfuscatedName("gm.cf")
    public long field2473;

    @ObfuscatedName("gm.cc")
    public class193 field2474;

    @ObfuscatedName("gm.cp")
    public class193 field2475;

    @ObfuscatedName("gm.ip()V")
    public void method3290() {
        if (this.field2475 != null) {
            this.field2475.field2474 = this.field2474;
            this.field2474.field2475 = this.field2475;
            this.field2474 = null;
            this.field2475 = null;
        }
    }

    @ObfuscatedName("gm.ir()Z")
    public boolean method3291() {
        return this.field2475 != null;
    }
}
