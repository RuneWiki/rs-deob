package deob;

@ObfuscatedName("gm")
public class class198 {

    @ObfuscatedName("gm.ec")
    public long field2963;

    @ObfuscatedName("gm.ej")
    public class198 field2962;

    @ObfuscatedName("gm.eo")
    public class198 field2964;

    @ObfuscatedName("gm.if()V")
    public void method3463() {
        if (this.field2964 != null) {
            this.field2964.field2962 = this.field2962;
            this.field2962.field2964 = this.field2964;
            this.field2962 = null;
            this.field2964 = null;
        }
    }

    @ObfuscatedName("gm.in()Z")
    public boolean method3460() {
        return this.field2964 != null;
    }
}
