package deob;

@ObfuscatedName("ix")
public class class251 extends class185 {

    @ObfuscatedName("ix.v")
    public static class155 field3232 = new class155(64);

    @ObfuscatedName("ix.x")
    public int field3235 = 0;

    @ObfuscatedName("ix.v(Lkj;I)V")
    public void method4000(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4001(arg0, var2);
        }
    }

    @ObfuscatedName("ix.x(Lkj;IB)V")
    public void method4001(class311 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3235 = arg0.method5342();
        }
    }
}
