package deob;

@ObfuscatedName("kc")
public class class287 extends class283 {

    @ObfuscatedName("kc.b")
    public int field3717;

    @ObfuscatedName("kc.b(Lkc;I)I")
    public int method4908(class287 arg0) {
        return this.field3717 - arg0.field3717;
    }

    @ObfuscatedName("kc.af(Ljw;I)I")
    public int method4799(class283 arg0) {
        return this.method4908((class287) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4908((class287) arg0);
    }
}
