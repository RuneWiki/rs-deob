package deob;

@ObfuscatedName("ik")
public class class231 extends class474 {

    @ObfuscatedName("ik.aj")
    public int field2533;

    @ObfuscatedName("ik.ag")
    public int field2531;

    @ObfuscatedName("ik.az")
    public int[] field2535;

    @ObfuscatedName("ik.av")
    public int[][] field2536;

    @ObfuscatedName("ik.ap")
    public class229 field2534;

    public class231(int arg0, byte[] arg1) {
        this.field2533 = arg0;
        class514 var3 = new class514(arg1);
        this.field2531 = var3.method8244();
        this.field2535 = new int[this.field2531];
        this.field2536 = new int[this.field2531][];
        for (int var4 = 0; var4 < this.field2531; var4++) {
            this.field2535[var4] = var3.method8244();
        }
        for (int var5 = 0; var5 < this.field2531; var5++) {
            this.field2536[var5] = new int[var3.method8244()];
        }
        for (int var6 = 0; var6 < this.field2531; var6++) {
            for (int var7 = 0; var7 < this.field2536[var6].length; var7++) {
                this.field2536[var6][var7] = var3.method8244();
            }
        }
        if (var3.field5072 < var3.field5070.length) {
            int var8 = var3.method8246();
            if (var8 > 0) {
                this.field2534 = new class229(var3, var8);
            }
        }
    }

    @ObfuscatedName("ik.aw(I)I")
    public int method4186() {
        return this.field2531;
    }

    @ObfuscatedName("ik.ay(I)Liv;")
    public class229 method4181() {
        return this.field2534;
    }
}
