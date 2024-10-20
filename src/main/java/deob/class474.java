package deob;

@ObfuscatedName("ss")
public class class474 implements Comparable {

    @ObfuscatedName("ss.ag")
    public class574 field4984;

    @ObfuscatedName("ss.am")
    public class574 field4983;

    @ObfuscatedName("ss.bh(B)Lwf;")
    public class574 method8064() {
        return this.field4984;
    }

    @ObfuscatedName("ss.bd(I)Ljava/lang/String;")
    public String method8065() {
        return this.field4984 == null ? "" : this.field4984.method9621();
    }

    @ObfuscatedName("ss.bx(I)Ljava/lang/String;")
    public String method8066() {
        return this.field4983 == null ? "" : this.field4983.method9621();
    }

    @ObfuscatedName("ss.bf(Lwf;Lwf;B)V")
    public void method8067(class574 arg0, class574 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4984 = arg0;
        this.field4983 = arg1;
    }

    @ObfuscatedName("ss.ae(Lss;S)I")
    public int method8037(class474 arg0) {
        return this.field4984.method9625(arg0.field4984);
    }

    public int compareTo(Object arg0) {
        return this.method8037((class474) arg0);
    }
}
