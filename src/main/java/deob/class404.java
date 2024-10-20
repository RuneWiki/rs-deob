package deob;

@ObfuscatedName("pb")
public class class404 implements Comparable {

    @ObfuscatedName("pb.ac")
    public class501 field4523;

    @ObfuscatedName("pb.ab")
    public class501 field4520;

    @ObfuscatedName("pb.bv(S)Ltj;")
    public class501 method6921() {
        return this.field4523;
    }

    @ObfuscatedName("pb.bo(I)Ljava/lang/String;")
    public String method6922() {
        return this.field4523 == null ? "" : this.field4523.method8490();
    }

    @ObfuscatedName("pb.bs(I)Ljava/lang/String;")
    public String method6923() {
        return this.field4520 == null ? "" : this.field4520.method8490();
    }

    @ObfuscatedName("pb.bg(Ltj;Ltj;S)V")
    public void method6935(class501 arg0, class501 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4523 = arg0;
        this.field4520 = arg1;
    }

    @ObfuscatedName("pb.al(Lpb;I)I")
    public int method6896(class404 arg0) {
        return this.field4523.method8502(arg0.field4523);
    }

    public int compareTo(Object arg0) {
        return this.method6896((class404) arg0);
    }
}
