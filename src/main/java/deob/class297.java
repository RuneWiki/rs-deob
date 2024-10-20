package deob;

@ObfuscatedName("km")
public class class297 implements Comparable {

    @ObfuscatedName("km.n")
    public class306 field3824;

    @ObfuscatedName("km.r")
    public class306 field3825;

    @ObfuscatedName("km.ap(B)Lko;")
    public class306 method4975() {
        return this.field3824;
    }

    @ObfuscatedName("km.ac(I)Ljava/lang/String;")
    public String method4958() {
        return this.field3824 == null ? "" : this.field3824.method5095();
    }

    @ObfuscatedName("km.aw(I)Ljava/lang/String;")
    public String method4959() {
        return this.field3825 == null ? "" : this.field3825.method5095();
    }

    @ObfuscatedName("km.as(Lko;Lko;I)V")
    public void method4957(class306 arg0, class306 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3824 = arg0;
        this.field3825 = arg1;
    }

    @ObfuscatedName("km.au(Lkm;I)I")
    public int method4960(class297 arg0) {
        return this.field3824.method5099(arg0.field3824);
    }

    public int compareTo(Object arg0) {
        return this.method4960((class297) arg0);
    }
}
