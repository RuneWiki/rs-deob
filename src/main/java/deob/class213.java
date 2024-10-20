package deob;

@ObfuscatedName("hv")
public class class213 extends class430 {

    @ObfuscatedName("hv.j")
    public int field2445;

    @ObfuscatedName("hv.y")
    public int field2449;

    @ObfuscatedName("hv.d")
    public int[] field2450;

    @ObfuscatedName("hv.n")
    public int[][] field2451;

    @ObfuscatedName("hv.r")
    public class212 field2452;

    public class213(int arg0, byte[] arg1) {
        this.field2445 = arg0;
        class464 var3 = new class464(arg1);
        this.field2449 = var3.method7735();
        this.field2450 = new int[this.field2449];
        this.field2451 = new int[this.field2449][];
        for (int var4 = 0; var4 < this.field2449; var4++) {
            this.field2450[var4] = var3.method7735();
        }
        for (int var5 = 0; var5 < this.field2449; var5++) {
            this.field2451[var5] = new int[var3.method7735()];
        }
        for (int var6 = 0; var6 < this.field2449; var6++) {
            for (int var7 = 0; var7 < this.field2451[var6].length; var7++) {
                this.field2451[var6][var7] = var3.method7735();
            }
        }
        if (var3.field4864 < var3.field4867.length) {
            int var8 = var3.method7716();
            if (var8 > 0) {
                this.field2452 = new class212(var3, var8);
            }
        }
    }

    @ObfuscatedName("hv.a(I)I")
    public int method3915() {
        return this.field2449;
    }

    @ObfuscatedName("hv.f(B)Lhh;")
    public class212 method3916() {
        return this.field2452;
    }
}
