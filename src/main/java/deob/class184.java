package deob;

@ObfuscatedName("ge")
public class class184 {

    @ObfuscatedName("ge.do")
    public long field2861;

    @ObfuscatedName("ge.ew")
    public class184 field2860;

    @ObfuscatedName("ge.eq")
    public class184 field2862;

    @ObfuscatedName("ge.if()V")
    public void method3260() {
        if (this.field2862 != null) {
            this.field2862.field2860 = this.field2860;
            this.field2860.field2862 = this.field2862;
            this.field2860 = null;
            this.field2862 = null;
        }
    }

    @ObfuscatedName("ge.ih()Z")
    public boolean method3261() {
        return this.field2862 != null;
    }
}
