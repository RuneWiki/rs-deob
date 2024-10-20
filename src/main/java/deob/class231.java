package deob;

@ObfuscatedName("in")
public class class231 {

    @ObfuscatedName("in.am")
    public final int[][] field2449;

    @ObfuscatedName("in.ap")
    public final int[][] field2452;

    @ObfuscatedName("in.af")
    public int field2450;

    @ObfuscatedName("in.aj")
    public int field2448;

    @ObfuscatedName("in.aq")
    public final int[] field2451;

    @ObfuscatedName("in.ar")
    public final int[] field2453;

    @ObfuscatedName("in.ag")
    public final int field2454;

    public class231(int arg0, int arg1) {
        this.field2449 = new int[arg0][arg1];
        this.field2452 = new int[arg0][arg1];
        int var3 = arg0 * arg1;
        int var4 = class318.method2259(var3 / 4);
        this.field2451 = new int[var4];
        this.field2453 = new int[var4];
        this.field2454 = var4 - 1;
    }

    @ObfuscatedName("in.am(B)V")
    public void method4126() {
        for (int var1 = 0; var1 < this.field2449.length; var1++) {
            for (int var2 = 0; var2 < this.field2449[var1].length; var2++) {
                this.field2449[var1][var2] = 0;
                this.field2452[var1][var2] = 99999999;
            }
        }
    }

    @ObfuscatedName("in.ap(III)V")
    public void method4148(int arg0, int arg1) {
        this.field2450 = arg0;
        this.field2448 = arg1;
    }

    @ObfuscatedName("in.af(I)I")
    public int method4129() {
        return this.field2450;
    }

    @ObfuscatedName("in.aj(B)I")
    public int method4150() {
        return this.field2448;
    }

    @ObfuscatedName("in.aq(B)I")
    public int method4151() {
        return this.field2449.length;
    }

    @ObfuscatedName("in.ar(I)I")
    public int method4144() {
        return this.field2449[0].length;
    }

    @ObfuscatedName("in.ag(B)[[I")
    public int[][] method4133() {
        return this.field2449;
    }

    @ObfuscatedName("in.ao(I)[[I")
    public int[][] method4134() {
        return this.field2452;
    }

    @ObfuscatedName("in.ae(I)[I")
    public int[] method4132() {
        return this.field2451;
    }

    @ObfuscatedName("in.aa(S)[I")
    public int[] method4136() {
        return this.field2453;
    }

    @ObfuscatedName("in.au(I)I")
    public int method4137() {
        return this.field2454;
    }
}
