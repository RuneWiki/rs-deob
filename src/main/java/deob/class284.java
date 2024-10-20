package deob;

@ObfuscatedName("jc")
public class class284 implements Comparable {

    @ObfuscatedName("jc.s")
    public class293 field3613;

    @ObfuscatedName("jc.t")
    public class293 field3612;

    @ObfuscatedName("jc.ae(I)Lku;")
    public class293 method4757() {
        return this.field3613;
    }

    @ObfuscatedName("jc.ap(I)Ljava/lang/String;")
    public String method4759() {
        return this.field3613 == null ? "" : this.field3613.method4889();
    }

    @ObfuscatedName("jc.au(I)Ljava/lang/String;")
    public String method4766() {
        return this.field3612 == null ? "" : this.field3612.method4889();
    }

    @ObfuscatedName("jc.aa(Lku;Lku;I)V")
    public void method4761(class293 arg0, class293 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3613 = arg0;
        this.field3612 = arg1;
    }

    @ObfuscatedName("jc.ar(Ljc;I)I")
    public int method4762(class284 arg0) {
        return this.field3613.method4890(arg0.field3613);
    }

    public int compareTo(Object arg0) {
        return this.method4762((class284) arg0);
    }
}
