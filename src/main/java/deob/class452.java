package deob;

@ObfuscatedName("ru")
public class class452 extends class449 {

    @ObfuscatedName("ru.am")
    public int field4738;

    @ObfuscatedName("ru.am(Lru;I)I")
    public int method7643(class452 arg0) {
        return this.field4738 - arg0.field4738;
    }

    @ObfuscatedName("ru.ap(Lrq;B)I")
    public int method7509(class449 arg0) {
        return this.method7643((class452) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7643((class452) arg0);
    }
}
