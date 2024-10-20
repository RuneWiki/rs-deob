package deob;

@ObfuscatedName("ju")
public class class257 extends class502 {

    @ObfuscatedName("ju.ay")
    public static class315 field2691 = new class315(64);

    @ObfuscatedName("ju.an")
    public char field2690;

    @ObfuscatedName("ju.au")
    public int field2693;

    @ObfuscatedName("ju.ax")
    public String field2697;

    @ObfuscatedName("ju.ao")
    public boolean field2695 = true;

    @ObfuscatedName("jr.ab(Lob;B)V")
    public static void method4456(class389 arg0) {
        Statics.field2692 = arg0;
    }

    @ObfuscatedName("ju.an(I)V")
    public void method4641() {
    }

    @ObfuscatedName("ju.au(Lvg;I)V")
    public void method4636(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4638(arg0, var2);
        }
    }

    @ObfuscatedName("ju.ax(Lvg;IB)V")
    public void method4638(class549 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method8798();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class415.field4643[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2690 = var6;
        } else if (arg1 == 2) {
            this.field2693 = arg0.method8803();
        } else if (arg1 == 4) {
            this.field2695 = false;
        } else if (arg1 == 5) {
            this.field2697 = arg0.method8808();
        }
    }

    @ObfuscatedName("ju.ao(B)Z")
    public boolean method4637() {
        return this.field2690 == 's';
    }

    @ObfuscatedName("fp.am(I)V")
    public static void method3209() {
        field2691.method5588();
    }
}
