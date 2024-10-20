package deob;

@ObfuscatedName("mv")
public class class350 implements Comparable {

    @ObfuscatedName("mv.p")
    public class440 field4106;

    @ObfuscatedName("mv.m")
    public class440 field4104;

    @ObfuscatedName("mv.ax(I)Lpo;")
    public class440 method5770() {
        return this.field4106;
    }

    @ObfuscatedName("mv.am(I)Ljava/lang/String;")
    public String method5774() {
        return this.field4106 == null ? "" : this.field4106.method7187();
    }

    @ObfuscatedName("mv.az(I)Ljava/lang/String;")
    public String method5769() {
        return this.field4104 == null ? "" : this.field4104.method7187();
    }

    @ObfuscatedName("mv.au(Lpo;Lpo;I)V")
    public void method5772(class440 arg0, class440 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4106 = arg0;
        this.field4104 = arg1;
    }

    @ObfuscatedName("mv.b(Lmv;I)I")
    public int method5718(class350 arg0) {
        return this.field4106.method7190(arg0.field4106);
    }

    public int compareTo(Object arg0) {
        return this.method5718((class350) arg0);
    }
}
