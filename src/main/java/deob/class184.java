package deob;

@ObfuscatedName("gb")
public class class184 {

    @ObfuscatedName("gb.df")
    public long field2861;

    @ObfuscatedName("gb.ef")
    public class184 field2860;

    @ObfuscatedName("gb.ej")
    public class184 field2862;

    @ObfuscatedName("gb.ir()V")
    public void method3309() {
        if (this.field2862 != null) {
            this.field2862.field2860 = this.field2860;
            this.field2860.field2862 = this.field2862;
            this.field2860 = null;
            this.field2862 = null;
        }
    }

    @ObfuscatedName("gb.iv()Z")
    public boolean method3310() {
        return this.field2862 != null;
    }
}
