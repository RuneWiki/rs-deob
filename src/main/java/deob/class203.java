package deob;

@ObfuscatedName("hd")
public class class203 extends class501 {

    @ObfuscatedName("hd.ad")
    public static class313 field2118 = new class313(64);

    @ObfuscatedName("hd.ag")
    public char field2113;

    @ObfuscatedName("hd.ak")
    public int field2116;

    @ObfuscatedName("hd.ap")
    public String field2114;

    @ObfuscatedName("hd.an")
    public boolean field2117 = true;

    @ObfuscatedName("bv.aq(Lok;B)V")
    public static void method825(class388 arg0) {
        Statics.field4691 = arg0;
    }

    @ObfuscatedName("cq.ad(II)Lhd;")
    public static class203 method1148(int arg0) {
        class203 var1 = (class203) field2118.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4691.method6539(11, arg0);
        class203 var3 = new class203();
        if (var2 != null) {
            var3.method3529(new class547(var2));
        }
        var3.method3528();
        field2118.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hd.ag(I)V")
    public void method3528() {
    }

    @ObfuscatedName("hd.ak(Lvp;I)V")
    public void method3529(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3527(arg0, var2);
        }
    }

    @ObfuscatedName("hd.ap(Lvp;IB)V")
    public void method3527(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2113 = class414.method6458(arg0.method8857());
        } else if (arg1 == 2) {
            this.field2116 = arg0.method8734();
        } else if (arg1 == 4) {
            this.field2117 = false;
        } else if (arg1 == 5) {
            this.field2114 = arg0.method8739();
        }
    }

    @ObfuscatedName("hd.an(B)Z")
    public boolean method3535() {
        return this.field2113 == 's';
    }
}
