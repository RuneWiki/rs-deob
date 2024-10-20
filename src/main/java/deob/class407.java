package deob;

@ObfuscatedName("pm")
public abstract class class407 {

    @ObfuscatedName("pm.ao")
    public class407 field4522;

    @ObfuscatedName("pm.at")
    public String field4523;

    @ObfuscatedName("pm.ac")
    public String field4524;

    @ObfuscatedName("pm.ai")
    public boolean field4525;

    @ObfuscatedName("pm.az")
    public boolean field4526;

    public class407(class407 arg0) {
        this.field4522 = arg0;
    }

    @ObfuscatedName("pm.ai(B)Z")
    public boolean method6984() {
        return this.field4525;
    }

    @ObfuscatedName("pm.az(I)Z")
    public boolean method6988() {
        return this.field4526;
    }

    @ObfuscatedName("pm.ap(I)Ljava/lang/String;")
    public String method6983() {
        return "Error in task: " + this.field4524 + ", Error message: " + this.field4523;
    }

    @ObfuscatedName("pm.aa(S)Lpm;")
    public class407 method6985() {
        return this.field4522;
    }

    @ObfuscatedName("pm.af(Ljava/lang/String;B)V")
    public void method6986(String arg0) {
        this.field4525 = true;
        this.field4523 = arg0;
    }

    @ObfuscatedName("pm.au(I)Z")
    public abstract boolean method6976();
}
