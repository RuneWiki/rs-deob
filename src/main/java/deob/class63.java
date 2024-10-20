package deob;

@ObfuscatedName("be")
public class class63 extends class66 {

    @ObfuscatedName("be.f")
    public int field1249;

    @ObfuscatedName("be.u")
    public byte[] field1248;

    @ObfuscatedName("be.x")
    public int field1247;

    @ObfuscatedName("be.b")
    public int field1250;

    @ObfuscatedName("be.l")
    public boolean field1251;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1249 = arg0;
        this.field1248 = arg1;
        this.field1247 = arg2;
        this.field1250 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1249 = arg0;
        this.field1248 = arg1;
        this.field1247 = arg2;
        this.field1250 = arg3;
        this.field1251 = arg4;
    }

    @ObfuscatedName("be.f(Lbr;)Lbe;")
    public class63 method1289(class75 arg0) {
        this.field1248 = arg0.method1535(this.field1248);
        this.field1249 = arg0.method1537(this.field1249);
        if (this.field1250 == this.field1247) {
            this.field1247 = this.field1250 = arg0.method1536(this.field1247);
        } else {
            this.field1247 = arg0.method1536(this.field1247);
            this.field1250 = arg0.method1536(this.field1250);
            if (this.field1250 == this.field1247) {
                this.field1247--;
            }
        }
        return this;
    }
}
