package deob;

@ObfuscatedName("qm")
public abstract class class422 {

    @ObfuscatedName("qm.ak")
    public class422 field4576;

    @ObfuscatedName("qm.ax")
    public String field4575;

    @ObfuscatedName("qm.ao")
    public String field4573;

    @ObfuscatedName("qm.ah")
    public boolean field4577;

    @ObfuscatedName("qm.ar")
    public boolean field4574;

    public class422(class422 arg0) {
        this.field4576 = arg0;
    }

    @ObfuscatedName("qm.ab(I)Z")
    public boolean method7069() {
        return this.field4577;
    }

    @ObfuscatedName("qm.am(B)Z")
    public boolean method7070() {
        return this.field4574;
    }

    @ObfuscatedName("qm.av(I)Ljava/lang/String;")
    public String method7071() {
        return "Error in task: " + this.field4573 + ", Error message: " + this.field4575;
    }

    @ObfuscatedName("qm.ag(I)Lqm;")
    public class422 method7072() {
        return this.field4576;
    }

    @ObfuscatedName("qm.aa(Ljava/lang/String;I)V")
    public void method7079(String arg0) {
        this.field4577 = true;
        this.field4575 = arg0;
    }

    @ObfuscatedName("qm.ac(B)Z")
    public abstract boolean method7059();
}
