package deob;

@ObfuscatedName("gr")
public class class193 {

    @ObfuscatedName("gr.cf")
    public long field2483;

    @ObfuscatedName("gr.cd")
    public class193 field2482;

    @ObfuscatedName("gr.ce")
    public class193 field2484;

    @ObfuscatedName("gr.il()V")
    public void method3347() {
        if (this.field2484 != null) {
            this.field2484.field2482 = this.field2482;
            this.field2482.field2484 = this.field2484;
            this.field2482 = null;
            this.field2484 = null;
        }
    }

    @ObfuscatedName("gr.ig()Z")
    public boolean method3343() {
        return this.field2484 != null;
    }
}
