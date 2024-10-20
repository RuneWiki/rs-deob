package deob;

@ObfuscatedName("pk")
public class class430 {

    @ObfuscatedName("pk.gp")
    public long field4635;

    @ObfuscatedName("pk.gq")
    public class430 field4636;

    @ObfuscatedName("pk.gg")
    public class430 field4637;

    @ObfuscatedName("pk.ez()V")
    public void method7170() {
        if (this.field4637 != null) {
            this.field4637.field4636 = this.field4636;
            this.field4636.field4637 = this.field4637;
            this.field4636 = null;
            this.field4637 = null;
        }
    }

    @ObfuscatedName("pk.eu()Z")
    public boolean method7171() {
        return this.field4637 != null;
    }
}
