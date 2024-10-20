package deob;

@ObfuscatedName("nw")
public class class387 {

    @ObfuscatedName("nw.fc")
    public long field4257;

    @ObfuscatedName("nw.fi")
    public class387 field4258;

    @ObfuscatedName("nw.fs")
    public class387 field4259;

    @ObfuscatedName("nw.fe()V")
    public void method6163() {
        if (this.field4259 != null) {
            this.field4259.field4258 = this.field4258;
            this.field4258.field4259 = this.field4259;
            this.field4258 = null;
            this.field4259 = null;
        }
    }

    @ObfuscatedName("nw.fu()Z")
    public boolean method6164() {
        return this.field4259 != null;
    }
}
