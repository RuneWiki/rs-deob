package deob;

@ObfuscatedName("bs")
public class class64 extends class48 {

    @ObfuscatedName("bs.i")
    public int field1253;

    @ObfuscatedName("bs.k")
    public byte[] field1256;

    @ObfuscatedName("bs.q")
    public int field1254;

    @ObfuscatedName("bs.j")
    public int field1255;

    @ObfuscatedName("bs.z")
    public boolean field1252;

    public class64(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1253 = arg0;
        this.field1256 = arg1;
        this.field1254 = arg2;
        this.field1255 = arg3;
    }

    public class64(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1253 = arg0;
        this.field1256 = arg1;
        this.field1254 = arg2;
        this.field1255 = arg3;
        this.field1252 = arg4;
    }

    @ObfuscatedName("bs.e(Lby;)Lbs;")
    public class64 method1375(class63 arg0) {
        this.field1256 = arg0.method1361(this.field1256);
        this.field1253 = arg0.method1362(this.field1253);
        if (this.field1255 == this.field1254) {
            this.field1254 = this.field1255 = arg0.method1363(this.field1254);
        } else {
            this.field1254 = arg0.method1363(this.field1254);
            this.field1255 = arg0.method1363(this.field1255);
            if (this.field1255 == this.field1254) {
                this.field1254--;
            }
        }
        return this;
    }
}
