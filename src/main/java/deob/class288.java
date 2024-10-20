package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ky")
public abstract class class288 {

    @ObfuscatedName("ky.u")
    public final int field3675;

    @ObfuscatedName("ky.i")
    public int field3677 = 0;

    @ObfuscatedName("ky.r")
    public class285[] field3676;

    @ObfuscatedName("ky.j")
    public HashMap field3674;

    @ObfuscatedName("ky.p")
    public HashMap field3678;

    @ObfuscatedName("ky.e")
    public Comparator field3679 = null;

    public class288(int arg0) {
        this.field3675 = arg0;
        this.field3676 = this.method4989(arg0);
        this.field3674 = new HashMap(arg0 / 8);
        this.field3678 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ky.f(B)V")
    public void method5001() {
        this.field3677 = 0;
        Arrays.fill(this.field3676, (Object) null);
        this.field3674.clear();
        this.field3678.clear();
    }

    @ObfuscatedName("ky.z(B)I")
    public int method5002() {
        return this.field3677;
    }

    @ObfuscatedName("ky.a(I)Z")
    public boolean method5038() {
        return this.field3677 == this.field3675;
    }

    @ObfuscatedName("ky.x(Lkx;I)Z")
    public boolean method5004(class294 arg0) {
        if (arg0.method5096()) {
            return this.field3674.containsKey(arg0) ? true : this.field3678.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.b(Lkx;I)Ljd;")
    public class285 method5005(class294 arg0) {
        class285 var2 = this.method5043(arg0);
        return var2 == null ? this.method5007(arg0) : var2;
    }

    @ObfuscatedName("ky.w(Lkx;I)Ljd;")
    public class285 method5043(class294 arg0) {
        return arg0.method5096() ? (class285) this.field3674.get(arg0) : null;
    }

    @ObfuscatedName("ky.g(Lkx;I)Ljd;")
    public class285 method5007(class294 arg0) {
        return arg0.method5096() ? (class285) this.field3678.get(arg0) : null;
    }

    @ObfuscatedName("ky.d(Lkx;I)Z")
    public final boolean method5008(class294 arg0) {
        class285 var2 = this.method5043(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5009(var2);
            return true;
        }
    }

    @ObfuscatedName("ky.m(Ljd;I)V")
    public final void method5009(class285 arg0) {
        int var2 = this.method5051(arg0);
        if (var2 != -1) {
            this.method5000(var2);
            this.method5015(arg0);
        }
    }

    @ObfuscatedName("ky.t(Lkx;I)Ljd;")
    public class285 method5010(class294 arg0) {
        return this.method5011(arg0, (class294) null);
    }

    @ObfuscatedName("ky.h(Lkx;Lkx;B)Ljd;")
    public class285 method5011(class294 arg0, class294 arg1) {
        if (this.method5043(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method4988();
        var3.method4975(arg0, arg1);
        this.method5016(var3);
        this.method5017(var3);
        return var3;
    }

    @ObfuscatedName("ky.ah(IB)Ljd;")
    public final class285 method5047(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3677) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3676[arg0];
    }

    @ObfuscatedName("ky.ad(I)V")
    public final void method5045() {
        if (this.field3679 == null) {
            Arrays.sort(this.field3676, 0, this.field3677);
        } else {
            Arrays.sort(this.field3676, 0, this.field3677, this.field3679);
        }
    }

    @ObfuscatedName("ky.aa(Ljd;Lkx;Lkx;I)V")
    public final void method5041(class285 arg0, class294 arg1, class294 arg2) {
        this.method5015(arg0);
        arg0.method4975(arg1, arg2);
        this.method5017(arg0);
    }

    @ObfuscatedName("ky.ag(Ljd;S)I")
    public final int method5051(class285 arg0) {
        for (int var2 = 0; var2 < this.field3677; var2++) {
            if (this.field3676[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ky.av(Ljd;S)V")
    public final void method5015(class285 arg0) {
        if (this.field3674.remove(arg0.field3666) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3665 != null) {
            this.field3678.remove(arg0.field3665);
        }
    }

    @ObfuscatedName("ky.am(Ljd;I)V")
    public final void method5016(class285 arg0) {
        this.field3676[++this.field3677 - 1] = arg0;
    }

    @ObfuscatedName("ky.ap(Ljd;I)V")
    public final void method5017(class285 arg0) {
        this.field3674.put(arg0.field3666, arg0);
        if (arg0.field3665 != null) {
            class285 var2 = (class285) this.field3678.put(arg0.field3665, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3665 = null;
            }
        }
    }

    @ObfuscatedName("ky.au(IB)V")
    public final void method5000(int arg0) {
        this.field3677--;
        if (arg0 < this.field3677) {
            System.arraycopy(this.field3676, arg0 + 1, this.field3676, arg0, this.field3677 - arg0);
        }
    }

    @ObfuscatedName("ky.ae(B)V")
    public final void method5019() {
        this.field3679 = null;
    }

    @ObfuscatedName("ky.ai(Ljava/util/Comparator;I)V")
    public final void method5020(Comparator arg0) {
        if (this.field3679 == null) {
            this.field3679 = arg0;
        } else if (this.field3679 instanceof class286) {
            ((class286) this.field3679).method4979(arg0);
        }
    }

    @ObfuscatedName("ky.y(I)Ljd;")
    public abstract class285 method4988();

    @ObfuscatedName("ky.c(II)[Ljd;")
    public abstract class285[] method4989(int arg0);
}
