package deob;

@ObfuscatedName("re")
public abstract class class444 {

    @ObfuscatedName("re.aj")
    public class444 field4798;

    @ObfuscatedName("re.az")
    public String field4795;

    @ObfuscatedName("re.af")
    public String field4794;

    @ObfuscatedName("re.aa")
    public boolean field4797;

    @ObfuscatedName("re.at")
    public boolean field4799;

    public class444(class444 arg0) {
        this.field4798 = arg0;
    }

    @ObfuscatedName("re.ac(B)Z")
    public boolean method7596() {
        return this.field4797;
    }

    @ObfuscatedName("re.ao(B)Z")
    public boolean method7597() {
        return this.field4799;
    }

    @ObfuscatedName("re.ah(I)Ljava/lang/String;")
    public String method7611() {
        return "Error in task: " + this.field4794 + ", Error message: " + this.field4795;
    }

    @ObfuscatedName("re.av(B)Lre;")
    public class444 method7598() {
        return this.field4798;
    }

    @ObfuscatedName("re.aq(Ljava/lang/String;I)V")
    public void method7599(String arg0) {
        this.field4797 = true;
        this.field4795 = arg0;
    }

    @ObfuscatedName("re.ak(I)Z")
    public abstract boolean method7581();
}
