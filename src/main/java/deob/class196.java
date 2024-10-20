package deob;

@ObfuscatedName("gr")
public class class196 {

    @ObfuscatedName("gr.cw")
    public long field2487;

    @ObfuscatedName("gr.cl")
    public class196 field2486;

    @ObfuscatedName("gr.cs")
    public class196 field2488;

    @ObfuscatedName("gr.ii()V")
    public void method3372() {
        if (this.field2488 != null) {
            this.field2488.field2486 = this.field2486;
            this.field2486.field2488 = this.field2488;
            this.field2486 = null;
            this.field2488 = null;
        }
    }

    @ObfuscatedName("gr.ia()Z")
    public boolean method3375() {
        return this.field2488 != null;
    }
}
