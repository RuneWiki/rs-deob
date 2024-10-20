package deob;

@ObfuscatedName("kg")
public class class297 implements Comparable {

    @ObfuscatedName("kg.b")
    public class306 field3832;

    @ObfuscatedName("kg.z")
    public class306 field3833;

    @ObfuscatedName("kg.ax(I)Lkb;")
    public class306 method4928() {
        return this.field3832;
    }

    @ObfuscatedName("kg.ai(I)Ljava/lang/String;")
    public String method4929() {
        return this.field3832 == null ? "" : this.field3832.method5060();
    }

    @ObfuscatedName("kg.aj(B)Ljava/lang/String;")
    public String method4938() {
        return this.field3833 == null ? "" : this.field3833.method5060();
    }

    @ObfuscatedName("kg.ac(Lkb;Lkb;I)V")
    public void method4931(class306 arg0, class306 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3832 = arg0;
        this.field3833 = arg1;
    }

    @ObfuscatedName("kg.ag(Lkg;I)I")
    public int method4932(class297 arg0) {
        return this.field3832.method5062(arg0.field3832);
    }

    public int compareTo(Object arg0) {
        return this.method4932((class297) arg0);
    }
}
