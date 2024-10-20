package deob;

@ObfuscatedName("ik")
public class class222 extends class449 {

    @ObfuscatedName("ik.ab")
    public int field2539;

    @ObfuscatedName("ik.aq")
    public int field2534;

    @ObfuscatedName("ik.al")
    public int[] field2540;

    @ObfuscatedName("ik.at")
    public int[][] field2543;

    @ObfuscatedName("ik.aa")
    public class220 field2542;

    public class222(int arg0, byte[] arg1) {
        this.field2539 = arg0;
        class489 var3 = new class489(arg1);
        this.field2534 = var3.method8248();
        this.field2540 = new int[this.field2534];
        this.field2543 = new int[this.field2534][];
        for (int var4 = 0; var4 < this.field2534; var4++) {
            this.field2540[var4] = var3.method8248();
        }
        for (int var5 = 0; var5 < this.field2534; var5++) {
            this.field2543[var5] = new int[var3.method8248()];
        }
        for (int var6 = 0; var6 < this.field2534; var6++) {
            for (int var7 = 0; var7 < this.field2543[var6].length; var7++) {
                this.field2543[var6][var7] = var3.method8248();
            }
        }
        if (var3.field4989 < var3.field4991.length) {
            int var8 = var3.method8250();
            if (var8 > 0) {
                this.field2542 = new class220(var3, var8);
            }
        }
    }

    @ObfuscatedName("ik.af(I)I")
    public int method4164() {
        return this.field2534;
    }

    @ObfuscatedName("ik.an(I)Lic;")
    public class220 method4165() {
        return this.field2542;
    }
}
