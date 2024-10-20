package deob;

@ObfuscatedName("mh")
public class class351 {

    @ObfuscatedName("mh.fk")
    public long field3941;

    @ObfuscatedName("mh.fs")
    public class351 field3942;

    @ObfuscatedName("mh.fz")
    public class351 field3943;

    @ObfuscatedName("mh.ex()V")
    public void method5354() {
        if (this.field3943 != null) {
            this.field3943.field3942 = this.field3942;
            this.field3942.field3943 = this.field3943;
            this.field3942 = null;
            this.field3943 = null;
        }
    }

    @ObfuscatedName("mh.ed()Z")
    public boolean method5353() {
        return this.field3943 != null;
    }
}
