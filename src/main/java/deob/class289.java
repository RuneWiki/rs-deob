package deob;

@ObfuscatedName("kp")
public class class289 extends class285 {

    @ObfuscatedName("kp.f")
    public int field3692;

    @ObfuscatedName("kp.f(Lkp;I)I")
    public int method5038(class289 arg0) {
        return this.field3692 - arg0.field3692;
    }

    @ObfuscatedName("kp.as(Ljw;S)I")
    public int method4932(class285 arg0) {
        return this.method5038((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5038((class289) arg0);
    }
}
