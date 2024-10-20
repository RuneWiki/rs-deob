package deob;

@ObfuscatedName("la")
public class class338 implements Comparable {

    @ObfuscatedName("la.s")
    public class422 field3953;

    @ObfuscatedName("la.a")
    public class422 field3952;

    @ObfuscatedName("la.ae(I)Lpb;")
    public class422 method5471() {
        return this.field3953;
    }

    @ObfuscatedName("la.aq(I)Ljava/lang/String;")
    public String method5470() {
        return this.field3953 == null ? "" : this.field3953.method6813();
    }

    @ObfuscatedName("la.al(B)Ljava/lang/String;")
    public String method5478() {
        return this.field3952 == null ? "" : this.field3952.method6813();
    }

    @ObfuscatedName("la.am(Lpb;Lpb;I)V")
    public void method5472(class422 arg0, class422 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3953 = arg0;
        this.field3952 = arg1;
    }

    @ObfuscatedName("la.w(Lla;I)I")
    public int method5447(class338 arg0) {
        return this.field3953.method6815(arg0.field3953);
    }

    public int compareTo(Object arg0) {
        return this.method5447((class338) arg0);
    }
}
