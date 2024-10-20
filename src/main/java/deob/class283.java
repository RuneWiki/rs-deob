package deob;

@ObfuscatedName("jx")
public class class283 implements Comparable {

    @ObfuscatedName("jx.s")
    public class292 field3611;

    @ObfuscatedName("jx.l")
    public class292 field3612;

    @ObfuscatedName("jx.ab(I)Lkm;")
    public class292 method4893() {
        return this.field3611;
    }

    @ObfuscatedName("jx.aw(B)Ljava/lang/String;")
    public String method4894() {
        return this.field3611 == null ? "" : this.field3611.method5033();
    }

    @ObfuscatedName("jx.ak(B)Ljava/lang/String;")
    public String method4895() {
        return this.field3612 == null ? "" : this.field3612.method5033();
    }

    @ObfuscatedName("jx.as(Lkm;Lkm;I)V")
    public void method4896(class292 arg0, class292 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3611 = arg0;
        this.field3612 = arg1;
    }

    @ObfuscatedName("jx.an(Ljx;B)I")
    public int method4901(class283 arg0) {
        return this.field3611.method5021(arg0.field3611);
    }

    public int compareTo(Object arg0) {
        return this.method4901((class283) arg0);
    }
}
