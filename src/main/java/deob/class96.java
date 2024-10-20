package deob;

@ObfuscatedName("dt")
public final class class96 extends class493 {

    @ObfuscatedName("dt.az")
    public int field1187;

    @ObfuscatedName("dt.ah")
    public int field1186;

    @ObfuscatedName("dt.af")
    public int field1185;

    @ObfuscatedName("dt.at")
    public int field1183;

    @ObfuscatedName("dt.an")
    public int field1184;

    @ObfuscatedName("dt.ao")
    public int field1188;

    @ObfuscatedName("dt.ab")
    public int field1189;

    @ObfuscatedName("dt.aw")
    public int field1199;

    @ObfuscatedName("dt.ad")
    public int field1191;

    @ObfuscatedName("dt.al")
    public int field1192;

    @ObfuscatedName("dt.as")
    public int field1193;

    @ObfuscatedName("dt.ai")
    public int field1195 = 31;

    @ObfuscatedName("dt.ax")
    public int field1196 = 0;

    @ObfuscatedName("dt.ar")
    public int field1197 = -1;

    @ObfuscatedName("dt.az(IB)V")
    public void method2280(int arg0) {
        this.field1195 = arg0;
    }

    @ObfuscatedName("dt.ah(II)Z")
    public boolean method2284(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1195 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }
}
