package deob;

@ObfuscatedName("kk")
public class class288 extends class284 {

    @ObfuscatedName("kk.z")
    public int field3631;

    @ObfuscatedName("kk.z(Lkk;I)I")
    public int method4867(class288 arg0) {
        return this.field3631 - arg0.field3631;
    }

    @ObfuscatedName("kk.ar(Ljc;I)I")
    public int method4762(class284 arg0) {
        return this.method4867((class288) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4867((class288) arg0);
    }
}
