package deob;

@ObfuscatedName("ft")
public class class17 {

    @ObfuscatedName("ft.dz")
    public long field213;

    @ObfuscatedName("ft.dm")
    public class17 field214;

    @ObfuscatedName("ft.ef")
    public class17 field215;

    @ObfuscatedName("ft.it()Z")
    public boolean method230() {
        return this.field215 != null;
    }

    @ObfuscatedName("ft.ie()V")
    public void method234() {
        if (this.field215 != null) {
            this.field215.field214 = this.field214;
            this.field214.field215 = this.field215;
            this.field214 = null;
            this.field215 = null;
        }
    }
}
