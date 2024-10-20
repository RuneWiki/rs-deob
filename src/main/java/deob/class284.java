package deob;

@ObfuscatedName("jd")
public class class284 implements Comparable {

    @ObfuscatedName("jd.k")
    public class293 field3591;

    @ObfuscatedName("jd.d")
    public class293 field3592;

    @ObfuscatedName("jd.ar(I)Lku;")
    public class293 method4696() {
        return this.field3591;
    }

    @ObfuscatedName("jd.af(I)Ljava/lang/String;")
    public String method4711() {
        return this.field3591 == null ? "" : this.field3591.method4845();
    }

    @ObfuscatedName("jd.at(I)Ljava/lang/String;")
    public String method4698() {
        return this.field3592 == null ? "" : this.field3592.method4845();
    }

    @ObfuscatedName("jd.as(Lku;Lku;S)V")
    public void method4707(class293 arg0, class293 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3591 = arg0;
        this.field3592 = arg1;
    }

    @ObfuscatedName("jd.am(Ljd;I)I")
    public int method4699(class284 arg0) {
        return this.field3591.method4847(arg0.field3591);
    }

    public int compareTo(Object arg0) {
        return this.method4699((class284) arg0);
    }
}
