package deob;

@ObfuscatedName("ra")
public class class452 implements Comparable {

    @ObfuscatedName("ra.al")
    public class557 field4758;

    @ObfuscatedName("ra.ai")
    public class557 field4759;

    @ObfuscatedName("ra.ap(I)Lvn;")
    public class557 method7559() {
        return this.field4758;
    }

    @ObfuscatedName("ra.bu(I)Ljava/lang/String;")
    public String method7558() {
        return this.field4758 == null ? "" : this.field4758.method9185();
    }

    @ObfuscatedName("ra.bo(I)Ljava/lang/String;")
    public String method7561() {
        return this.field4759 == null ? "" : this.field4759.method9185();
    }

    @ObfuscatedName("ra.bd(Lvn;Lvn;B)V")
    public void method7562(class557 arg0, class557 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4758 = arg0;
        this.field4759 = arg1;
    }

    @ObfuscatedName("ra.aw(Lra;B)I")
    public int method7534(class452 arg0) {
        return this.field4758.method9190(arg0.field4758);
    }

    public int compareTo(Object arg0) {
        return this.method7534((class452) arg0);
    }
}
