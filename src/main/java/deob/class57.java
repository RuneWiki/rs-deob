package deob;

@ObfuscatedName("bg")
public class class57 extends class60 {

    @ObfuscatedName("bg.c")
    public int field1131;

    @ObfuscatedName("bg.j")
    public byte[] field1130;

    @ObfuscatedName("bg.y")
    public int field1133;

    @ObfuscatedName("bg.r")
    public int field1132;

    @ObfuscatedName("bg.f")
    public boolean field1129;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1131 = arg0;
        this.field1130 = arg1;
        this.field1133 = arg2;
        this.field1132 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1131 = arg0;
        this.field1130 = arg1;
        this.field1133 = arg2;
        this.field1132 = arg3;
        this.field1129 = arg4;
    }

    @ObfuscatedName("bg.c(Lba;)Lbg;")
    public class57 method1087(class69 arg0) {
        this.field1130 = arg0.method1330(this.field1130);
        this.field1131 = arg0.method1331(this.field1131);
        if (this.field1133 == this.field1132) {
            this.field1133 = this.field1132 = arg0.method1334(this.field1133);
        } else {
            this.field1133 = arg0.method1334(this.field1133);
            this.field1132 = arg0.method1334(this.field1132);
            if (this.field1133 == this.field1132) {
                this.field1133--;
            }
        }
        return this;
    }
}
