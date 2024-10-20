package deob;

@ObfuscatedName("tp")
public class class506 {

    @ObfuscatedName("tp.hn")
    public long field5075;

    @ObfuscatedName("tp.hx")
    public class506 field5074;

    @ObfuscatedName("tp.hs")
    public class506 field5076;

    @ObfuscatedName("tp.jw()V")
    public void method8218() {
        if (this.field5076 != null) {
            this.field5076.field5074 = this.field5074;
            this.field5074.field5076 = this.field5076;
            this.field5074 = null;
            this.field5076 = null;
        }
    }

    @ObfuscatedName("tp.ji()Z")
    public boolean method8221() {
        return this.field5076 != null;
    }
}
