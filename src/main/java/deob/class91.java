package deob;

@ObfuscatedName("cm")
public final class class91 extends class433 {

    @ObfuscatedName("cm.h")
    public int field1165;

    @ObfuscatedName("cm.e")
    public int field1172;

    @ObfuscatedName("cm.v")
    public int field1161;

    @ObfuscatedName("cm.x")
    public int field1173;

    @ObfuscatedName("cm.m")
    public int field1164;

    @ObfuscatedName("cm.q")
    public int field1176;

    @ObfuscatedName("cm.f")
    public int field1167;

    @ObfuscatedName("cm.r")
    public int field1168;

    @ObfuscatedName("cm.u")
    public int field1169;

    @ObfuscatedName("cm.b")
    public int field1170;

    @ObfuscatedName("cm.g")
    public int field1166 = 31;

    @ObfuscatedName("cm.i")
    public int field1163 = 0;

    @ObfuscatedName("cm.o")
    public int field1174 = -1;

    @ObfuscatedName("cm.h(IB)V")
    public void method2213(int arg0) {
        this.field1166 = arg0;
    }

    @ObfuscatedName("cm.e(II)Z")
    public boolean method2216(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1166 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
