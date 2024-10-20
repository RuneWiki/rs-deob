package deob;

@ObfuscatedName("kd")
public class class270 extends class485 {

    @ObfuscatedName("kd.au")
    public int field2791;

    @ObfuscatedName("kd.aa")
    public int field2793;

    @ObfuscatedName("kd.ac")
    public int[] field2797;

    @ObfuscatedName("kd.al")
    public int[][] field2798;

    @ObfuscatedName("kd.az")
    public class268 field2796;

    public class270(int arg0, byte[] arg1) {
        this.field2791 = arg0;
        class527 var3 = new class527(arg1);
        this.field2793 = var3.method8410();
        this.field2797 = new int[this.field2793];
        this.field2798 = new int[this.field2793][];
        for (int var4 = 0; var4 < this.field2793; var4++) {
            this.field2797[var4] = var3.method8410();
        }
        for (int var5 = 0; var5 < this.field2793; var5++) {
            this.field2798[var5] = new int[var3.method8410()];
        }
        for (int var6 = 0; var6 < this.field2793; var6++) {
            for (int var7 = 0; var7 < this.field2798[var6].length; var7++) {
                this.field2798[var6][var7] = var3.method8410();
            }
        }
        if (var3.field5137 < var3.field5140.length) {
            int var8 = var3.method8412();
            if (var8 > 0) {
                this.field2796 = new class268(var3, var8);
            }
        }
    }

    @ObfuscatedName("kd.at(I)I")
    public int method4787() {
        return this.field2793;
    }

    @ObfuscatedName("kd.ah(I)Lkz;")
    public class268 method4788() {
        return this.field2796;
    }
}
