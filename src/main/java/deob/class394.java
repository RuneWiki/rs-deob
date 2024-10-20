package deob;

@ObfuscatedName("oh")
public class class394 extends class391 {

    @ObfuscatedName("oh.a")
    public int field4493;

    @ObfuscatedName("oh.a(Loh;B)I")
    public int method6830(class394 arg0) {
        return this.field4493 - arg0.field4493;
    }

    @ObfuscatedName("oh.f(Loj;I)I")
    public int method6692(class391 arg0) {
        return this.method6830((class394) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6830((class394) arg0);
    }
}
