package deob;

@ObfuscatedName("gp")
public class class208 {

    @ObfuscatedName("gp.ek")
    public long field3099;

    @ObfuscatedName("gp.ez")
    public class208 field3098;

    @ObfuscatedName("gp.ew")
    public class208 field3100;

    @ObfuscatedName("gp.ib()V")
    public void method3624() {
        if (this.field3100 != null) {
            this.field3100.field3098 = this.field3098;
            this.field3098.field3100 = this.field3100;
            this.field3098 = null;
            this.field3100 = null;
        }
    }

    @ObfuscatedName("gp.iu()Z")
    public boolean method3625() {
        return this.field3100 != null;
    }
}
