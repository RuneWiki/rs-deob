package deob;

@ObfuscatedName("kb")
public class class301 extends class297 {

    @ObfuscatedName("kb.d")
    public int field3838;

    @ObfuscatedName("kb.d(Lkb;I)I")
    public int method5074(class301 arg0) {
        return this.field3838 - arg0.field3838;
    }

    @ObfuscatedName("kb.au(Lkm;I)I")
    public int method4960(class297 arg0) {
        return this.method5074((class301) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5074((class301) arg0);
    }
}
