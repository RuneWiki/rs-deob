package deob;

@ObfuscatedName("gp")
public class class207 {

    @ObfuscatedName("gp.cs")
    public long field2470;

    @ObfuscatedName("gp.cf")
    public class207 field2471;

    @ObfuscatedName("gp.cj")
    public class207 field2472;

    @ObfuscatedName("gp.kk()V")
    public void method3766() {
        if (this.field2472 != null) {
            this.field2472.field2471 = this.field2471;
            this.field2471.field2472 = this.field2472;
            this.field2471 = null;
            this.field2472 = null;
        }
    }

    @ObfuscatedName("gp.kz()Z")
    public boolean method3768() {
        return this.field2472 != null;
    }
}
