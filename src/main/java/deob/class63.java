package deob;

@ObfuscatedName("bh")
public class class63 extends class66 {

    @ObfuscatedName("bh.b")
    public int field1200;

    @ObfuscatedName("bh.g")
    public byte[] field1199;

    @ObfuscatedName("bh.j")
    public int field1201;

    @ObfuscatedName("bh.d")
    public int field1202;

    @ObfuscatedName("bh.x")
    public boolean field1203;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1200 = arg0;
        this.field1199 = arg1;
        this.field1201 = arg2;
        this.field1202 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1200 = arg0;
        this.field1199 = arg1;
        this.field1201 = arg2;
        this.field1202 = arg3;
        this.field1203 = arg4;
    }

    @ObfuscatedName("bh.b(Lbk;)Lbh;")
    public class63 method1238(class75 arg0) {
        this.field1199 = arg0.method1505(this.field1199);
        this.field1200 = arg0.method1504(this.field1200);
        if (this.field1202 == this.field1201) {
            this.field1201 = this.field1202 = arg0.method1512(this.field1201);
        } else {
            this.field1201 = arg0.method1512(this.field1201);
            this.field1202 = arg0.method1512(this.field1202);
            if (this.field1202 == this.field1201) {
                this.field1201--;
            }
        }
        return this;
    }
}
