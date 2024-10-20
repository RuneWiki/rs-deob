package deob;

@ObfuscatedName("ru")
public class class444 {

    @ObfuscatedName("ru.hl")
    public long field4673;

    @ObfuscatedName("ru.he")
    public class444 field4672;

    @ObfuscatedName("ru.ha")
    public class444 field4674;

    @ObfuscatedName("ru.gi()V")
    public void method7335() {
        if (this.field4674 != null) {
            this.field4674.field4672 = this.field4672;
            this.field4672.field4674 = this.field4674;
            this.field4672 = null;
            this.field4674 = null;
        }
    }

    @ObfuscatedName("ru.gc()Z")
    public boolean method7336() {
        return this.field4674 != null;
    }
}
