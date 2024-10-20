package deob;

@ObfuscatedName("rm")
public abstract class class446 {

    @ObfuscatedName("rm.an")
    public class446 field4796;

    @ObfuscatedName("rm.au")
    public String field4792;

    @ObfuscatedName("rm.ax")
    public String field4797;

    @ObfuscatedName("rm.ao")
    public boolean field4794;

    @ObfuscatedName("rm.am")
    public boolean field4793;

    public class446(class446 arg0) {
        this.field4796 = arg0;
    }

    @ObfuscatedName("rm.ae(S)Z")
    public boolean method7668() {
        return this.field4794;
    }

    @ObfuscatedName("rm.ad(I)Z")
    public boolean method7669() {
        return this.field4793;
    }

    @ObfuscatedName("rm.aq(I)Ljava/lang/String;")
    public String method7673() {
        return "Error in task: " + this.field4797 + ", Error message: " + this.field4792;
    }

    @ObfuscatedName("rm.al(I)Lrm;")
    public class446 method7674() {
        return this.field4796;
    }

    @ObfuscatedName("rm.aj(Ljava/lang/String;B)V")
    public void method7672(String arg0) {
        this.field4794 = true;
        this.field4792 = arg0;
    }

    @ObfuscatedName("rm.ab(I)Z")
    public abstract boolean method7665();
}
