package deob;

@ObfuscatedName("nc")
public class class373 implements Comparable {

    @ObfuscatedName("nc.f")
    public class466 field4351;

    @ObfuscatedName("nc.n")
    public class466 field4352;

    @ObfuscatedName("nc.z(I)Lqo;")
    public class466 method6224() {
        return this.field4351;
    }

    @ObfuscatedName("nc.o(B)Ljava/lang/String;")
    public String method6231() {
        return this.field4351 == null ? "" : this.field4351.method7774();
    }

    @ObfuscatedName("nc.as(B)Ljava/lang/String;")
    public String method6234() {
        return this.field4352 == null ? "" : this.field4352.method7774();
    }

    @ObfuscatedName("nc.ac(Lqo;Lqo;I)V")
    public void method6226(class466 arg0, class466 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4351 = arg0;
        this.field4352 = arg1;
    }

    @ObfuscatedName("nc.p(Lnc;I)I")
    public int method6198(class373 arg0) {
        return this.field4351.method7777(arg0.field4351);
    }

    public int compareTo(Object arg0) {
        return this.method6198((class373) arg0);
    }
}
