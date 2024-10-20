package deob;

@ObfuscatedName("jr")
public class class285 implements Comparable {

    @ObfuscatedName("jr.e")
    public class294 field3693;

    @ObfuscatedName("jr.q")
    public class294 field3694;

    @ObfuscatedName("jr.o(B)Lkg;")
    public class294 method5128() {
        return this.field3693;
    }

    @ObfuscatedName("jr.af(I)Ljava/lang/String;")
    public String method5134() {
        return this.field3693 == null ? "" : this.field3693.method5269();
    }

    @ObfuscatedName("jr.an(I)Ljava/lang/String;")
    public String method5130() {
        return this.field3694 == null ? "" : this.field3694.method5269();
    }

    @ObfuscatedName("jr.ax(Lkg;Lkg;B)V")
    public void method5131(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3693 = arg0;
        this.field3694 = arg1;
    }

    @ObfuscatedName("jr.aw(Ljr;I)I")
    public int method5132(class285 arg0) {
        return this.field3693.method5273(arg0.field3693);
    }

    public int compareTo(Object arg0) {
        return this.method5132((class285) arg0);
    }
}
