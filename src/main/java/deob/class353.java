package deob;

@ObfuscatedName("mf")
public class class353 {

    @ObfuscatedName("mf.fu")
    public long field3937;

    @ObfuscatedName("mf.fb")
    public class353 field3935;

    @ObfuscatedName("mf.fp")
    public class353 field3936;

    @ObfuscatedName("mf.eo()V")
    public void method5407() {
        if (this.field3936 != null) {
            this.field3936.field3935 = this.field3935;
            this.field3935.field3936 = this.field3936;
            this.field3935 = null;
            this.field3936 = null;
        }
    }

    @ObfuscatedName("mf.ew()Z")
    public boolean method5408() {
        return this.field3936 != null;
    }
}
