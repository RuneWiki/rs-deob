package deob;

@ObfuscatedName("jf")
public class class284 implements Comparable {

    @ObfuscatedName("jf.q")
    public class293 field3626;

    @ObfuscatedName("jf.j")
    public class293 field3625;

    @ObfuscatedName("jf.e(I)Lkq;")
    public class293 method4796() {
        return this.field3626;
    }

    @ObfuscatedName("jf.l(B)Ljava/lang/String;")
    public String method4777() {
        return this.field3626 == null ? "" : this.field3626.method4925();
    }

    @ObfuscatedName("jf.t(I)Ljava/lang/String;")
    public String method4772() {
        return this.field3625 == null ? "" : this.field3625.method4925();
    }

    @ObfuscatedName("jf.x(Lkq;Lkq;I)V")
    public void method4774(class293 arg0, class293 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3626 = arg0;
        this.field3625 = arg1;
    }

    @ObfuscatedName("jf.ah(Ljf;I)I")
    public int method4773(class284 arg0) {
        return this.field3626.method4927(arg0.field3626);
    }

    public int compareTo(Object arg0) {
        return this.method4773((class284) arg0);
    }
}
