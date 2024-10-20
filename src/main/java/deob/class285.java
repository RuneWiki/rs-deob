package deob;

@ObfuscatedName("ju")
public class class285 implements Comparable {

    @ObfuscatedName("ju.x")
    public class294 field3629;

    @ObfuscatedName("ju.w")
    public class294 field3628;

    @ObfuscatedName("ju.an(I)Lki;")
    public class294 method4699() {
        return this.field3629;
    }

    @ObfuscatedName("ju.aj(S)Ljava/lang/String;")
    public String method4686() {
        return this.field3629 == null ? "" : this.field3629.method4821();
    }

    @ObfuscatedName("ju.ax(I)Ljava/lang/String;")
    public String method4687() {
        return this.field3628 == null ? "" : this.field3628.method4821();
    }

    @ObfuscatedName("ju.ag(Lki;Lki;I)V")
    public void method4694(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3629 = arg0;
        this.field3628 = arg1;
    }

    @ObfuscatedName("ju.au(Lju;I)I")
    public int method4703(class285 arg0) {
        return this.field3629.method4830(arg0.field3629);
    }

    public int compareTo(Object arg0) {
        return this.method4703((class285) arg0);
    }
}
