package deob;

@ObfuscatedName("bm")
public class class56 extends class59 {

    @ObfuscatedName("bm.j")
    public int field1137;

    @ObfuscatedName("bm.z")
    public byte[] field1136;

    @ObfuscatedName("bm.y")
    public int field1138;

    @ObfuscatedName("bm.h")
    public int field1139;

    @ObfuscatedName("bm.r")
    public boolean field1140;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1137 = arg0;
        this.field1136 = arg1;
        this.field1138 = arg2;
        this.field1139 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1137 = arg0;
        this.field1136 = arg1;
        this.field1138 = arg2;
        this.field1139 = arg3;
        this.field1140 = arg4;
    }

    @ObfuscatedName("bm.j(Lbo;)Lbm;")
    public class56 method1065(class68 arg0) {
        this.field1136 = arg0.method1328(this.field1136);
        this.field1137 = arg0.method1329(this.field1137);
        if (this.field1139 == this.field1138) {
            this.field1138 = this.field1139 = arg0.method1334(this.field1138);
        } else {
            this.field1138 = arg0.method1334(this.field1138);
            this.field1139 = arg0.method1334(this.field1139);
            if (this.field1139 == this.field1138) {
                this.field1138--;
            }
        }
        return this;
    }
}
