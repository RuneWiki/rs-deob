package deob;

@ObfuscatedName("lm")
public class class324 implements Comparable {

    @ObfuscatedName("lm.v")
    public class406 field3853;

    @ObfuscatedName("lm.j")
    public class406 field3852;

    @ObfuscatedName("lm.ae(I)Loh;")
    public class406 method5204() {
        return this.field3853;
    }

    @ObfuscatedName("lm.an(B)Ljava/lang/String;")
    public String method5198() {
        return this.field3853 == null ? "" : this.field3853.method6520();
    }

    @ObfuscatedName("lm.am(B)Ljava/lang/String;")
    public String method5199() {
        return this.field3852 == null ? "" : this.field3852.method6520();
    }

    @ObfuscatedName("lm.al(Loh;Loh;B)V")
    public void method5200(class406 arg0, class406 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3853 = arg0;
        this.field3852 = arg1;
    }

    @ObfuscatedName("lm.t(Llm;I)I")
    public int method5167(class324 arg0) {
        return this.field3853.method6523(arg0.field3853);
    }

    public int compareTo(Object arg0) {
        return this.method5167((class324) arg0);
    }
}
