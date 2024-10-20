package deob;

@ObfuscatedName("pw")
public class class408 implements Comparable {

    @ObfuscatedName("pw.aw")
    public class513 field4581;

    @ObfuscatedName("pw.ac")
    public class513 field4579;

    @ObfuscatedName("pw.be(I)Ltm;")
    public class513 method7167() {
        return this.field4581;
    }

    @ObfuscatedName("pw.bk(I)Ljava/lang/String;")
    public String method7168() {
        return this.field4581 == null ? "" : this.field4581.method8841();
    }

    @ObfuscatedName("pw.bx(I)Ljava/lang/String;")
    public String method7169() {
        return this.field4579 == null ? "" : this.field4579.method8841();
    }

    @ObfuscatedName("pw.bo(Ltm;Ltm;B)V")
    public void method7170(class513 arg0, class513 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4581 = arg0;
        this.field4579 = arg1;
    }

    @ObfuscatedName("pw.an(Lpw;I)I")
    public int method7139(class408 arg0) {
        return this.field4581.method8845(arg0.field4581);
    }

    public int compareTo(Object arg0) {
        return this.method7139((class408) arg0);
    }
}
