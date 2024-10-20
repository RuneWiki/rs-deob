package deob;

@ObfuscatedName("az")
public class class33 {

    @ObfuscatedName("az.g")
    public int field318;

    @ObfuscatedName("az.r")
    public int field321;

    @ObfuscatedName("az.e")
    public int[][] field316;

    @ObfuscatedName("az.q")
    public int[][] field319;

    @ObfuscatedName("az.c")
    public int[][] field317;

    @ObfuscatedName("az.l")
    public int[][] field320;

    public class33(int arg0, int arg1) {
        this.field318 = arg0;
        this.field321 = arg1;
        this.field316 = new int[arg0][arg1];
        this.field319 = new int[arg0][arg1];
        this.field317 = new int[arg0][arg1];
        this.field320 = new int[arg0][arg1];
    }

    @ObfuscatedName("az.g(IIILju;B)V")
    public void method543(int arg0, int arg1, int arg2, class262 arg3) {
        if (arg3 == null || arg0 + arg2 < 0 || arg1 + arg2 < 0 || arg0 - arg2 > this.field318 || arg1 - arg2 > this.field321) {
            return;
        }
        int var5 = Math.max(0, arg0 - arg2);
        int var6 = Math.min(this.field318, arg0 + arg2);
        int var7 = Math.max(0, arg1 - arg2);
        int var8 = Math.min(this.field321, arg1 + arg2);
        for (int var9 = var5; var9 < var6; var9++) {
            for (int var10 = var7; var10 < var8; var10++) {
                this.field316[var9][var10] += arg3.field3362 * 256 / arg3.field3361;
                this.field319[var9][var10] += arg3.field3365;
                this.field317[var9][var10] += arg3.field3364;
                int var10002 = this.field320[var9][var10]++;
            }
        }
    }

    @ObfuscatedName("az.r(III)I")
    public int method541(int arg0, int arg1) {
        if (arg0 < 0 || arg1 < 0 || arg0 >= this.field318 || arg1 >= this.field321) {
            return 0;
        } else if (this.field317[arg0][arg1] == 0) {
            return 0;
        } else {
            int var3 = this.field316[arg0][arg1] / this.field320[arg0][arg1];
            int var4 = this.field319[arg0][arg1] / this.field320[arg0][arg1];
            int var5 = this.field317[arg0][arg1] / this.field320[arg0][arg1];
            return class10.method80((double) var3 / 256.0D, (double) var4 / 256.0D, (double) var5 / 256.0D);
        }
    }
}
