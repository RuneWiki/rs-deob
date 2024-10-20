package deob;

@ObfuscatedName("js")
public class class286 implements Comparable {

    @ObfuscatedName("js.q")
    public class295 field3683;

    @ObfuscatedName("js.w")
    public class295 field3684;

    @ObfuscatedName("js.p(I)Lkp;")
    public class295 method4997() {
        return this.field3683;
    }

    @ObfuscatedName("js.v(B)Ljava/lang/String;")
    public String method4992() {
        return this.field3683 == null ? "" : this.field3683.method5136();
    }

    @ObfuscatedName("js.ag(I)Ljava/lang/String;")
    public String method4993() {
        return this.field3684 == null ? "" : this.field3684.method5136();
    }

    @ObfuscatedName("js.aq(Lkp;Lkp;I)V")
    public void method4994(class295 arg0, class295 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3683 = arg0;
        this.field3684 = arg1;
    }

    @ObfuscatedName("js.aj(Ljs;I)I")
    public int method4991(class286 arg0) {
        return this.field3683.method5134(arg0.field3683);
    }

    public int compareTo(Object arg0) {
        return this.method4991((class286) arg0);
    }
}
