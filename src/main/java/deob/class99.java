package deob;

@ObfuscatedName("do")
public final class class99 extends class515 {

    @ObfuscatedName("do.ap")
    public int field1206;

    @ObfuscatedName("do.aw")
    public int field1200;

    @ObfuscatedName("do.ak")
    public int field1199;

    @ObfuscatedName("do.aj")
    public int field1202;

    @ObfuscatedName("do.ai")
    public int field1209;

    @ObfuscatedName("do.ay")
    public int field1203;

    @ObfuscatedName("do.as")
    public int field1205;

    @ObfuscatedName("do.ae")
    public int field1201;

    @ObfuscatedName("do.am")
    public int field1207;

    @ObfuscatedName("do.at")
    public int field1208;

    @ObfuscatedName("do.au")
    public int field1215;

    @ObfuscatedName("do.ao")
    public int field1210 = 31;

    @ObfuscatedName("do.af")
    public int field1211 = 0;

    @ObfuscatedName("do.ar")
    public int field1212 = -1;

    @ObfuscatedName("do.ap(II)V")
    public void method2608(int arg0) {
        this.field1210 = arg0;
    }

    @ObfuscatedName("do.aw(II)Z")
    public boolean method2610(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1210 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
