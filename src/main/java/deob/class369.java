package deob;

@ObfuscatedName("nr")
public class class369 {

    @ObfuscatedName("nr.fy")
    public long field4056;

    @ObfuscatedName("nr.fx")
    public class369 field4055;

    @ObfuscatedName("nr.fa")
    public class369 field4057;

    @ObfuscatedName("nr.fe()V")
    public void method5732() {
        if (this.field4057 != null) {
            this.field4057.field4055 = this.field4055;
            this.field4055.field4057 = this.field4057;
            this.field4055 = null;
            this.field4057 = null;
        }
    }

    @ObfuscatedName("nr.ff()Z")
    public boolean method5733() {
        return this.field4057 != null;
    }
}
