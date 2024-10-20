package deob;

@ObfuscatedName("rf")
public class class445 implements Comparable {

    @ObfuscatedName("rf.ar")
    public class550 field4688;

    @ObfuscatedName("rf.ao")
    public class550 field4689;

    @ObfuscatedName("rf.be(I)Lvj;")
    public class550 method7428() {
        return this.field4688;
    }

    @ObfuscatedName("rf.bd(I)Ljava/lang/String;")
    public String method7414() {
        return this.field4688 == null ? "" : this.field4688.method9073();
    }

    @ObfuscatedName("rf.bl(I)Ljava/lang/String;")
    public String method7415() {
        return this.field4689 == null ? "" : this.field4689.method9073();
    }

    @ObfuscatedName("rf.bi(Lvj;Lvj;B)V")
    public void method7416(class550 arg0, class550 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4688 = arg0;
        this.field4689 = arg1;
    }

    @ObfuscatedName("rf.ah(Lrf;B)I")
    public int method7381(class445 arg0) {
        return this.field4688.method9089(arg0.field4688);
    }

    public int compareTo(Object arg0) {
        return this.method7381((class445) arg0);
    }
}
