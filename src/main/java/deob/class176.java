package deob;

@ObfuscatedName("fs")
public class class176 {

    @ObfuscatedName("fs.df")
    public long field2817;

    @ObfuscatedName("fs.ek")
    public class176 field2818;

    @ObfuscatedName("fs.ez")
    public class176 field2819;

    @ObfuscatedName("fs.ie()V")
    public void method3288() {
        if (this.field2819 != null) {
            this.field2819.field2818 = this.field2818;
            this.field2818.field2819 = this.field2819;
            this.field2818 = null;
            this.field2819 = null;
        }
    }

    @ObfuscatedName("fs.il()Z")
    public boolean method3289() {
        return this.field2819 != null;
    }
}
