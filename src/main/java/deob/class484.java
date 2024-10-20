package deob;

@ObfuscatedName("sz")
public class class484 extends class444 {

    @ObfuscatedName("sz.an")
    public static class280 field4968 = new class280(64);

    @ObfuscatedName("sz.aw")
    public Object[][] field4972;

    @ObfuscatedName("sz.ac")
    public int[][] field4970;

    @ObfuscatedName("sz.au")
    public int field4971 = -1;

    @ObfuscatedName("ek.an(II)Lsz;")
    public static class484 method2941(int arg0) {
        class484 var1 = (class484) field4968.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4969.method6090(38, arg0);
        class484 var3 = new class484();
        if (var2 != null) {
            var3.method8150(new class489(var2));
        }
        var3.method8153();
        field4968.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("sz.aw(Lsg;I)V")
    public void method8150(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method8163(arg0, var2);
        }
    }

    @ObfuscatedName("sz.ac(IB)[Ljava/lang/Object;")
    public Object[] method8161(int arg0) {
        return this.field4972 == null ? null : this.field4972[arg0];
    }

    @ObfuscatedName("sz.au(Lsg;II)V")
    public void method8163(class489 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8248();
            if (this.field4972 == null) {
                this.field4972 = new Object[var3][];
                this.field4970 = new int[var3][];
            }
            for (int var4 = arg0.method8248(); var4 != 255; var4 = arg0.method8248()) {
                int var5 = arg0.method8248();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8417();
                }
                this.field4972[var4] = class485.method6608(arg0, var6);
                this.field4970[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4971 = arg0.method8270();
        }
    }

    @ObfuscatedName("sz.ab(I)V")
    public void method8153() {
    }
}
