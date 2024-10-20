package deob;

@ObfuscatedName("kr")
public class class273 extends class489 {

    @ObfuscatedName("kr.ar")
    public int field2827;

    @ObfuscatedName("kr.ag")
    public int field2824;

    @ObfuscatedName("kr.ao")
    public int[] field2829;

    @ObfuscatedName("kr.ae")
    public int[][] field2828;

    @ObfuscatedName("kr.aa")
    public class271 field2831;

    public class273(int arg0, byte[] arg1) {
        this.field2827 = arg0;
        class531 var3 = new class531(arg1);
        this.field2824 = var3.method8561();
        this.field2829 = new int[this.field2824];
        this.field2828 = new int[this.field2824][];
        for (int var4 = 0; var4 < this.field2824; var4++) {
            this.field2829[var4] = var3.method8561();
        }
        for (int var5 = 0; var5 < this.field2824; var5++) {
            this.field2828[var5] = new int[var3.method8561()];
        }
        for (int var6 = 0; var6 < this.field2824; var6++) {
            for (int var7 = 0; var7 < this.field2828[var6].length; var7++) {
                this.field2828[var6][var7] = var3.method8561();
            }
        }
        if (var3.field5181 < var3.field5178.length) {
            int var8 = var3.method8775();
            if (var8 > 0) {
                this.field2831 = new class271(var3, var8);
            }
        }
    }

    @ObfuscatedName("kr.am(S)I")
    public int method4870() {
        return this.field2824;
    }

    @ObfuscatedName("kr.ap(B)Lkx;")
    public class271 method4871() {
        return this.field2831;
    }
}
