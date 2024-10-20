package deob;

@ObfuscatedName("ra")
public abstract class class449 {

    @ObfuscatedName("ra.ak")
    public class449 field4883;

    @ObfuscatedName("ra.aj")
    public String field4884;

    @ObfuscatedName("ra.ai")
    public String field4882;

    @ObfuscatedName("ra.ay")
    public boolean field4885;

    @ObfuscatedName("ra.as")
    public boolean field4886;

    public class449(class449 arg0) {
        this.field4883 = arg0;
    }

    @ObfuscatedName("ra.as(I)Z")
    public boolean method8063() {
        return this.field4885;
    }

    @ObfuscatedName("ra.ae(B)Z")
    public boolean method8072() {
        return this.field4886;
    }

    @ObfuscatedName("ra.am(I)Ljava/lang/String;")
    public String method8065() {
        return "Error in task: " + this.field4882 + ", Error message: " + this.field4884;
    }

    @ObfuscatedName("ra.at(I)Lra;")
    public class449 method8066() {
        return this.field4883;
    }

    @ObfuscatedName("ra.au(Ljava/lang/String;I)V")
    public void method8067(String arg0) {
        this.field4885 = true;
        this.field4884 = arg0;
    }

    @ObfuscatedName("ra.ap(I)Z")
    public abstract boolean method8051();
}
