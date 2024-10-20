package deob;

@ObfuscatedName("br")
public class class58 extends class61 {

    @ObfuscatedName("br.n")
    public int field1190;

    @ObfuscatedName("br.g")
    public byte[] field1186;

    @ObfuscatedName("br.a")
    public int field1188;

    @ObfuscatedName("br.m")
    public int field1189;

    @ObfuscatedName("br.s")
    public boolean field1187;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1190 = arg0;
        this.field1186 = arg1;
        this.field1188 = arg2;
        this.field1189 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1190 = arg0;
        this.field1186 = arg1;
        this.field1188 = arg2;
        this.field1189 = arg3;
        this.field1187 = arg4;
    }

    @ObfuscatedName("br.n(Lbw;)Lbr;")
    public class58 method1140(class70 arg0) {
        this.field1186 = arg0.method1423(this.field1186);
        this.field1190 = arg0.method1419(this.field1190);
        if (this.field1189 == this.field1188) {
            this.field1188 = this.field1189 = arg0.method1417(this.field1188);
        } else {
            this.field1188 = arg0.method1417(this.field1188);
            this.field1189 = arg0.method1417(this.field1189);
            if (this.field1189 == this.field1188) {
                this.field1188--;
            }
        }
        return this;
    }
}
