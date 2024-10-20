package deob;

@ObfuscatedName("jb")
public class class278 extends class274 {

    @ObfuscatedName("jb.s")
    public int field3586;

    @ObfuscatedName("jb.s(Ljb;I)I")
    public int method4740(class278 arg0) {
        return this.field3586 - arg0.field3586;
    }

    @ObfuscatedName("jb.ai(Lju;B)I")
    public int method4637(class274 arg0) {
        return this.method4740((class278) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4740((class278) arg0);
    }
}
