package deob;

@ObfuscatedName("tz")
public class class505 {

    @ObfuscatedName("tz.hq")
    public long field5082;

    @ObfuscatedName("tz.hy")
    public class505 field5083;

    @ObfuscatedName("tz.hz")
    public class505 field5081;

    @ObfuscatedName("tz.kh()V")
    public void method8130() {
        if (this.field5081 != null) {
            this.field5081.field5083 = this.field5083;
            this.field5083.field5081 = this.field5081;
            this.field5083 = null;
            this.field5081 = null;
        }
    }

    @ObfuscatedName("tz.kf()Z")
    public boolean method8131() {
        return this.field5081 != null;
    }
}
