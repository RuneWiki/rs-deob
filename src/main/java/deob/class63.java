package deob;

@ObfuscatedName("bd")
public class class63 extends class47 {

    @ObfuscatedName("bd.v")
    public int field1244;

    @ObfuscatedName("bd.m")
    public byte[] field1241;

    @ObfuscatedName("bd.j")
    public int field1242;

    @ObfuscatedName("bd.o")
    public int field1243;

    @ObfuscatedName("bd.l")
    public boolean field1240;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1244 = arg0;
        this.field1241 = arg1;
        this.field1242 = arg2;
        this.field1243 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1244 = arg0;
        this.field1241 = arg1;
        this.field1242 = arg2;
        this.field1243 = arg3;
        this.field1240 = arg4;
    }

    @ObfuscatedName("bd.i(Lbm;)Lbd;")
    public class63 method1346(class62 arg0) {
        this.field1241 = arg0.method1332(this.field1241);
        this.field1244 = arg0.method1334(this.field1244);
        if (this.field1243 == this.field1242) {
            this.field1242 = this.field1243 = arg0.method1337(this.field1242);
        } else {
            this.field1242 = arg0.method1337(this.field1242);
            this.field1243 = arg0.method1337(this.field1243);
            if (this.field1243 == this.field1242) {
                this.field1242--;
            }
        }
        return this;
    }
}
