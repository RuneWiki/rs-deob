package deob;

@ObfuscatedName("ne")
public class class371 implements Comparable {

    @ObfuscatedName("ne.q")
    public class464 field4307;

    @ObfuscatedName("ne.f")
    public class464 field4308;

    @ObfuscatedName("ne.ac(B)Lqa;")
    public class464 method6075() {
        return this.field4307;
    }

    @ObfuscatedName("ne.ae(B)Ljava/lang/String;")
    public String method6076() {
        return this.field4307 == null ? "" : this.field4307.method7617();
    }

    @ObfuscatedName("ne.aj(B)Ljava/lang/String;")
    public String method6077() {
        return this.field4308 == null ? "" : this.field4308.method7617();
    }

    @ObfuscatedName("ne.am(Lqa;Lqa;I)V")
    public void method6078(class464 arg0, class464 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4307 = arg0;
        this.field4308 = arg1;
    }

    @ObfuscatedName("ne.v(Lne;B)I")
    public int method6033(class371 arg0) {
        return this.field4307.method7621(arg0.field4307);
    }

    public int compareTo(Object arg0) {
        return this.method6033((class371) arg0);
    }
}
