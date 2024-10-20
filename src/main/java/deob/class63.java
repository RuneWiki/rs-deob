package deob;

@ObfuscatedName("bf")
public class class63 extends class66 {

    @ObfuscatedName("bf.f")
    public int field1239;

    @ObfuscatedName("bf.s")
    public byte[] field1236;

    @ObfuscatedName("bf.q")
    public int field1238;

    @ObfuscatedName("bf.g")
    public int field1237;

    @ObfuscatedName("bf.m")
    public boolean field1240;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1239 = arg0;
        this.field1236 = arg1;
        this.field1238 = arg2;
        this.field1237 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1239 = arg0;
        this.field1236 = arg1;
        this.field1238 = arg2;
        this.field1237 = arg3;
        this.field1240 = arg4;
    }

    @ObfuscatedName("bf.f(Lbb;)Lbf;")
    public class63 method1256(class75 arg0) {
        this.field1236 = arg0.method1519(this.field1236);
        this.field1239 = arg0.method1518(this.field1239);
        if (this.field1238 == this.field1237) {
            this.field1238 = this.field1237 = arg0.method1522(this.field1238);
        } else {
            this.field1238 = arg0.method1522(this.field1238);
            this.field1237 = arg0.method1522(this.field1237);
            if (this.field1238 == this.field1237) {
                this.field1238--;
            }
        }
        return this;
    }
}
