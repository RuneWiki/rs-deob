package deob;

@ObfuscatedName("ku")
public class class297 implements Comparable {

    @ObfuscatedName("ku.o")
    public class306 field3824;

    @ObfuscatedName("ku.j")
    public class306 field3823;

    @ObfuscatedName("ku.ai(I)Lko;")
    public class306 method4884() {
        return this.field3824;
    }

    @ObfuscatedName("ku.ab(I)Ljava/lang/String;")
    public String method4902() {
        return this.field3824 == null ? "" : this.field3824.method5038();
    }

    @ObfuscatedName("ku.ak(B)Ljava/lang/String;")
    public String method4886() {
        return this.field3823 == null ? "" : this.field3823.method5038();
    }

    @ObfuscatedName("ku.as(Lko;Lko;B)V")
    public void method4887(class306 arg0, class306 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3824 = arg0;
        this.field3823 = arg1;
    }

    @ObfuscatedName("ku.aa(Lku;B)I")
    public int method4888(class297 arg0) {
        return this.field3824.method5043(arg0.field3824);
    }

    public int compareTo(Object arg0) {
        return this.method4888((class297) arg0);
    }
}
