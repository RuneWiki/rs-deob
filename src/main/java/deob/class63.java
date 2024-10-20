package deob;

@ObfuscatedName("bq")
public class class63 extends class47 {

    @ObfuscatedName("bq.r")
    public int field1222;

    @ObfuscatedName("bq.u")
    public byte[] field1219;

    @ObfuscatedName("bq.t")
    public int field1220;

    @ObfuscatedName("bq.k")
    public int field1221;

    @ObfuscatedName("bq.x")
    public boolean field1218;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1222 = arg0;
        this.field1219 = arg1;
        this.field1220 = arg2;
        this.field1221 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1222 = arg0;
        this.field1219 = arg1;
        this.field1220 = arg2;
        this.field1221 = arg3;
        this.field1218 = arg4;
    }

    @ObfuscatedName("bq.a(Lbx;)Lbq;")
    public class63 method1257(class62 arg0) {
        this.field1219 = arg0.method1243(this.field1219);
        this.field1222 = arg0.method1244(this.field1222);
        if (this.field1221 == this.field1220) {
            this.field1220 = this.field1221 = arg0.method1245(this.field1220);
        } else {
            this.field1220 = arg0.method1245(this.field1220);
            this.field1221 = arg0.method1245(this.field1221);
            if (this.field1221 == this.field1220) {
                this.field1220--;
            }
        }
        return this;
    }
}
