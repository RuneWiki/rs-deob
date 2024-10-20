package deob;

@ObfuscatedName("bs")
public class class56 extends class72 {

    @ObfuscatedName("bs.s")
    public int field1022;

    @ObfuscatedName("bs.c")
    public byte[] field1021;

    @ObfuscatedName("bs.f")
    public int field1020;

    @ObfuscatedName("bs.h")
    public int field1023;

    @ObfuscatedName("bs.a")
    public boolean field1024;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1022 = arg0;
        this.field1021 = arg1;
        this.field1020 = arg2;
        this.field1023 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1022 = arg0;
        this.field1021 = arg1;
        this.field1020 = arg2;
        this.field1023 = arg3;
        this.field1024 = arg4;
    }

    @ObfuscatedName("bs.s(Lba;)Lbs;")
    public class56 method943(class66 arg0) {
        this.field1021 = arg0.method1080(this.field1021);
        this.field1022 = arg0.method1075(this.field1022);
        if (this.field1023 == this.field1020) {
            this.field1020 = this.field1023 = arg0.method1078(this.field1020);
        } else {
            this.field1020 = arg0.method1078(this.field1020);
            this.field1023 = arg0.method1078(this.field1023);
            if (this.field1023 == this.field1020) {
                this.field1020--;
            }
        }
        return this;
    }
}
