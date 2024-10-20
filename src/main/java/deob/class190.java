package deob;

@ObfuscatedName("gr")
public class class190 {

    @ObfuscatedName("gr.cm")
    public long field2152;

    @ObfuscatedName("gr.cf")
    public class190 field2153;

    @ObfuscatedName("gr.ct")
    public class190 field2151;

    @ObfuscatedName("gr.fx()V")
    public void method3388() {
        if (this.field2151 != null) {
            this.field2151.field2153 = this.field2153;
            this.field2153.field2151 = this.field2151;
            this.field2153 = null;
            this.field2151 = null;
        }
    }

    @ObfuscatedName("gr.fy()Z")
    public boolean method3387() {
        return this.field2151 != null;
    }
}
