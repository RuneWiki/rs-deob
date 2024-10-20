package deob;

@ObfuscatedName("jh")
public class class285 implements Comparable {

    @ObfuscatedName("jh.l")
    public class294 field3620;

    @ObfuscatedName("jh.m")
    public class294 field3619;

    @ObfuscatedName("jh.ab(I)Lkm;")
    public class294 method4780() {
        return this.field3620;
    }

    @ObfuscatedName("jh.ac(I)Ljava/lang/String;")
    public String method4768() {
        return this.field3620 == null ? "" : this.field3620.method4912();
    }

    @ObfuscatedName("jh.ao(I)Ljava/lang/String;")
    public String method4769() {
        return this.field3619 == null ? "" : this.field3619.method4912();
    }

    @ObfuscatedName("jh.af(Lkm;Lkm;I)V")
    public void method4770(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3620 = arg0;
        this.field3619 = arg1;
    }

    @ObfuscatedName("jh.av(Ljh;B)I")
    public int method4771(class285 arg0) {
        return this.field3620.method4904(arg0.field3620);
    }

    public int compareTo(Object arg0) {
        return this.method4771((class285) arg0);
    }
}
