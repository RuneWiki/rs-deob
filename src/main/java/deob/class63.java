package deob;

@ObfuscatedName("bj")
public class class63 extends class47 {

    @ObfuscatedName("bj.p")
    public int field1210;

    @ObfuscatedName("bj.k")
    public byte[] field1207;

    @ObfuscatedName("bj.a")
    public int field1208;

    @ObfuscatedName("bj.q")
    public int field1209;

    @ObfuscatedName("bj.j")
    public boolean field1206;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1210 = arg0;
        this.field1207 = arg1;
        this.field1208 = arg2;
        this.field1209 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1210 = arg0;
        this.field1207 = arg1;
        this.field1208 = arg2;
        this.field1209 = arg3;
        this.field1206 = arg4;
    }

    @ObfuscatedName("bj.x(Lbu;)Lbj;")
    public class63 method1295(class62 arg0) {
        this.field1207 = arg0.method1283(this.field1207);
        this.field1210 = arg0.method1284(this.field1210);
        if (this.field1209 == this.field1208) {
            this.field1208 = this.field1209 = arg0.method1286(this.field1208);
        } else {
            this.field1208 = arg0.method1286(this.field1208);
            this.field1209 = arg0.method1286(this.field1209);
            if (this.field1209 == this.field1208) {
                this.field1208--;
            }
        }
        return this;
    }
}
