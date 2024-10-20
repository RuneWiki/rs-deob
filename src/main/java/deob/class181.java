package deob;

@ObfuscatedName("fd")
public class class181 {

    @ObfuscatedName("fd.cp")
    public long field2091;

    @ObfuscatedName("fd.cs")
    public class181 field2090;

    @ObfuscatedName("fd.ck")
    public class181 field2089;

    @ObfuscatedName("fd.fv()V")
    public void method3386() {
        if (this.field2089 != null) {
            this.field2089.field2090 = this.field2090;
            this.field2090.field2089 = this.field2089;
            this.field2090 = null;
            this.field2089 = null;
        }
    }

    @ObfuscatedName("fd.fk()Z")
    public boolean method3388() {
        return this.field2089 != null;
    }
}
