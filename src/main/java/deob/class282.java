package deob;

@ObfuscatedName("ko")
public class class282 extends class505 {

    @ObfuscatedName("ko.an")
    public int field2911;

    @ObfuscatedName("ko.aj")
    public int field2913;

    @ObfuscatedName("ko.av")
    public int[] field2908;

    @ObfuscatedName("ko.ab")
    public int[][] field2914;

    @ObfuscatedName("ko.ai")
    public class280 field2915;

    public class282(int arg0, byte[] arg1) {
        this.field2911 = arg0;
        class547 var3 = new class547(arg1);
        this.field2913 = var3.method8804();
        this.field2908 = new int[this.field2913];
        this.field2914 = new int[this.field2913][];
        for (int var4 = 0; var4 < this.field2913; var4++) {
            this.field2908[var4] = var3.method8804();
        }
        for (int var5 = 0; var5 < this.field2913; var5++) {
            this.field2914[var5] = new int[var3.method8804()];
        }
        for (int var6 = 0; var6 < this.field2913; var6++) {
            for (int var7 = 0; var7 < this.field2914[var6].length; var7++) {
                this.field2914[var6][var7] = var3.method8804();
            }
        }
        if (var3.field5363 < var3.field5364.length) {
            int var8 = var3.method8899();
            if (var8 > 0) {
                this.field2915 = new class280(var3, var8);
            }
        }
    }

    @ObfuscatedName("ko.aq(B)I")
    public int method4918() {
        return this.field2913;
    }

    @ObfuscatedName("ko.ad(I)Lkj;")
    public class280 method4919() {
        return this.field2915;
    }
}
