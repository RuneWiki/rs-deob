package deob;

@ObfuscatedName("af")
public class class42 extends class60 {

    @ObfuscatedName("af.h")
    public int field299;

    @ObfuscatedName("af.e")
    public byte[] field297;

    @ObfuscatedName("af.v")
    public int field298;

    @ObfuscatedName("af.x")
    public int field296;

    @ObfuscatedName("af.m")
    public boolean field300;

    public class42(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field299 = arg0;
        this.field297 = arg1;
        this.field298 = arg2;
        this.field296 = arg3;
    }

    public class42(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field299 = arg0;
        this.field297 = arg1;
        this.field298 = arg2;
        this.field296 = arg3;
        this.field300 = arg4;
    }

    @ObfuscatedName("af.h(Lby;)Laf;")
    public class42 method760(class57 arg0) {
        this.field297 = arg0.method1059(this.field297);
        this.field299 = arg0.method1058(this.field299);
        if (this.field298 == this.field296) {
            this.field298 = this.field296 = arg0.method1053(this.field298);
        } else {
            this.field298 = arg0.method1053(this.field298);
            this.field296 = arg0.method1053(this.field296);
            if (this.field298 == this.field296) {
                this.field298--;
            }
        }
        return this;
    }
}
