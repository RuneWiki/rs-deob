package deob;

@ObfuscatedName("kv")
public class class289 extends class285 {

    @ObfuscatedName("kv.v")
    public int field3660;

    @ObfuscatedName("kv.v(Lkv;B)I")
    public int method5064(class289 arg0) {
        return this.field3660 - arg0.field3660;
    }

    @ObfuscatedName("kv.an(Ljx;I)I")
    public int method4955(class285 arg0) {
        return this.method5064((class289) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5064((class289) arg0);
    }
}
