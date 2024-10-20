package deob;

@ObfuscatedName("gm")
public class class203 extends class410 {

    @ObfuscatedName("gm.e")
    public int field2378;

    @ObfuscatedName("gm.g")
    public int field2375;

    @ObfuscatedName("gm.w")
    public int[] field2376;

    @ObfuscatedName("gm.y")
    public int[][] field2379;

    @ObfuscatedName("gm.i")
    public class202 field2377;

    public class203(int arg0, byte[] arg1) {
        this.field2378 = arg0;
        class443 var3 = new class443(arg1);
        this.field2375 = var3.method7047();
        this.field2376 = new int[this.field2375];
        this.field2379 = new int[this.field2375][];
        for (int var4 = 0; var4 < this.field2375; var4++) {
            this.field2376[var4] = var3.method7047();
        }
        for (int var5 = 0; var5 < this.field2375; var5++) {
            this.field2379[var5] = new int[var3.method7047()];
        }
        for (int var6 = 0; var6 < this.field2375; var6++) {
            for (int var7 = 0; var7 < this.field2379[var6].length; var7++) {
                this.field2379[var6][var7] = var3.method7047();
            }
        }
        if (var3.field4700 < var3.field4701.length) {
            int var8 = var3.method7049();
            if (var8 > 0) {
                this.field2377 = new class202(var3, var8);
            }
        }
    }

    @ObfuscatedName("gm.c(I)I")
    public int method3817() {
        return this.field2375;
    }

    @ObfuscatedName("gm.v(I)Lgq;")
    public class202 method3819() {
        return this.field2377;
    }
}
