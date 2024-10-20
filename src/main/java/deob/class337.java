package deob;

@ObfuscatedName("le")
public class class337 implements Comparable {

    @ObfuscatedName("le.m")
    public class421 field3948;

    @ObfuscatedName("le.k")
    public class421 field3947;

    @ObfuscatedName("le.aw(B)Lpp;")
    public class421 method5455() {
        return this.field3948;
    }

    @ObfuscatedName("le.at(B)Ljava/lang/String;")
    public String method5465() {
        return this.field3948 == null ? "" : this.field3948.method6800();
    }

    @ObfuscatedName("le.as(B)Ljava/lang/String;")
    public String method5457() {
        return this.field3947 == null ? "" : this.field3947.method6800();
    }

    @ObfuscatedName("le.ae(Lpp;Lpp;I)V")
    public void method5458(class421 arg0, class421 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3948 = arg0;
        this.field3947 = arg1;
    }

    @ObfuscatedName("le.c(Lle;I)I")
    public int method5424(class337 arg0) {
        return this.field3948.method6784(arg0.field3948);
    }

    public int compareTo(Object arg0) {
        return this.method5424((class337) arg0);
    }
}
