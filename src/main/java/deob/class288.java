package deob;

@ObfuscatedName("ke")
public class class288 implements Comparable {

    @ObfuscatedName("ke.l")
    public class297 field3682;

    @ObfuscatedName("ke.g")
    public class297 field3683;

    @ObfuscatedName("ke.s(B)Lku;")
    public class297 method5125() {
        return this.field3682;
    }

    @ObfuscatedName("ke.u(I)Ljava/lang/String;")
    public String method5126() {
        return this.field3682 == null ? "" : this.field3682.method5261();
    }

    @ObfuscatedName("ke.aa(I)Ljava/lang/String;")
    public String method5127() {
        return this.field3683 == null ? "" : this.field3683.method5261();
    }

    @ObfuscatedName("ke.ai(Lku;Lku;I)V")
    public void method5128(class297 arg0, class297 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3682 = arg0;
        this.field3683 = arg1;
    }

    @ObfuscatedName("ke.ag(Lke;B)I")
    public int method5140(class288 arg0) {
        return this.field3682.method5263(arg0.field3682);
    }

    public int compareTo(Object arg0) {
        return this.method5140((class288) arg0);
    }
}
