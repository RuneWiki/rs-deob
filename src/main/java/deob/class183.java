package deob;

@ObfuscatedName("gw")
public class class183 {

    @ObfuscatedName("gw.dj")
    public long field2830;

    @ObfuscatedName("gw.el")
    public class183 field2829;

    @ObfuscatedName("gw.eg")
    public class183 field2831;

    @ObfuscatedName("gw.ht()V")
    public void method3268() {
        if (this.field2831 != null) {
            this.field2831.field2829 = this.field2829;
            this.field2829.field2831 = this.field2831;
            this.field2829 = null;
            this.field2831 = null;
        }
    }

    @ObfuscatedName("gw.hg()Z")
    public boolean method3269() {
        return this.field2831 != null;
    }
}
