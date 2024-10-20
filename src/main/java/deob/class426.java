package deob;

@ObfuscatedName("qe")
public abstract class class426 {

    @ObfuscatedName("qe.al")
    public class426 field4629;

    @ObfuscatedName("qe.ai")
    public String field4627;

    @ObfuscatedName("qe.ar")
    public String field4628;

    @ObfuscatedName("qe.as")
    public boolean field4630;

    @ObfuscatedName("qe.aa")
    public boolean field4631;

    public class426(class426 arg0) {
        this.field4629 = arg0;
    }

    @ObfuscatedName("qe.as(B)Z")
    public boolean method7277() {
        return this.field4630;
    }

    @ObfuscatedName("qe.aa(B)Z")
    public boolean method7299() {
        return this.field4631;
    }

    @ObfuscatedName("qe.az(I)Ljava/lang/String;")
    public String method7278() {
        return "Error in task: " + this.field4628 + ", Error message: " + this.field4627;
    }

    @ObfuscatedName("qe.ao(I)Lqe;")
    public class426 method7279() {
        return this.field4629;
    }

    @ObfuscatedName("qe.au(Ljava/lang/String;I)V")
    public void method7280(String arg0) {
        this.field4630 = true;
        this.field4627 = arg0;
    }

    @ObfuscatedName("qe.aq(I)Z")
    public abstract boolean method7266();
}
