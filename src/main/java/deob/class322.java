package deob;

@ObfuscatedName("lx")
public class class322 implements Comparable {

    @ObfuscatedName("lx.f")
    public class328 field3837;

    @ObfuscatedName("lx.y")
    public class328 field3836;

    @ObfuscatedName("lx.ag(I)Lly;")
    public class328 method5229() {
        return this.field3837;
    }

    @ObfuscatedName("lx.ax(B)Ljava/lang/String;")
    public String method5227() {
        return this.field3837 == null ? "" : this.field3837.method5338();
    }

    @ObfuscatedName("lx.as(I)Ljava/lang/String;")
    public String method5228() {
        return this.field3836 == null ? "" : this.field3836.method5338();
    }

    @ObfuscatedName("lx.aj(Lly;Lly;I)V")
    public void method5231(class328 arg0, class328 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3837 = arg0;
        this.field3836 = arg1;
    }

    @ObfuscatedName("lx.n(Llx;I)I")
    public int method5188(class322 arg0) {
        return this.field3837.method5341(arg0.field3837);
    }

    public int compareTo(Object arg0) {
        return this.method5188((class322) arg0);
    }
}
