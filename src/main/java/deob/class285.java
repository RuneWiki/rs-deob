package deob;

@ObfuscatedName("jb")
public class class285 implements Comparable {

    @ObfuscatedName("jb.w")
    public class294 field3684;

    @ObfuscatedName("jb.s")
    public class294 field3685;

    @ObfuscatedName("jb.af(I)Lka;")
    public class294 method5002() {
        return this.field3684;
    }

    @ObfuscatedName("jb.az(B)Ljava/lang/String;")
    public String method4992() {
        return this.field3684 == null ? "" : this.field3684.method5130();
    }

    @ObfuscatedName("jb.at(I)Ljava/lang/String;")
    public String method4991() {
        return this.field3685 == null ? "" : this.field3685.method5130();
    }

    @ObfuscatedName("jb.ac(Lka;Lka;I)V")
    public void method5006(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3684 = arg0;
        this.field3685 = arg1;
    }

    @ObfuscatedName("jb.am(Ljb;I)I")
    public int method4995(class285 arg0) {
        return this.field3684.method5149(arg0.field3684);
    }

    public int compareTo(Object arg0) {
        return this.method4995((class285) arg0);
    }
}
