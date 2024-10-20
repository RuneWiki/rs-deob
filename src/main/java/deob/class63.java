package deob;

@ObfuscatedName("by")
public class class63 extends class47 {

    @ObfuscatedName("by.e")
    public int field1239;

    @ObfuscatedName("by.a")
    public byte[] field1236;

    @ObfuscatedName("by.h")
    public int field1237;

    @ObfuscatedName("by.y")
    public int field1238;

    @ObfuscatedName("by.j")
    public boolean field1235;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1239 = arg0;
        this.field1236 = arg1;
        this.field1237 = arg2;
        this.field1238 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1239 = arg0;
        this.field1236 = arg1;
        this.field1237 = arg2;
        this.field1238 = arg3;
        this.field1235 = arg4;
    }

    @ObfuscatedName("by.p(Lbj;)Lby;")
    public class63 method1346(class62 arg0) {
        this.field1236 = arg0.method1332(this.field1236);
        this.field1239 = arg0.method1339(this.field1239);
        if (this.field1238 == this.field1237) {
            this.field1237 = this.field1238 = arg0.method1334(this.field1237);
        } else {
            this.field1237 = arg0.method1334(this.field1237);
            this.field1238 = arg0.method1334(this.field1238);
            if (this.field1238 == this.field1237) {
                this.field1237--;
            }
        }
        return this;
    }
}
