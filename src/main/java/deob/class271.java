package deob;

@ObfuscatedName("kx")
public class class271 {

    @ObfuscatedName("kx.ap")
    public class129[] field2812;

    @ObfuscatedName("kx.af")
    public int field2814;

    public class271(class531 arg0, int arg1) {
        this.field2812 = new class129[arg1];
        this.field2814 = arg0.method8561();
        for (int var3 = 0; var3 < this.field2812.length; var3++) {
            class129 var4 = new class129(this.field2814, arg0, false);
            this.field2812[var3] = var4;
        }
        this.method4820();
    }

    @ObfuscatedName("kx.am(B)V")
    public void method4820() {
        class129[] var1 = this.field2812;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class129 var3 = var1[var2];
            if (var3.field1495 >= 0) {
                var3.field1496 = this.field2812[var3.field1495];
            }
        }
    }

    @ObfuscatedName("kx.ap(I)I")
    public int method4821() {
        return this.field2812.length;
    }

    @ObfuscatedName("kx.af(II)Lez;")
    public class129 method4822(int arg0) {
        return arg0 >= this.method4821() ? null : this.field2812[arg0];
    }

    @ObfuscatedName("kx.aj(I)[Lez;")
    public class129[] method4823() {
        return this.field2812;
    }

    @ObfuscatedName("kx.aq(Lfu;II)V")
    public void method4824(class139 arg0, int arg1) {
        this.method4825(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("kx.ar(Lfu;I[ZZB)V")
    public void method4825(class139 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3027();
        int var6 = 0;
        class129[] var7 = this.method4823();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class129 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3029(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
