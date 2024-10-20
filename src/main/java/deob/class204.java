package deob;

@ObfuscatedName("gw")
public class class204 {

    @ObfuscatedName("gw.cc")
    public long field2597;

    @ObfuscatedName("gw.cr")
    public class204 field2598;

    @ObfuscatedName("gw.cz")
    public class204 field2596;

    @ObfuscatedName("gw.jk()V")
    public void method3474() {
        if (this.field2596 != null) {
            this.field2596.field2598 = this.field2598;
            this.field2598.field2596 = this.field2596;
            this.field2598 = null;
            this.field2596 = null;
        }
    }

    @ObfuscatedName("gw.jz()Z")
    public boolean method3475() {
        return this.field2596 != null;
    }
}
