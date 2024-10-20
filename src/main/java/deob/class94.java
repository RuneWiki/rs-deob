package deob;

@ObfuscatedName("dv")
public final class class94 extends class461 {

    @ObfuscatedName("dv.at")
    public int field1139;

    @ObfuscatedName("dv.an")
    public int field1135;

    @ObfuscatedName("dv.av")
    public int field1136;

    @ObfuscatedName("dv.as")
    public int field1146;

    @ObfuscatedName("dv.ax")
    public int field1138;

    @ObfuscatedName("dv.ap")
    public int field1141;

    @ObfuscatedName("dv.ab")
    public int field1134;

    @ObfuscatedName("dv.ak")
    public int field1149;

    @ObfuscatedName("dv.ae")
    public int field1142;

    @ObfuscatedName("dv.af")
    public int field1143;

    @ObfuscatedName("dv.ao")
    public int field1144;

    @ObfuscatedName("dv.aj")
    public int field1145 = 31;

    @ObfuscatedName("dv.ad")
    public int field1147 = 0;

    @ObfuscatedName("dv.ac")
    public int field1148 = -1;

    @ObfuscatedName("dv.at(II)V")
    public void method2233(int arg0) {
        this.field1145 = arg0;
    }

    @ObfuscatedName("dv.an(II)Z")
    public boolean method2238(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1145 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
