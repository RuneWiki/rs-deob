package deob;

@ObfuscatedName("qd")
public abstract class class423 {

    @ObfuscatedName("qd.af")
    public class423 field4599;

    @ObfuscatedName("qd.aj")
    public String field4596;

    @ObfuscatedName("qd.aq")
    public String field4598;

    @ObfuscatedName("qd.ar")
    public boolean field4597;

    @ObfuscatedName("qd.ag")
    public boolean field4595;

    public class423(class423 arg0) {
        this.field4599 = arg0;
    }

    @ObfuscatedName("qd.au(I)Z")
    public boolean method7264() {
        return this.field4597;
    }

    @ObfuscatedName("qd.an(B)Z")
    public boolean method7274() {
        return this.field4595;
    }

    @ObfuscatedName("qd.ad(I)Ljava/lang/String;")
    public String method7266() {
        return "Error in task: " + this.field4598 + ", Error message: " + this.field4596;
    }

    @ObfuscatedName("qd.ax(I)Lqd;")
    public class423 method7267() {
        return this.field4599;
    }

    @ObfuscatedName("qd.aw(Ljava/lang/String;B)V")
    public void method7268(String arg0) {
        this.field4597 = true;
        this.field4596 = arg0;
    }

    @ObfuscatedName("qd.am(I)Z")
    public abstract boolean method7259();
}
