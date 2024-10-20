package deob;

@ObfuscatedName("cz")
public class class96 extends class111 {

    @ObfuscatedName("cz.y")
    public int field1333;

    @ObfuscatedName("cz.c")
    public byte[] field1334;

    @ObfuscatedName("cz.n")
    public int field1336;

    @ObfuscatedName("cz.u")
    public int field1335;

    @ObfuscatedName("cz.i")
    public boolean field1332;

    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1333 = arg0;
        this.field1334 = arg1;
        this.field1336 = arg2;
        this.field1335 = arg3;
    }

    public class96(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1333 = arg0;
        this.field1334 = arg1;
        this.field1336 = arg2;
        this.field1335 = arg3;
        this.field1332 = arg4;
    }

    @ObfuscatedName("cz.y(Ldu;)Lcz;")
    public class96 method2018(class105 arg0) {
        this.field1334 = arg0.method2114(this.field1334);
        this.field1333 = arg0.method2116(this.field1333);
        if (this.field1336 == this.field1335) {
            this.field1336 = this.field1335 = arg0.method2115(this.field1336);
        } else {
            this.field1336 = arg0.method2115(this.field1336);
            this.field1335 = arg0.method2115(this.field1335);
            if (this.field1336 == this.field1335) {
                this.field1336--;
            }
        }
        return this;
    }
}
