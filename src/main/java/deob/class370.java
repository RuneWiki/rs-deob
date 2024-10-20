package deob;

@ObfuscatedName("ns")
public class class370 {

    @ObfuscatedName("ns.ff")
    public long field4075;

    @ObfuscatedName("ns.fu")
    public class370 field4074;

    @ObfuscatedName("ns.fm")
    public class370 field4076;

    @ObfuscatedName("ns.ft()V")
    public void method5752() {
        if (this.field4076 != null) {
            this.field4076.field4074 = this.field4074;
            this.field4074.field4076 = this.field4076;
            this.field4074 = null;
            this.field4076 = null;
        }
    }

    @ObfuscatedName("ns.fl()Z")
    public boolean method5756() {
        return this.field4076 != null;
    }
}
