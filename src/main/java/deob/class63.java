package deob;

@ObfuscatedName("bo")
public class class63 extends class47 {

    @ObfuscatedName("bo.q")
    public int field1250;

    @ObfuscatedName("bo.y")
    public byte[] field1251;

    @ObfuscatedName("bo.v")
    public int field1252;

    @ObfuscatedName("bo.g")
    public int field1253;

    @ObfuscatedName("bo.x")
    public boolean field1254;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1250 = arg0;
        this.field1251 = arg1;
        this.field1252 = arg2;
        this.field1253 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1250 = arg0;
        this.field1251 = arg1;
        this.field1252 = arg2;
        this.field1253 = arg3;
        this.field1254 = arg4;
    }

    @ObfuscatedName("bo.c(Lby;)Lbo;")
    public class63 method1276(class62 arg0) {
        this.field1251 = arg0.method1263(this.field1251);
        this.field1250 = arg0.method1266(this.field1250);
        if (this.field1253 == this.field1252) {
            this.field1252 = this.field1253 = arg0.method1264(this.field1252);
        } else {
            this.field1252 = arg0.method1264(this.field1252);
            this.field1253 = arg0.method1264(this.field1253);
            if (this.field1253 == this.field1252) {
                this.field1252--;
            }
        }
        return this;
    }
}
