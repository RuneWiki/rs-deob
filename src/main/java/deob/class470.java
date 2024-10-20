package deob;

@ObfuscatedName("sg")
public class class470 implements Comparable {

    @ObfuscatedName("sg.aj")
    public class568 field4922;

    @ObfuscatedName("sg.az")
    public class568 field4921;

    @ObfuscatedName("sg.bt(B)Lvv;")
    public class568 method7890() {
        return this.field4922;
    }

    @ObfuscatedName("sg.bn(I)Ljava/lang/String;")
    public String method7884() {
        return this.field4922 == null ? "" : this.field4922.method9385();
    }

    @ObfuscatedName("sg.bw(B)Ljava/lang/String;")
    public String method7881() {
        return this.field4921 == null ? "" : this.field4921.method9385();
    }

    @ObfuscatedName("sg.bl(Lvv;Lvv;B)V")
    public void method7882(class568 arg0, class568 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4922 = arg0;
        this.field4921 = arg1;
    }

    @ObfuscatedName("sg.al(Lsg;I)I")
    public int method7852(class470 arg0) {
        return this.field4922.method9400(arg0.field4922);
    }

    public int compareTo(Object arg0) {
        return this.method7852((class470) arg0);
    }
}
