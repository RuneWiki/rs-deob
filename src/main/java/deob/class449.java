package deob;

@ObfuscatedName("rq")
public class class449 implements Comparable {

    @ObfuscatedName("rq.af")
    public class554 field4729;

    @ObfuscatedName("rq.aj")
    public class554 field4728;

    @ObfuscatedName("rq.bt(I)Lvs;")
    public class554 method7544() {
        return this.field4729;
    }

    @ObfuscatedName("rq.br(I)Ljava/lang/String;")
    public String method7545() {
        return this.field4729 == null ? "" : this.field4729.method9164();
    }

    @ObfuscatedName("rq.ba(B)Ljava/lang/String;")
    public String method7546() {
        return this.field4728 == null ? "" : this.field4728.method9164();
    }

    @ObfuscatedName("rq.bk(Lvs;Lvs;S)V")
    public void method7548(class554 arg0, class554 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4729 = arg0;
        this.field4728 = arg1;
    }

    @ObfuscatedName("rq.ap(Lrq;B)I")
    public int method7509(class449 arg0) {
        return this.field4729.method9159(arg0.field4729);
    }

    public int compareTo(Object arg0) {
        return this.method7509((class449) arg0);
    }
}
