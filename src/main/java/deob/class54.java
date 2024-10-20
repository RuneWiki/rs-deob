package deob;

@ObfuscatedName("bi")
public class class54 implements class51 {

    @ObfuscatedName("bi.r")
    public class132[] field719;

    @ObfuscatedName("bi.d")
    public class104 field722 = new class104();

    @ObfuscatedName("bi.l")
    public int field717;

    @ObfuscatedName("bi.m")
    public int field718 = 0;

    @ObfuscatedName("bi.c")
    public double field720 = 1.0D;

    @ObfuscatedName("bi.n")
    public int field721 = 128;

    @ObfuscatedName("bi.j")
    public class86 field716;

    public class54(class86 arg0, class86 arg1, int arg2, double arg3, int arg4) {
        this.field716 = arg1;
        this.field717 = arg2;
        this.field718 = this.field717;
        this.field720 = arg3;
        this.field721 = arg4;
        int[] var7 = arg0.method1053(0);
        int var8 = var7.length;
        this.field719 = new class132[arg0.method1054(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class135 var10 = new class135(arg0.method1044(0, var7[var9]));
            this.field719[var7[var9]] = new class132(var10);
        }
    }

    @ObfuscatedName("bi.u(D)V")
    public void method757(double arg0) {
        this.field720 = arg0;
        this.method749();
    }

    @ObfuscatedName("bi.r(II)[I")
    public int[] method735(int arg0) {
        class132 var2 = this.field719[arg0];
        if (var2 != null) {
            if (var2.field1694 != null) {
                this.field722.method1312(var2);
                var2.field1689 = true;
                return var2.field1694;
            }
            boolean var3 = var2.method1571(this.field720, this.field721, this.field716);
            if (var3) {
                if (this.field718 == 0) {
                    class132 var4 = (class132) this.field722.method1290();
                    var4.method1572();
                } else {
                    this.field718--;
                }
                this.field722.method1312(var2);
                var2.field1689 = true;
                return var2.field1694;
            }
        }
        return null;
    }

    @ObfuscatedName("bi.d(II)I")
    public int method731(int arg0) {
        return this.field719[arg0] == null ? 0 : this.field719[arg0].field1687;
    }

    @ObfuscatedName("bi.l(II)Z")
    public boolean method732(int arg0) {
        return this.field719[arg0].field1686;
    }

    @ObfuscatedName("bi.m(II)Z")
    public boolean method733(int arg0) {
        return this.field721 == 64;
    }

    @ObfuscatedName("bi.v(I)V")
    public void method749() {
        for (int var1 = 0; var1 < this.field719.length; var1++) {
            if (this.field719[var1] != null) {
                this.field719[var1].method1572();
            }
        }
        this.field722 = new class104();
        this.field718 = this.field717;
    }

    @ObfuscatedName("bi.w(II)V")
    public void method751(int arg0) {
        for (int var2 = 0; var2 < this.field719.length; var2++) {
            class132 var3 = this.field719[var2];
            if (var3 != null && var3.field1692 != 0 && var3.field1689) {
                var3.method1576(arg0);
                var3.field1689 = false;
            }
        }
    }
}
