package deob;

@ObfuscatedName("gc")
public class class208 {

    @ObfuscatedName("gc.ez")
    public long field3096;

    @ObfuscatedName("gc.ev")
    public class208 field3097;

    @ObfuscatedName("gc.ee")
    public class208 field3098;

    @ObfuscatedName("gc.hr()V")
    public void method3646() {
        if (this.field3098 != null) {
            this.field3098.field3097 = this.field3097;
            this.field3097.field3098 = this.field3098;
            this.field3097 = null;
            this.field3098 = null;
        }
    }

    @ObfuscatedName("gc.ir()Z")
    public boolean method3647() {
        return this.field3098 != null;
    }
}
