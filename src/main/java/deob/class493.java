package deob;

@ObfuscatedName("su")
public class class493 {

    @ObfuscatedName("su.hb")
    public long field4951;

    @ObfuscatedName("su.hp")
    public class493 field4950;

    @ObfuscatedName("su.ht")
    public class493 field4952;

    @ObfuscatedName("su.fp()V")
    public void method7855() {
        if (this.field4952 != null) {
            this.field4952.field4950 = this.field4950;
            this.field4950.field4952 = this.field4952;
            this.field4950 = null;
            this.field4952 = null;
        }
    }

    @ObfuscatedName("su.gg()Z")
    public boolean method7854() {
        return this.field4952 != null;
    }
}
