package deob;

@ObfuscatedName("dw")
public final class class97 extends class488 {

    @ObfuscatedName("dw.ac")
    public int field1175;

    @ObfuscatedName("dw.al")
    public int field1172;

    @ObfuscatedName("dw.ak")
    public int field1176;

    @ObfuscatedName("dw.ax")
    public int field1173;

    @ObfuscatedName("dw.ao")
    public int field1180;

    @ObfuscatedName("dw.ah")
    public int field1179;

    @ObfuscatedName("dw.ar")
    public int field1177;

    @ObfuscatedName("dw.ab")
    public int field1178;

    @ObfuscatedName("dw.am")
    public int field1171;

    @ObfuscatedName("dw.av")
    public int field1174;

    @ObfuscatedName("dw.ag")
    public int field1181;

    @ObfuscatedName("dw.ap")
    public int field1182 = 31;

    @ObfuscatedName("dw.ay")
    public int field1183 = 0;

    @ObfuscatedName("dw.as")
    public int field1184 = -1;

    @ObfuscatedName("dw.ac(II)V")
    public void method2300(int arg0) {
        this.field1182 = arg0;
    }

    @ObfuscatedName("dw.al(II)Z")
    public boolean method2302(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1182 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
