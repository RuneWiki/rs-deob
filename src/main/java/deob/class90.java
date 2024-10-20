package deob;

@ObfuscatedName("ct")
public final class class90 extends class440 {

    @ObfuscatedName("ct.f")
    public int field1156;

    @ObfuscatedName("ct.w")
    public int field1145;

    @ObfuscatedName("ct.v")
    public int field1146;

    @ObfuscatedName("ct.s")
    public int field1147;

    @ObfuscatedName("ct.z")
    public int field1148;

    @ObfuscatedName("ct.j")
    public int field1149;

    @ObfuscatedName("ct.i")
    public int field1150;

    @ObfuscatedName("ct.n")
    public int field1151;

    @ObfuscatedName("ct.l")
    public int field1152;

    @ObfuscatedName("ct.k")
    public int field1153;

    @ObfuscatedName("ct.r")
    public int field1154 = 31;

    @ObfuscatedName("ct.b")
    public int field1155 = 0;

    @ObfuscatedName("ct.m")
    public int field1144 = -1;

    @ObfuscatedName("ct.f(II)V")
    public void method2302(int arg0) {
        this.field1154 = arg0;
    }

    @ObfuscatedName("ct.w(II)Z")
    public boolean method2303(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1154 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
