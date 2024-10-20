package deob;

@ObfuscatedName("lu")
public class class338 implements Comparable {

    @ObfuscatedName("lu.f")
    public class422 field3960;

    @ObfuscatedName("lu.j")
    public class422 field3959;

    @ObfuscatedName("lu.r(I)Lpm;")
    public class422 method5508() {
        return this.field3960;
    }

    @ObfuscatedName("lu.n(I)Ljava/lang/String;")
    public String method5512() {
        return this.field3960 == null ? "" : this.field3960.method6815();
    }

    @ObfuscatedName("lu.u(I)Ljava/lang/String;")
    public String method5510() {
        return this.field3959 == null ? "" : this.field3959.method6815();
    }

    @ObfuscatedName("lu.d(Lpm;Lpm;I)V")
    public void method5511(class422 arg0, class422 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3960 = arg0;
        this.field3959 = arg1;
    }

    @ObfuscatedName("lu.q(Llu;B)I")
    public int method5482(class338 arg0) {
        return this.field3960.method6829(arg0.field3960);
    }

    public int compareTo(Object arg0) {
        return this.method5482((class338) arg0);
    }
}
