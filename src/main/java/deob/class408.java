package deob;

@ObfuscatedName("pp")
public abstract class class408 {

    @ObfuscatedName("pp.am")
    public class408 field4528;

    @ObfuscatedName("pp.as")
    public String field4530;

    @ObfuscatedName("pp.aj")
    public String field4529;

    @ObfuscatedName("pp.ag")
    public boolean field4531;

    @ObfuscatedName("pp.az")
    public boolean field4527;

    public class408(class408 arg0) {
        this.field4528 = arg0;
    }

    @ObfuscatedName("pp.ag(B)Z")
    public boolean method6973() {
        return this.field4531;
    }

    @ObfuscatedName("pp.az(I)Z")
    public boolean method6956() {
        return this.field4527;
    }

    @ObfuscatedName("pp.av(B)Ljava/lang/String;")
    public String method6957() {
        return "Error in task: " + this.field4529 + ", Error message: " + this.field4530;
    }

    @ObfuscatedName("pp.ap(S)Lpp;")
    public class408 method6958() {
        return this.field4528;
    }

    @ObfuscatedName("pp.aq(Ljava/lang/String;I)V")
    public void method6959(String arg0) {
        this.field4531 = true;
        this.field4530 = arg0;
    }

    @ObfuscatedName("pp.aw(II)Z")
    public abstract boolean method6944(int arg0);
}
