package deob;

@ObfuscatedName("ri")
public abstract class class448 {

    @ObfuscatedName("ri.ag")
    public class448 field4845;

    @ObfuscatedName("ri.am")
    public String field4843;

    @ObfuscatedName("ri.ax")
    public String field4844;

    @ObfuscatedName("ri.aq")
    public boolean field4846;

    @ObfuscatedName("ri.af")
    public boolean field4842;

    public class448(class448 arg0) {
        this.field4845 = arg0;
    }

    @ObfuscatedName("ri.af(S)Z")
    public boolean method7811() {
        return this.field4846;
    }

    @ObfuscatedName("ri.at(B)Z")
    public boolean method7812() {
        return this.field4842;
    }

    @ObfuscatedName("ri.au(B)Ljava/lang/String;")
    public String method7813() {
        return "Error in task: " + this.field4844 + ", Error message: " + this.field4843;
    }

    @ObfuscatedName("ri.ar(I)Lri;")
    public class448 method7809() {
        return this.field4845;
    }

    @ObfuscatedName("ri.al(Ljava/lang/String;I)V")
    public void method7820(String arg0) {
        this.field4846 = true;
        this.field4843 = arg0;
    }

    @ObfuscatedName("ri.ac(I)Z")
    public abstract boolean method7804();
}
