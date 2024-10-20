package deob;

@ObfuscatedName("bt")
public class class63 extends class47 {

    @ObfuscatedName("bt.t")
    public int field1221;

    @ObfuscatedName("bt.n")
    public byte[] field1219;

    @ObfuscatedName("bt.e")
    public int field1220;

    @ObfuscatedName("bt.l")
    public int field1222;

    @ObfuscatedName("bt.d")
    public boolean field1223;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1221 = arg0;
        this.field1219 = arg1;
        this.field1220 = arg2;
        this.field1222 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1221 = arg0;
        this.field1219 = arg1;
        this.field1220 = arg2;
        this.field1222 = arg3;
        this.field1223 = arg4;
    }

    @ObfuscatedName("bt.f(Lba;)Lbt;")
    public class63 method1344(class62 arg0) {
        this.field1219 = arg0.method1328(this.field1219);
        this.field1221 = arg0.method1329(this.field1221);
        if (this.field1222 == this.field1220) {
            this.field1220 = this.field1222 = arg0.method1336(this.field1220);
        } else {
            this.field1220 = arg0.method1336(this.field1220);
            this.field1222 = arg0.method1336(this.field1222);
            if (this.field1222 == this.field1220) {
                this.field1220--;
            }
        }
        return this;
    }
}
