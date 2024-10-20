package deob;

@ObfuscatedName("hn")
public class class215 extends class433 {

    @ObfuscatedName("hn.q")
    public int field2522;

    @ObfuscatedName("hn.f")
    public int field2523;

    @ObfuscatedName("hn.r")
    public int[] field2524;

    @ObfuscatedName("hn.u")
    public int[][] field2525;

    @ObfuscatedName("hn.b")
    public class214 field2526;

    public class215(int arg0, byte[] arg1) {
        this.field2522 = arg0;
        class467 var3 = new class467(arg1);
        this.field2523 = var3.method7792();
        this.field2524 = new int[this.field2523];
        this.field2525 = new int[this.field2523][];
        for (int var4 = 0; var4 < this.field2523; var4++) {
            this.field2524[var4] = var3.method7792();
        }
        for (int var5 = 0; var5 < this.field2523; var5++) {
            this.field2525[var5] = new int[var3.method7792()];
        }
        for (int var6 = 0; var6 < this.field2523; var6++) {
            for (int var7 = 0; var7 < this.field2525[var6].length; var7++) {
                this.field2525[var6][var7] = var3.method7792();
            }
        }
        if (var3.field4915 < var3.field4917.length) {
            int var8 = var3.method7794();
            if (var8 > 0) {
                this.field2526 = new class214(var3, var8);
            }
        }
    }

    @ObfuscatedName("hn.h(I)I")
    public int method4039() {
        return this.field2523;
    }

    @ObfuscatedName("hn.e(I)Lhi;")
    public class214 method4035() {
        return this.field2526;
    }
}
