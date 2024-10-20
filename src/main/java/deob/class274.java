package deob;

@ObfuscatedName("jg")
public class class274 implements Comparable {

    @ObfuscatedName("jg.n")
    public class283 field3582;

    @ObfuscatedName("jg.q")
    public class283 field3581;

    @ObfuscatedName("jg.u(B)Lju;")
    public class283 method4737() {
        return this.field3582;
    }

    @ObfuscatedName("jg.ad(I)Ljava/lang/String;")
    public String method4713() {
        return this.field3582 == null ? "" : this.field3582.method4851();
    }

    @ObfuscatedName("jg.ag(B)Ljava/lang/String;")
    public String method4714() {
        return this.field3581 == null ? "" : this.field3581.method4851();
    }

    @ObfuscatedName("jg.ak(Lju;Lju;I)V")
    public void method4738(class283 arg0, class283 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3582 = arg0;
        this.field3581 = arg1;
    }

    @ObfuscatedName("jg.av(Ljg;I)I")
    public int method4715(class274 arg0) {
        return this.field3582.method4860(arg0.field3582);
    }

    public int compareTo(Object arg0) {
        return this.method4715((class274) arg0);
    }
}
