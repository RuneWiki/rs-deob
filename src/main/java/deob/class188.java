package deob;

@ObfuscatedName("gr")
public class class188 {

    @ObfuscatedName("gr.d")
    public int[] field2469;

    public class188(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2469 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2469[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2469[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2469[var5 + var5] = arg0[var4];
            this.field2469[var5 + var5 + 1] = var4++;
        }
    }

    @ObfuscatedName("gr.d(I)I")
    public int method3332(int arg0) {
        int var2 = (this.field2469.length >> 1) - 1;
        int var3 = arg0 & var2;
        while (true) {
            int var4 = this.field2469[var3 + var3 + 1];
            if (var4 == -1) {
                return -1;
            }
            if (this.field2469[var3 + var3] == arg0) {
                return var4;
            }
            var3 = var3 + 1 & var2;
        }
    }
}
