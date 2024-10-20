package deob;

@ObfuscatedName("hw")
public final class class214 {

    @ObfuscatedName("hw.d")
    public int field2644;

    @ObfuscatedName("hw.z")
    public int field2643;

    @ObfuscatedName("hw.n")
    public class210 field2642;

    @ObfuscatedName("hw.r")
    public class228 field2645 = new class228();

    public class214(int arg0, int arg1) {
        this.field2644 = arg0;
        this.field2643 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2642 = new class210(var3);
    }

    @ObfuscatedName("hw.d(J)Ljava/lang/Object;")
    public Object method3710(long arg0) {
        class225 var3 = (class225) this.field2642.method3668(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3654();
        if (var4 == null) {
            var3.method3785();
            var3.method3828();
            this.field2643 += var3.field2671;
            return null;
        }
        if (var3.method3658()) {
            class209 var5 = new class209(var4, var3.field2671);
            this.field2642.method3666(var5, var3.field2655);
            this.field2645.method3869(var5);
            var5.field2659 = 0L;
            var3.method3785();
            var3.method3828();
        } else {
            this.field2645.method3869(var3);
            var3.field2659 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hw.z(J)V")
    public void method3730(long arg0) {
        class225 var3 = (class225) this.field2642.method3668(arg0);
        this.method3733(var3);
    }

    @ObfuscatedName("hw.n(Lhy;)V")
    public void method3733(class225 arg0) {
        if (arg0 != null) {
            arg0.method3785();
            arg0.method3828();
            this.field2643 += arg0.field2671;
        }
    }

    @ObfuscatedName("hw.r(Ljava/lang/Object;J)V")
    public void method3712(Object arg0, long arg1) {
        this.method3713(arg0, arg1, 1);
    }

    @ObfuscatedName("hw.e(Ljava/lang/Object;JI)V")
    public void method3713(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2644) {
            throw new IllegalStateException();
        }
        this.method3730(arg1);
        this.field2643 -= arg2;
        while (this.field2643 < 0) {
            class225 var5 = (class225) this.field2645.method3870();
            this.method3733(var5);
        }
        class209 var6 = new class209(arg0, arg2);
        this.field2642.method3666(var6, arg1);
        this.field2645.method3869(var6);
        var6.field2659 = 0L;
    }

    @ObfuscatedName("hw.y(I)V")
    public void method3709(int arg0) {
        for (class225 var2 = (class225) this.field2645.method3876(); var2 != null; var2 = (class225) this.field2645.method3873()) {
            if (var2.method3658()) {
                if (var2.method3654() == null) {
                    var2.method3785();
                    var2.method3828();
                    this.field2643 += var2.field2671;
                }
            } else if (++var2.field2659 > (long) arg0) {
                class220 var3 = new class220(var2.method3654(), var2.field2671);
                this.field2642.method3666(var3, var2.field2655);
                class207.method3635(var3, var2);
                var2.method3785();
                var2.method3828();
            }
        }
    }

    @ObfuscatedName("hw.k()V")
    public void method3715() {
        this.field2645.method3868();
        this.field2642.method3663();
        this.field2643 = this.field2644;
    }
}
