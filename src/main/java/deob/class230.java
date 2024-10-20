package deob;

@ObfuscatedName("iu")
public class class230 extends class473 {

    @ObfuscatedName("iu.ai")
    public int field2557;

    @ObfuscatedName("iu.az")
    public int field2558;

    @ObfuscatedName("iu.ap")
    public int[] field2559;

    @ObfuscatedName("iu.aa")
    public int[][] field2560;

    @ObfuscatedName("iu.af")
    public class228 field2561;

    public class230(int arg0, byte[] arg1) {
        this.field2557 = arg0;
        class515 var3 = new class515(arg1);
        this.field2558 = var3.method8300();
        this.field2559 = new int[this.field2558];
        this.field2560 = new int[this.field2558][];
        for (int var4 = 0; var4 < this.field2558; var4++) {
            this.field2559[var4] = var3.method8300();
        }
        for (int var5 = 0; var5 < this.field2558; var5++) {
            this.field2560[var5] = new int[var3.method8300()];
        }
        for (int var6 = 0; var6 < this.field2558; var6++) {
            for (int var7 = 0; var7 < this.field2560[var6].length; var7++) {
                this.field2560[var6][var7] = var3.method8300();
            }
        }
        if (var3.field5111 < var3.field5108.length) {
            int var8 = var3.method8448();
            if (var8 > 0) {
                this.field2561 = new class228(var3, var8);
            }
        }
    }

    @ObfuscatedName("iu.au(I)I")
    public int method4196() {
        return this.field2558;
    }

    @ObfuscatedName("iu.ae(I)Lim;")
    public class228 method4193() {
        return this.field2561;
    }
}
