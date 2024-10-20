package deob;

@ObfuscatedName("ro")
public abstract class class445 {

    @ObfuscatedName("ro.ag")
    public class445 field4816;

    @ObfuscatedName("ro.ak")
    public String field4813;

    @ObfuscatedName("ro.ap")
    public String field4815;

    @ObfuscatedName("ro.an")
    public boolean field4814;

    @ObfuscatedName("ro.aj")
    public boolean field4817;

    public class445(class445 arg0) {
        this.field4816 = arg0;
    }

    @ObfuscatedName("ro.aj(I)Z")
    public boolean method7567() {
        return this.field4814;
    }

    @ObfuscatedName("ro.av(I)Z")
    public boolean method7568() {
        return this.field4817;
    }

    @ObfuscatedName("ro.ab(I)Ljava/lang/String;")
    public String method7569() {
        return "Error in task: " + this.field4815 + ", Error message: " + this.field4813;
    }

    @ObfuscatedName("ro.ai(I)Lro;")
    public class445 method7572() {
        return this.field4816;
    }

    @ObfuscatedName("ro.ae(Ljava/lang/String;I)V")
    public void method7571(String arg0) {
        this.field4814 = true;
        this.field4813 = arg0;
    }

    @ObfuscatedName("ro.aq(S)Z")
    public abstract boolean method7560();
}
