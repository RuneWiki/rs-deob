package deob;

@ObfuscatedName("bz")
public class class62 extends class46 {

    @ObfuscatedName("bz.f")
    public int field1219;

    @ObfuscatedName("bz.n")
    public byte[] field1216;

    @ObfuscatedName("bz.c")
    public int field1218;

    @ObfuscatedName("bz.r")
    public int field1215;

    @ObfuscatedName("bz.k")
    public boolean field1217;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1219 = arg0;
        this.field1216 = arg1;
        this.field1218 = arg2;
        this.field1215 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1219 = arg0;
        this.field1216 = arg1;
        this.field1218 = arg2;
        this.field1215 = arg3;
        this.field1217 = arg4;
    }

    @ObfuscatedName("bz.v(Lby;)Lbz;")
    public class62 method1349(class61 arg0) {
        this.field1216 = arg0.method1347(this.field1216);
        this.field1219 = arg0.method1336(this.field1219);
        if (this.field1218 == this.field1215) {
            this.field1218 = this.field1215 = arg0.method1334(this.field1218);
        } else {
            this.field1218 = arg0.method1334(this.field1218);
            this.field1215 = arg0.method1334(this.field1215);
            if (this.field1218 == this.field1215) {
                this.field1218--;
            }
        }
        return this;
    }
}
