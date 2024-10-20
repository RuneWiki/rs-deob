package deob;

@ObfuscatedName("ee")
public class class145 extends class128 {

    @ObfuscatedName("ee.k")
    public int field2196;

    @ObfuscatedName("ee.r")
    public byte[] field2199;

    @ObfuscatedName("ee.l")
    public int field2198;

    @ObfuscatedName("ee.i")
    public int field2197;

    @ObfuscatedName("ee.e")
    public boolean field2200;

    public class145(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2196 = arg0;
        this.field2199 = arg1;
        this.field2198 = arg2;
        this.field2197 = arg3;
    }

    public class145(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2196 = arg0;
        this.field2199 = arg1;
        this.field2198 = arg2;
        this.field2197 = arg3;
        this.field2200 = arg4;
    }

    @ObfuscatedName("ee.r(Lp;)Lee;")
    public class145 method2049(class26 arg0) {
        this.field2199 = arg0.method321(this.field2199);
        this.field2196 = arg0.method318(this.field2196);
        if (this.field2198 == this.field2197) {
            this.field2198 = this.field2197 = arg0.method319(this.field2198);
        } else {
            this.field2198 = arg0.method319(this.field2198);
            this.field2197 = arg0.method319(this.field2197);
            if (this.field2198 == this.field2197) {
                this.field2198--;
            }
        }
        return this;
    }
}
