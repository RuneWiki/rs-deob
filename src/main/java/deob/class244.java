package deob;

@ObfuscatedName("jt")
public class class244 extends class515 {

    @ObfuscatedName("jt.ay")
    public int field2631;

    @ObfuscatedName("jt.as")
    public int field2632;

    @ObfuscatedName("jt.ae")
    public int[] field2633;

    @ObfuscatedName("jt.am")
    public int[][] field2634;

    @ObfuscatedName("jt.at")
    public class242 field2637;

    public class244(int arg0, byte[] arg1) {
        this.field2631 = arg0;
        class558 var3 = new class558(arg1);
        this.field2632 = var3.method9258();
        this.field2633 = new int[this.field2632];
        this.field2634 = new int[this.field2632][];
        for (int var4 = 0; var4 < this.field2632; var4++) {
            this.field2633[var4] = var3.method9258();
        }
        for (int var5 = 0; var5 < this.field2632; var5++) {
            this.field2634[var5] = new int[var3.method9258()];
        }
        for (int var6 = 0; var6 < this.field2632; var6++) {
            for (int var7 = 0; var7 < this.field2634[var6].length; var7++) {
                this.field2634[var6][var7] = var3.method9258();
            }
        }
        if (var3.field5462 < var3.field5463.length) {
            int var8 = var3.method9260();
            if (var8 > 0) {
                this.field2637 = new class242(var3, var8);
            }
        }
    }

    @ObfuscatedName("jt.ap(B)I")
    public int method4668() {
        return this.field2632;
    }

    @ObfuscatedName("jt.aw(I)Ljx;")
    public class242 method4669() {
        return this.field2637;
    }
}
