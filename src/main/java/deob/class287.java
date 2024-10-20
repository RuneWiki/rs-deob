package deob;

@ObfuscatedName("kx")
public class class287 extends class283 {

    @ObfuscatedName("kx.z")
    public int field3625;

    @ObfuscatedName("kx.z(Lkx;I)I")
    public int method5004(class287 arg0) {
        return this.field3625 - arg0.field3625;
    }

    @ObfuscatedName("kx.an(Ljx;B)I")
    public int method4901(class283 arg0) {
        return this.method5004((class287) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5004((class287) arg0);
    }
}
