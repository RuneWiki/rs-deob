package deob;

@ObfuscatedName("jq")
public class class241 extends class502 {

    @ObfuscatedName("jq.ay")
    public static class315 field2540 = new class315(64);

    @ObfuscatedName("jq.an")
    public char field2534;

    @ObfuscatedName("jq.au")
    public char field2539;

    @ObfuscatedName("jq.ax")
    public String field2536 = class380.field4097;

    @ObfuscatedName("jq.ao")
    public int field2537;

    @ObfuscatedName("jq.am")
    public int field2538 = 0;

    @ObfuscatedName("jq.ac")
    public int[] field2533;

    @ObfuscatedName("jq.ae")
    public int[] field2535;

    @ObfuscatedName("jq.ad")
    public String[] field2541;

    @ObfuscatedName("ew.ab(IS)Ljq;")
    public static class241 method2944(int arg0) {
        class241 var1 = (class241) field2540.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4573.method6670(8, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method4491(new class549(var2));
        }
        field2540.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.ay(Lvg;B)V")
    public void method4491(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4492(arg0, var2);
        }
    }

    @ObfuscatedName("jq.an(Lvg;II)V")
    public void method4492(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2534 = (char) arg0.method9025();
        } else if (arg1 == 2) {
            this.field2539 = (char) arg0.method9025();
        } else if (arg1 == 3) {
            this.field2536 = arg0.method8808();
        } else if (arg1 == 4) {
            this.field2537 = arg0.method8803();
        } else if (arg1 == 5) {
            this.field2538 = arg0.method8968();
            this.field2533 = new int[this.field2538];
            this.field2541 = new String[this.field2538];
            for (int var3 = 0; var3 < this.field2538; var3++) {
                this.field2533[var3] = arg0.method8803();
                this.field2541[var3] = arg0.method8808();
            }
        } else if (arg1 == 6) {
            this.field2538 = arg0.method8968();
            this.field2533 = new int[this.field2538];
            this.field2535 = new int[this.field2538];
            for (int var4 = 0; var4 < this.field2538; var4++) {
                this.field2533[var4] = arg0.method8803();
                this.field2535[var4] = arg0.method8803();
            }
        }
    }

    @ObfuscatedName("jq.au(I)I")
    public int method4496() {
        return this.field2538;
    }
}
