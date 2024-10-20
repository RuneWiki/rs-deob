package deob;

@ObfuscatedName("qm")
public class class421 implements Comparable {

    @ObfuscatedName("qm.av")
    public class525 field4599;

    @ObfuscatedName("qm.as")
    public class525 field4600;

    @ObfuscatedName("qm.ba(I)Lun;")
    public class525 method7150() {
        return this.field4599;
    }

    @ObfuscatedName("qm.bn(I)Ljava/lang/String;")
    public String method7151() {
        return this.field4599 == null ? "" : this.field4599.method8756();
    }

    @ObfuscatedName("qm.bb(I)Ljava/lang/String;")
    public String method7152() {
        return this.field4600 == null ? "" : this.field4600.method8756();
    }

    @ObfuscatedName("qm.bx(Lun;Lun;I)V")
    public void method7149(class525 arg0, class525 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4599 = arg0;
        this.field4600 = arg1;
    }

    @ObfuscatedName("qm.an(Lqm;I)I")
    public int method7110(class421 arg0) {
        return this.field4599.method8760(arg0.field4599);
    }

    public int compareTo(Object arg0) {
        return this.method7110((class421) arg0);
    }
}
