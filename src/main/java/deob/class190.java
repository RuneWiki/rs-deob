package deob;

@ObfuscatedName("gw")
public class class190 {

    @ObfuscatedName("gw.cp")
    public long field2157;

    @ObfuscatedName("gw.ch")
    public class190 field2155;

    @ObfuscatedName("gw.cs")
    public class190 field2156;

    @ObfuscatedName("gw.fa()V")
    public void method3401() {
        if (this.field2156 != null) {
            this.field2156.field2155 = this.field2155;
            this.field2155.field2156 = this.field2156;
            this.field2155 = null;
            this.field2156 = null;
        }
    }

    @ObfuscatedName("gw.fh()Z")
    public boolean method3406() {
        return this.field2156 != null;
    }
}
