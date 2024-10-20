package deob;

@ObfuscatedName("gu")
public class class208 {

    @ObfuscatedName("gu.ea")
    public long field3097;

    @ObfuscatedName("gu.ey")
    public class208 field3098;

    @ObfuscatedName("gu.eb")
    public class208 field3099;

    @ObfuscatedName("gu.il()V")
    public void method3605() {
        if (this.field3099 != null) {
            this.field3099.field3098 = this.field3098;
            this.field3098.field3099 = this.field3099;
            this.field3098 = null;
            this.field3099 = null;
        }
    }

    @ObfuscatedName("gu.iz()Z")
    public boolean method3604() {
        return this.field3099 != null;
    }
}
