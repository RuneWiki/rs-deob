package deob;

@ObfuscatedName("qc")
public abstract class class427 {

    @ObfuscatedName("qc.af")
    public class427 field4650;

    @ObfuscatedName("qc.at")
    public String field4654;

    @ObfuscatedName("qc.an")
    public String field4652;

    @ObfuscatedName("qc.ao")
    public boolean field4651;

    @ObfuscatedName("qc.ab")
    public boolean field4655;

    public class427(class427 arg0) {
        this.field4650 = arg0;
    }

    @ObfuscatedName("qc.ad(S)Z")
    public boolean method7159() {
        return this.field4651;
    }

    @ObfuscatedName("qc.al(I)Z")
    public boolean method7162() {
        return this.field4655;
    }

    @ObfuscatedName("qc.as(I)Ljava/lang/String;")
    public String method7173() {
        return "Error in task: " + this.field4652 + ", Error message: " + this.field4654;
    }

    @ObfuscatedName("qc.ag(B)Lqc;")
    public class427 method7160() {
        return this.field4650;
    }

    @ObfuscatedName("qc.ai(Ljava/lang/String;B)V")
    public void method7175(String arg0) {
        this.field4651 = true;
        this.field4654 = arg0;
    }

    @ObfuscatedName("qc.az(I)Z")
    public abstract boolean method7146();
}
