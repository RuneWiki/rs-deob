package deob;

@ObfuscatedName("ba")
public class class54 implements class51 {

    @ObfuscatedName("ba.t")
    public class132[] field712;

    @ObfuscatedName("ba.n")
    public class104 field705 = new class104();

    @ObfuscatedName("ba.q")
    public int field710;

    @ObfuscatedName("ba.h")
    public int field708 = 0;

    @ObfuscatedName("ba.k")
    public double field709 = 1.0D;

    @ObfuscatedName("ba.r")
    public int field706 = 128;

    @ObfuscatedName("ba.l")
    public class86 field707;

    public class54(class86 arg0, class86 arg1, int arg2, double arg3, int arg4) {
        this.field707 = arg1;
        this.field710 = arg2;
        this.field708 = this.field710;
        this.field709 = arg3;
        this.field706 = arg4;
        int[] var7 = arg0.method1024(0);
        int var8 = var7.length;
        this.field712 = new class132[arg0.method1025(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class135 var10 = new class135(arg0.method1015(0, var7[var9]));
            this.field712[var7[var9]] = new class132(var10);
        }
    }

    @ObfuscatedName("ba.d(D)V")
    public void method727(double arg0) {
        this.field709 = arg0;
        this.method730();
    }

    @ObfuscatedName("ba.t(II)[I")
    public int[] method708(int arg0) {
        class132 var2 = this.field712[arg0];
        if (var2 != null) {
            if (var2.field1678 != null) {
                this.field705.method1281(var2);
                var2.field1691 = true;
                return var2.field1678;
            }
            boolean var3 = var2.method1545(this.field709, this.field706, this.field707);
            if (var3) {
                if (this.field708 == 0) {
                    class132 var4 = (class132) this.field705.method1278();
                    var4.method1546();
                } else {
                    this.field708--;
                }
                this.field705.method1281(var2);
                var2.field1691 = true;
                return var2.field1678;
            }
        }
        return null;
    }

    @ObfuscatedName("ba.n(II)I")
    public int method703(int arg0) {
        return this.field712[arg0] == null ? 0 : this.field712[arg0].field1682;
    }

    @ObfuscatedName("ba.q(II)Z")
    public boolean method704(int arg0) {
        return this.field712[arg0].field1683;
    }

    @ObfuscatedName("ba.h(IB)Z")
    public boolean method705(int arg0) {
        return this.field706 == 64;
    }

    @ObfuscatedName("ba.x(I)V")
    public void method730() {
        for (int var1 = 0; var1 < this.field712.length; var1++) {
            if (this.field712[var1] != null) {
                this.field712[var1].method1546();
            }
        }
        this.field705 = new class104();
        this.field708 = this.field710;
    }

    @ObfuscatedName("ba.z(IS)V")
    public void method728(int arg0) {
        for (int var2 = 0; var2 < this.field712.length; var2++) {
            class132 var3 = this.field712[var2];
            if (var3 != null && var3.field1690 != 0 && var3.field1691) {
                var3.method1547(arg0);
                var3.field1691 = false;
            }
        }
    }
}
