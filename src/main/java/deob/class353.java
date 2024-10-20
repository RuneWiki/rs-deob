package deob;

@ObfuscatedName("nb")
public class class353 {

    @ObfuscatedName("nb.af")
    public byte field4296;

    @ObfuscatedName("nb.an")
    public int field4290;

    @ObfuscatedName("nb.aw")
    public int field4291;

    @ObfuscatedName("nb.ac")
    public int field4293;

    @ObfuscatedName("nb.au")
    public int field4289;

    @ObfuscatedName("nb.ab")
    public int field4294;

    public class353() {
    }

    public class353(class489 arg0, boolean arg1) {
        this.field4296 = arg0.method8249();
        this.field4290 = arg0.method8250();
        this.field4291 = arg0.method8254();
        this.field4293 = arg0.method8254();
        this.field4289 = arg0.method8254();
        this.field4294 = arg0.method8254();
        if (arg1) {
            this.method6233(Statics.method6013(arg0));
        }
    }

    @ObfuscatedName("nb.an(Ljava/lang/Integer;I)V")
    public void method6233(Integer arg0) {
    }

    @ObfuscatedName("nb.aw(I)I")
    public int method6229() {
        return this.field4296 & 0x7;
    }

    @ObfuscatedName("nb.ac(B)I")
    public int method6232() {
        return (this.field4296 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("nb.au(IB)V")
    public void method6239(int arg0) {
        this.field4296 &= 0xFFFFFFF8;
        this.field4296 = (byte) (this.field4296 | arg0 & 0x7);
    }

    @ObfuscatedName("nb.ab(II)V")
    public void method6235(int arg0) {
        this.field4296 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4296 = (byte) (this.field4296 | 0x8);
        }
    }
}
