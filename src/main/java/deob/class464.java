package deob;

@ObfuscatedName("qh")
public class class464 {

    @ObfuscatedName("qh.c")
    public int[] field4858;

    public class464(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4858 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4858[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4858[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4858[var5 + var5] = arg0[var4];
            this.field4858[var5 + var5 + 1] = var4++;
        }
    }

    @ObfuscatedName("qh.c(II)I")
    public int method7772(int arg0) {
        int var2 = (this.field4858.length >> 1) - 1;
        int var3 = arg0 & var2;
        while (true) {
            int var4 = this.field4858[var3 + var3 + 1];
            if (var4 == -1) {
                return -1;
            }
            if (this.field4858[var3 + var3] == arg0) {
                return var4;
            }
            var3 = var3 + 1 & var2;
        }
    }
}
