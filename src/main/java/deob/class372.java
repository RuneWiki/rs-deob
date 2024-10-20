package deob;

@ObfuscatedName("nb")
public class class372 implements Comparable {

    @ObfuscatedName("nb.l")
    public class461 field4323;

    @ObfuscatedName("nb.k")
    public class461 field4322;

    @ObfuscatedName("nb.j(B)Lqv;")
    public class461 method6011() {
        return this.field4323;
    }

    @ObfuscatedName("nb.z(I)Ljava/lang/String;")
    public String method5999() {
        return this.field4323 == null ? "" : this.field4323.method7492();
    }

    @ObfuscatedName("nb.i(I)Ljava/lang/String;")
    public String method6000() {
        return this.field4322 == null ? "" : this.field4322.method7492();
    }

    @ObfuscatedName("nb.u(Lqv;Lqv;I)V")
    public void method6001(class461 arg0, class461 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4323 = arg0;
        this.field4322 = arg1;
    }

    @ObfuscatedName("nb.q(Lnb;I)I")
    public int method5974(class372 arg0) {
        return this.field4323.method7497(arg0.field4323);
    }

    public int compareTo(Object arg0) {
        return this.method5974((class372) arg0);
    }
}
