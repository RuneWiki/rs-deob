package deob;

@ObfuscatedName("hj")
public class class202 extends class457 {

    @ObfuscatedName("hj.an")
    public static class287 field2106 = new class287(64);

    @ObfuscatedName("hj.av")
    public char field2107;

    @ObfuscatedName("hj.as")
    public int field2114;

    @ObfuscatedName("hj.ax")
    public String field2109;

    @ObfuscatedName("hj.ap")
    public boolean field2105 = true;

    @ObfuscatedName("oo.at(II)Lhj;")
    public static class202 method6280(int arg0) {
        class202 var1 = (class202) field2106.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2110.method6080(11, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3493(new class501(var2));
        }
        var3.method3492();
        field2106.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hj.an(I)V")
    public void method3492() {
    }

    @ObfuscatedName("hj.av(Ltz;I)V")
    public void method3493(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3494(arg0, var2);
        }
    }

    @ObfuscatedName("hj.as(Ltz;IB)V")
    public void method3494(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2107 = class383.method3254(arg0.method8130());
        } else if (arg1 == 2) {
            this.field2114 = arg0.method8134();
        } else if (arg1 == 4) {
            this.field2105 = false;
        } else if (arg1 == 5) {
            this.field2109 = arg0.method8253();
        }
    }

    @ObfuscatedName("hj.ax(I)Z")
    public boolean method3495() {
        return this.field2107 == 's';
    }
}
