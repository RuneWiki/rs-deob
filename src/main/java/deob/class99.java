package deob;

@ObfuscatedName("dr")
public final class class99 extends class508 {

    @ObfuscatedName("dr.ac")
    public int field1209;

    @ObfuscatedName("dr.ae")
    public int field1207;

    @ObfuscatedName("dr.ag")
    public int field1208;

    @ObfuscatedName("dr.am")
    public int field1223;

    @ObfuscatedName("dr.ax")
    public int field1210;

    @ObfuscatedName("dr.aq")
    public int field1211;

    @ObfuscatedName("dr.af")
    public int field1212;

    @ObfuscatedName("dr.at")
    public int field1216;

    @ObfuscatedName("dr.au")
    public int field1213;

    @ObfuscatedName("dr.ar")
    public int field1215;

    @ObfuscatedName("dr.al")
    public int field1222;

    @ObfuscatedName("dr.ah")
    public int field1218 = 31;

    @ObfuscatedName("dr.ap")
    public int field1219 = 0;

    @ObfuscatedName("dr.ab")
    public int field1220 = -1;

    @ObfuscatedName("dr.ac(II)V")
    public void method2506(int arg0) {
        this.field1218 = arg0;
    }

    @ObfuscatedName("dr.ae(II)Z")
    public boolean method2507(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1218 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
