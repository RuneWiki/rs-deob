package deob;

@ObfuscatedName("on")
public class class411 {

    @ObfuscatedName("on.gr")
    public long field4468;

    @ObfuscatedName("on.gi")
    public class411 field4469;

    @ObfuscatedName("on.gs")
    public class411 field4470;

    @ObfuscatedName("on.fc()V")
    public void method6409() {
        if (this.field4470 != null) {
            this.field4470.field4469 = this.field4469;
            this.field4469.field4470 = this.field4470;
            this.field4469 = null;
            this.field4470 = null;
        }
    }

    @ObfuscatedName("on.fp()Z")
    public boolean method6412() {
        return this.field4470 != null;
    }
}
