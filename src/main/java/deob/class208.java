package deob;

@ObfuscatedName("gm")
public class class208 {

    @ObfuscatedName("gm.eb")
    public long field3105;

    @ObfuscatedName("gm.ec")
    public class208 field3106;

    @ObfuscatedName("gm.em")
    public class208 field3107;

    @ObfuscatedName("gm.hu()V")
    public void method3665() {
        if (this.field3107 != null) {
            this.field3107.field3106 = this.field3106;
            this.field3106.field3107 = this.field3107;
            this.field3106 = null;
            this.field3107 = null;
        }
    }

    @ObfuscatedName("gm.hg()Z")
    public boolean method3666() {
        return this.field3107 != null;
    }
}
