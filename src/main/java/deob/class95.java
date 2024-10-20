package deob;

@ObfuscatedName("dp")
public final class class95 extends class485 {

    @ObfuscatedName("dp.at")
    public int field1165;

    @ObfuscatedName("dp.ah")
    public int field1154;

    @ObfuscatedName("dp.ar")
    public int field1155;

    @ObfuscatedName("dp.ao")
    public int field1156;

    @ObfuscatedName("dp.ab")
    public int field1157;

    @ObfuscatedName("dp.au")
    public int field1158;

    @ObfuscatedName("dp.aa")
    public int field1159;

    @ObfuscatedName("dp.ac")
    public int field1163;

    @ObfuscatedName("dp.al")
    public int field1161;

    @ObfuscatedName("dp.az")
    public int field1162;

    @ObfuscatedName("dp.ap")
    public int field1153;

    @ObfuscatedName("dp.ax")
    public int field1160 = 31;

    @ObfuscatedName("dp.as")
    public int field1164 = 0;

    @ObfuscatedName("dp.ay")
    public int field1166 = -1;

    @ObfuscatedName("dp.at(II)V")
    public void method2328(int arg0) {
        this.field1160 = arg0;
    }

    @ObfuscatedName("dp.ah(IS)Z")
    public boolean method2330(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1160 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
