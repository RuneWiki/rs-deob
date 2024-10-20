package deob;

@ObfuscatedName("gr")
public class class208 {

    @ObfuscatedName("gr.eh")
    public long field3099;

    @ObfuscatedName("gr.eo")
    public class208 field3098;

    @ObfuscatedName("gr.ew")
    public class208 field3100;

    @ObfuscatedName("gr.in()V")
    public void method3693() {
        if (this.field3100 != null) {
            this.field3100.field3098 = this.field3098;
            this.field3098.field3100 = this.field3100;
            this.field3098 = null;
            this.field3100 = null;
        }
    }

    @ObfuscatedName("gr.ij()Z")
    public boolean method3694() {
        return this.field3100 != null;
    }
}
