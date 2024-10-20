package deob;

@ObfuscatedName("ql")
public abstract class class419 {

    @ObfuscatedName("ql.ar")
    public class419 field4555;

    @ObfuscatedName("ql.ao")
    public String field4552;

    @ObfuscatedName("ql.ab")
    public String field4553;

    @ObfuscatedName("ql.au")
    public boolean field4558;

    @ObfuscatedName("ql.aa")
    public boolean field4556;

    public class419(class419 arg0) {
        this.field4555 = arg0;
    }

    @ObfuscatedName("ql.aa(I)Z")
    public boolean method7135() {
        return this.field4558;
    }

    @ObfuscatedName("ql.ac(B)Z")
    public boolean method7130() {
        return this.field4556;
    }

    @ObfuscatedName("ql.al(I)Ljava/lang/String;")
    public String method7128() {
        return "Error in task: " + this.field4553 + ", Error message: " + this.field4552;
    }

    @ObfuscatedName("ql.az(I)Lql;")
    public class419 method7132() {
        return this.field4555;
    }

    @ObfuscatedName("ql.ap(Ljava/lang/String;B)V")
    public void method7133(String arg0) {
        this.field4558 = true;
        this.field4552 = arg0;
    }

    @ObfuscatedName("ql.at(I)Z")
    public abstract boolean method7116();
}
