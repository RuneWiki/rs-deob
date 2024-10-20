package deob;

@ObfuscatedName("fk")
public class class7 extends class13 {

    @ObfuscatedName("fk.cz")
    public class7 field53;

    @ObfuscatedName("fk.cf")
    public class7 field52;

    @ObfuscatedName("fk.em()V")
    public void method49() {
        if (this.field53 != null) {
            this.field53.field52 = this.field52;
            this.field52.field53 = this.field53;
            this.field52 = null;
            this.field53 = null;
        }
    }
}
