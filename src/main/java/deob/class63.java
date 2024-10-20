package deob;

@ObfuscatedName("bt")
public class class63 extends class66 {

    @ObfuscatedName("bt.m")
    public int field1189;

    @ObfuscatedName("bt.l")
    public byte[] field1188;

    @ObfuscatedName("bt.y")
    public int field1187;

    @ObfuscatedName("bt.u")
    public int field1190;

    @ObfuscatedName("bt.k")
    public boolean field1191;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1189 = arg0;
        this.field1188 = arg1;
        this.field1187 = arg2;
        this.field1190 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1189 = arg0;
        this.field1188 = arg1;
        this.field1187 = arg2;
        this.field1190 = arg3;
        this.field1191 = arg4;
    }

    @ObfuscatedName("bt.m(Lbl;)Lbt;")
    public class63 method1286(class75 arg0) {
        this.field1188 = arg0.method1544(this.field1188);
        this.field1189 = arg0.method1545(this.field1189);
        if (this.field1190 == this.field1187) {
            this.field1187 = this.field1190 = arg0.method1551(this.field1187);
        } else {
            this.field1187 = arg0.method1551(this.field1187);
            this.field1190 = arg0.method1551(this.field1190);
            if (this.field1190 == this.field1187) {
                this.field1187--;
            }
        }
        return this;
    }
}
