package deob;

@ObfuscatedName("jx")
public class class285 implements Comparable {

    @ObfuscatedName("jx.o")
    public class294 field3648;

    @ObfuscatedName("jx.k")
    public class294 field3646;

    @ObfuscatedName("jx.n(I)Lkk;")
    public class294 method4951() {
        return this.field3648;
    }

    @ObfuscatedName("jx.g(I)Ljava/lang/String;")
    public String method4952() {
        return this.field3648 == null ? "" : this.field3648.method5082();
    }

    @ObfuscatedName("jx.ab(I)Ljava/lang/String;")
    public String method4953() {
        return this.field3646 == null ? "" : this.field3646.method5082();
    }

    @ObfuscatedName("jx.ao(Lkk;Lkk;B)V")
    public void method4954(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3648 = arg0;
        this.field3646 = arg1;
    }

    @ObfuscatedName("jx.an(Ljx;I)I")
    public int method4955(class285 arg0) {
        return this.field3648.method5086(arg0.field3648);
    }

    public int compareTo(Object arg0) {
        return this.method4955((class285) arg0);
    }
}
