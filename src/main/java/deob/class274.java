package deob;

@ObfuscatedName("jh")
public class class274 implements Comparable {

    @ObfuscatedName("jh.v")
    public class283 field3579;

    @ObfuscatedName("jh.u")
    public class283 field3577;

    @ObfuscatedName("jh.s(I)Ljq;")
    public class283 method4570() {
        return this.field3579;
    }

    @ObfuscatedName("jh.f(I)Ljava/lang/String;")
    public String method4571() {
        return this.field3579 == null ? "" : this.field3579.method4712();
    }

    @ObfuscatedName("jh.j(B)Ljava/lang/String;")
    public String method4569() {
        return this.field3577 == null ? "" : this.field3577.method4712();
    }

    @ObfuscatedName("jh.d(Ljq;Ljq;I)V")
    public void method4573(class283 arg0, class283 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3579 = arg0;
        this.field3577 = arg1;
    }

    @ObfuscatedName("jh.l(Ljh;I)I")
    public int method4578(class274 arg0) {
        return this.field3579.method4700(arg0.field3579);
    }

    public int compareTo(Object arg0) {
        return this.method4578((class274) arg0);
    }
}
