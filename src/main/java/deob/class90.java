package deob;

@ObfuscatedName("cw")
public final class class90 extends class430 {

    @ObfuscatedName("cw.a")
    public int field1123;

    @ObfuscatedName("cw.f")
    public int field1122;

    @ObfuscatedName("cw.c")
    public int field1129;

    @ObfuscatedName("cw.x")
    public int field1124;

    @ObfuscatedName("cw.h")
    public int field1125;

    @ObfuscatedName("cw.j")
    public int field1126;

    @ObfuscatedName("cw.y")
    public int field1127;

    @ObfuscatedName("cw.d")
    public int field1128;

    @ObfuscatedName("cw.n")
    public int field1121;

    @ObfuscatedName("cw.r")
    public int field1130;

    @ObfuscatedName("cw.s")
    public int field1131 = 31;

    @ObfuscatedName("cw.p")
    public int field1136 = 0;

    @ObfuscatedName("cw.b")
    public int field1133 = -1;

    @ObfuscatedName("cw.a(IB)V")
    public void method2214(int arg0) {
        this.field1131 = arg0;
    }

    @ObfuscatedName("cw.f(IB)Z")
    public boolean method2215(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1131 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
