package deob;

@ObfuscatedName("ml")
public class class354 {

    @ObfuscatedName("ml.fx")
    public long field3966;

    @ObfuscatedName("ml.fr")
    public class354 field3965;

    @ObfuscatedName("ml.fe")
    public class354 field3967;

    @ObfuscatedName("ml.fc()V")
    public void method5447() {
        if (this.field3967 != null) {
            this.field3967.field3965 = this.field3965;
            this.field3965.field3967 = this.field3967;
            this.field3965 = null;
            this.field3967 = null;
        }
    }

    @ObfuscatedName("ml.fi()Z")
    public boolean method5448() {
        return this.field3967 != null;
    }
}
